package com.example.a2doparcial.presentacion.ciudades

import com.example.a2doparcial.repository.modelos.Ciudad

sealed class CiudadesEstado {
    data object Vacio: CiudadesEstado()
    data object Cargando: CiudadesEstado()
    data class Resultado( val ciudades : Array<Ciudad> ) : CiudadesEstado()
    data class Error(val mensaje: String): CiudadesEstado()
}