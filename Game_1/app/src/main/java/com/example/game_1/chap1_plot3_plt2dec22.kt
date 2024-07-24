package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot3_plt2dec22 : AppCompatActivity() {

    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot3_plt2dec22)

        val intent = intent
        val adv = intent.getIntExtra("adv", -99)
        val intel = intent.getIntExtra("intel", -99)
        val att = intent.getStringExtra("att")

        next = findViewById(R.id.plt3_22)

        next.setOnClickListener {
            val Intent = Intent (this, chap1_plot3_plt2::class.java)
            Intent.putExtra("intel", intel)
            Intent.putExtra("att", att)
            Intent.putExtra("adv", adv)
            startActivity(Intent)
        }
    }
}