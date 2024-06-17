package com.example.a2doparcial

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.a2doparcial.presentacion.ciudades.CiudadesPage
import com.example.a2doparcial.presentacion.clima.ClimaPage
import com.example.a2doparcial.router.Enrutador
import com.example.a2doparcial.router.Ruta

@Composable
fun MainPage() {
    val navHostController = rememberNavController()
    NavHost(
        navController = navHostController,
        startDestination = Ruta.Ciudades.id
    ) {
        composable(
            route = Ruta.Ciudades.id
        ) {
            CiudadesPage(navHostController)
        }
        composable(
            route = Ruta.Clima().id
        ) {
            ClimaPage(navHostController)
        }
    }
}