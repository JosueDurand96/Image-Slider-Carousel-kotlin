package com.example.imageslidercarousel


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var images: Array<Int> = arrayOf(R.drawable.josue1, R.drawable.josue2, R.drawable.josue3)
    var adapter: PagerAdapter = SliderAdapter(applicationContext, images)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewpager.adapter = adapter

    }
}
