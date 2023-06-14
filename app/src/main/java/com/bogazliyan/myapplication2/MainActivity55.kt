package com.bogazliyan.myapplication2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity55 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main55)

        val button = findViewById<Button>(R.id.button177)
        button.setOnClickListener {
            val url = "https://www.mehmetakinol.com.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }

        val button1 = findViewById<Button>(R.id.button178)
        button1.setOnClickListener {
            val url = "https://www.linkedin.com/in/mehmet-akinol-0725381a/?locale=tr_TR"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        val button2 = findViewById<Button>(R.id.button179)
        button2.setOnClickListener {
            val url = "https://twitter.com/makinol"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }

        val button3 = findViewById<Button>(R.id.button183)
        button3.setOnClickListener {
            val url = "https://www.instagram.com/bogazliyanmobil/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }




        val button4 = findViewById<Button>(R.id.button180)
        button4.setOnClickListener {
            val url = "https://www.denizhansahin.com/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }

        val button5 = findViewById<Button>(R.id.button181)
        button5.setOnClickListener {
            val url = "https://www.linkedin.com/in/denizhan-%C5%9Fahin-a5136b211/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        val button6 = findViewById<Button>(R.id.button182)
        button6.setOnClickListener {
            val url = "https://twitter.com/denizzhansahin"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }

        val button7 = findViewById<Button>(R.id.button184)
        button7.setOnClickListener {
            val url = "https://www.instagram.com/bogazliyanmobil/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }

    }
}