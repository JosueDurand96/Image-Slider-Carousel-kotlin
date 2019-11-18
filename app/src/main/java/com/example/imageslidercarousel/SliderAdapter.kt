package com.example.imageslidercarousel

import android.content.Context
import android.view.View
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter : PagerAdapter {


    var context: Context
    var images: Array<Int>

    constructor(context: Context, images: Array<Int>) : super() {
        this.context = context
        this.images = images
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean =view ==  `object` as ConstraintLayout

    override fun getCount(): Int {
        return images.size
    }

}