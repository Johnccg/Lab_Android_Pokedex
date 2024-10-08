package com.example.pokedex_lab.pokemon

import com.google.gson.annotations.SerializedName

data class Other(
    val dream_world: DreamWorld,
    val home: Home,
    @SerializedName("official-artwork") val official_artwork: OfficialArtwork,
    val showdown: Showdown
)