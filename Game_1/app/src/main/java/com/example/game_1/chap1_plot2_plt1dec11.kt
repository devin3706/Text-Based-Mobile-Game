package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot2_plt1dec11 : AppCompatActivity() {

    lateinit var dec_2_1_11: Button
    lateinit var dec_2_2_11: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot2_plt1dec11)

        val intent = intent
        val adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")

        dec_2_1_11 = findViewById(R.id.dec_2_1_11)
        dec_2_2_11 = findViewById(R.id.dec_2_2_11)

        dec_2_1_11.setOnClickListener {
            val Intent = Intent (this, chap1_plot3_plt2dec21::class.java)
            if(adv == 1){
                Intent.putExtra("adv", 2)
            }else{
                Intent.putExtra("adv", 1)
            }
            Intent.putExtra("att", att)
            startActivity(Intent)
        }
        dec_2_2_11.setOnClickListener {
            val Intent = Intent (this, chap1_plot3_plt2dec22::class.java)
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Scared")
            Intent.putExtra("intel", 1)
            startActivity(Intent)
        }
    }
}