package com.example.pornhub

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.pornhub.databinding.ActivityHomeBinding
import com.example.pornhub.fragment.fourfragment
import com.example.pornhub.fragment.onefragment
import com.example.pornhub.fragment.threefragment
import com.example.pornhub.fragment.twofragment

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomeBinding
    val onefragment = onefragment()
    val twofragment = twofragment()
    val threefragment = threefragment()
    val fourfragment = fourfragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadfragment(onefragment)
        changefragment()
    }
    fun changefragment(){
        binding.navigationBotton.setOnNavigationItemSelectedListener{ item ->
            when(item.itemId){
                R.id.onefragment->{
                    loadfragment(onefragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.twofragment->{
                    loadfragment(twofragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.threefragment->{
                    loadfragment(threefragment)
                    return@setOnNavigationItemSelectedListener true
                }
                R.id.fourfragment->{
                    loadfragment(fourfragment)
                    return@setOnNavigationItemSelectedListener true
                }
            }
            return@setOnNavigationItemSelectedListener false
            }
    }
    fun loadfragment(fragment: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.container_frag, fragment)
        fragmentTransaction.commit()
    }
}