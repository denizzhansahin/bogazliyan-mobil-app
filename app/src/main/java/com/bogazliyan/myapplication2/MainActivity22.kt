package com.bogazliyan.myapplication2

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity22 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main22)

        //İç işleri bakanlığı - harita
        val button1 = findViewById<Button>(R.id.button89)
        button1.setOnClickListener {
            val destination = "39.914511,32.852116"
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

        //içişleri internet sitesi
        val button = findViewById<Button>(R.id.button132)
        button.setOnClickListener {
            val url = "https://www.icisleri.gov.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //içileri bakanlığı - telefon
        val button2 = findViewById<Button>(R.id.button133)
        button2.setOnClickListener {
            val phoneNumber = "03124224000" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }

        //yozgat valiliği harita
        val button3 = findViewById<Button>(R.id.button134)
        button3.setOnClickListener {
            val destination = "39.828171,34.821424"
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

        //yozgat valiliği internet sitesi
        val button4 = findViewById<Button>(R.id.button135)
        button4.setOnClickListener {
            val url = "http://www.yozgat.gov.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //yozgat valiliği - telefon
        val button5 = findViewById<Button>(R.id.button136)
        button5.setOnClickListener {
            val phoneNumber = "03542123643" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }



        //kaymakamlık harita
        val button6 = findViewById<Button>(R.id.button137)
        button6.setOnClickListener {
            val destination = "39.192997,35.246873"
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

        //kaymakamlık internet sitesi
        val button7 = findViewById<Button>(R.id.button138)
        button7.setOnClickListener {
            val url = "http://www.bogazliyan.gov.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //kaymakamlık - telefon
        val button8 = findViewById<Button>(R.id.button139)
        button8.setOnClickListener {
            val phoneNumber = "03546451010" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        //ilçe gençlik ve spor harita
        val button9 = findViewById<Button>(R.id.button140)
        button9.setOnClickListener {
            val destination = "39.198361,35.253018"
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

        //ilçe gençlik ve spor internet sitesi
        val button10 = findViewById<Button>(R.id.button141)
        button10.setOnClickListener {
            val url = "https://www.facebook.com/bogazliyanghsm/?locale=tr_TR"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //ilçe gençlik ve spor - telefon
        val button11 = findViewById<Button>(R.id.button142)
        button11.setOnClickListener {
            val phoneNumber = "03546454915" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        //ilçe milli eğitim harita
        val button12 = findViewById<Button>(R.id.button143)
        button12.setOnClickListener {
            val destination = "39.192997,35.246873"
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

        //ilçe milli eğitim internet sitesi
        val button13 = findViewById<Button>(R.id.button144)
        button13.setOnClickListener {
            val url = "https://bogazliyan.meb.gov.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //ilçe milli eğitim - telefon
        val button14 = findViewById<Button>(R.id.button145)
        button14.setOnClickListener {
            val phoneNumber = "03546451018" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        //hastane harita
        val button15 = findViewById<Button>(R.id.button146)
        button15.setOnClickListener {
            val destination = "39.195328,35.254482"
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

        //hastane internet sitesi
        val button16 = findViewById<Button>(R.id.button1147)
        button16.setOnClickListener {
            val url = "https://bogazliyandh.saglik.gov.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //hastane - telefon
        val button17 = findViewById<Button>(R.id.button148)
        button17.setOnClickListener {
            val phoneNumber = "03546452674" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }



        //boğazlıyan gençlik merkezi harita
        val button18 = findViewById<Button>(R.id.button149)
        button18.setOnClickListener {
            val destination = "39.198361,35.253018"
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

        //boğazlıyan gençlik merkezi internet sitesi
        val button19 = findViewById<Button>(R.id.button150)
        button19.setOnClickListener {
            val url = "https://e-genc.gsb.gov.tr/EGenc/Kurum/KurumDetay?kurumId=Lc79DUJTFyEv2BTrH0UPoTLf0M%2FWWCsepiGYThMq64I%3D"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //boğazlıyan gençlik merkezi - telefon
        val button20 = findViewById<Button>(R.id.button151)
        button20.setOnClickListener {
            val phoneNumber = "03545024310" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }



        //boğazlıyan belediyesi harita
        val button21 = findViewById<Button>(R.id.button152)
        button21.setOnClickListener {
            val destination = "39.189649,35.244709"
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

        //boğazlıyan belediyesi internet sitesi
        val button22 = findViewById<Button>(R.id.button153)
        button22.setOnClickListener {
            val url = "http://www.bogazliyan.bel.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //boğazlıyan belediyesi - telefon
        val button23 = findViewById<Button>(R.id.button154)
        button23.setOnClickListener {
            val phoneNumber = "03546452000" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }



        //yozgat bozok üniversitesi harita
        val button24 = findViewById<Button>(R.id.button155)
        button24.setOnClickListener {
            val destination = "39.776626,34.801157"
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

        //yozgat bozok üniversitesi internet sitesi
        val button25 = findViewById<Button>(R.id.button156)
        button25.setOnClickListener {
            val url = "https://bozok.edu.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //yozgat bozok üniversitesi - telefon
        val button26 = findViewById<Button>(R.id.button157)
        button26.setOnClickListener {
            val phoneNumber = "03542178991" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        //bogazlıyan myo harita
        val button27 = findViewById<Button>(R.id.button158)
        button27.setOnClickListener {
            val destination = "39.202839,35.262000"
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

        //bogazlıyan myo internet sitesi
        val button28 = findViewById<Button>(R.id.button159)
        button28.setOnClickListener {
            val url = "https://bozok.edu.tr/okul/bogazliyan-myo"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //bogazlıyan myo - telefon
        val button29 = findViewById<Button>(R.id.button160)
        button29.setOnClickListener {
            val phoneNumber = "03542903002" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        //adliye harita
        val button30 = findViewById<Button>(R.id.button161)
        button30.setOnClickListener {
            val destination = "39.193992,35.242764"
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

        //adliye internet sitesi
        val button31 = findViewById<Button>(R.id.button162)
        button31.setOnClickListener {
            val url = "https://bogazliyan.adalet.gov.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //adliye - telefon
        val button32 = findViewById<Button>(R.id.button163)
        button32.setOnClickListener {
            val phoneNumber = "03546451109" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


        //emniyet harita
        val button33 = findViewById<Button>(R.id.button164)
        button33.setOnClickListener {
            val destination = "39.192501,35.246005"
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

        //emniyet internet sitesi
        val button34 = findViewById<Button>(R.id.button165)
        button34.setOnClickListener {
            val url = "https://www.yozgat.pol.tr/"

            val defaultBrowserIntent = Intent(Intent.ACTION_VIEW)
            defaultBrowserIntent.data = Uri.parse(url)
            startActivity(defaultBrowserIntent)
        }


        //emniyet - telefon
        val button35 = findViewById<Button>(R.id.button166)
        button35.setOnClickListener {
            val phoneNumber = "03546452446" // Telefon numarası burada belirtilir.
            val dial =
                "tel:$phoneNumber" // Telefon numarası, telefona arama yapmak için kullanılacak formatında belirtilir.
            val intent = Intent(Intent.ACTION_DIAL, Uri.parse(dial))
            startActivity(intent) // Arama yapılır.

        }


    }
}