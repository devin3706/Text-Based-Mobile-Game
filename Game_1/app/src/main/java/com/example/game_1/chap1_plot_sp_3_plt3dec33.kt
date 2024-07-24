package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot_sp_3_plt3dec33 : AppCompatActivity() {

    lateinit var dec_sp_3_1: Button
    lateinit var dec_sp_3_2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot_sp3_plt3dec33)

        val intent = intent

        var adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        var intel = intent.getIntExtra("intel", -99)
        val other = intent.getIntExtra("other", -99)

        dec_sp_3_1 = findViewById(R.id.dec_sp_3_1)
        dec_sp_3_2 = findViewById(R.id.dec_sp_3_2)

        dec_sp_3_1.setOnClickListener {
            val Intent = Intent (this, chap1_plot4_plt3dec31::class.java)
            intel += 1
            adv += 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", att)
            Intent.putExtra("other", other)
            Intent.putExtra("bridge_1", 1)
            startActivity(Intent)
        }
        dec_sp_3_2.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            intel -= 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Bold")
            Intent.putExtra("other", other)
            Intent.putExtra("epilogue_4",3)
            startActivity(Intent)
        }
    }
}