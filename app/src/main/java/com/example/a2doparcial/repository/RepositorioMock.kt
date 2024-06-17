package com.example.a2doparcial.repository

import com.example.a2doparcial.repository.modelos.Ciudad
import com.example.a2doparcial.repository.modelos.Clima

class RepositorioMock  : Repositorio {
    override suspend fun buscarCiudad(ciudad: String): Array<Ciudad> {
        val ciudad1 = Ciudad(name = "Cordoba",
            lat = -23.0,
            lon = -24.3,
            country = "Argentina")
        val ciudad2 =Ciudad(name = "Buenos Aires",
            lat = -23.0,
            lon = -24.3,
            country = "Argentina")
        val ciudad3 =Ciudad(name = "La Plata",
            lat = -23.0,
            lon = -24.3,
            country = "Argentina")
        return arrayOf(ciudad1,ciudad2,ciudad3)
    }

    override suspend fun traerClima(ciudad: Ciudad): Clima {
        TODO("Not yet implemented")
    }

    override suspend fun traerPronostico(ciudad: Ciudad): List<Clima> {
        TODO("Not yet implemented")
    }
}