package com.example.pokedex_lab.data.api.model.pokemon

data class Move(
    val move: com.example.pokedex_lab.data.api.model.pokemon.MoveX,
    val version_group_details: List<com.example.pokedex_lab.data.api.model.pokemon.VersionGroupDetail>
)