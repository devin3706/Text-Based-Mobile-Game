package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot3_plt2dec21 : AppCompatActivity() {

    lateinit var next: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot3_plt2dec21)

        next = findViewById(R.id.plt3_21)

        next.setOnClickListener {
            toPlot_3_plt2()
        }
    }

    fun toPlot_3_plt2(){
        val intent = intent
        val adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")

        val Intent = Intent (this, chap1_plot3_plt2::class.java)
        Intent.putExtra("adv", adv)
        Intent.putExtra("att", att)
        startActivity(Intent)
    }
}