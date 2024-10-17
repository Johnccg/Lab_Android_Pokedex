package com.example.pokedex_lab.data.api

import com.example.pokedex_lab.data.api.model.PokedexObject
import com.example.pokedex_lab.data.api.model.pokemon.Pokemon
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

//nos ayudará para mapear el API. Lo que hacemos en este archivo es definir todas las
// conexiones o URL que necesitamos conectar.
//Como es un archivo de interfaz no podemos escribir código funcional
interface PokemonAPIService {
    //https://pokeapi.co/api/v2/pokemon/?limit=1279
    //define con una anotación de Kotlin el tipo de llamada que vamos a hacer y la ruta que debe seguir.
    @GET("pokemon")
    //a palabra reservada suspend esto va a funcionar para las funciones que tengan un comportamiento asíncrono.
    suspend fun getPokemonList(
        @Query("limit") limit:Int
    ): PokedexObject

    //https://pokeapi.co/api/v2/pokemon/{number_pokemon}/
    @GET("pokemon/{numberPokemon}")
    suspend fun getPokemonInfo(
        @Path("numberPokemon") numberPokemon:Int
    ) : Pokemon
}