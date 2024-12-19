package com.example.currencyconvertorapp

import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    lateinit var myCheckBox: CheckBox
    lateinit var myRadioGroup: RadioGroup
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //CHECKED BOX
        displayCheckedBox()

        //RADIO BUTTON
        displayRadioGroup()



    }

    //CHECKED BOX: Allow user to toggle between two states
    fun displayCheckedBox(){
        myCheckBox = findViewById(R.id.checkBox)

        //Handle checkbox state change
        myCheckBox.setOnCheckedChangeListener { _, isChecked ->

            //button view: The checkbox view that was clicked
            //isChecked: The new checked state of the checkbox
            //_: Ignore the unused parameter warning
            //myCheckBox.setOnCheckedChangeListener { _, isChecked ->  }

            if(isChecked){
                Toast.makeText(this,"Checked",Toast.LENGTH_LONG).show()
            }else{}

        }


    }

    //RADIO BUTTON: Allow user to select only one option from a set of options
    fun displayRadioGroup() {

        //Initialise and declare the radio buttons

        val myRadioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val myRedButton = findViewById<RadioButton>(R.id.red)
        val myBlueButton = findViewById<RadioButton>(R.id.blue)
        val myGreenButton = findViewById<RadioButton>(R.id.green)
        val myYellowButton = findViewById<RadioButton>(R.id.yellow)

        //Detecting the checked radio button
        myRadioGroup.setOnCheckedChangeListener { radioGroup, i ->

            when (i) {
                R.id.red -> {
                    Toast.makeText(this, "Red", Toast.LENGTH_LONG).show()
                }

                R.id.blue -> {
                    Toast.makeText(this, "Blue", Toast.LENGTH_LONG).show()
                }

                R.id.green -> {
                    Toast.makeText(this, "Green", Toast.LENGTH_LONG).show()
                }

                R.id.yellow -> {
                    Toast.makeText(this, "Yellow", Toast.LENGTH_LONG).show()

                }

            }
        }


    }}

