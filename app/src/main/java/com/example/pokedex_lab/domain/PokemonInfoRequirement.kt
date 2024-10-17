package com.example.pokedex_lab.domain

import com.example.pokedex_lab.data.PokemonRepository
import com.example.pokedex_lab.data.api.model.pokemon.Pokemon

class PokemonInfoRequirement {
    private val pokemonRepository = PokemonRepository()

    suspend operator fun invoke(
        pokemonNumber: Int
    ): Pokemon? = pokemonRepository.getPokemonInfo(pokemonNumber)
}