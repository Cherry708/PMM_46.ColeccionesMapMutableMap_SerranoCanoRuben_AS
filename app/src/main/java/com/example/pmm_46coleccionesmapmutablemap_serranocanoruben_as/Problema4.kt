package com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pmm_46coleccionesmapmutablemap_serranocanoruben_as.databinding.ActivityProblema4Binding

class Problema4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problema4)

        val binding = ActivityProblema4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val productos = mapOf(
            Pair(19,Producto("Azúcar",1.2,8)),
            Pair(76,Producto("Pan",0.6,14)),
            Pair(64,Producto("Huevo",1.8,12)),
            Pair(23,Producto("Uva",0.4,16))
        )

        binding.tvResultado40.text = mostrarProductos(productos)

    }
    fun mostrarProductos(productos: Map<Int,Producto>): String {
        var producto = ""
        for ((clave,valor) in productos)
            producto += "$valor, clave: $clave\n"
        return producto
    }
}
class Producto(val nombre: String, val precio: Double, val cantidad: Int){
    override fun toString(): String {
        return "Producto: $nombre, precio: $precio, cantidad: $cantidad"
    }
}