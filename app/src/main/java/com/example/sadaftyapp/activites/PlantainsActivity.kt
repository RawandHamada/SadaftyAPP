package com.example.sadaftyapp.activites

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.*
import com.example.sadaftyapp.Adapter.PlantainsAdapter
import com.example.sadaftyapp.Adapter.TurboAdapter
import com.example.sadaftyapp.R

class PlantainsActivity : AppCompatActivity() {
    lateinit var gridView: GridView

    private var Images = intArrayOf(
        R.drawable.planaxis1, R.drawable.planaxis2, R.drawable.planaxis3,
        R.drawable.planaxis4, R.drawable.planaxis5, R.drawable.planaxis6
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_plantains)
            val plantains =findViewById<ImageView>(R.id.backpla)
        plantains.setOnClickListener(View.OnClickListener {
            finish()
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        })
        var gridView: GridView=findViewById(R.id.gridViewplantains)
        val mainAdapter = PlantainsAdapter(this ,  Images)
        gridView.adapter = mainAdapter
        var  scrollNest=findViewById<LinearLayout>(R.id.scrollNest)
        gridView.isFocusable = false
        scrollNest.requestFocus()


    }
}