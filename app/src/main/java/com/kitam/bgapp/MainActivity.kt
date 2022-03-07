package com.kitam.bgapp

import android.content.Intent
import android.os.Bundle
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.firebase.ui.auth.AuthUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.R
import com.kitam.bgapp.ui.login.LoginActivity
import io.github.muddz.styleabletoast.StyleableToast


class MainActivity : AppCompatActivity() {

    var progressBar: ProgressBar? = null
    private val boardGameViewModel: BoardGameViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        progressBar = findViewById(R.id.loading)
        boardGameViewModel.onCreate()
        boardGameViewModel.firstSetup.postValue(true)
        boardGameViewModel.isLoading.observe(this, Observer {
            this.progressBar?.isVisible = it
        })

        boardGameViewModel.toastText.observe(this, Observer {
            if(!it.isNullOrEmpty())
                StyleableToast.makeText(this, it, Toast.LENGTH_LONG, R.style.mytoast).show();

        })


        boardGameViewModel.needsSessionRefresh.observe(this, Observer {
            if(it){
                AuthUI.getInstance()
                    .signOut(this)
                    .addOnCompleteListener {
                        // ...
                        val intent = Intent(this, LoginActivity::class.java).apply {
                        }
                        startActivity(intent)
                        finish()
                    }
            }
        })

        boardGameViewModel.favGamesList.observe(this, {
            if(!it.isNullOrEmpty()){

            }
        })

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_hot, R.id.navigation_search, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
    }




}