package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.CaeruleumAdapter
import com.example.sadaftyapp.Adapter.CerithiumAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class CaeruleumActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.caeruleum1, R.drawable.caeruleum2, R.drawable.caeruleum3,
        R.drawable.caeruleum4, R.drawable.caeruleum5, R.drawable.caeruleum6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        setContentView(R.layout.activity_caeruleum)

        val caeruleum = findViewById<ImageView>(R.id.backum)
        caeruleum.setOnClickListener(View.OnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewcaeruleum)
        val mainAdapter = CerithiumAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()

    }
}