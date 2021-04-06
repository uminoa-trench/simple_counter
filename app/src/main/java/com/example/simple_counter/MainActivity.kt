package com.example.simple_counter

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addCounter(view: View) {
        val countText = findViewById<TextView>(R.id.count_text)
        val addCountNum = Integer.parseInt(countText.text.toString())+1

        countText.text = addCountNum.toString()

    }

    fun resetCounter(view: View){
        val countText = findViewById<TextView>(R.id.count_text)

        countText.text = "0"
    }
}