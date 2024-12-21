package com.example.volume

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdaptor(val context: Context,private val gridItem:List<Shape>):ArrayAdapter<Shape>(context,0,gridItem) {

    //context: required to access resoucrce and layoputs
    //0: the resource ID for the layout file, 0 because we need to inflate our custom layout, not the predefined
    //gridItems: list of items that the adapter will adapt and display io the gridview

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        return super.getView(position, convertView, parent)
    }

    private class ViewHolder{
        lateinit var imageView: ImageView
        lateinit var textView: TextView
    }
}