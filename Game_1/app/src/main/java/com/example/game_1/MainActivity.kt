package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val handler = android.os.Handler()
        val runnable = Runnable {
            val intent = Intent(this, onBoarding_page_2::class.java)  // Replace with your actual next activity class
            startActivity(intent)
            finish()
        }
        handler.postDelayed(runnable, 3000)
    }
}