package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.BursaAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R
import com.example.sadaftyapp.onbording.BorderTwoActivity

class BursaActivity : AppCompatActivity() {
    lateinit var gridView: GridView
     private var Images = intArrayOf(
        R.drawable.bursa1, R.drawable.bursa2, R.drawable.bursa3,
        R.drawable.bursa4, R.drawable.bursa5, R.drawable.bursa6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_bursa)
        val bursa=findViewById<ImageView>(R.id.backbu)

        bursa.setOnClickListener(View.OnClickListener {
             val intent = Intent(this@BursaActivity,MainActivity::class.java)
            startActivity(intent)
            // finish()
        })
        var gridView: GridView=findViewById(R.id.gridViewbursa)
        val mainAdapter = BursaAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()

    }}