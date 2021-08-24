package com.example.happybirthdayv01

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

     val image : ImageView = findViewById(R.id.imageView)
     val submitButton : Button = findViewById(R.id.submit)
     val  layout : View = findViewById(R.id.layoutFirst)

        submitButton.setOnClickListener{
            submitButton.text = getString(R.string.app_name)
            image.visibility = View.VISIBLE
            layout.setBackgroundColor(getColor(R.color.green))

        }
    }
}
