package com.example.a2doparcial.presentacion.ciudades

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.a2doparcial.repository.Repositorio
import com.example.a2doparcial.router.Router
import com.example.a2doparcial.router.Ruta
import kotlinx.coroutines.launch

class CiudadesViewModel(
    val repositorio: Repositorio,
    val router: Router
) : ViewModel(){

    var uiState by mutableStateOf<CiudadesEstado>(CiudadesEstado.Vacio)

    fun ejecutar(intencion: CiudadesIntencion){
        when(intencion){
            is CiudadesIntencion.Buscar -> buscar(nombre = intencion.nombre)
            is CiudadesIntencion.Seleccionar -> seleccionar(indice = intencion.indice)
        }
    }

    private fun buscar( nombre: String){

        uiState = CiudadesEstado.Cargando
        viewModelScope.launch {
            try {
                val listaDeCiudades = repositorio.buscarCiudad(nombre)
                uiState = CiudadesEstado.Resultado(listaDeCiudades)
            } catch (exeption: Exception){
                uiState = CiudadesEstado.Error(exeption.message ?: "error desconocido")
            }
        }
    }

    private fun seleccionar(indice: Int){
        uiState = CiudadesEstado.Vacio
        router.navegar(Ruta.Clima())
    }
}


class CiudadesViewModelFactory(
    private val repositorio: Repositorio,
    private val router: Router
) : ViewModelProvider.Factory {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CiudadesViewModel::class.java)) {
            return CiudadesViewModel(repositorio,router) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}