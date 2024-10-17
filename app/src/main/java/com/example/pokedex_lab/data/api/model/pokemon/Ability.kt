package com.example.pokedex_lab.data.api.model.pokemon

data class Ability(
    val ability: com.example.pokedex_lab.data.api.model.pokemon.AbilityX,
    val is_hidden: Boolean,
    val slot: Int
)