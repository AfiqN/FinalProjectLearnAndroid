package com.example.finalproject

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SplashSchreen: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spash_activity)

        val imgView: ImageView = findViewById(R.id.imageView)
        val textView: TextView = findViewById(R.id.textView)
        textView.alpha = 0f
        textView.animate().setDuration(1000).alpha(1f)
        imgView.alpha = 0f
        imgView.animate().setDuration(1000).alpha(1f).withEndAction {
            val i = Intent(this@SplashSchreen, MainActivity::class.java)
            startActivity(i)
            @Suppress("DEPRECATION")
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}