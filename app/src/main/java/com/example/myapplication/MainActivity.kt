package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var myT1: TextView =findViewById<TextView>(R.id.t1)
        myT1.text="Hello !!!"

        var btn1=findViewById<Button>(R.id.button1)

    }
}