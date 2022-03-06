package com.kitam.bgapp.ui.login

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.EditText
import android.widget.Toast
import androidx.lifecycle.coroutineScope
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.firebase.ui.auth.AuthUI
import com.firebase.ui.auth.FirebaseAuthUIActivityResultContract
import com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult
import com.google.firebase.auth.FirebaseAuth
import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.BuildConfig
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.R
import com.kitam.bgapp.data.data.User
import com.kitam.bgapp.databinding.ActivityLoginBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Duration


class LoginActivity : AppCompatActivity() {

    private lateinit var loginViewModel: LoginViewModel
    private lateinit var binding: ActivityLoginBinding

    // Choose authentication providers
    val providers = arrayListOf(
        AuthUI.IdpConfig.EmailBuilder().build(),
        AuthUI.IdpConfig.FacebookBuilder().build(),
        AuthUI.IdpConfig.GoogleBuilder().build())

    // Create and launch sign-in intent
    val signInIntent = AuthUI.getInstance()
        .createSignInIntentBuilder()
        .setAvailableProviders(providers)
        .setTheme(R.style.Theme_BGToolBelt) // Set theme
        .build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = binding.username
        val password = binding.password
        val login = binding.login
        val loading = binding.loading

        binding.tvVersion?.text = "V " + BuildConfig.VERSION_NAME


        val rnds = (1..3).random()

        when (rnds) {
            1 -> binding.background?.let {
                Glide.with(this).load(resources.getDrawable(R.drawable.login_background_1,theme)).transition(DrawableTransitionOptions.withCrossFade()).into(
                    it
                )
            }
            2 -> binding.background?.let {
                Glide.with(this).load(resources.getDrawable(R.drawable.login_background_2,theme)).transition(DrawableTransitionOptions.withCrossFade()).into(
                    it
                )
            }

            3 -> binding.background?.let {
                Glide.with(this).load(resources.getDrawable(R.drawable.login_background_5,theme)).transition(DrawableTransitionOptions.withCrossFade()).into(
                    it
                )
            }

            else -> { // Note the block
            }
        }



        loginViewModel = ViewModelProvider(this, LoginViewModelFactory())
            .get(LoginViewModel::class.java)

        loginViewModel.loginFormState.observe(this@LoginActivity, Observer {
            val loginState = it ?: return@Observer

            // disable login button unless both username / password is valid
            login.isEnabled = loginState.isDataValid

            if (loginState.usernameError != null) {
                username.error = getString(loginState.usernameError)
            }
            if (loginState.passwordError != null) {
                password.error = getString(loginState.passwordError)
            }
        })

        loginViewModel.loginResult.observe(this@LoginActivity, Observer {
            val loginResult = it ?: return@Observer

            loading.visibility = View.GONE
            if (loginResult.error != null) {
                showLoginFailed(loginResult.error)
            }
            if (loginResult.success != null) {
                updateUiWithUser(loginResult.success)
            }
            setResult(Activity.RESULT_OK)


        })

        username.afterTextChanged {
            loginViewModel.loginDataChanged(
                username.text.toString(),
                password.text.toString()
            )
        }

        password.apply {
            afterTextChanged {
                loginViewModel.loginDataChanged(
                    username.text.toString(),
                    password.text.toString()
                )
            }

            setOnEditorActionListener { _, actionId, _ ->
                when (actionId) {
                    EditorInfo.IME_ACTION_DONE ->
                       // loginViewModel.login(username.text.toString(), password.text.toString())
                        signInLauncher.launch(signInIntent)

                }
                false
            }

            login.setOnClickListener {
                loading.visibility = View.VISIBLE
                //loginViewModel.login(username.text.toString(), password.text.toString())
            }
        }

        binding.login.isEnabled = true

        binding.login.setOnClickListener {
            signInLauncher.launch(signInIntent)

        }


    }

    override fun onStart() {
        super.onStart()
        val currentUser = FirebaseAuth.getInstance().currentUser
        if(currentUser != null){
            goToMainActivity()
        }
    }

    private fun updateUiWithUser(model: LoggedInUserView) {
        val welcome = getString(R.string.welcome)
        val displayName = model.displayName
        // TODO : initiate successful logged in experience
        Toast.makeText(
            applicationContext,
            "$welcome $displayName",
            Toast.LENGTH_LONG
        ).show()
    }

    private fun showLoginFailed(@StringRes errorString: Int) {
        Toast.makeText(applicationContext, errorString, Toast.LENGTH_SHORT).show()
    }

    private val signInLauncher = registerForActivityResult(
        FirebaseAuthUIActivityResultContract()
    ) { res ->
        this.onSignInResult(res)
    }

    private fun onSignInResult(result: FirebaseAuthUIAuthenticationResult) {
        val response = result.idpResponse
        binding.loading.visibility = View.GONE
        if (result.resultCode == RESULT_OK) {
            // Successfully signed in

            val currentUser = FirebaseAuth.getInstance().currentUser
            if(currentUser != null){
                lifecycle.coroutineScope.launch {
                    withContext(Dispatchers.IO) {

                        BGToolBeltApp.database.taskDao().insertUser(User(currentUser.email!!, currentUser.displayName, currentUser.phoneNumber, emptyList(), emptyList(), emptyList(), emptyList()))
                        goToMainActivity();

                    }
                }

            }

            // ...
        } else {
            // Sign in failed. If response is null the user canceled the
            // sign-in flow using the back button. Otherwise check
            // response.getError().getErrorCode() and handle the error.
            // ...
            if (response != null) {

                //showLoginFailed(response.describeContents())
                Toast.makeText(this, "Login Failed: " + response.error?.errorCode.toString(), Toast.LENGTH_LONG);

                //Log.e("Login Failed", response.error?.errorCode.toString())
            };

        }
    }


    private fun goToMainActivity() {
        val intent = Intent(this, MainActivity::class.java).apply {
        }
        startActivity(intent)

        finish()
    }
}

/*
SIGNOUT

AuthUI.getInstance()
        .signOut(this)
        .addOnCompleteListener {
            // ...
        }
*/


/**
 * Extension function to simplify setting an afterTextChanged action to EditText components.
 */
fun EditText.afterTextChanged(afterTextChanged: (String) -> Unit) {
    this.addTextChangedListener(object : TextWatcher {
        override fun afterTextChanged(editable: Editable?) {
            afterTextChanged.invoke(editable.toString())
        }

        override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}

        override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {}
    })
}