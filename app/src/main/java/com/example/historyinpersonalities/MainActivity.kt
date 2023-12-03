package com.example.historyinpersonalities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var linkToCategory: TextView = findViewById(R.id.linkToCat)
        var linkToPeten: TextView = findViewById(R.id.linkToPeten)
        var linkToError: ImageView = findViewById(R.id.linkToError)

        linkToCategory.setOnClickListener {
            val intent = Intent(this, article::class.java)
            startActivity(intent)
        }
        linkToError.setOnClickListener {
            val intent = Intent(this, error::class.java)
            startActivity(intent)
        }
        linkToPeten.setOnClickListener {
            val intent = Intent(this, peten::class.java)
            startActivity(intent)
        }
    }
}