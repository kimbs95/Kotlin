package com.example.myapplication18

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication18.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.textView.text=getString(R.string.txt_data2)
    }
}