package com.internshala.ayushmanapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.internshala.ayushmanapp.R

class PrivacyPolicyActivity : AppCompatActivity() {

    lateinit var crossPrivacyPolicy: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_privacy_policy)

        crossPrivacyPolicy = findViewById(R.id.crossPrivacyPolicy)

        crossPrivacyPolicy.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}