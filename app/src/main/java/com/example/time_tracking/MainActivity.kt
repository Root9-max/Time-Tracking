package com.example.time_tracking
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class tieMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Redirect to LoginActivity
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
}
