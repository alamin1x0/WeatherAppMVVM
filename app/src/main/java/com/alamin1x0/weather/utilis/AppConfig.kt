package com.alamin1x0.weather.utilis

import android.app.Application
import com.alamin1x0.weather.dependency_injection.repositoryModule
import com.alamin1x0.weather.dependency_injection.viewModelMode
import org.koin.core.context.startKoin
import org.koin.dsl.module

class AppConfig:Application() {

    override fun onCreate() {
        super.onCreate()
        startKoin {
           modules(listOf(repositoryModule, viewModelMode))
        }
    }
}