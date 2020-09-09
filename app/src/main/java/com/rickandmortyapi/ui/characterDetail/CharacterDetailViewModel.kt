package com.rickandmortyapi.ui.characterDetail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import com.rickandmortyapi.data.local.entity.CharacterWithLocations
import com.rickandmortyapi.data.repository.CharacterRepository

class CharacterDetailViewModel(private val characterRepository: CharacterRepository) : ViewModel() {

    //Coroutines
    private var charDetailJob = Job()
    private val coroutineScope = CoroutineScope(charDetailJob + Dispatchers.Main)

    //Data
    private var characterId: Int = 0
    private val _characterWithLocation = MutableLiveData<CharacterWithLocations>()
    val characterWithLocation: LiveData<CharacterWithLocations>
        get() = _characterWithLocation

    override fun onCleared() {
        super.onCleared()
        charDetailJob.cancel()
    }

    fun fetchSingleCharacter(charId: Int) {
        characterId = charId
        coroutineScope.launch {
            _characterWithLocation.value = async(Dispatchers.IO) {
                characterRepository.getCharacterByIdFromDb(charId)
            }.await()
        }
    }
}