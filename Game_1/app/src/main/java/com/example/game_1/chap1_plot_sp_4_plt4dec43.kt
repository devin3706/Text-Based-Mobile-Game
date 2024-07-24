package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_plot_sp_4_plt4dec43 : AppCompatActivity() {

    lateinit var dec_sp_41: Button
    lateinit var dec_sp_42: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_plot_sp4_plt4dec43)

        val intent = intent
        var adv = intent.getIntExtra("adv", -99)
        //val att = intent.getStringExtra("att")
        var intel = intent.getIntExtra("intel", -99)
        val other = intent.getIntExtra("other", -99)

        dec_sp_41 = findViewById(R.id.dec_sp_4_1)
        dec_sp_42 = findViewById(R.id.dec_sp_4_2)

        dec_sp_41.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            if(intel != -99){
                intel += 1
            }
            adv += 1
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Brave")
            Intent.putExtra("intel", intel)
            Intent.putExtra("other", other)
            Intent.putExtra("epilogue_2/3", 1)
            startActivity(Intent)
        }
        dec_sp_42.setOnClickListener {
            val Intent = Intent (this, chap1_bridge1::class.java)
            adv += 1
            Intent.putExtra("adv", adv)
            Intent.putExtra("att", "Bold")
            Intent.putExtra("intel", intel)
            Intent.putExtra("other", other)
            Intent.putExtra("epilogue_2/3", 2)
            startActivity(Intent)
        }
    }
}