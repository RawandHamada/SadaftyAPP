package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.TerebraliaAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class TerebraliaActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.terebralia1, R.drawable.terebralia2, R.drawable.terebralia3,
        R.drawable.terebralia4, R.drawable.terebralia5, R.drawable.terebralia6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_terebralia)
            val terebralia=findViewById<ImageView>(R.id.backter)
        terebralia.setOnClickListener(View.OnClickListener {
            finish()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewterebralia)
        val mainAdapter = TerebraliaAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()


    }
}