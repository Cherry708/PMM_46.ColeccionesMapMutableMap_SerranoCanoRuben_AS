package com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as.databinding.ActivityProblema6Binding

class Problema6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema6)

        val binding = ActivityProblema6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val mapaDiario = mutableMapOf(
            Pair(Fecha(3,7,2021), "Día 3 de Julio."),
            Pair(Fecha(11,2,2020), "Día 11 de Febrero."),
            Pair(Fecha(30,9,2021), "Día 30 de Septiembre.")
        )

        binding.tvResultado60.text = mostrarDiario(mapaDiario)

    }
    fun mostrarDiario(mapaDiario: MutableMap<Fecha,String>):String{
        var diario = ""
        for ((clave, valor) in mapaDiario){
            diario += "$clave, $valor\n"
        }
        return diario
    }
}
data class Fecha(val dia: Int, val mes: Int, val ano: Int){
    override fun toString(): String {
        return "Fecha $dia/$mes/$ano"
    }
}