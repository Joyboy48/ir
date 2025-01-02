package com.example.fragments

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import androidx.lifecycle.ReportFragment.Companion.reportFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val btn1:Button = findViewById(R.id.button)
        val btn2:Button = findViewById(R.id.button2)

        btn1.setOnClickListener{
            val fragment1:FragmentOne = FragmentOne()
            loadFragment(fragment1)
        }

        btn2.setOnClickListener{
            val fragment2:FragmentTwo = FragmentTwo()
            loadFragment(fragment2)
        }
    }

    fun loadFragment(fragment:Fragment){
        //fragment manager : responsible for managing gragments
        //in activity. it keep track of fraagment lifecycle and handles transaction involving fragments
        val fragmentManager = supportFragmentManager

        //fragment transaction : used to define a set of operation tp be performed on fragment
        val fragmentTransaction:FragmentTransaction =
            fragmentManager.beginTransaction()

        //replacing the layout with new fragment
        fragmentTransaction.replace(R.id.frameLayout,fragment)
        fragmentTransaction.commit()
    }
}