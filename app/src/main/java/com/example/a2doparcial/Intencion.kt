package com.example.a2doparcial

sealed class Intencion {
    object BorrarTodo: Intencion()
    object MostrarCordoba: Intencion()
    object MostrarCaba: Intencion()
    object MostrarError: Intencion()
}
