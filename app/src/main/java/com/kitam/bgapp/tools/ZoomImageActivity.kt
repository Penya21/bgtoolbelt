package com.kitam.bgapp.tools

import androidx.appcompat.app.AppCompatActivity
import android.annotation.SuppressLint
import android.os.Build
import android.os.Bundle
import android.os.Handler
import android.view.MotionEvent
import android.view.View
import android.view.WindowInsets
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.viewModels
import androidx.fragment.app.activityViewModels
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.kitam.bgapp.R
import com.kitam.bgapp.databinding.ActivityZoomImageBinding
import com.kitam.bgapp.model.BoardGameViewModel

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class ZoomImageActivity : AppCompatActivity() {

    private lateinit var binding: ActivityZoomImageBinding



    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityZoomImageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val url=intent.getStringExtra("url")

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        Glide.with(this).load(url).transition(DrawableTransitionOptions.withCrossFade(250)).error(R.drawable.splash_background).into(binding.image)
    }



}