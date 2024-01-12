package com.alamin1x0.weather.data

sealed class WeatherData
data class CurrentLocation(
    val data: String,
    val locaiton: String = "Choose your location"
) : WeatherData()
