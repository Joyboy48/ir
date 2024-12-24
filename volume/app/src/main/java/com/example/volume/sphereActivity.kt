package com.example.volume

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class sphereActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sphere)

        val textView = findViewById<TextView>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView3)
        val editText = findViewById<TextView>(R.id.editText_sphere)
        val button = findViewById<TextView>(R.id.button)

        button.setOnClickListener{
            val radius = editText.text.toString()
            var r = Integer.parseInt(radius.toString())
            var volume = (4/3)*3.14*r*r*r
            result.text = "Volume: $volume m^3"
        }

    }
}