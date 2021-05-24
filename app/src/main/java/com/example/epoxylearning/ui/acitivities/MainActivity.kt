package com.example.epoxylearning.ui.acitivities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.epoxylearning.data.FakeData
import com.example.epoxylearning.databinding.ActivityMainBinding
import com.example.epoxylearning.ui.adapters.OuterAdapter


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initEpoxy()
    }

    private fun initEpoxy() {
        val outerList = FakeData.getOuterList()
        OuterAdapter.setup(binding.rvOuter, outerList)
    }
}