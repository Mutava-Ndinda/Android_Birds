package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class fourthBirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fourth_bird)
        val imageview10 = findViewById<ImageView>(R.id.imageView10)
        val imageview11 = findViewById<ImageView>(R.id.imageView11)
        imageview10.setOnClickListener { finish() }
        imageview11.setOnClickListener {
            val intent = Intent(this, fifthBirdActivity::class.java)
            startActivity(intent)
        }
    }
}