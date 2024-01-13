package com.alamin1x0.weather.dependency_injection

import com.alamin1x0.weather.videwmodel.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelMode = module {
    viewModel { HomeViewModel(weatherDataRepository = get()) }
}