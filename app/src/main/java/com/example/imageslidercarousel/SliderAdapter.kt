package com.example.imageslidercarousel

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter

class SliderAdapter : PagerAdapter {


    var context: Context
    var images: Array<Int>
    lateinit var inflater: LayoutInflater


    constructor(context: Context, images: Array<Int>) : super() {
        this.context = context
        this.images = images
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean =view ==  `object` as ConstraintLayout

    override fun getCount(): Int {
        return images.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        var image:ImageView
        inflater=context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        var view:View=inflater.inflate(R.layout.slider_image_item,container,false)
        image=view.findViewById(R.id.slider_image)

    }

}