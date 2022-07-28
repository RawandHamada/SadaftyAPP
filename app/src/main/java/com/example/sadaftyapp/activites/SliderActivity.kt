package com.example.sadaftyapp.activites

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.sadaftyapp.Adapter.MySliderImageAdapter
import com.example.sadaftyapp.R

class SliderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_slider)
        val pager=findViewById<ViewPager>(R.id.pager)
        var imgs = listOf<Int>(R.drawable.scabridum1,R.drawable.scabridum5,R.drawable.scabridum6)


        var adapter = MySliderImageAdapter(imgs,this)


        pager.adapter = adapter
    }

}
