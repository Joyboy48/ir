package com.example.volume

import android.content.Intent
import android.os.Bundle
import android.widget.GridView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //the view
        val gridView = findViewById<GridView>(R.id.gridView)

        //data source
        var shape1:Shape = Shape(R.drawable.sphere,"Sphere")
        var shape2:Shape = Shape(R.drawable.cube,"Cube")
        var shape3:Shape = Shape(R.drawable.prism,"Prism")
        var shape4:Shape = Shape(R.drawable.cylinder,"Cylinder")

        val gridItems = listOf<Shape>(
            shape1,shape2,shape3,shape4
        )

        //Adapter
        val customAdaptor = MyCustomAdaptor(this,gridItems)
        gridView.adapter = customAdaptor

        //Handlind the click event on the gridview
        gridView.setOnItemClickListener { _, _, position, id ->
           val clickItem = customAdaptor.getItem(position)

            if(clickItem?.shapeName == "Sphere"){
                val intent = Intent(this,sphereActivity::class.java)
                startActivity(intent)
            }

            if(clickItem?.shapeName == "Cube"){
                val intent = Intent(this,cubeActivity::class.java)
                startActivity(intent)
            }

            if(clickItem?.shapeName == "Prism"){
                val intent = Intent(this,prismActivity::class.java)
                startActivity(intent)
            }

            if(clickItem?.shapeName == "Cylinder"){
                val intent = Intent(this,cylinderActivity::class.java)
                startActivity(intent)
            }
        }

    }
}