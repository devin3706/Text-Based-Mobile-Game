package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot1 : AppCompatActivity() {

    lateinit var dec_1_1: Button
    lateinit var dec_1_2: Button
    lateinit var dec_1_3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot1)

        dec_1_1 = findViewById(R.id.dec_1_1)
        dec_1_2 = findViewById(R.id.dec_1_2)
        dec_1_3 = findViewById(R.id.dec_1_3)

        dec_1_1.setOnClickListener {
            toPlot_2_dec_1_1()
        }
        dec_1_2.setOnClickListener {
            toPlot_3_dec_1_2()
        }
        dec_1_3.setOnClickListener {
            toEpilogue_1()
        }
    }

    fun toPlot_2_dec_1_1(){
        val Intent = Intent (this, chap1_plot2_plt1dec11::class.java)
        Intent.putExtra("adv", 1)
        Intent.putExtra("att", "Brave")
        startActivity(Intent)
    }
    fun toPlot_3_dec_1_2(){
        val Intent = Intent (this, chap1_plot3_plt1dec12::class.java)
        Intent.putExtra("intel", 1)
        Intent.putExtra("att", "Curious")
        Intent.putExtra("other", 1)
        startActivity(Intent)
    }
    fun toEpilogue_1(){
        val Intent = Intent (this, chap1_epilogue1_plt1dec13::class.java)
        Intent.putExtra("att", "Lazy")
        startActivity(Intent)
    }
}