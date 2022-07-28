package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.NeritaAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class NeritaActivity : AppCompatActivity() {

    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.nerita1, R.drawable.nerita2, R.drawable.nerita3,
        R.drawable.nerita4, R.drawable.nerita5, R.drawable.nerita6
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_nerita)
        val nerita = findViewById<ImageView>(R.id.backaner)
        nerita.setOnClickListener(View.OnClickListener {
            finish()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewnerita)
        val mainAdapter = NeritaAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()

    }}