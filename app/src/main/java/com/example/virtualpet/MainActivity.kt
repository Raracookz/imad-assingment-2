package com.example.virtualpet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val startButton: Button = findViewById(R.id.startButton)

    /*
        startButton.setOnClcklistener {
            val intent = Intent (this, Virtual::class.java)
            startActivity(Intent)

        }
     */


        startButton.setOnClickListener {
            startActivity(Intent(this, Virtual::class.java))
            finish()
        }

    }
}




