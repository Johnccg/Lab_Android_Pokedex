package com.example.pokedex_lab.data.api.model

import com.google.gson.annotations.SerializedName

data class PokedexObject(
    @SerializedName("count") val count: Int,
    @SerializedName("results") val results: ArrayList<com.example.pokedex_lab.data.api.model.PokemonBase>,
)
