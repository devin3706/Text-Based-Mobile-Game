package com.example.game_1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class onBoarding_page_2 : AppCompatActivity() {

    lateinit var start: Button
    lateinit var toPrevGames: Button

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_page2)

        start = findViewById(R.id.startBtn)
        toPrevGames = findViewById(R.id.prevGames)

        start.setOnClickListener {
            startGame()
        }

        toPrevGames.setOnClickListener {
            toPreviousGames()
        }
    }

    fun startGame() {
        val Intent = Intent(this, chap1_startPage::class.java)
        startActivity(Intent)
    }

    fun toPreviousGames() {
        val Intent = Intent (this, chap1_prevGames::class.java)
        startActivity(Intent)
    }
}

