package com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as.databinding.ActivityProblema3Binding

class Problema3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema3)

        val binding = ActivityProblema3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val diccionario = mapOf(
            Pair("Hello", "Hola"),
            Pair("Name","Nombre"),
            Pair("Template","Plantilla"),
            Pair("Vowel","Vocal")
        )

        binding.tvResultado30.text = mostrarDiccionario(diccionario)

    }
    fun mostrarDiccionario(diccionario: Map<String,String>): String {
        var contenido = ""
        for ((palabraIngles,palabraCastellano) in diccionario)
            contenido += "$palabraIngles es $palabraCastellano en castellano\n"
        return contenido
    }
}