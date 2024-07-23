package com.example.midexam_3

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonOpenCalculator = findViewById<Button>(R.id.buttonOpenCalculator)
        val buttonOpenMealPlanner = findViewById<Button>(R.id.buttonOpenMealPlanner)

        buttonOpenCalculator.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            intent.putExtra("number1", 10.0)
            intent.putExtra("number2", 20.0)
            startActivity(intent)
        }

        buttonOpenMealPlanner.setOnClickListener {
            val intent = Intent(this, MealPlannerActivity::class.java)
            intent.putExtra("mealType", "Dinner")
            startActivity(intent)
        }
    }
}
