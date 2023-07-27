package com.example.pornhub

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.pornhub.MainActivity.Companion.pref
import com.example.pornhub.databinding.ActivityRegistroBinding

class RegistroActivity : AppCompatActivity() {
    lateinit var binding: ActivityRegistroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        guardar()
    }
    fun guardar()
    {
        binding.addcon.addTextChangedListener {
            var rex = Regex("^[A-Z][a-zA-Z0-9]{5,}[-_.]{1}[a-zA-Z0-9]{0,10}").matches(binding.addcon.text.toString())
            if (rex) {
                binding.addcon.error = null;
                pref.setContrase(binding.addcon.text.toString())
            } else {
                binding.addcon.error = "Baja Seguridad";
            }
            if (binding.addcon.text.isNullOrEmpty())
            {
                binding.addcon.error =null;
            }
        }
        binding.registro.setOnClickListener {
            var rex = Regex("^[A-Z][a-zA-Z0-9]{5,}[-_.]{1}[a-zA-Z0-9]{0,10}").matches(binding.addcon.text.toString())
            if(binding.addcon.text.toString()==""&&binding.addconfir.text.toString()=="")
            {
                binding.addcon.error="Campo querido"
                binding.addconfir.error="Campo requerido"
            }
            else if (binding.addcon.text.toString()!=binding.addconfir.text.toString())
            {
                binding.addcon.error="las contraseñas no coinciden";
                binding.addconfir.error="las contraseñas no coinciden";
            }
            if(binding.addusu.text.isNullOrEmpty())
            {
                binding.addusu.error="Campo Requerido"
            }
            else
            {
                binding.addusu.error=null
            }
            if(binding.addcel.text.isNullOrEmpty())
            {
                binding.addcel.error="Campo Requerido"
            }
            else
            {
                binding.addcel.error=null
            }
            if(rex&&!binding.addusu.text.isNullOrEmpty()&&!binding.addcon.text.isNullOrEmpty()&&binding.addcon.text.toString()==binding.addconfir.text.toString()&&!binding.addcel.text.isNullOrEmpty())
            {
                pref.setUsuario(binding.addusu.text.toString())
                pref.setContrase(binding.addcon.text.toString())
                pref.setCelular(binding.addcel.text.toString().toInt())
                Toast.makeText(this, "Registrado", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,MainActivity::class.java))
                finish()
            }

        }
    }
}