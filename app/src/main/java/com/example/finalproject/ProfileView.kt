package com.example.finalproject

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ProfileView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        supportActionBar?.title = "Profil"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        val backBtn: Button = findViewById(R.id.profile_back_btn)
        backBtn.setOnClickListener {
            finish()
        }

    }
}