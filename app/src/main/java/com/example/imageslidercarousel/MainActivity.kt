package com.example.imageslidercarousel

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val context:Context = applicationContext

    var images: Array<Int> = arrayOf(R.drawable.josue1, R.drawable.josue2, R.drawable.josue3)
    var adapter: PagerAdapter = SliderAdapter(context, images)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = adapter
    }
}
