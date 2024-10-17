package com.example.pokedex_lab.domain

import com.example.pokedex_lab.data.PokemonRepository
import com.example.pokedex_lab.data.api.model.PokedexObject

class PokemonListRequirement {
    private val pokemonRepository = PokemonRepository()

    suspend operator fun invoke(
        limit: Int
    ): PokedexObject? = pokemonRepository.getPokemonList(limit)
}