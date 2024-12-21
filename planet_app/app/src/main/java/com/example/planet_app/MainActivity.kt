package com.example.planet_app

import android.os.Bundle
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.mastercoding.planetsapp.Planet

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1- The View: List View
        val myListView = findViewById<ListView>(R.id.listView)

        //2- The Data Source: List<plante>
        val planet1 = Planet("Mercury","0 Moon",R.drawable.mercury )
        val planet2 = Planet("Venus", "0 Moons", R.drawable.venus)
        val planet3 = Planet("Earth","1 Moon",R.drawable.earth)
        val planet4 = Planet("Mars", "2 Moons", R.drawable.mars)
        val planet5 = Planet("Jupiter", "79 Moons", R.drawable.jupiter)
        val planet6 = Planet("Saturn", "83 Moons", R.drawable.saturn)
        val planet7 = Planet("Uranus", "27 Moons", R.drawable.uranus)
        val planet8 = Planet("Neptune", "14 Moons", R.drawable.neptune)

        var planetList = ArrayList<Planet>()
        planetList.add(planet1)
        planetList.add(planet2)
        planetList.add(planet3)
        planetList.add(planet4)
        planetList.add(planet5)
        planetList.add(planet6)
        planetList.add(planet7)
        planetList.add(planet8)

        var myAdapter = MyCustomAdapter(this,planetList)

        myListView.adapter = myAdapter



    }
}