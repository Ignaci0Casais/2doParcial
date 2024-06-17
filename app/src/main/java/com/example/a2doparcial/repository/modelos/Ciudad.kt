package com.example.a2doparcial.repository.modelos

import kotlinx.serialization.Serializable

@Serializable
data class Ciudad(
    val name: String,
    val lat: Double,
    val lon: Double,
    val country: String,
    val state: String? = null
)