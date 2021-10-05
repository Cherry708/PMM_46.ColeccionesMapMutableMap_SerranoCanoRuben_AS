package com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as.databinding.ActivityProblema2Binding

class Problema2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema2)

        val binding = ActivityProblema2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapaArticulos = mapOf(
            Pair("Televisión",419.00),
            Pair("Tomate",1.69),
            Pair("Silla",23.99),
            Pair("Teclado",15.99),
            Pair("Puerta",44.99)
        )

        var articulos = ""
        for ((articulo, precio) in mapaArticulos){
            articulos += "$articulo, precio: $precio\n"
        }


        val cantidadArticulos = "Artículos de precio superior a 20: " +
                "${mapaArticulos.count(){it.value >= 20}}\n"

        binding.tvResultado20.text = articulos.plus(cantidadArticulos)
    }
}