package com.example.currencyconvertorapp

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.CheckBox
import android.widget.DatePicker
import android.widget.ProgressBar
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Spinner
import android.widget.TimePicker
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    lateinit var myCheckBox: CheckBox
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //CHECKED BOX
        displayCheckedBox()

        //RADIO BUTTON
        displayRadioGroup()

        //Spinner
        displaySpinner()

        //timepicker
        displayTimePicker()

        //datepicker
        displayDatePicker()

        //progressBar
        displayProgressBar()


    }

    //CHECKED BOX: Allow user to toggle between two states
    fun displayCheckedBox() {
        myCheckBox = findViewById(R.id.checkBox)

        //Handle checkbox state change
        myCheckBox.setOnCheckedChangeListener { _, isChecked ->

            //button view: The checkbox view that was clicked
            //isChecked: The new checked state of the checkbox
            //_: Ignore the unused parameter warning
            //myCheckBox.setOnCheckedChangeListener { _, isChecked ->  }

            if (isChecked) {
                Toast.makeText(this, "Checked", Toast.LENGTH_LONG).show()
            } else {
            }

        }


    }

    //RADIO BUTTON: Allow user to select only one option from a set of options
    fun displayRadioGroup() {

        //Initialise and declare the radio buttons

        val myRadioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        //val myRedButton = findViewById<RadioButton>(R.id.red)
        ///val myBlueButton = findViewById<RadioButton>(R.id.blue)
        //val myGreenButton = findViewById<RadioButton>(R.id.green)
        //val myYellowButton = findViewById<RadioButton>(R.id.yellow)

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
    }

    //spinner: Allow user to select an option from a set of options
    fun displaySpinner() {

        //initialise the spinner: The view
        val spinner: Spinner = findViewById(R.id.spinner)

        //Data source for the spinner: Array
        val operationSystem = arrayOf("Android", "iOS", "Windows", "MacOS", "Linux")

        //Adapter: A bridge between the data source and the spinner
        //ArrayAdapter: used to bind array of data with spinner
        //convert each item of the array into a view in a spinner
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item,
            operationSystem
        )

        //set adapter to view
        spinner.adapter = adapter

        //Handling item selection
        spinner.onItemSelectedListener = object :
        AdapterView.OnItemSelectedListener{
            //object: serves as the listener for item selection event
            override fun onItemSelected(
                parent: AdapterView<*>?, //parentView
                view: View?, //selectedItemView
                position: Int, //position of the selected item
                id: Long //id of the selected item
            ) {
                // Handle the selected item
                //val selectedItem = parent?.getItemAtPosition(position).toString()
                val selectedItem2 = operationSystem[position]
                Toast.makeText(applicationContext, "Selected item: $selectedItem2", Toast.LENGTH_LONG).show()


            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }


    }

    //time picker: Allow user to select a time
    fun displayTimePicker() {
        val timePicker = findViewById<TimePicker>(R.id.timePicker)

        //Handle the change in time
        timePicker.setOnTimeChangedListener { view, hourOfDay, minute ->

            //Formating the selected time: hh:mm
            val selectedTime =  String.format("%02d:%02d", hourOfDay, minute)

            Toast.makeText(applicationContext,"Your time: $selectedTime",Toast.LENGTH_LONG).show()

        }
    }

    //date picker: allow user to select a date
    fun displayDatePicker(){
        val datepicker = findViewById<DatePicker>(R.id.datePicker)

        //Handel changes in date
        datepicker.setOnDateChangedListener { view, year, monthOfYear, dayOfMonth ->
            Toast.makeText(applicationContext,"Your selected date is: $dayOfMonth.$monthOfYear.$year",Toast.LENGTH_LONG).show()
        }
    }

    //progress bar
    fun displayProgressBar(){
        val progressBar = findViewById<ProgressBar>(R.id.progressBar)

        
    }


}

