package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.GridView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.core.widget.NestedScrollView
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R
import com.example.sadaftyapp.onbording.BorderTwoActivity

class TurboActivity : AppCompatActivity() {

    private var Images = intArrayOf(
        R.drawable.turbo1, R.drawable.turbo2, R.drawable.turbo3,
        R.drawable.turbo4, R.drawable.turbo5, R.drawable.turbo6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_turbo)
        val turbo = findViewById<ImageView>(R.id.backtur)
        turbo.setOnClickListener(View.OnClickListener {
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewturbo)
        val mainAdapter = TurboAdapter(this ,  Images)
        gridView.adapter = mainAdapter
       var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()

    }}


