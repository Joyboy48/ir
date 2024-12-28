package com.example.card_view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class sportAdapter(val sportList:ArrayList<sportModel>):
    RecyclerView.Adapter<sportAdapter.MyViewHolder> (){

    //ViewHolder: Holds reference to the views within each item in the recyclerview
    inner class MyViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        var sportImage: ImageView
        var sportName: TextView

        init {
            sportImage = itemView.findViewById(R.id.imageViewCard)
            sportName = itemView.findViewById(R.id.cardTextView)

            itemView.setOnClickListener{
                Toast.makeText( itemView.context,"You clicked ${sportList[adapterPosition].sportName}",Toast.LENGTH_SHORT).show()
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // v-creating new view
    val  v = LayoutInflater.from(parent.context).inflate(R.layout.carditem_layout,parent,false)
        return MyViewHolder(v)
    }


    override fun getItemCount(): Int {
        return sportList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.sportImage.setImageResource(sportList[position].sportImage)
        holder.sportName.setText(sportList[position].sportName)
    }

}

//making viewholder
//creating a new view
//bind data into view