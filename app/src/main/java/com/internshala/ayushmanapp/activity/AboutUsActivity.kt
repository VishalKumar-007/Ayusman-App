package com.internshala.ayushmanapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import com.internshala.ayushmanapp.R

class AboutUsActivity : AppCompatActivity() {

    lateinit var backAboutUs: LinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_us)

        backAboutUs = findViewById(R.id.backAboutUs)

        backAboutUs.setOnClickListener {
            onBackPressed()
        }
    }

    override fun onBackPressed() {
        finish()
    }
}