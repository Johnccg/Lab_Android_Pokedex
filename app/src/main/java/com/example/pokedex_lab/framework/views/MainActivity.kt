package com.example.pokedex_lab.framework.views

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.pokedex_lab.databinding.ActivityMainBinding
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.pokedex_lab.framework.adapters.PokemonAdapter
import com.example.pokedex_lab.data.api.model.PokemonBase
import com.example.pokedex_lab.framework.viewmodel.MainViewModel

class MainActivity: AppCompatActivity() {
    //se generan automáticamente cuando declaramos nuestros layouts y
    //convierten el snake case del nombre en camel case añadiendo la palabra binding
    private lateinit var binding: ActivityMainBinding
    //Maneja la lógica de la lista (RV)
    private val adapter : PokemonAdapter = PokemonAdapter()
    //Información a desplegar
    private lateinit var data:ArrayList<PokemonBase>
    //Esto es una lazy initialize e  inicializa primero lo elemental y hasta después se crea el objeto
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initializeBinding()
        initializeObservers()
        viewModel.getPokemonList()
    }

    private fun initializeBinding() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun setUpRecyclerView(dataForList:ArrayList<PokemonBase>){
        binding.RVPokemon.setHasFixedSize(true)
        //es una lista continua de elementos donde su punto más importante es su orientación Vertical u Horizontal
        val linearLayoutManager = LinearLayoutManager(
            this,
            LinearLayoutManager.VERTICAL,
            false)
        binding.RVPokemon.layoutManager = linearLayoutManager
        adapter.pokemonAdapter(dataForList, this)
        binding.RVPokemon.adapter = adapter
    }

    //Inicio de la llamada asíncrona
    //Los Scopes no son más que entornos pensados para ejecutar cierto tipo de acciones asíncronas
//    private fun getPokemonList(){
//        CoroutineScope(Dispatchers.IO).launch {
//            val pokemonRepository = PokemonRepository()
//            val result: PokedexObject? = pokemonRepository.getPokemonList(Constants.MAX_POKEMON_NUMBER)
//            Log.d("Salida", result?.count.toString())
//            CoroutineScope(Dispatchers.Main).launch {
//                setUpRecyclerView(result?.results!!)
//            }
//        }
//    }

    private fun initializeObservers(){
        viewModel.pokedexObjectLiveData.observe(this){ poxedexObject ->
            setUpRecyclerView(poxedexObject.results)
        }
    }
}

