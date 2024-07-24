package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_epilogue2_plt4dec41 : AppCompatActivity() {

    lateinit var skipBtn_2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_epilogue2_plt4dec41)

        skipBtn_2 = findViewById(R.id.skipBtn_2)

        skipBtn_2.setOnClickListener {
            skip()
        }
    }

    fun skip(){
        val intent = intent
        val adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        val intel = intent.getIntExtra("intel", -99)
        val other = intent.getIntExtra("other", -99)

        val Intent = Intent(this, chap1_result::class.java)
        Intent.putExtra("adv", adv)
        Intent.putExtra("att", att)
        Intent.putExtra("intel", intel)
        Intent.putExtra("other", other)
        Intent.putExtra("epilogues", 2)
        startActivity(Intent)
    }
}