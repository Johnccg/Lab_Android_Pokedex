package com.example.pokedex_lab

import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_lab.databinding.ItemPokemonBinding

class PokemonViewHolder(private val binding: ItemPokemonBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(item: PokemonBase){
        binding.TVName.text = item.name
    }
}