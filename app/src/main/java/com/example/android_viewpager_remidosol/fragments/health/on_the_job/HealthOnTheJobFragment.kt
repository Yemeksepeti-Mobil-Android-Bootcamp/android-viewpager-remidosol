package com.example.android_viewpager_remidosol.fragments.health.on_the_job

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.android_viewpager_remidosol.R

class HealthOnTheJobFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_on_the_job, container, false)
    }
}