package com.alamin1x0.weather.dependency_injection

import com.alamin1x0.weather.network.repository.WeatherDataRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { WeatherDataRepository() }
}