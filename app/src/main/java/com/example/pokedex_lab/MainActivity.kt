package com.example.pokedex_lab

import android.app.Activity
import android.os.Bundle
import android.util.Log
import com.example.pokedex_lab.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity: Activity() {
    //se generan automáticamente cuando declaramos nuestros layouts y
    //convierten el snake case del nombre en camel case añadiendo la palabra binding
    private lateinit var binding: ActivityMainBinding
    //Maneja la lógica de la lista (RV)
    private val adapter : PokemonAdapter = PokemonAdapter()
    //Información a desplegar
    private lateinit var data:ArrayList<PokemonBase>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        getPokemonList()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<PokemonBase>){
        binding.RVPokemon.setHasFixedSize(true)
        //es una lista continua de elementos donde su punto más importante es su orientación Vertical u Horizontal
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVPokemon.layoutManager = linearLayoutManager
        adapter.PokemonAdapter(dataForList, this)
        binding.RVPokemon.adapter = adapter
    }

    //Inicio de la llamada asíncrona
    //Los Scopes no son más que entornos pensados para ejecutar cierto tipo de acciones asíncronas
    private fun getPokemonList(){
        CoroutineScope(Dispatchers.IO).launch {
            val pokemonRepository = PokemonRepository()
            val result:PokedexObject? = pokemonRepository.getPokemonList(Constants.MAX_POKEMON_NUMBER)
            Log.d("Salida", result?.count.toString())
            CoroutineScope(Dispatchers.Main).launch {
                setUpRecyclerView(result?.results!!)
            }
        }
    }
}

