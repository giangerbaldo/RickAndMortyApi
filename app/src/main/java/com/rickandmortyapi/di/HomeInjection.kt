package com.rickandmortyapi.di

import androidx.lifecycle.ViewModelProvider
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import com.rickandmortyapi.data.repository.CharacterRepository
import com.rickandmortyapi.ui.home.HomeFragment
import com.rickandmortyapi.ui.home.HomeViewModelFactory

@Subcomponent(modules = [HomeModule::class])
interface HomeComponent {

    fun inject(fragment: HomeFragment)
}

@Module
class HomeModule {
    @Provides
    fun provideViewModelFactory(characterRepository: CharacterRepository):
            ViewModelProvider.Factory {
        return HomeViewModelFactory(characterRepository)
    }
}

