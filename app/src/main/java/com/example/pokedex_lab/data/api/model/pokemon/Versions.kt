package com.example.pokedex_lab.data.api.model.pokemon

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i") val generation_i: com.example.pokedex_lab.data.api.model.pokemon.GenerationI,
    @SerializedName("generation-ii") val generation_ii: com.example.pokedex_lab.data.api.model.pokemon.GenerationIi,
    @SerializedName("generation-iii") val generation_iii: com.example.pokedex_lab.data.api.model.pokemon.GenerationIii,
    @SerializedName("generation-iv") val generation_iv: com.example.pokedex_lab.data.api.model.pokemon.GenerationIv,
    @SerializedName("generationv") val generation_v: com.example.pokedex_lab.data.api.model.pokemon.GenerationV,
    @SerializedName("generationvi") val generation_vi: com.example.pokedex_lab.data.api.model.pokemon.GenerationVi,
    @SerializedName("generationvii") val generation_vii: com.example.pokedex_lab.data.api.model.pokemon.GenerationVii,
    @SerializedName("generationviii") val generation_viii: com.example.pokedex_lab.data.api.model.pokemon.GenerationViii
)