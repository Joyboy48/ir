package com.example.service_app

import android.content.Intent
import android.content.IntentFilter
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    lateinit var airplaneModeReciver: AirplaneModeReciver
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var startButton: Button = findViewById(R.id.button)
        var stopButton: Button = findViewById(R.id.button2)




        startButton.setOnClickListener {
            var startServiceIntent = Intent(
                applicationContext,
                MyService::class.java
            )
            startService(startServiceIntent)
        }

        stopButton.setOnClickListener {
            var stopServiceIntent = Intent(
                applicationContext,
                MyService::class.java
            )
            stopService(stopServiceIntent)
        }

        //register dynamically the broadcast receiver
        var intentFilter: IntentFilter = IntentFilter("android.intent.action.AIRPLANE_MODE ")

         airplaneModeReciver = AirplaneModeReciver()
        registerReceiver(airplaneModeReciver, intentFilter, RECEIVER_EXPORTED)


    }

    override fun onDestroy() {
        unregisterReceiver(airplaneModeReciver)
        super.onDestroy()
    }


    }
