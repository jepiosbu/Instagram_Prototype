package com.example.pornhub

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.os.Handler
import android.os.Looper
import com.example.pornhub.databinding.ActivitySplahsBinding

class SplahsActivity : AppCompatActivity() {
    lateinit var binding: ActivitySplahsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySplahsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var makia= object : CountDownTimer(6000,1000){
            var aca="."
            override fun onTick(p0: Long) {
                binding.load.text= aca
                aca=aca+" ."
            }

            override fun onFinish() {
                startActivity(Intent(this@SplahsActivity,HomeActivity::class.java))
            }
        }
        makia.start()
    }
}
