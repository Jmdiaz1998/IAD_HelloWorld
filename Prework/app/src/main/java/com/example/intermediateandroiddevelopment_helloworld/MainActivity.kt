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
            Toast.makeText(this, "Hello, can you tell me something about you?!", Toast.LENGTH_SHORT).show()
        }

        val universityButton = findViewById<Button>(R.id.University_button)
        universityButton.setOnClickListener {
            Log.v("University_Button", "University Button Clicked!")
            findViewById<ImageView>(R.id.Main_Image).setImageResource(R.drawable.fiu_gl_and_gc)
            findViewById<TextView>(R.id.textView).text =
                "I attend Florida International University and been doing so since 2016. Its where I earned my Bachelors degree and where soon, I will earn my Masters."

        }
        val interestButton = findViewById<Button>(R.id.Interest_Button)
        interestButton.setOnClickListener {
            Log.v("Interest_Button", "Interest Button Clicked!")
            findViewById<ImageView>(R.id.Main_Image).setImageResource(R.drawable.aeronautical_engineering)
            findViewById<TextView>(R.id.textView).text =
                "I enjoy learning about aeronautical engineering and dream of getting my pilots license one day."
        }
        val aboutme_Button = findViewById<Button>(R.id.AboutMe_Button)
        aboutme_Button.setOnClickListener {
            Log.v("Interest_Button", "AboutMe Button Clicked!")
            findViewById<ImageView>(R.id.Main_Image).setImageResource(R.drawable.jmd_portrait)
            findViewById<TextView>(R.id.textView).text = "Hello World! My name is Jorge and im a product owner fascinated by all that is possible by using code."


        }
    }
}