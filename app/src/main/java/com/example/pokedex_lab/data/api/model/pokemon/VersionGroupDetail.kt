package com.example.pokedex_lab.data.api.model.pokemon

data class VersionGroupDetail(
    val level_learned_at: Int,
    val move_learn_method: com.example.pokedex_lab.data.api.model.pokemon.MoveLearnMethod,
    val version_group: com.example.pokedex_lab.data.api.model.pokemon.VersionGroup
)