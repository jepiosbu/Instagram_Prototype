package com.example.pornhub

import android.content.Context

class Pref(val context: Context)
{
    fun setUsuario(Usuario:String)
    {
        context.getSharedPreferences("code", Context.MODE_PRIVATE).edit().putString("usuario",Usuario).apply()
    }
    fun setContrase(Contrase:String)
    {
        context.getSharedPreferences("code", Context.MODE_PRIVATE).edit().putString("contraseña",Contrase).apply()
    }
    fun setCelular(Celular:Int)
    {
        context.getSharedPreferences("code", Context.MODE_PRIVATE).edit().putInt("celular",Celular).apply()
    }
    fun getUsuario(): String? {
        var getU= context.getSharedPreferences("code", Context.MODE_PRIVATE).getString("usuario","")
        return getU
    }
    fun getContrase(): String?
    {
        var getC=context.getSharedPreferences("code", Context.MODE_PRIVATE).getString("contraseña","")
        return getC
    }
    fun getCelular(): Int
    {
        var getN=context.getSharedPreferences("code", Context.MODE_PRIVATE).getInt("celular",0)
        return getN
    }
}