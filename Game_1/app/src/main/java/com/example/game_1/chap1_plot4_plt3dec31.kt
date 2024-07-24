package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot4_plt3dec31 : AppCompatActivity() {

    lateinit var dec_4_1_31: Button
    lateinit var dec_4_2_31: Button
    lateinit var dec_4_3_31: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot4_plt3dec31)

        val intent = intent
        var adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        var intel = intent.getIntExtra("intel", -99)
        val other = intent.getIntExtra("other", -99)

        dec_4_1_31 = findViewById(R.id.dec_4_1_31)
        dec_4_2_31 = findViewById(R.id.dec_4_2_31)
        dec_4_3_31 = findViewById(R.id.dec_4_3_31)

        dec_4_1_31.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            adv += 1
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", att)
            Intent.putExtra("intel", intel)
            Intent.putExtra("epilogue_2/3", 1)
            Intent.putExtra("other", other)
            startActivity(Intent)
        }
        dec_4_2_31.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            adv += 1
            Intent.putExtra("epilogue_2/3", 2)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", att)
            Intent.putExtra("intel", intel)
            Intent.putExtra("other", other)
            startActivity(Intent)
        }
        dec_4_3_31.setOnClickListener {
            val Intent = Intent (this, chap1_plot_sp_4_plt4dec43::class.java)
            if(intel != -99){
                intel += 1
            }
            Intent.putExtra("adv", adv)
            //Intent.putExtra("att", "Curious")
            Intent.putExtra("intel", intel)
            Intent.putExtra("other", other)
            startActivity(Intent)
        }
    }
}