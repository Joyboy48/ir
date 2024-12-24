package com.example.volume

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class prismActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_prism)

        val textView = findViewById<TextView>(R.id.textView2)
        val result = findViewById<TextView>(R.id.textView3)
        val editText = findViewById<TextView>(R.id.editText_sphere)
        val button = findViewById<TextView>(R.id.button)
        val editText2 = findViewById<TextView>(R.id.editText_sphere1)
        val editText3 = findViewById<TextView>(R.id.editText_sphere2)

        button.setOnClickListener{
            val base = editText.text.toString()
            val height = editText2.text.toString()
            val length = editText3.text.toString()
            var b = Integer.parseInt(base.toString())
            var h = Integer.parseInt(height.toString())
            var l = Integer.parseInt(length.toString())
            var volume = b*h*l
            result.text = "Volume: $volume m^3"
        }

    }
}