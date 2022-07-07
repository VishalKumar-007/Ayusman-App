package com.internshala.ayushmanapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    lateinit var txtTermsAndConditions: TextView
    lateinit var txtAboutUs: TextView
    lateinit var txtPrivacyPolicy: TextView
    lateinit var etPhoneNumber: EditText
    lateinit var tvPhoneNumber: TextView
    lateinit var btnGetOtp: Button
    lateinit var btnBuyNow: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        txtTermsAndConditions = findViewById(R.id.txtTermsAndConditions)
        txtAboutUs = findViewById(R.id.txtAboutUs)
        txtPrivacyPolicy = findViewById(R.id.txtPrivacyPolicy)
        etPhoneNumber = findViewById(R.id.etPhoneNumber)
        tvPhoneNumber = findViewById(R.id.tvPhoneNumber)
        btnGetOtp = findViewById(R.id.btnGetOtp)
        btnBuyNow = findViewById(R.id.btnBuyNow)

        btnGetOtp.setOnClickListener {
            var phoneNumber = etPhoneNumber.text.toString()
            if(phoneNumber.isEmpty()){
                etPhoneNumber.setBackgroundResource(R.drawable.edittext_error_background)
                tvPhoneNumber.text = "*Please enter phone number."
            }
            else{
                Toast.makeText(this, "Clicked on Get Otp", Toast.LENGTH_SHORT).show()
            }
        }

    }
}