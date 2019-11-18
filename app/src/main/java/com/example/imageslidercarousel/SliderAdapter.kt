package com.example.imageslidercarousel

import android.content.Context
import android.view.View
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter : PagerAdapter {


    var context: Context
    var images: List<Int>

    constructor(var context: Context, var images: Array<Int>) : super() {

    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}