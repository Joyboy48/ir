package com.example.groceryapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 Adapter view: recyclerView
    val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false
        )

        //data source
        var groceryItems:ArrayList<itemModel> = arrayListOf()

        val v1 = itemModel("Fruits","Fresh Fruits from the garden",R.drawable.fruit)
        val v2 = itemModel("Vegetables"," Delicious Vegetables",R.drawable.vegitables)
        val v3= itemModel("Bakery","Bread,Wheat,and beans",R.drawable.bread)
        val v4 = itemModel("Beverages","Juice,tea,coffee,and soda",R.drawable.beverage)
        val v5 = itemModel("Milk","Milk shakes and yogurt",R.drawable.milk)
        val v6 = itemModel("Snacks","Fresh Fruits from the garden",R.drawable.popcorn)

        groceryItems.add(v1)
        groceryItems.add(v2)
        groceryItems.add(v3)
        groceryItems.add(v4)
        groceryItems.add(v5)
        groceryItems.add(v6)

        //Adapter
        val adapter = myAdapter(groceryItems)
        recyclerView.adapter = adapter



    }

}