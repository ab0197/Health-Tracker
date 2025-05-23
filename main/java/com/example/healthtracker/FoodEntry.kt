package com.example.healthtracker

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "food_entries")
data class FoodEntry(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    val foodName: String,
    val calorieCount: Int
)
