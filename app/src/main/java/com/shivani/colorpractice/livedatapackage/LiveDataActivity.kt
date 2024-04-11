package com.shivani.colorpractice.livedatapackage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.shivani.colorpractice.R
import com.shivani.colorpractice.databinding.ActivityLiveDataBinding
import com.shivani.colorpractice.databinding.FragmentLiveDataBinding
import androidx.lifecycle.ViewModelProvider as ViewModelProvider1

class LiveDataActivity : AppCompatActivity() {
    lateinit var colorViewModel : ColorViewModel
    lateinit var binding: ActivityLiveDataBinding
    lateinit var value : FragmentLiveDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLiveDataBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.activity = this
        colorViewModel = ViewModelProvider1(this)[ColorViewModel::class.java]
    }
    fun buttonClick(buttonNumber: Int){
        when(buttonNumber){
            0 -> colorViewModel.color.value = 0
            1 -> colorViewModel.color.value = 1
            2 -> colorViewModel.color.value = 2
        }
    }
}

