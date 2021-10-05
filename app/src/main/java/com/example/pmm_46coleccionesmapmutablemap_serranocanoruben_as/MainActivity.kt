package com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapaPaises = mapOf(
            Pair("España",10000),
            Pair("Argentina",20000),
            Pair("China", 30000)
        )

        var mostrarPaises = ""
        for (pais in mapaPaises){
            mostrarPaises += "$pais\n"
        }

        var mostrarClaveValor = ""
        for ((clave, valor) in mapaPaises){
            mostrarClaveValor = "La clave es $clave y el valor $valor\n"
        }

        val elementosMapa = "La cantidad de elementos en el mapa es ${mapaPaises.size}\n"

        var mostrarHabitantes = ""
        for ((pais, habitantes) in mapaPaises){
            mostrarHabitantes += "Los habitantes de $pais son $habitantes\n"
        }

        binding.tvResultado10.text = mostrarPaises
            .plus(mostrarClaveValor)
            .plus(elementosMapa)
            .plus(mostrarHabitantes)
    }
}