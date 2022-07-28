package com.example.sadaftyapp.onbording

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import com.example.sadaftyapp.R
import com.example.sadaftyapp.activites.MainActivity

class BorderOneActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_border_one)
        val button=findViewById<Button>(R.id.button)
        button.setOnClickListener() {
            intent = Intent(this, BorderTwoActivity::class.java)
            startActivity(intent)
        }

    }
}