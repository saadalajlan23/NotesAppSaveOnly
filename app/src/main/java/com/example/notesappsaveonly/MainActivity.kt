package com.example.notesappsaveonly

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val databaseHelper by lazy { DatabaseHelper(applicationContext) }
    private lateinit var editText: EditText
    private lateinit var btnSave : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText = findViewById(R.id.etText)
        btnSave = findViewById(R.id.btSubmit)
        btnSave.setOnClickListener {
            val Text = editText.text.toString()
            databaseHelper.saveData(Text)
            Toast.makeText(this, "Added successfully", Toast.LENGTH_LONG).show()
            editText.text.clear()

        }

    }
}