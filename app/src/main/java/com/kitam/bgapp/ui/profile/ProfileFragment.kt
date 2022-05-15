package com.kitam.bgapp.ui.profile

import android.content.Intent
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.firebase.ui.auth.AuthUI
import com.google.android.play.core.review.ReviewManager
import com.google.android.play.core.review.ReviewManagerFactory
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.ktx.Firebase
import com.kitam.bgapp.MainActivity
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.ProfileFragmentBinding
import com.kitam.bgapp.databinding.ProfileFragmentBinding.inflate
import com.kitam.bgapp.ui.login.LoginActivity
import com.google.android.play.core.review.ReviewInfo
import com.google.android.play.core.tasks.Task
import android.content.DialogInterface

import com.google.android.material.dialog.MaterialAlertDialogBuilder





class ProfileFragment : Fragment() {

    private var _binding: ProfileFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var reviewManager: ReviewManager

    private lateinit var viewModel: ProfileViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ProfileFragmentBinding.inflate(inflater, container, false)
        reviewManager = ReviewManagerFactory.create(requireContext())
            binding.buttonLogout.setOnClickListener {
                try {
                    AuthUI.getInstance()
                        .signOut(requireContext())
                        .addOnCompleteListener {
                            val intent = Intent(requireContext(), LoginActivity::class.java).apply {
                            }
                            startActivity(intent)
                        }
                }catch (e: Exception){
                    val intent = Intent(requireContext(), LoginActivity::class.java).apply {
                    }
                    startActivity(intent)
                }
            }


        binding.buttonRateApp.setOnClickListener{
            try {
                val request: Task<ReviewInfo> = reviewManager.requestReviewFlow()
                request.addOnCompleteListener { task ->
                    if (task.isSuccessful()) {
                        // We can get the ReviewInfo object
                        val reviewInfo: ReviewInfo = task.getResult()
                        val flow: Task<Void> =
                            reviewManager.launchReviewFlow(requireActivity(), reviewInfo)
                        flow.addOnCompleteListener { task1 -> }

                    } else {
                        // There was some problem, continue regardless of the result.
                        // show native rate app dialog on error
                        showRateAppFallbackDialog()
                    }
                }
            }catch (e:Exception){
                showRateAppFallbackDialog()

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

    private fun showRateAppFallbackDialog() {
        if(isAdded) {
            MaterialAlertDialogBuilder(requireContext())
                .setTitle(R.string.rate_app_title)
                .setMessage(R.string.rate_app_message)
                .setPositiveButton(R.string.rate_btn_pos) { dialog, which -> }
                .setNegativeButton(
                    R.string.rate_btn_neg
                ) { dialog, which -> }
                .setNeutralButton(
                    R.string.rate_btn_nut
                ) { dialog, which -> }
                .setOnDismissListener(DialogInterface.OnDismissListener { dialog: DialogInterface? -> })
                .show()
        }
    }

}