package com.bogazliyan.myapplication2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity16 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main16)

       //içişleri bakanlığı
        val button57 = findViewById<Button>(R.id.button57)
        //valilik
        val button58 = findViewById<Button>(R.id.button58)
        //kaymakamlık
        val button59 = findViewById<Button>(R.id.button59)
        //cimer
        val button60 = findViewById<Button>(R.id.button60)
        //112 - acil
        val button61 = findViewById<Button>(R.id.button61)
        //ilçe milli eğitim
        val button62 = findViewById<Button>(R.id.button62)
        //ilçe gençlik ve spor
        val button63 = findViewById<Button>(R.id.button63)
        //ilçe sağlık
        val button64 = findViewById<Button>(R.id.button64)
        //ilçe tarım
        val button65 = findViewById<Button>(R.id.button65)
        //devlet hastanesi
        val button66 = findViewById<Button>(R.id.button66)
        //gençlik merkezi
        val button67 = findViewById<Button>(R.id.button67)
        //boğazlıyan belediyesi
        val button68 = findViewById<Button>(R.id.button68)
        //uzunlu belediyesi
        val button69 = findViewById<Button>(R.id.button69)
        //yamaçlı belediyesi
        val button70 = findViewById<Button>(R.id.button70)


        button57.setOnClickListener {
            val phoneNumber = "03124224000" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button58.setOnClickListener {
            val phoneNumber = "03542123643" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button59.setOnClickListener {
            val phoneNumber = "03546451010" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button60.setOnClickListener {
            val phoneNumber = "150" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button61.setOnClickListener {
            val phoneNumber = "112" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button62.setOnClickListener {
            val phoneNumber = "03546451018" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button63.setOnClickListener {
            val phoneNumber = "03546454915" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button64.setOnClickListener {
            val phoneNumber = "03546453677" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button65.setOnClickListener {
            val phoneNumber = "03546451009" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button66.setOnClickListener {
            val phoneNumber = "03546452674" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button67.setOnClickListener {
            val phoneNumber = "03545024310" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        button68.setOnClickListener {
            val phoneNumber = "03546452000" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button69.setOnClickListener {
            val phoneNumber = "03546748012" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        button70.setOnClickListener {
            val phoneNumber = "03546634599" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

    }
}