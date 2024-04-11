package com.shivani.colorpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import com.shivani.colorpractice.databinding.ActivityMainBinding
import com.shivani.colorpractice.R.color.Red as Red1

class MainActivity() : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var colorchange: Color
    var Int: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        binding.btnRed= findViewById(R.id.btnRed)
//        binding.btnRed.setOnClickListener(this)
//        binding.btnBlue = findViewById(R.id.btnBlue)
//        binding.btnBlue.setOnClickListener(this)
//        binding.btnPink=findViewById(R.id.btnPink)
//        binding.btnPink.setOnClickListener(R.id.btnPink)

        binding.btnRed.setOnClickListener {
            colorchange.colorSwitch(R.color.Red)
        }
            binding.btnBlue.setOnClickListener {
                colorchange.colorSwitch(R.color.Blue)
            }
            binding.btnPink.setOnClickListener {
                colorchange.colorSwitch(R.color.Pink)
            }
    }
    fun increment(n: Int) {
        binding.btnValue.text = n.toString()
    }
}











