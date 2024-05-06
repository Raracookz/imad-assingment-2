package com.example.virtualpet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Virtual : AppCompatActivity() {

    private var health = 100
    private var hunger = 0
    private var cleanliness = 100



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_virtual)

        val petImage: pl.droidsonroids.gif.GifImageView = findViewById(R.id.gifImageView)
        val feedButton: Button = findViewById(R.id.button_Feed)
        val cleanButton: Button = findViewById(R.id.button_Clean)
        val playButton: Button = findViewById(R.id.button_Play)

        feedButton.setOnClickListener{
            feedPet()
            petImage.setImageResource(R.drawable.sharkeel_eating)
        }

        cleanButton.setOnClickListener{
            cleanPet()
            petImage.setImageResource(R.drawable.sharkeel_cleaned)
        }

        playButton.setOnClickListener {
            playWithPet()
            petImage.setImageResource(R.drawable.sharkeel_playing)
        }

        
        updateStatusText()
    }


    private fun feedPet() {
        hunger -= 20
        if (hunger < 0) hunger = 0
        health += 10
        if (health > 100) health = 100
        updateStatusText()
    }

    private fun cleanPet(){
        cleanliness = 100
        health += 5
        if (health > 100) health = 100
        updateStatusText()
    }

    private fun playWithPet(){
        health -= 10
        if (health < 0) health = 0
        hunger += 20
        if (hunger > 100) hunger = 100
        cleanliness -= 10
        if (cleanliness < 0) cleanliness = 0
        updateStatusText()
    }


    private fun updateStatusText(){
        val statusText: TextView = findViewById(R.id.statusText1)
        statusText.text = "Health: $health Hunger: $hunger Cleanliness: $cleanliness"

    }


}