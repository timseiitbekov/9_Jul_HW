package com.example.a9_jul_hw

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LoginPageOne : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.login_one)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.login_one)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val buttonGameNow: Button = findViewById(R.id.game_now)
        buttonGameNow.setOnClickListener {
            val intent = Intent(this, LoadingPage::class.java)
            startActivity(intent)
        }

        val buttonLoginEmail: Button = findViewById(R.id.login_email)
        buttonLoginEmail.setOnClickListener {
            val intent = Intent(this, LoginPageTwo::class.java)
            startActivity(intent)
        }
    }
}