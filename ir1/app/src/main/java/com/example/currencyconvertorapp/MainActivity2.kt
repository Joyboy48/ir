package com.example.currencyconvertorapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    lateinit var myTextView: TextView
    lateinit var myTextView2: TextView
    lateinit var myButton4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        myTextView = findViewById(R.id.textView3)
        myTextView2= findViewById(R.id.textView4)
        myButton4 = findViewById(R.id.button4)

        //Receive data from the Intent
       val receivedData = intent.getStringExtra("myName")


        //use the data
        myTextView.text = "Welcome $receivedData"

        val randomNumber = generateRandomNumber(6)

        myTextView2.text = "Random number: \n $randomNumber"

        myButton4.setOnClickListener{
            if (receivedData != null) {
                shareResult(receivedData,randomNumber)
            }
        }



    }

    fun generateRandomNumber(count:Int):String{
        var randomNumbers = List(count){
            (0..42).random()
        }
        return randomNumbers.joinToString(" ")
    }

    fun shareResult(receivedData:String,generatedNumber:String){

        //Implicit Intent

        var i = Intent(Intent.ACTION_SEND)
        i.setType("text/plain")
        i.putExtra(Intent.EXTRA_SUBJECT,"$receivedData generated the number")
        i.putExtra(Intent.EXTRA_TEXT,"$generatedNumber is the number")

        startActivity(i)

    }
}