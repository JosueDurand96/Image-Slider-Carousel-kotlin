package com.example.imageslidercarousel

import android.content.Context
import android.view.View
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter : PagerAdapter {


    var context: Context
    var images: List<Int>

    constructor(context: Context, var images: Array<Int>) : super() {
        this.context = context
        this.images = images
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {

    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}