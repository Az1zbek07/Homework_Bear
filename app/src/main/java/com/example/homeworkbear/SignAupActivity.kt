package com.example.homeworkbear

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import com.google.android.material.button.MaterialButton

class SignAupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_aup)
        val btnSend: MaterialButton = findViewById(R.id.btnSignUp)
        val editName = findViewById<EditText>(R.id.editName)
        val editPassword = findViewById<EditText>(R.id.editPassword)

        btnSend.setOnClickListener {
            val intent = Intent(this, DataActivity::class.java)
            val user = User(editName.text.toString().trim(), editPassword.text.toString().trim())
            intent.putExtra("user", user)
            startActivity(intent)
            finish()
        }
    }
}