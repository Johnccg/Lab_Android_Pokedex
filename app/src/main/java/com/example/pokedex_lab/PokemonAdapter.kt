package com.example.pokedex_lab

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pokedex_lab.databinding.ItemPokemonBinding

//se usa únicamente en las listas y es la que sirve de medio de conexión
// entre los datos que pasamos y el layout xml de la celda.
class PokemonAdapter: RecyclerView.Adapter<PokemonViewHolder>() {
    var data:ArrayList<PokemonBase> = ArrayList()
    //le dice al RecyclerView que layout vamos a utilizar
    // e igualmente observa que utilizamos la forma del binding para cargar los componentes de la vista.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonViewHolder {
        val binding = ItemPokemonBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return PokemonViewHolder(binding)
    }

    //es el encargado de pintar la celda utiliza el ViewHolder que es literalmente
    //el encargado de conectar los componentes de una celda con el dato particular de la lista
    override fun onBindViewHolder(holder: PokemonViewHolder, position: Int) {
        val item = data[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun PokemonAdapter(basicData : ArrayList<PokemonBase>){
        this.data = basicData
    }
}