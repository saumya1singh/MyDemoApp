package com.saumya.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //kotlin
        //var and val

        val rollButton=findViewById<Button>(R.id.rollButton)
        val seekBar=findViewById<SeekBar>(R.id.seekBar)
        val resultTextView=findViewById<TextView>(R.id.resultTextView)

        //action on clicking the Roll Button

        rollButton.setOnClickListener {

        val randomNumber= Random().nextInt(seekBar.progress)
        resultTextView.text= randomNumber.toString()
         }


    }
}
