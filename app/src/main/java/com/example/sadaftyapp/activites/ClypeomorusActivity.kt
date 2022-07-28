package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.ClypeomAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class ClypeomorusActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.cly1, R.drawable.cly2, R.drawable.cly3,
        R.drawable.cly4, R.drawable.cly5, R.drawable.cly6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_clypeomorus)
        val clypeomorus = findViewById<ImageView>(R.id.backcl)
        clypeomorus.setOnClickListener(View.OnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewclypeomorus)
        val mainAdapter = ClypeomAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()


    }
}