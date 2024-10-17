package com.example.pokedex_lab.data.api.model.pokemon

data class Pokemon(
    val abilities: List<com.example.pokedex_lab.data.api.model.pokemon.Ability>,
    val base_experience: Int,
    val cries: com.example.pokedex_lab.data.api.model.pokemon.Cries,
    val forms: List<com.example.pokedex_lab.data.api.model.pokemon.Form>,
    val game_indices: List<com.example.pokedex_lab.data.api.model.pokemon.GameIndice>,
    val height: Int,
    val held_items: List<Any?>,
    val id: Int,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<com.example.pokedex_lab.data.api.model.pokemon.Move>,
    val name: String,
    val order: Int,
    val past_abilities: List<Any?>,
    val past_types: List<Any?>,
    val species: com.example.pokedex_lab.data.api.model.pokemon.Species,
    val sprites: com.example.pokedex_lab.data.api.model.pokemon.Sprites,
    val stats: List<com.example.pokedex_lab.data.api.model.pokemon.Stat>,
    val types: List<com.example.pokedex_lab.data.api.model.pokemon.Type>,
    val weight: Int
)