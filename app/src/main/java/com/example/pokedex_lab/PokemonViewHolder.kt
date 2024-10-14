package com.example.pokedex_lab

import android.content.Context
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.Priority
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.pokedex_lab.databinding.ItemPokemonBinding
import com.example.pokedex_lab.pokemon.Pokemon
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PokemonViewHolder(private val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: PokemonBase, context:Context){
        binding.TVName.text = item.name
        //Contect hace referencia a la vista activa y permite hacer referencia a la carpeta res desde código
        getPokemonInfo(item.url,binding.IVPhoto,context)
    }
}

private fun getPokemonInfo(url:String, imageView: ImageView, context: Context){
    //"https://pokeapi.co/api/v2/pokemon/23/"
    var pokemonStringNumber:String = url.replace("https://pokeapi.co/api/v2/pokemon/","")
    pokemonStringNumber = pokemonStringNumber.replace("/","")
    val pokemonNumber:Int = Integer.parseInt(pokemonStringNumber)

    CoroutineScope(Dispatchers.IO).launch {
        val pokemonRepository = PokemonRepository()
        val result: Pokemon? = pokemonRepository.getPokemonInfo(pokemonNumber)
        CoroutineScope(Dispatchers.Main).launch {
            //Encuentra la imágen desde la data class auto generada
            val urlImage = result?.sprites?.other?.official_artwork?.front_default.toString()

            //Glide carga imágenes de forma asíncrona
            //Primero se añaden las opciones de la request
            val requestOptions =  RequestOptions()
                .centerCrop()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .fitCenter()
                .priority(Priority.HIGH)

            //Se hace la llamada asíncrona
            Glide.with(context).load(urlImage)
                .apply(requestOptions)
                .into(imageView)
        }
    }
}