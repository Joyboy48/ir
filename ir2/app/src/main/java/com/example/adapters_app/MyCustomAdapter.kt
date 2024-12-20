package com.example.adapters_app
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class MyCustomAdapter(private val context: Context,private val items: List<String>):BaseAdapter() {

    override fun getCount(): Int {
        //return the number of items in the data set
        return items.size
    }

    override fun getItem(position: Int): Any {
        //Return the data item associated with the specified position in the data set
        return items[position]
    }

    override fun getItemId(position: Int): Long {
        //retuns a unique identifier for the item at the specified position
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        //return a view that represents the item at the specified position
        //convertView: recycle view that can be reused to opti,ised the performence
        val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

        val view: View
        if (convertView == null) {
            view = inflater.inflate(R.layout.my_custom_layout, parent, false)
        } else {
            view = convertView
        }

        //Bind data with view
        val item = getItem(position) as String
        val titleTextView = view.findViewById<TextView>(R.id.textViewCustom)
        titleTextView.text = item

        return view


    }

}