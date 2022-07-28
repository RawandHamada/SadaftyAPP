package com.example.sadaftyapp.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import com.example.sadaftyapp.R
import com.example.sadaftyapp.activites.FullActivity

internal class BursaAdapter(
    private val context: Context,
    private val numberImage: IntArray) : BaseAdapter() {
    private var layoutInflater: LayoutInflater? = null
    private lateinit var imageView: ImageView
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var convertView = convertView
        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (convertView == null) {
            convertView = layoutInflater!!.inflate(R.layout.item_image_recycler, null)
        }
        imageView = convertView!!.findViewById(R.id.imageView)
        imageView.setImageResource(numberImage[position])
        imageView.setOnClickListener {
            val intent = Intent(context,FullActivity::class.java)
            intent.putExtra("imgID" , getItem(position))
            parent?.context?.startActivity(intent)
        }

        return convertView
    }

    override fun getItem(position: Int): Int = numberImage[position]

    override fun getItemId(position: Int): Long = 0

    override fun getCount(): Int = numberImage.size

}

