package com.example.game_1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class chap1_prevGames : AppCompatActivity() {

    lateinit var backToStart: Button
    lateinit var reset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_prev_games)

        //accessing and displaying high score
        val sharedPreferences = getSharedPreferences("HighScore", Context.MODE_PRIVATE)

        val highestAttitude = sharedPreferences.getString("highestAttitude", "")
        val highestIntellect = sharedPreferences.getInt("highestIntellect", 0)
        val highestAdventure = sharedPreferences.getInt("highestAdventure", 0)

        val _highAtt = findViewById<TextView>(R.id.best_att)
        _highAtt.text = highestAttitude
        val _highIntel = findViewById<TextView>(R.id.best_intel)
        _highIntel.text = highestIntellect.toString()
        val _highAdventurous = findViewById<TextView>(R.id.best_adv)
        _highAdventurous.text = highestAdventure.toString()

        //accessing and displaying last game details
        val lastGame = getSharedPreferences("LastGame", Context.MODE_PRIVATE)

        val lastAttitude = lastGame.getString("lastAttitude", "")
        val lastIntellect = lastGame.getInt("lastIntellect", 0)
        val lastAdventure = lastGame.getInt("lastAdventure", 0)
        val lastStatus = lastGame.getString("lastStatus", "")
        val lastSecret = lastGame.getString("lastSecret", "")

        val _lastAtt = findViewById<TextView>(R.id.prev_att)
        _lastAtt.text = lastAttitude
        val _lastIntel = findViewById<TextView>(R.id.prev_intel)
        _lastIntel.text = lastIntellect.toString()
        val _lastAdventurous = findViewById<TextView>(R.id.prev_adv)
        _lastAdventurous.text = lastAdventure.toString()
        val _lastObjective = findViewById<TextView>(R.id.prev_status)
        _lastObjective.text = lastStatus
        val _lastOther = findViewById<TextView>(R.id.prev_secret)
        _lastOther.text = lastSecret


        backToStart = findViewById(R.id.backToStart_2)
        reset = findViewById(R.id.reset)

        backToStart.setOnClickListener {
            val Intent = Intent (this, onBoarding_page_2::class.java)
            startActivity(Intent)
        }

        reset.setOnClickListener {
            val editor = sharedPreferences.edit()
            editor.clear()
            editor.apply()

            val editorLastGame = lastGame.edit()
            editorLastGame.clear()
            editorLastGame.apply()

            val Intent = Intent (this, onBoarding_page_2::class.java)
            startActivity(Intent)
        }
    }
}