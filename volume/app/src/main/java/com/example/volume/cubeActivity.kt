package com.example.volume

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class cubeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_cube)

        val textView = findViewById<TextView>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView3)
        val editText = findViewById<TextView>(R.id.editText_sphere)
        val button = findViewById<TextView>(R.id.button)

        button.setOnClickListener{
            val side = editText.text.toString()
            var s = Integer.parseInt(side.toString())
            var volume = s*s*s
            result.text = "Volume: $volume m^3"
        }

    }
}