package com.internshala.ayushmanapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.internshala.ayushmanapp.R

class HelpActivity : AppCompatActivity() {

    lateinit var crossHelp: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_help)

        crossHelp = findViewById(R.id.crossHelp)

        crossHelp.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}