package com.rickandmortyapi.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rickandmortyapi.data.repository.CharacterRepository
import javax.inject.Inject

class HomeViewModelFactory @Inject constructor(
    private val characterRepository: CharacterRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(HomeViewModel::class.java)) {
            return HomeViewModel(characterRepository) as T
        }
        throw IllegalArgumentException("Unknown HomeViewModel class") as Throwable
    }
}