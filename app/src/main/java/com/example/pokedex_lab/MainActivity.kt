package com.example.pokedex_lab

import android.app.Activity
import android.os.Bundle
import com.example.pokedex_lab.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager

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
        setUpRecyclerView(testData())
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
        adapter.PokemonAdapter(dataForList)
        binding.RVPokemon.adapter = adapter
    }

    private fun testData():ArrayList<PokemonBase>{
        var result = ArrayList<PokemonBase>()

        result.add(PokemonBase("bulbasaur",""))
        result.add(PokemonBase("charmander",""))
        result.add(PokemonBase("squirtle",""))

        return result
    }
}

