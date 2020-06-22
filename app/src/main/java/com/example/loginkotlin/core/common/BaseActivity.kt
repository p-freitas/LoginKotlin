package com.example.loginkotlin.core.common

import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    companion object {
        const val SUCCESS = "success"
        const val TITLE = "title"
        const val MESSAGE = "message"
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        //   if (hasFocus) setFullscreen()
    }

    private fun setFullscreen() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    override fun onBackPressed() {
        /** Do nothing!! */
    }

}