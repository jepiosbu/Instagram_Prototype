package com.example.pornhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.pornhub.databinding.ActivitySplahsBinding

class SplahsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplahsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplahsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}