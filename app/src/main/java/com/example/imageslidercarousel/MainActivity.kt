package com.example.imageslidercarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    var images: Array<Int> = arrayOf(R.drawable.josue1, R.drawable.josue2, R.drawable.josue3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
