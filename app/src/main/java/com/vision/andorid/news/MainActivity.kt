package com.vision.andorid.news

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.vision.andorid.common_utils.Activities
import com.vision.andorid.common_utils.Navigator
import com.vision.andorid.news.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var provider:Navigator.Provider

    private var _binding:ActivityMainBinding?=null
    private val binding:ActivityMainBinding
    get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.statusBarColor = ContextCompat.getColor(this,R.color.white)
        _binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        provider.getActivities(Activities.SearchActivity).navigate(this)

    }
}