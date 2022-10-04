package com.vision.andorid.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.vision.andorid.news.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding:ActivityMainBinding?=null
    private val binding:ActivityMainBinding
    get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}