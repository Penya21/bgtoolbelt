package com.kitam.bgapp.ui.profile

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.firebase.ui.auth.AuthUI
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.ProfileFragmentBinding
import com.kitam.bgapp.databinding.ProfileFragmentBinding.inflate
import com.kitam.bgapp.ui.login.LoginActivity

class ProfileFragment : Fragment() {

    private var _binding: ProfileFragmentBinding? = null
    private val binding get() = _binding!!


    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)

        binding.buttonLogout.setOnClickListener{
            AuthUI.getInstance()
                .signOut(requireContext())
                .addOnCompleteListener {
                    // ...
                    val intent = Intent(requireContext(), LoginActivity::class.java).apply {
                    }
                    startActivity(intent)
                }
        }


        val user = FirebaseAuth.getInstance().currentUser
        user?.let {
            // Name, email address, and profile photo Url
            val name = user.displayName
            val email = user.email
            val photoUrl = user.photoUrl

            binding.username.text = name
            binding.email.text = email

            // Check if user's email is verified
            val emailVerified = user.isEmailVerified

            // The user's ID, unique to the Firebase project. Do NOT use this value to
            // authenticate with your backend server, if you have one. Use
            // FirebaseUser.getToken() instead.
            val uid = user.uid
        }

        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(ProfileViewModel::class.java)

        // TODO: Use the ViewModel
    }

}