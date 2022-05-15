package com.kitam.bgapp

import android.content.Intent
import android.os.Bundle
import android.view.ScaleGestureDetector
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.lifecycle.Observer
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import com.comix.overwatch.HiveProgressView
import com.firebase.ui.auth.AuthUI
import com.google.android.gms.ads.AdLoader
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.kitam.bgapp.model.BoardGameViewModel
import com.kitam.bgapp.ui.login.LoginActivity
import io.github.muddz.styleabletoast.StyleableToast
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior

import androidx.coordinatorlayout.widget.CoordinatorLayout

import android.view.ViewGroup





class MainActivity : AppCompatActivity() {

    var progressBar: HiveProgressView? = null
    private val boardGameViewModel: BoardGameViewModel by viewModels()
    lateinit var adLoader: AdLoader
    lateinit var navView: BottomNavigationView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        navView = findViewById(R.id.nav_view)

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
                R.id.navigation_hot,R.id.navigation_search, R.id.navigation_stores, R.id.navigation_dashboard, R.id.navigation_notifications, R.id.navigation_profile
            )
        )
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)


    }

    override fun onDestroy() {
        super.onDestroy()
    }


    fun showBottomNavigationMenu(){
        val layoutParams: ViewGroup.LayoutParams = navView.layoutParams
        if (layoutParams is CoordinatorLayout.LayoutParams) {
            val behavior = layoutParams.behavior
            if (behavior is HideBottomViewOnScrollBehavior<*>) {
                val hideShowBehavior =
                    behavior as HideBottomViewOnScrollBehavior<BottomNavigationView>
                hideShowBehavior.slideUp(navView)
            }
        }
    }

    fun hideBottomNavigationMenu(){
        val layoutParams: ViewGroup.LayoutParams = navView.layoutParams
        if (layoutParams is CoordinatorLayout.LayoutParams) {
            val behavior = layoutParams.behavior
            if (behavior is HideBottomViewOnScrollBehavior<*>) {
                val hideShowBehavior =
                    behavior as HideBottomViewOnScrollBehavior<BottomNavigationView>
                hideShowBehavior.slideDown(navView)
            }
        }
    }


}