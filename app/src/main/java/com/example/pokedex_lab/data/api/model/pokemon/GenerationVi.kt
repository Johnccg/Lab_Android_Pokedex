package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationVi(
    @SerializedName("omegaruby-alphasapphire") val omegaruby_alphasapphire: com.example.pokedex_lab.data.api.model.pokemon.OmegarubyAlphasapphire,
    @SerializedName("x-y") val x_y: com.example.pokedex_lab.data.api.model.pokemon.XY
)