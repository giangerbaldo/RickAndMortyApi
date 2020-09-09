package com.rickandmortyapi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import com.rickandmortyapi.RickAndMortyApplication
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.databinding.FragmentHomeBinding
import com.rickandmortyapi.di.HomeModule
import javax.inject.Inject

class HomeFragment : Fragment(), SearchView.OnQueryTextListener, CharactersAdapter.OnclickListener {

    @Inject
    lateinit var homeViewModelFactory: HomeViewModelFactory
    private val viewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this, homeViewModelFactory).get(HomeViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?): View {

        val binding = FragmentHomeBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.recyclerCharacters.adapter = CharactersAdapter(this)

        binding.searchView.setOnQueryTextListener(this)
        binding.searchView.isIconified = false
        binding.searchView.isIconifiedByDefault = false
        binding.searchView.clearFocus()

        return binding.root
    }

    private fun inject() {
        (activity!!.application as RickAndMortyApplication)
            .component
            .plus(HomeModule())
            .inject(this)
    }

    override fun onQueryTextSubmit(query: String?): Boolean {
        query?.let { viewModel.filterCharacterList(it) }
        return false
    }

    override fun onQueryTextChange(query: String?): Boolean {
        query?.let { viewModel.filterCharacterList(it) }
        return false
    }

    override fun onCharacterClick(character: CharacterEntity) {
        this.findNavController()
            .navigate(HomeFragmentDirections.actionShowCharacterDetail(character.id))
    }
}