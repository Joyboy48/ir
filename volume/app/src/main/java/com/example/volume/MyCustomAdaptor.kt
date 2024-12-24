package com.example.volume

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdaptor(val ctx:Context,private val gridItem:List<Shape>):ArrayAdapter<Shape>(ctx,0,gridItem) {

    //context: required to access resoucrce and layoputs
    //0: the resource ID for the layout file, 0 because we need to inflate our custom layout, not the predefined
    //gridItems: list of items that the adapter will adapt and display io the gridview

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var itemView = convertView
        val holder: ViewHolder

        if (itemView == null){
            itemView = LayoutInflater.from(context).inflate(R.layout.grid_item_layout,parent,false)

            //create and set viewholder
            holder = ViewHolder()
            holder.imageView = itemView.findViewById(R.id.imageView)
            holder.textView = itemView.findViewById(R.id.textView)
            itemView.tag = holder
        }else{
            //get the viewholder from the converview
            holder = itemView?.tag as ViewHolder
        }

        //bind the data to the views
        val currentItem = gridItem[position]
        holder.imageView.setImageResource(currentItem.shapeImg)
        holder.textView.text = currentItem.shapeName

        //!!: non-null assertion operator
        return itemView!!
    }

    private class ViewHolder{
        lateinit var imageView: ImageView
        lateinit var textView: TextView
    }
}