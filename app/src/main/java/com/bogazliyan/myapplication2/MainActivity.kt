package com.bogazliyan.myapplication2

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.navigation.NavigationView
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.app.AppCompatActivity
import com.bogazliyan.myapplication2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        setSupportActionBar(binding.appBarMain.toolbar)

        binding.appBarMain.fab.setOnClickListener { view ->
            Snackbar.make(view, "Merhaba, iletişim formunu açtınız.", Snackbar.LENGTH_LONG)
                .setAction("İletişim", null).show()

            val intent = Intent(this, MainActivity18::class.java)
            startActivity(intent)
        }

        val myImageButton: ImageButton = findViewById(R.id.imageButton13)
        myImageButton.setOnClickListener {
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)
        }

        val myImageButton2: ImageButton = findViewById(R.id.imageButton15)
        myImageButton2.setOnClickListener {
            val intent = Intent(this, MainActivity20::class.java)
            startActivity(intent)
        }

        val myImageButton3: ImageButton = findViewById(R.id.imageButton14)
        myImageButton3.setOnClickListener {
            val intent = Intent(this, MainActivity21::class.java)
            startActivity(intent)
        }

        val myImageButton4: ImageButton = findViewById(R.id.imageButton18)
        myImageButton4.setOnClickListener {
            val intent = Intent(this, MainActivity22::class.java)
            startActivity(intent)
        }



        val myImageButton5: ImageButton = findViewById(R.id.imageButton16)
        myImageButton5.setOnClickListener {
            val intent = Intent(this, MainActivity53::class.java)
            startActivity(intent)
        }

        val myImageButton6: ImageButton = findViewById(R.id.imageButton17)
        myImageButton6.setOnClickListener {
            val intent = Intent(this, MainActivity37::class.java)
            startActivity(intent)
        }


        val myImageButton7: ImageButton = findViewById(R.id.imageButton12)
        myImageButton7.setOnClickListener {
            val intent = Intent(this, MainActivity42::class.java)
            startActivity(intent)
        }



        val myImageButton8: ImageButton = findViewById(R.id.imageButton28)
        myImageButton8.setOnClickListener {
            val intent = Intent(this, MainActivity46::class.java)
            startActivity(intent)
        }

        val myImageButton9: ImageButton = findViewById(R.id.imageButton29)
        myImageButton9.setOnClickListener {
            val intent = Intent(this, MainActivity47::class.java)
            startActivity(intent)
        }

        val myImageButton10: ImageButton = findViewById(R.id.imageButton11)
        myImageButton10.setOnClickListener {
            val intent = Intent(this, MainActivity48::class.java)
            startActivity(intent)
        }

        val myImageButton11: ImageButton = findViewById(R.id.imageButton32)
        myImageButton11.setOnClickListener {
            val intent = Intent(this, MainActivity49::class.java)
            startActivity(intent)
        }

        val myImageButton_gezmek: ImageButton = findViewById(R.id.imageButton_home31)
        myImageButton_gezmek.setOnClickListener {
            val intent = Intent(this, MainActivity23::class.java)
            startActivity(intent)
        }

        val myImageButton12: ImageButton = findViewById(R.id.imageButton_home)
        myImageButton12.setOnClickListener {
            val intent = Intent(this, MainActivity50::class.java)
            startActivity(intent)
        }

        val myImageButton13: ImageButton = findViewById(R.id.imageButton_home1)
        myImageButton13.setOnClickListener {
            val intent = Intent(this, MainActivity51::class.java)
            startActivity(intent)
        }

        val myImageButton14: ImageButton = findViewById(R.id.imageButton30)
        myImageButton14.setOnClickListener {
            val intent = Intent(this, MainActivity52::class.java)
            startActivity(intent)
        }

        val myImageButton15: ImageButton = findViewById(R.id.imageButton31)
        myImageButton15.setOnClickListener {
            val intent = Intent(this, MainActivity54::class.java)
            startActivity(intent)
        }

        val myImageButton16: ImageButton = findViewById(R.id.imageButtonEcz)
        myImageButton16.setOnClickListener {
            val intent = Intent(this, MainActivity56::class.java)
            startActivity(intent)
        }

        val drawerLayout: DrawerLayout = binding.drawerLayout
        val navView: NavigationView = binding.navView
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow
            ), drawerLayout
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)





        navView.setNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.anasayfa -> {
                    Toast.makeText(this@MainActivity, "Anasayfa", Toast.LENGTH_SHORT).show()

                    /*
                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)

                     */

                }
                R.id.bogazliyan_hakkinda -> {
                    Toast.makeText(this@MainActivity, "Boğazlıyan Hakkında", Toast.LENGTH_SHORT).show()


                    val intent = Intent(this@MainActivity, MainActivity2::class.java)
                    startActivity(intent)


                }
                R.id.beldeler -> {
                    Toast.makeText(this@MainActivity, "Beldeler", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this@MainActivity, MainActivity10::class.java)
                    startActivity(intent)


                }
                R.id.mahalleler -> {
                    Toast.makeText(this@MainActivity, "Mahalleler", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this@MainActivity, MainActivity8::class.java)
                    startActivity(intent)
                }
                R.id.koyler -> {
                    Toast.makeText(this@MainActivity, "Köyler", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this@MainActivity, MainActivity9::class.java)
                    startActivity(intent)


                }
                R.id.telefonlar -> {
                    Toast.makeText(this@MainActivity, "Telefonlar", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this@MainActivity, MainActivity16::class.java)
                    startActivity(intent)


                }
                R.id.iletisim -> {
                    Toast.makeText(this@MainActivity, "İletişim", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this@MainActivity, MainActivity18::class.java)
                    startActivity(intent)


                }
                R.id.yardim -> {
                    Toast.makeText(this@MainActivity, "Yardım", Toast.LENGTH_SHORT).show()

                    val intent = Intent(this@MainActivity, MainActivity17::class.java)
                    startActivity(intent)


                }
            }
            true
        }
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                // action_settings öğesine tıklandığında açılacak activity'i başlat
                startActivity(Intent(this, MainActivity55::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

/*
Mehmet Akınol 03.06.2023 Proje geliştirme lideri ve fikir sahibi
Denizhan Şahin 03.06.2023 Proje geliştiricisi ama full stack developer değil
Hacı Ali Özdemir 03.06.2023 uygulamayı ilk gören kişidir.
Ayla Çetin 05.06.2023 uygulamayı ikinci gören kişidir.
 */