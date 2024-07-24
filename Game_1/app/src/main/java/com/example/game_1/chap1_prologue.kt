package com.example.game_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.lifecycle.ViewModelProvider

class chap1_prologue : AppCompatActivity() {

    lateinit var nextBtn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_prologue)

        nextBtn = findViewById(R.id.nextBtn_1)

        nextBtn.setOnClickListener {
            next()
        }
    }

    fun next(){
        val Intent = Intent (this, chap1_plot1::class.java)
        startActivity(Intent)
        finish()
    }
}