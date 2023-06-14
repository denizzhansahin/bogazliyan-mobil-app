package com.bogazliyan.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myImageButton: ImageButton = findViewById(R.id.imageButton1)
        myImageButton.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val myImageButton1: ImageButton = findViewById(R.id.imageButton2)
        myImageButton1.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)
            startActivity(intent)
        }

        val myImageButton3: ImageButton = findViewById(R.id.imageButton4)
        myImageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        val myImageButton4: ImageButton = findViewById(R.id.imageButton5)
        myImageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }

        val myImageButton5: ImageButton = findViewById(R.id.imageButton6)
        myImageButton5.setOnClickListener {
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)
        }
    }
}