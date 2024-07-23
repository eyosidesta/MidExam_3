package com.example.midexam_3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MealPlannerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_planner)

        val mealType = intent.getStringExtra("mealType")

        val tvMealType = findViewById<TextView>(R.id.tvMealType)
        tvMealType.text = "Meal Type: $mealType"
    }
}
