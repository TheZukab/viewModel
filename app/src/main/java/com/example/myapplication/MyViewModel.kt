package com.example.myapplication

import androidx.compose.runtime.getValue
import androidx.compose.runtime.*
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
    var heightInput by mutableStateOf("")
    var weightInput by mutableStateOf("")
    val weight = weightInput.toFloatOrNull() ?: 0.0f
    val height = heightInput.toFloatOrNull() ?: 0.0f
    val bmi = if (weight > 0 && height > 0) weight / (height * height) else 0.0

}