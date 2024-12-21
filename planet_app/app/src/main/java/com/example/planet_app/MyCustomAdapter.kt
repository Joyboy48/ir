package com.example.planet_app

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.mastercoding.planetsapp.Planet

class MyCustomAdapter(val context: Context, val planets: List<Planet>):BaseAdapter() {
    override fun getCount(): Int {
        //return number of item
        return planets.size
    }

    override fun getItem(p0: Int): Any {
        //return the data item associated with the specified position
        return planets[p0]
    }

    override fun getItemId(p0: Int): Long {
        //return a unqiue identifier for the data item at a specified position
        return p0.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        //retun the view that display the data at the specified positon
        val inflater = context.getSystemService(
            Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view:View
        if (p1 == null){
            //Inflate the new view
            view = inflater.inflate(R.layout.item_list_layout,p2,false)
        }else{
            //reuse the convertView
            view = p1
        }

        //Bind the data with the view
        val item = getItem(p0) as Planet
        //initailise the views
        val tilteTextView = view.findViewById<TextView>(R.id.planet_name)
        val moonCountTextView = view.findViewById<TextView>(R.id.moon_count)
        val imageView = view.findViewById<ImageView>(R.id.imageView)

        tilteTextView.text = item.title
        moonCountTextView.text = item.moonCount
        imageView.setImageResource(item.imagePlanet)

        //Handle the clickEvent
        view.setOnClickListener{
            Toast.makeText(context,"${planets[p0].title}",Toast.LENGTH_SHORT).show()

        }

        return view

    }
}