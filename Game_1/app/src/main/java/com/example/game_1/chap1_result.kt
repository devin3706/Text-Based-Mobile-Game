package com.example.game_1

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class chap1_result : AppCompatActivity() {

    lateinit var backToStart: Button

    lateinit var viewModel: ResultPageViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chap1_result)

        viewModel = ViewModelProvider(this).get(ResultPageViewModel::class.java)

        val intent = intent

        val endings = intent.getIntExtra("epilogues", -1)
        val other = intent.getIntExtra("other", -99)

        val adv = intent.getIntExtra("adv", -99)
        val att = intent.getStringExtra("att")
        val intel = intent.getIntExtra("intel", -99)

        val intellect: Int
        val adventure: Int
        val status: String
        val statusInt: Int
        val secret: String

        viewModel.setAttitude(att.toString())

        //setting intellect
        if(intel > -4){
            intellect = 5 * intel
        }else{
            intellect = 0
        }

        //setting adventure
        if(adv > 0){
            adventure = 5 * adv
        }else{
            adventure = 0
        }

        //setting secret
        if (other == 1){
            secret = "🔹Secret Storyline Found🔹"
        }else{
            secret = "🔸No Secrets Found🔸"
        }

        //setting objective status
        if (endings == 1){
            status = "🔸Objective Failed🔸"
            statusInt = 0

        }else if (endings == 2){
            status = "🔹Objective Passed🔹"
            statusInt = 1

        }else if (endings == 3){
            status = "🔸Objective Failed🔸"
            statusInt = 0

        }else if (endings == 4){
            status = "🔸Objective Failed🔸"
            statusInt = 0

        }else{
            status = "Status Unknown"
            statusInt = 0
        }

        viewModel.finalOutputs(intellect, adventure, secret, status)

        val _att = findViewById<TextView>(R.id.attd)
        _att.text = viewModel.getAttitude()
        val _intel = findViewById<TextView>(R.id.intlct)
        _intel.text = viewModel.getIntellect().toString()
        val _adventurous = findViewById<TextView>(R.id.advn)
        _adventurous.text = viewModel.getAdventure().toString()

        val _objective = findViewById<TextView>(R.id.objective)
        _objective.text = viewModel.getStatus()
        val _other = findViewById<TextView>(R.id.other)
        _other.text = viewModel.getSecret()

        //setting up high score - using shared preferences
        val sharedPreferences = getSharedPreferences("HighScore", Context.MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        val currentAttitude = att
        val currentIntellect = intellect
        val currentAdventure = adventure
        val currentStatus = status
        val currentSecret = secret

        val highestIntellect = sharedPreferences.getInt("highestIntellect", 0)
        val highestAdventure = sharedPreferences.getInt("highestAdventure", 0)

        if (currentIntellect > highestIntellect && currentAdventure > highestAdventure && statusInt == 1) {
            editor.putString("highestAttitude", currentAttitude)
            editor.putInt("highestIntellect", currentIntellect)
            editor.putInt("highestAdventure", currentAdventure)
        }

        editor.apply()

        //setting up Last played game - using shared preferences
        val lastGame = getSharedPreferences("LastGame", Context.MODE_PRIVATE)
        val editorLastGame = lastGame.edit()

        editorLastGame.putString("lastAttitude", currentAttitude)
        editorLastGame.putInt("lastIntellect", currentIntellect)
        editorLastGame.putInt("lastAdventure", currentAdventure)
        editorLastGame.putString("lastStatus", currentStatus)
        editorLastGame.putString("lastSecret", currentSecret)

        editorLastGame.apply()


        backToStart = findViewById(R.id.backToStart)

        backToStart.setOnClickListener {
            toStart()
        }
    }

    fun toStart(){
        val Intent = Intent (this, onBoarding_page_2::class.java)
        startActivity(Intent)
    }
}