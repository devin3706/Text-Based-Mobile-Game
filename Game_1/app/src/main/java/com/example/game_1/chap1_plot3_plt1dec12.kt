package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot3_plt1dec12 : AppCompatActivity() {

    lateinit var dec_3_1_12: Button
    lateinit var dec_3_2_12: Button
    lateinit var dec_3_3_12: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cahp1_plot3_plt1dec12)

        val intent = intent
        var intel = intent.getIntExtra("intel", -99)
        val att = intent.getStringExtra("att")
        var adv = intent.getIntExtra("adv", 0)
        val other = intent.getIntExtra("other", -99)

        dec_3_1_12 = findViewById(R.id.dec_3_1_12)
        dec_3_2_12 = findViewById(R.id.dec_3_2_12)
        dec_3_3_12 = findViewById(R.id.dec_3_3_12)

        dec_3_1_12.setOnClickListener {
            val Intent = Intent (this, chap1_plot4_plt3dec31::class.java)
            intel -= 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("att", "Scared")
            Intent.putExtra("adv", adv)
            Intent.putExtra("other", other)
            startActivity(Intent)
        }
        dec_3_2_12.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            intel -= 1
            adv += 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Bold")
            Intent.putExtra("other", other)
            Intent.putExtra("epilogue_4", 3)
            startActivity(Intent)
        }
        dec_3_3_12.setOnClickListener {
            val Intent = Intent (this, chap1_plot_sp_3_plt3dec33::class.java)
            intel += 1
            Intent.putExtra("intel", intel)
            Intent.putExtra("att", att)
            Intent.putExtra("adv", adv)
            Intent.putExtra("other", other)
            startActivity(Intent)
        }
    }
}