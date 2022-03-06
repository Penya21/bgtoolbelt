package com.kitam.bgapp.tools

import android.app.Activity
import android.os.Build
import android.text.Html
import android.widget.ImageView
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.core.content.ContextCompat
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
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

    fun String.removeHTML(): String {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            var temp = Html.fromHtml(this, Html.FROM_HTML_MODE_COMPACT).toString().replace("&#10;", "\n" )

//            return Html.fromHtml(Html.fromHtml(this, Html.FROM_HTML_MODE_LEGACY).toString(), Html.FROM_HTML_MODE_COMPACT).toString()
            return Html.fromHtml(temp, Html.FROM_HTML_MODE_LEGACY).toString()
        } else {
            @Suppress("DEPRECATION")
            return Html.fromHtml(this).toString()
        }
    }

    fun String.removeFirstLastChar(): String =  this.substring(1, this.length - 1)

    fun <T> LiveData<T>.observeOnce(lifecycleOwner: LifecycleOwner, observer: Observer<T>) {
        observe(lifecycleOwner, object : Observer<T> {
            override fun onChanged(t: T?) {
                observer.onChanged(t)
                removeObserver(this)
            }
        })
    }
