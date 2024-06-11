package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFifthBirdBinding
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.squareup.picasso.Picasso

class fifthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.prev5.setOnClickListener {
            val intent = Intent(this,ActivityFourthBirdBinding::class.java)
            finish()
        }
        Picasso
            .get()
            .load("https://i.pinimg.com/564x/2a/04/c9/2a04c9c1f22452b71984de72e7eb9abf.jpg")
            .into(binding.imageView5)

        }
    }
