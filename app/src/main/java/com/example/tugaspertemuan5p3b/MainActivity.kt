package com.example.tugaspertemuan5p3b

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Spannable
import android.text.SpannableString
import android.text.SpannableStringBuilder
import android.text.style.ForegroundColorSpan
import com.example.tugaspertemuan5p3b.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
        const val EXTRA_USERNAME = "extra_username"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_PHONE = "extra_phone"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding){
            registerBtn.setOnClickListener {
                val intentToSecondActivity =
                    Intent(this@MainActivity,MainActivity2::class.java)
                val username = username.text.toString()
                val email = email.text.toString()
                val phone = phone.text.toString()
                intentToSecondActivity.putExtra(EXTRA_USERNAME, username)
                intentToSecondActivity.putExtra(EXTRA_EMAIL, email)
                intentToSecondActivity.putExtra(EXTRA_PHONE, phone)
                startActivity(intentToSecondActivity)
            }
        }

    }

}