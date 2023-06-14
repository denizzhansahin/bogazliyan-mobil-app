package com.bogazliyan.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity10 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main10)

        val myImageButton: ImageButton = findViewById(R.id.imageButton1)
        myImageButton.setOnClickListener {
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        val myImageButton1: ImageButton = findViewById(R.id.imageButton2)
        myImageButton1.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

        val myImageButton2: ImageButton = findViewById(R.id.imageButton4)
        myImageButton2.setOnClickListener {
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

        val myImageButton3: ImageButton = findViewById(R.id.imageButton5)
        myImageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

        val myImageButton4: ImageButton = findViewById(R.id.imageButton6)
        myImageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity15::class.java)
            startActivity(intent)
        }

    }
}