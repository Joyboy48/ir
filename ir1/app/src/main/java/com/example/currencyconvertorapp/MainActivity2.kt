package com.example.currencyconvertorapp

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    lateinit var myTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        myTextView = findViewById(R.id.textView3)

        //Receive data from the Intent
        val receivedData = intent.getStringExtra("myName")
        //use the data
        myTextView.text = "Welcome $receivedData"

    }
}