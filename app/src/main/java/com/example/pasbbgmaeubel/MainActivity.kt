package com.example.pasbbgmaeubel

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loginButton: LinearLayout = findViewById(R.id.linearLayout)
        loginButton.setOnClickListener {
            val intent = Intent(this, register::class.java)
            startActivity(intent)
            }
        }
}