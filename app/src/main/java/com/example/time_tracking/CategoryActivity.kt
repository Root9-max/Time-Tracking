package com.example.time_tracking
import CategoryAdapter
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class CategoryActivity : AppCompatActivity() {

    private lateinit var etCategory: EditText
    private lateinit var btnAddCategory: Button
    private lateinit var rvCategories: RecyclerView
    private lateinit var categoryAdapter: CategoryAdapter
    private lateinit var btnBackToMenu: Button
    private val categories = mutableListOf<String>()

    @SuppressLint("NotifyDataSetChanged")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.categoty_activity) // Corrected typo here

        etCategory = findViewById(R.id.etCategory)
        btnAddCategory = findViewById(R.id.btnAddCategory)
        rvCategories = findViewById(R.id.rvCategories)
        btnBackToMenu = findViewById(R.id.btnBackToMenu)
        categoryAdapter = CategoryAdapter(categories)
        rvCategories.adapter = categoryAdapter
        rvCategories.layoutManager = LinearLayoutManager(this)

        btnBackToMenu.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }

        btnAddCategory.setOnClickListener {
            val newCategory = etCategory.text.toString().trim()
            if (newCategory.isNotEmpty()) {
                categories.add(newCategory)
                categoryAdapter.notifyDataSetChanged()
                etCategory.text.clear()
            }
        }

    }
}

