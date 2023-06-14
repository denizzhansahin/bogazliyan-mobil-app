package com.bogazliyan.myapplication2

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity36 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main36)

        val button1 = findViewById<Button>(R.id.button176)

        button1.setOnClickListener {
            val destination = "39.179046,35.241394"
            val uri = Uri.parse("google.navigation:q=$destination")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            intent.setPackage("com.google.android.apps.maps")
            try {
                startActivity(intent)
            } catch (e: ActivityNotFoundException) {
                // Google Maps app is not installed, use browser instead
                val mapsIntent = Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("http://maps.google.com/maps?q=$destination")
                )
                startActivity(mapsIntent)
            }
        }

    }
}