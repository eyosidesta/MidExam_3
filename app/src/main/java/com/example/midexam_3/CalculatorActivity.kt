package com.example.midexam_3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        // Retrieve data from intent extras
        val number1 = intent.getDoubleExtra("number1", 0.0)
        val number2 = intent.getDoubleExtra("number2", 0.0)

        etNumber1.setText(number1.toString())
        etNumber2.setText(number2.toString())

        btnAdd.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = etNumber2.text.toString().toDoubleOrNull() ?: 0.0
            val result = num1 + num2
            tvResult.text = result.toString()
        }
    }
}
