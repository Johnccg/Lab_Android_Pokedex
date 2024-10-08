package com.example.pokedex_lab.pokemon

import com.google.gson.annotations.SerializedName

data class Versions(
    @SerializedName("generation-i") val generation_i: GenerationI,
    @SerializedName("generation-ii") val generation_ii: GenerationIi,
    @SerializedName("generation-iii") val generation_iii: GenerationIii,
    @SerializedName("generation-iv") val generation_iv: GenerationIv,
    @SerializedName("generationv") val generation_v: GenerationV,
    @SerializedName("generationvi") val generation_vi: GenerationVi,
    @SerializedName("generationvii") val generation_vii: GenerationVii,
    @SerializedName("generationviii") val generation_viii: GenerationViii
)