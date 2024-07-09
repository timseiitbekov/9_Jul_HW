package com.example.a9_jul_hw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPageTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_two)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login_two)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonNext: Button = findViewById(R.id.next)
        buttonNext.setOnClickListener {
            val intent = Intent(this, LoadingPage::class.java)
            startActivity(intent)
        }
    }
}