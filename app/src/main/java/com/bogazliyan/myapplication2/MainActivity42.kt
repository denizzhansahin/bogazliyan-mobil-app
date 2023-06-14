package com.bogazliyan.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity42 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main42)


        val myImageButton1: ImageButton = findViewById(R.id.imageButton1_yemek)
        myImageButton1.setOnClickListener {
            val intent = Intent(this, MainActivity43::class.java)
            startActivity(intent)
        }

        val myImageButton2: ImageButton = findViewById(R.id.imageButton2_yemek)
        myImageButton2.setOnClickListener {
            val intent = Intent(this, MainActivity44::class.java)
            startActivity(intent)
        }

        val myImageButton4: ImageButton = findViewById(R.id.imageButton4_yemek)
        myImageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity45::class.java)
            startActivity(intent)
        }

    }
}