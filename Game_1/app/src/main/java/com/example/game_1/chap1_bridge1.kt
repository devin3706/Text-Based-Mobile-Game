package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class chap1_bridge1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_bridge1)

        val intent = intent
        val fromPlot_4 = intent.getIntExtra("epilogue_2/3", -1)
        val fromPlot_3 = intent.getIntExtra("epilogue_4", -2)
        val fromPlot_1 = intent.getIntExtra("epilogue_1", -5)
        val adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        val intel = intent.getIntExtra("intel", -99)
        val other = intent.getIntExtra("other", -99)

        val handler = android.os.Handler()
        val runnable = Runnable {
                if (fromPlot_4 == 1) {
                    val Intent = Intent(this, chap1_epilogue2_plt4dec41::class.java)
                    Intent.putExtra("adv", adv)
                    Intent.putExtra("att", att)
                    Intent.putExtra("intel", intel)
                    Intent.putExtra("other", other)
                    startActivity(Intent)
                }else if (fromPlot_4 == 2) {
                    val Intent = Intent(this, chap1_epilogue3_plt4dec42::class.java)
                    Intent.putExtra("adv", adv)
                    Intent.putExtra("att", att)
                    Intent.putExtra("intel", intel)
                    Intent.putExtra("other", other)
                    startActivity(Intent)
                }else if (fromPlot_3 == 3) {
                    val Intent = Intent(this, chap1_epilogue4_plt3dec32::class.java)
                    Intent.putExtra("adv", adv)
                    Intent.putExtra("att", att)
                    Intent.putExtra("intel", intel)
                    Intent.putExtra("other", other)
                    startActivity(Intent)
                }else if (fromPlot_1 == 5) {
                    val Intent = Intent(this, chap1_epilogue1_plt1dec13::class.java)
                    Intent.putExtra("att", att)
                    startActivity(Intent)
                }
            }

        handler.postDelayed(runnable, 3000)
    }
}