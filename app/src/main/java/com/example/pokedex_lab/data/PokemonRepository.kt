package com.example.pokedex_lab.data

import com.example.pokedex_lab.data.api.model.PokedexObject
import com.example.pokedex_lab.data.api.PokemonApiClient
import com.example.pokedex_lab.data.api.model.pokemon.Pokemon

class PokemonRepository {
    private val apiPokemon = PokemonApiClient()

    suspend fun getPokemonList(limit:Int): PokedexObject? = apiPokemon.getPokemonList(limit)

    suspend fun getPokemonInfo(numberPokemon:Int): Pokemon?  = apiPokemon.getPokemonInfo(numberPokemon)
}