package com.alamin1x0.weather.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.alamin1x0.weather.data.CurrentLocation
import com.alamin1x0.weather.data.WeatherData
import com.alamin1x0.weather.databinding.ItemContainerCurrentLocationBinding

class WeatherAdapter(
    private val onLocationClicked: () -> Unit
) : RecyclerView.Adapter<WeatherAdapter.CurrentLocationViewHolder>() {

    private val weatherData = mutableListOf<WeatherData>()

    fun setData(data: List<WeatherData>) {
        weatherData.clear()
        weatherData.addAll(data)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrentLocationViewHolder {
        return CurrentLocationViewHolder(
            ItemContainerCurrentLocationBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: CurrentLocationViewHolder, position: Int) {
        holder.bind(weatherData[position] as CurrentLocation)
    }

    override fun getItemCount(): Int {
        return weatherData.size
    }

    inner class CurrentLocationViewHolder(
        private val binding: ItemContainerCurrentLocationBinding
    ) : RecyclerView.ViewHolder(binding.root) {
        fun bind(currentLocation: CurrentLocation) {
            with(binding) {
                textCurrentDate.text = currentLocation.data
                textCurrentLocation.text = currentLocation.locaiton
                imageCurrentLocation.setOnClickListener { onLocationClicked() }
                textCurrentLocation.setOnClickListener { onLocationClicked() }

            }
        }
    }
}