package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class GenerationIv(
    @SerializedName("diamond-pearl") val diamond_pearl: com.example.pokedex_lab.data.api.model.pokemon.DiamondPearl,
    @SerializedName("heartgold-soulsilver") val heartgold_soulsilver: com.example.pokedex_lab.data.api.model.pokemon.HeartgoldSoulsilver,
    val platinum: com.example.pokedex_lab.data.api.model.pokemon.Platinum
)