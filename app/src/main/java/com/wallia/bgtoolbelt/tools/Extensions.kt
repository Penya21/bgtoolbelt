package com.wallia.bgtoolbelt.tools

import android.app.Activity
import android.os.Build
import android.text.Html
import android.text.Spanned
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide


    //Check Nulls
    fun Any?.isNull() = this == null

    //Show Toast
    fun Activity.toast(text: String, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, text, duration).show()
    }

    //Get Color
    fun Activity.color(@ColorRes color: Int) = ContextCompat.getColor(this, color)


    //Load Url into ImageView
    fun ImageView.load(url: String) {
        if (url.isNotEmpty()) {
            Glide.with(this.context).load(url).into(this)
        }
    }

    fun String.toSpanned(): Spanned {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            return Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY)
        } else {
            @Suppress("DEPRECATION")
            return Html.fromHtml(this)
        }
    }

    fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

