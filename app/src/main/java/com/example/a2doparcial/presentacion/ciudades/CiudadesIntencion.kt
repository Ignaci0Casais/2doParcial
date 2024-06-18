package com.example.a2doparcial.presentacion.ciudades

import com.example.a2doparcial.repository.modelos.Ciudad

sealed class CiudadesIntencion {
    data class Buscar( val nombre:String ) : CiudadesIntencion()
    data class Seleccionar(val ciudad: Ciudad) : CiudadesIntencion()
}