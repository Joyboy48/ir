package com.example.currencyconvertorapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
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
    lateinit var myButton2: Button
    lateinit var myButton3: Button
    lateinit var myEditText: EditText
    lateinit var myTextView: TextView
    lateinit var myTextView2: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(this, "onCreate method is called", Toast.LENGTH_LONG).show()

        myButton = findViewById(R.id.button)
        myEditText = findViewById(R.id.editText)
        myTextView = findViewById(R.id.textView)
        myTextView2 = findViewById(R.id.textView2)
        myButton2 = findViewById(R.id.button2)
        myButton3 = findViewById(R.id.button3)

        myButton.setOnClickListener {
            var value = myEditText.text.toString()
            var doubleValue = value.toDouble()
            var inr = convert(doubleValue)
            //display
            myTextView2.text = "$inr Rupees 😔 \n Padh le bhai abhi bhi time hai 😁"
        }

        //Intent: Used to navigate from one activity to another activity

        //Type of intents:
        //1. Emplicit Intent:
        myButton2.setOnClickListener {
            var explicitIntent = Intent(this, MainActivity2::class.java)

            explicitIntent.putExtra("myName","Astitva")
            startActivity(explicitIntent)
        }
        //2. Implicit Intent

        myButton3.setOnClickListener{
            val implicitIntent = Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://www.youtube.com")
            )
            startActivity(implicitIntent)
        }
    }
    //menu
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu,menu)
        return true
    }
    //function on selected menu
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId.equals(R.id.new_note)){
            Toast.makeText(this,"You Selected a new note",Toast.LENGTH_LONG).show()
        }
        return super.onOptionsItemSelected(item)
    }

    fun convert(value: Double): Double {
        return value * 84.91
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart method is called", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume method is called", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause method is called", Toast.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop method is called", Toast.LENGTH_LONG).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart method is called", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy method is called", Toast.LENGTH_LONG).show()
    }
}