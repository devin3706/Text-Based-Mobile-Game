package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class chap1_startPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_startpage)

        val handler = android.os.Handler()
        val runnable = Runnable {
            val intent = Intent(this, chap1_prologue::class.java)
            startActivity(intent)
            finish()
        }
        handler.postDelayed(runnable, 3000)
    }
}