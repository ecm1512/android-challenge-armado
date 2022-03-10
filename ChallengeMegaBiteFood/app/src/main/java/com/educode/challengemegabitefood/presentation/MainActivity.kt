package com.educode.challengemegabitefood.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.educode.challengemegabitefood.data.remote.service.response.Data
import com.educode.challengemegabitefood.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso
import org.koin.androidx.scope.ScopeActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : ScopeActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var pokeAdapter: PokeAdapter
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rvModifier.layoutManager = LinearLayoutManager(this)
        pokeAdapter = PokeAdapter()
        binding.rvModifier.adapter = pokeAdapter

        viewModel.getPokeHeader()

        viewModel.data.observe(this, Observer(::onDataLoad))


    }

    private fun onDataLoad(data: Data?) {
        if (data != null) {
            Picasso.get()
                .load(data.itemImage)
                .into(binding.ivImage)
        }
    }
}

