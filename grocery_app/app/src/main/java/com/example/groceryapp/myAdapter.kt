package com.example.groceryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class myAdapter(val itemList: ArrayList<itemModel>):RecyclerView.Adapter<myAdapter.MyViewHolder>() {


    //ViewHolder:holding the ref. to the views of single item in the 'RecyclerView'
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

        var itemImage:ImageView
        var itemTitle:TextView
        var itemDescription:TextView

        init {
            itemImage = itemView.findViewById(R.id.imageView)
            itemTitle = itemView.findViewById(R.id.textView)
            itemDescription = itemView.findViewById(R.id.textView2)

            itemView.setOnClickListener(){
                Toast.makeText(
                    itemView.context,
                    "you choose: ${itemList[adapterPosition].name}",
                    Toast.LENGTH_SHORT
                ).show()

            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        //called when RV needs a  new viewHolder Instance
        //inflating the layout for a singe item and retuning a new VH
        //ViewGroup:is the parent view that the new view will be attacted to after  its bound to new data
        //viewType: in many cases you might have only on etype of a view used to distinguish between different  view types

        val v = LayoutInflater.from(parent.context ).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(v)
    }

    override fun getItemCount(): Int {
      //return the total number of items in the data set
        return itemList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        //bind data to the view holder @ specific position
        holder.itemTitle.setText(itemList[position].name)
        holder.itemDescription.setText(itemList[position].description)
        holder.itemImage.setImageResource(itemList[position].image)


    }
}