package com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as.databinding.ActivityProblema5Binding

class Problema5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema5)

        val binding = ActivityProblema5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaMaterias = listOf(
            Materia("Física",8.2),
            Materia("Química",7.1),
            Materia("Geología",6.2),
            Materia("Química",6.4),
            Materia("Castellano",8.2),
            Materia("Filosofía",7.3)

        )
        val mapaAlumnos = mapOf(

            Pair("48532A", listaMaterias[0]),

            Pair("6337B", listaMaterias[1]),

            Pair("5593T", listaMaterias[2])
        )

        binding.tvResultado50.text = mostrarAlumnos(mapaAlumnos)

    }
    fun mostrarAlumnos(mapaAlumnos: Map<String, Materia>): String{
        var alumno = ""
        for ((clave, valor) in mapaAlumnos)
            alumno += "ID: $clave, Materias: $valor\n"
        return alumno
    }
}
data class Materia(val nombre: String, val nota:Double){
    override fun toString(): String {
        return "$nombre, nota $nota"
    }
}