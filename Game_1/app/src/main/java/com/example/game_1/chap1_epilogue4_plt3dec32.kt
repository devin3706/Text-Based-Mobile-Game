package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider

class chap1_epilogue4_plt3dec32 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_epilogue4_plt3dec32)

        val intent = intent

        val adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        val intel = intent.getIntExtra("intel", 0)
        val other = intent.getIntExtra("other", -99)

        val handler = android.os.Handler()
        val runnable = Runnable {
            val Intent = Intent(this, chap1_result::class.java)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", att)
            Intent.putExtra("intel", intel)
            Intent.putExtra("other", other)
            Intent.putExtra("epilogues", 4)
            startActivity(Intent)
        }
        handler.postDelayed(runnable, 5000)
    }
}