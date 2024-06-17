package com.example.a2doparcial.presentacion.clima

sealed class ClimaEstado {
    data class Exitoso (
        val ciudad: String = "",
        val temperatura: Double = 0.00,
        val descripcion: String= "",
        val st :Double = 0.00,
    ) : ClimaEstado()
    data class Error(
        val mensaje :String = "",
    ) : ClimaEstado()
    data object Vacio: ClimaEstado()
    data object Cargando: ClimaEstado()
}
