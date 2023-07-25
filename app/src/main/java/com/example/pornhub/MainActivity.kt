package com.example.pornhub

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.pornhub.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    companion object{
        lateinit var pref: Pref
    }
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        pref= Pref(this)
        loginF()
        login()
        registrarte()
    }
    fun loginF(){
        binding.loginF.setOnClickListener {
            startActivity(Intent(this,SplahsActivity::class.java))
        }
    }
    fun login(){
        binding.login.setOnClickListener {
            if(pref.getUsuario().toString()==binding.addusu.text.toString()&&pref.getContrase().toString()==binding.addcon.text.toString())
            {
                startActivity(Intent(this,SplahsActivity::class.java))
            }
            if (pref.getUsuario().toString()!=binding.addusu.text.toString())
            {
                binding.addusu.error="Usuario Incorrecto"
            }
            if(pref.getContrase().toString()!=binding.addcon.text.toString())
            {
                binding.addcon.error="Contraseña Incorrecta"
            }
        }
    }
    fun registrarte(){
        binding.registrate.setOnClickListener {
            startActivity(Intent(this,RegistroActivity::class.java))
        }
    }
}