package com.internshala.ayushmanapp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.internshala.ayushmanapp.R

class TermsAndConditionActivity : AppCompatActivity() {

    lateinit var crossTermsAndConditions: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_and_condition)

        crossTermsAndConditions = findViewById(R.id.crossTermsAndConditions)

        crossTermsAndConditions.setOnClickListener {
            onBackPressed()
        }

    }

    override fun onBackPressed() {
        finish()
    }
}