package com.example.time_tracking
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity



class MenuActivity : AppCompatActivity() {

    private lateinit var btnTimesheetEntry: Button
    private lateinit var btnCategories: Button
    private lateinit var btnSettings: Button
    private lateinit var btnLogin : Button
    private lateinit var btnViewEntriesActivity : Button
    private lateinit var btnBackToMenu: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.menu_activity)

        // Initialize buttons
        btnTimesheetEntry = findViewById(R.id.btnTimesheetEntry)
        btnCategories = findViewById(R.id.btnCategories)
        btnSettings = findViewById(R.id.btnSettings)
        btnLogin = findViewById(R.id.btnLogin)
        btnViewEntriesActivity = findViewById(R.id.btnViewEntries)
        btnBackToMenu = findViewById(R.id.btnBackToMenu)

        val btnBackToMenu: Button = findViewById(R.id.btnBackToMenu)
        btnBackToMenu.setOnClickListener {
            // Navigate back to the previous activity (if applicable)
            onBackPressed()
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