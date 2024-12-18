package com.example.currencyconvertorapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var myButton: Button
    lateinit var myEditText: EditText
    lateinit var myTextView: TextView
    lateinit var myTextView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this,"onCreate method is called",Toast.LENGTH_LONG).show()

        myButton = findViewById(R.id.button)
        myEditText = findViewById(R.id.editText)
        myTextView = findViewById(R.id.textView)
        myTextView2 = findViewById(R.id.textView2)

        myButton.setOnClickListener {
            var value = myEditText.text.toString()
            var doubleValue = value.toDouble()

            var inr = convert(doubleValue)

            //display
            myTextView2.text = "$inr Rupees 😔 \n Padh le bhai abhi bhi time hai 😁"
        }

    }

    override fun onStart() {
        super.onStart()
    }

    fun convert(value:Double):Double{
        return value*84.91
    }
}