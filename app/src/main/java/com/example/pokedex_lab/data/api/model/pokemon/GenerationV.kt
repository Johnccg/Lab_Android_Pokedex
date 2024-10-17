package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationV(
    @SerializedName("black-white") val black_white: com.example.pokedex_lab.data.api.model.pokemon.BlackWhite
)