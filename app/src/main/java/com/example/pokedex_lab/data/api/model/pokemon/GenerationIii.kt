package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIii(
    val emerald: com.example.pokedex_lab.data.api.model.pokemon.Emerald,
    @SerializedName("firered-leafgreen") val firered_leafgreen: com.example.pokedex_lab.data.api.model.pokemon.FireredLeafgreen,
    @SerializedName("ruby-sapphire") val ruby_sapphire: com.example.pokedex_lab.data.api.model.pokemon.RubySapphire
)