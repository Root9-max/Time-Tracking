package com.example.time_tracking
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class MenuActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)

        // Initialize buttons
        val btnTimesheetEntry: Button = findViewById(R.id.btnTimesheetEntry)
        val btnCategories: Button = findViewById(R.id.btnCategories)
        val btnSettings: Button = findViewById(R.id.btnSettings)
        val btnLogin : Button = findViewById(R.id.btnLogin)
        val btnViewEntriesActivity : Button = findViewById(R.id.btnViewEntries)

        // In your activity class, after setContentView is called
        val btnBackToMenu: Button = findViewById(R.id.btnBackToMenu)
        btnBackToMenu.setOnClickListener {
            // Navigate back to the menu activity
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish() // Optional: Close the current activity
        }

        // Set click listeners for buttons
        btnTimesheetEntry.setOnClickListener {
            // Navigate to TimesheetEntryActivity
            startActivity(Intent(this, TimesheetEntryActivity::class.java))
        }

        btnCategories.setOnClickListener {
            // Navigate to CategoriesActivity
            startActivity(Intent(this, CategoryActivity::class.java))
        }

        btnSettings.setOnClickListener {
            // Navigate to SettingsActivity
            startActivity(Intent(this, SettingsActivity::class.java))
        }

    }
}