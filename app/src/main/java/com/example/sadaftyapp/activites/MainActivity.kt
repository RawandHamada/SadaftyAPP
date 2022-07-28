package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.example.sadaftyapp.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Img_plantains  =findViewById<ImageView>(R.id.imgPlanaxis)
        val Img_Cerithium  =findViewById<ImageView>(R.id.imgCerithium)
        val Image_Cerithidea  =findViewById<ImageView>(R.id.imageCerithidea)
        val Img_Turbo  =findViewById<ImageView>(R.id.imgTurbo)
        val Image_Nerita  =findViewById<ImageView>(R.id.imageNerita)
        val Image_Clypeomorus  =findViewById<ImageView>(R.id.imageClypeomorus)
        val Image_Terebralia  =findViewById<ImageView>(R.id.imageTerebralia)
        val Image_Caeruleum  =findViewById<ImageView>(R.id.imageCaeruleum)
        val Image_Thais  =findViewById<ImageView>(R.id.imageThais)
        val Image_Bursa  =findViewById<ImageView>(R.id.imageBursa)



        Img_plantains.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, PlantainsActivity::class.java)
            startActivity(intent)
        })
        Img_Cerithium.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, CerithiumActivity::class.java)
            startActivity(intent)
        })
        Image_Cerithidea.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, CerithideaActivity::class.java)
            startActivity(intent)
        })
        Img_Turbo.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, TurboActivity::class.java)
            startActivity(intent)
        })
        Image_Nerita.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, NeritaActivity::class.java)
            startActivity(intent)
        })
        Image_Clypeomorus.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ClypeomorusActivity::class.java)
            startActivity(intent)
        })
        Image_Terebralia.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, TerebraliaActivity::class.java)
            startActivity(intent)
        })
        Image_Caeruleum.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, CaeruleumActivity::class.java)
            startActivity(intent)
        })
        Image_Thais.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, ThaisActivity::class.java)
            startActivity(intent)
        })
        Image_Bursa.setOnClickListener(View.OnClickListener {
            val intent = Intent(this@MainActivity, BursaActivity::class.java)
            startActivity(intent)
        })


    }
}