package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.CerithiumAdapter
import com.example.sadaftyapp.Adapter.CeriyhideaAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class CerithideaActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.cingulate1, R.drawable.cingulate2, R.drawable.cingulate3,
        R.drawable.cingulate4, R.drawable.cingulate5, R.drawable.cingulate6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_cerithidea)
        val cerithidea=findViewById<ImageView>(R.id.backdea)
        cerithidea.setOnClickListener(View.OnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewcerithidea)
        val mainAdapter = CeriyhideaAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()
    }}