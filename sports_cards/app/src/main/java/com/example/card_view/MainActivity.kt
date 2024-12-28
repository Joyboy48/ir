package com.example.card_view

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

        val recyclerView:RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        var sportList : ArrayList<sportModel> = ArrayList()

        val sport1 = sportModel(R.drawable.football,"Football")
        val sport2 = sportModel(R.drawable.ping,"ping")
        val sport3 = sportModel(R.drawable.tennis,"tennis")
        val sport4 = sportModel(R.drawable.volley,"volley")
        val sport5= sportModel(R.drawable.basketball,"basketball")

        sportList.add(sport1)
        sportList.add(sport2)
        sportList.add(sport3)
        sportList.add(sport4)
        sportList.add(sport5)

        val adapter = sportAdapter(sportList)
        recyclerView.adapter = adapter

    }
}