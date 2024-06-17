package com.example.a2doparcial.repository

import com.example.a2doparcial.repository.modelos.Ciudad
import com.example.a2doparcial.repository.modelos.Clima

interface Repositorio {
    suspend fun buscarCiudad(ciudad: String): Array<Ciudad>
    suspend fun traerClima(ciudad: Ciudad) : Clima
    suspend fun traerPronostico(ciudad: Ciudad) : List<Clima>
}