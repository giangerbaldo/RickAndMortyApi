package com.rickandmortyapi.di

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import com.rickandmortyapi.data.repository.CharacterRepository
import com.rickandmortyapi.ui.characterDetail.CharacterDetailFragment
import com.rickandmortyapi.ui.characterDetail.CharacterDetailViewModelFactory

@Subcomponent(modules = [CharacterDetailModule::class])
interface CharacterDetailComponent {

    fun inject(fragment: CharacterDetailFragment)
}

@Module
class CharacterDetailModule {
    @Provides
    fun provideViewModelFactory(characterRepository: CharacterRepository):
            ViewModelProvider.Factory {
        return CharacterDetailViewModelFactory(characterRepository)
    }
}

