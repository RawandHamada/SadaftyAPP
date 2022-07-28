package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.CerithiumAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class CerithiumActivity : AppCompatActivity() {

    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.scabridum1, R.drawable.scabridum2, R.drawable.scabridum3,
        R.drawable.scabridum4, R.drawable.scabridum5, R.drawable.scabridum6
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_cerithium)
        val cerithium=findViewById<ImageView>(R.id.backcer)
        cerithium.setOnClickListener(View.OnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewcerithium)
        val mainAdapter = CerithiumAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()

    }}