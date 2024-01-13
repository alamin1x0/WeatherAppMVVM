package com.alamin1x0.weather.data

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

sealed class WeatherData
data class CurrentLocation(
    val data: String = getCurrentData(),
    val locaiton: String = "Choose your location",
    val latitude: Double? = null,
    val longitude: Double? = null,
) : WeatherData()


private fun getCurrentData(): String {
    val currentData = Date()
    val formatter = SimpleDateFormat("d MMMM yyyy", Locale.getDefault())
    return "Today, ${formatter.format(currentData)}"
}