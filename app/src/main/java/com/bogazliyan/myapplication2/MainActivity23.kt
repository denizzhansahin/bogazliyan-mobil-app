package com.bogazliyan.myapplication2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity23 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main23)

        val myImageButton1: ImageButton = findViewById(R.id.imageButton1)
        myImageButton1.setOnClickListener {
            val intent = Intent(this, MainActivity24::class.java)
            startActivity(intent)
        }

        val myImageButton2: ImageButton = findViewById(R.id.imageButton2)
        myImageButton2.setOnClickListener {
            val intent = Intent(this, MainActivity25::class.java)
            startActivity(intent)
        }

        val myImageButton4: ImageButton = findViewById(R.id.imageButton4)
        myImageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity26::class.java)
            startActivity(intent)
        }

        val myImageButton5: ImageButton = findViewById(R.id.imageButton5)
        myImageButton5.setOnClickListener {
            val intent = Intent(this, MainActivity27::class.java)
            startActivity(intent)
        }

        val myImageButton6: ImageButton = findViewById(R.id.imageButton6)
        myImageButton6.setOnClickListener {
            val intent = Intent(this, MainActivity28::class.java)
            startActivity(intent)
        }

        val myImageButton7: ImageButton = findViewById(R.id.imageButton)
        myImageButton7.setOnClickListener {
            val intent = Intent(this, MainActivity29::class.java)
            startActivity(intent)
        }

        val myImageButton8: ImageButton = findViewById(R.id.imageButton3)
        myImageButton8.setOnClickListener {
            val intent = Intent(this, MainActivity30::class.java)
            startActivity(intent)
        }

        val myImageButton9: ImageButton = findViewById(R.id.imageButton7)
        myImageButton9.setOnClickListener {
            val intent = Intent(this, MainActivity31::class.java)
            startActivity(intent)
        }

        val myImageButton10: ImageButton = findViewById(R.id.imageButton8)
        myImageButton10.setOnClickListener {
            val intent = Intent(this, MainActivity32::class.java)
            startActivity(intent)
        }

        val myImageButton11: ImageButton = findViewById(R.id.imageButton9)
        myImageButton11.setOnClickListener {
            val intent = Intent(this, MainActivity33::class.java)
            startActivity(intent)
        }

        val myImageButton12: ImageButton = findViewById(R.id.imageButton10)
        myImageButton12.setOnClickListener {
            val intent = Intent(this, MainActivity34::class.java)
            startActivity(intent)
        }

        val myImageButton13: ImageButton = findViewById(R.id.imageButton19)
        myImageButton13.setOnClickListener {
            val intent = Intent(this, MainActivity35::class.java)
            startActivity(intent)
        }

        val myImageButton14: ImageButton = findViewById(R.id.imageButton20)
        myImageButton14.setOnClickListener {
            val intent = Intent(this, MainActivity36::class.java)
            startActivity(intent)
        }


    }
}