package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVii(
    val icons: com.example.pokedex_lab.data.api.model.pokemon.Icons,
    @SerializedName("ultra-sun-ultra-moon") val ultra_sun_ultra_moon: com.example.pokedex_lab.data.api.model.pokemon.UltraSunUltraMoon
)