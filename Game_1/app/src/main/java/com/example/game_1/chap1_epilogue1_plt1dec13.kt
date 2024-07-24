package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class chap1_epilogue1_plt1dec13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_epilogue1_plt1dec13)

        val intent = intent
        val att = intent.getStringExtra("att")

        val handler = android.os.Handler()
        val runnable = Runnable {
            val Intent = Intent(this, chap1_result::class.java)
            Intent.putExtra("att", att)
            Intent.putExtra("epilogues", 1)
            startActivity(Intent)
        }
        handler.postDelayed(runnable, 5000)
    }
}