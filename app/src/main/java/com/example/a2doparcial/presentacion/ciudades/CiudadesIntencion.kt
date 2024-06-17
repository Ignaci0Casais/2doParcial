package com.example.a2doparcial.presentacion.ciudades

sealed class CiudadesIntencion {
    data class Buscar( val nombre:String ) : CiudadesIntencion()
    data class Seleccionar(val indice: Int) : CiudadesIntencion()
}