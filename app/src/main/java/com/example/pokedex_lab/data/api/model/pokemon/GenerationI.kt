package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationI(
    @SerializedName("red-blue") val red_blue: com.example.pokedex_lab.data.api.model.pokemon.RedBlue,
    val yellow: com.example.pokedex_lab.data.api.model.pokemon.Yellow
)