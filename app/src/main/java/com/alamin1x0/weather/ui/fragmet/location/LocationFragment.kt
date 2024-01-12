package com.alamin1x0.weather.ui.fragmet.location

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alamin1x0.weather.R
import com.alamin1x0.weather.databinding.FragmentLocationBinding


class LocationFragment : Fragment() {

    lateinit var binding: FragmentLocationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLocationBinding.inflate(layoutInflater)

        return binding.root
    }

}