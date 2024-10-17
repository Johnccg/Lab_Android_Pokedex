package com.example.pokedex_lab.framework.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.pokedex_lab.data.api.model.PokedexObject
import com.example.pokedex_lab.domain.PokemonListRequirement
import com.example.pokedex_lab.util.Constants
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {
    //Es un tipo de dato al cual la actividad se pudede conectar para saber si hay cambios
    //Puede recibir cualquier tipo de dato, nosotros se lo especificamos
    val pokedexObjectLiveData = MutableLiveData<PokedexObject>()
    private val pokemonListRequirement = PokemonListRequirement()

    fun getPokemonList(){
        //Corrutina específica de un ViewModel, mientras el ViewModel viva esta corrutina va a existir
        viewModelScope.launch(Dispatchers.IO) {
            val result: PokedexObject? = pokemonListRequirement(Constants.MAX_POKEMON_NUMBER)
            Log.d("Salida", result?.count.toString())
            CoroutineScope(Dispatchers.Main).launch {
                pokedexObjectLiveData.postValue(result!!)
            }
        }
    }
}