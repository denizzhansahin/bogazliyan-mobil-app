package com.bogazliyan.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity37 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main37)

        val myImageButton: ImageButton = findViewById(R.id.imageButton_1)
        myImageButton.setOnClickListener {
            val intent = Intent(this, MainActivity38::class.java)
            startActivity(intent)
        }


        val myImageButton2: ImageButton = findViewById(R.id.imageButton_2)
        myImageButton2.setOnClickListener {
            val intent = Intent(this, MainActivity39::class.java)
            startActivity(intent)
        }

        val myImageButton3: ImageButton = findViewById(R.id.imageButton_3)
        myImageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity40::class.java)
            startActivity(intent)
        }

        val myImageButton4: ImageButton = findViewById(R.id.imageButton_4)
        myImageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity41::class.java)
            startActivity(intent)
        }

    }
}