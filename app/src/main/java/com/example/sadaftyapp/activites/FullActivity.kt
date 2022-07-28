package com.example.sadaftyapp.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.ImageView
import com.example.sadaftyapp.R

class FullActivity : AppCompatActivity() {
    lateinit var img_full:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_full)
        var img_full:ImageView=findViewById(R.id.img_full)
        img_full.setImageResource(intent.getIntExtra("imgID" , R.drawable.caeruleum1))
    }
}