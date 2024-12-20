package com.example.adapters_app

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1 Initialising the listView
        val listView = findViewById<ListView>(R.id.listView)

        //2 Data source
         val list = arrayOf(
             "A","B","C","D","E","A",
             "B","C","D","E","A","B",
             "C","D","E","A","B","C",
             "D","E","A","B","C","D",
             "E","A","B","C","D","E"
         )

        //3 Adapter
        val myAdapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            list
        )

        //4 Set adaptor to list view
        listView.adapter = myAdapter


    }
}