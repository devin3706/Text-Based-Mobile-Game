package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot3_plt2 : AppCompatActivity() {

    lateinit var dec_3_1_21: Button
    lateinit var dec_3_2_21: Button
    lateinit var dec_3_3_21: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot3_plt2)

        val intent = intent
        var adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        var intel = intent.getIntExtra("intel", 0)

        dec_3_1_21 = findViewById(R.id.dec_3_1_21)
        dec_3_2_21 = findViewById(R.id.dec_3_2_21)
        dec_3_3_21 = findViewById(R.id.dec_3_3_21)

        dec_3_1_21.setOnClickListener {
            val Intent = Intent (this, chap1_plot4_plt3dec31::class.java)
            intel -= 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", att)
            startActivity(Intent)
        }
        dec_3_2_21.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            intel -= 1
            adv += 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Bold")
            Intent.putExtra("epilogue_4",3)
            startActivity(Intent)
        }
        dec_3_3_21.setOnClickListener {
            val Intent = Intent (this, chap1_plot_sp_3_plt3dec33::class.java)
            intel += 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Curious")
            startActivity(Intent)
        }
    }
}