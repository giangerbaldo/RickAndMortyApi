package com.rickandmortyapi.ui.characterDetail

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.rickandmortyapi.RickAndMortyApplication
import com.rickandmortyapi.databinding.FragmentCharacterDetailBinding
import com.rickandmortyapi.di.CharacterDetailModule
import javax.inject.Inject

class CharacterDetailFragment : Fragment() {

    @Inject
    lateinit var charDetailViewModelFactory: CharacterDetailViewModelFactory
    private val viewModel: CharacterDetailViewModel by lazy {
        ViewModelProviders.of(this, charDetailViewModelFactory)
            .get(CharacterDetailViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        inject()
    }

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View {

        val binding = FragmentCharacterDetailBinding.inflate(inflater)
        binding.lifecycleOwner = this
        binding.detailViewModel = viewModel

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val characterId = CharacterDetailFragmentArgs.fromBundle(arguments!!).characterId
        viewModel.fetchSingleCharacter(characterId)
    }

    private fun inject() {
        (activity!!.application as RickAndMortyApplication)
            .component
            .plus(CharacterDetailModule())
            .inject(this)
    }
}