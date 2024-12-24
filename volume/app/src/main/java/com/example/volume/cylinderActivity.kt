package com.example.volume

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cylinderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cylinder)

        val textView = findViewById<TextView>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView3)
        val editText = findViewById<TextView>(R.id.editText_sphere)
        val button = findViewById<TextView>(R.id.button)
        val editText2 = findViewById<TextView>(R.id.editText)

        button.setOnClickListener{
            val radius = editText.text.toString()
            val height = editText2.text.toString()
            var r = Integer.parseInt(radius.toString())
            var h = Integer.parseInt(height.toString())
            var volume = 3.14*r*r*h
            result.text = "Volume: $volume m^3"
        }
    }
}