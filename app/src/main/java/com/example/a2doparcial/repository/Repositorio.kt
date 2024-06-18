package com.example.a2doparcial.repository

import com.example.a2doparcial.repository.modelos.Ciudad
import com.example.a2doparcial.repository.modelos.Clima

interface Repositorio {
    suspend fun buscarCiudad(ciudad: String): List<Ciudad>
    suspend fun traerClima(lat: Float, lon: Float) : Clima
    suspend fun traerPronostico(lat: Float, lon: Float) : List<Clima>
}