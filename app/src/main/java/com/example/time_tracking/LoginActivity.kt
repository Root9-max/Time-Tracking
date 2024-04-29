package com.example.time_tracking

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var btnLogin: Button
    private lateinit var etPassword: EditText
    private lateinit var etUsername: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btnLogin)
        etPassword = findViewById(R.id.etPassword)
        etUsername = findViewById(R.id.etUsername)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString()
            val password = etPassword.text.toString()

            if (isValidUsername(username) && isValidPassword(password)) {
                // Navigate to CategoryActivity
                startActivity(Intent(this, CategoryActivity::class.java))
                finish()
            } else {
                // Show error message
                // For now, let's just show a toast message
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun isValidUsername(username: String): Boolean {
        // Implement username validation logic here
        // Example validation: username must not be empty
        return username.isNotEmpty()
    }

    private fun isValidPassword(password: String): Boolean {
        // Implement password validation logic here
        // Example validation: password must not be empty
        return password.isNotEmpty()
    }
}


