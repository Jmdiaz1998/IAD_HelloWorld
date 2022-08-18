package com.example.intermediateandroiddevelopment_helloworld

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val helloButton = findViewById<Button>(R.id.Hello_Button)
        helloButton.setOnClickListener {
            Log.v("Hello world", "Button clicked!")
            Toast.makeText(this, "Hello to you too!", Toast.LENGTH_SHORT).show()

            val universityButton = findViewById<Button>(R.id.University_button)
            universityButton.setOnClickListener {
                Log.v("University_Button", "University Button Clicked!")
                findViewById<ImageView>(R.id.Main_Image).setImageResource(R.drawable.fiu_gl_and_gc)
                findViewById<TextView>(R.id.textView).text = "Go Panthers"
            }
        }
    }
}