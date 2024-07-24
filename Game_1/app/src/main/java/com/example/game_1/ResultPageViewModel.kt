package com.example.game_1

import androidx.lifecycle.ViewModel

class ResultPageViewModel : ViewModel() {

    private var attitude = "Unknown"
    private var intellect = 0
    private var adventure = 0
    private var secret = "🔸No Secrets Found🔸"
    private var status = "Status Unknown"

    fun setAttitude(att: String) {
        attitude = att
    }

    fun getAttitude(): String {
        return attitude
    }

    fun finalOutputs(i: Int, ad: Int, scrt: String, objective: String){
        intellect = i
        adventure = ad
        secret = scrt
        status = objective
    }

    fun getIntellect(): Int {
        return intellect
    }

    fun getAdventure(): Int {
        return adventure
    }

    fun getSecret(): String {
        return secret
    }

    fun getStatus(): String {
        return status
    }
}
