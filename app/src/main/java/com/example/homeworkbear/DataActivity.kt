package com.example.homeworkbear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        val textData = findViewById<TextView>(R.id.textData)
        val text = intent.getParcelableExtra<User>("user")?.toString()
        textData.text = text
    }
}