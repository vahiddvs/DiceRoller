package com.vahidseidi.projects.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val resultFirstDice: TextView = findViewById(R.id.textView1)
        val firstDice = Dice(6)
        resultFirstDice.text = firstDice.roll().toString()

        val resultSecondDice: TextView = findViewById(R.id.textView2)
        val secondDice = Dice(6)
        resultSecondDice.text=secondDice.roll().toString()
    }
}

class Dice(val numSides: Int) {

    fun roll(): Int {
        return (1..numSides).random()
    }
}