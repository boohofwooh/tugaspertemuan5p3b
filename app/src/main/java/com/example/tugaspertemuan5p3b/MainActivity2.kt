package com.example.tugaspertemuan5p3b

import android.app.Activity
import android.bluetooth.BluetoothDevice.EXTRA_NAME
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.tugaspertemuan5p3b.MainActivity.Companion.EXTRA_EMAIL
import com.example.tugaspertemuan5p3b.MainActivity.Companion.EXTRA_PHONE
import com.example.tugaspertemuan5p3b.MainActivity.Companion.EXTRA_USERNAME
import com.example.tugaspertemuan5p3b.databinding.ActivityMain2Binding
import com.example.tugaspertemuan5p3b.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val username = intent.getStringExtra(EXTRA_USERNAME)
        val email = intent.getStringExtra(EXTRA_EMAIL)
        val phone = intent.getStringExtra(EXTRA_PHONE)
        with(binding) {
            container.text = "Welcome $username \nYour $email has been activated \nYour $phone has been registered!"

            logoutBtn.setOnClickListener {
                val intent = Intent(this@MainActivity2, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
