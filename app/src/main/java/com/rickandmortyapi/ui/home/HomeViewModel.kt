package com.rickandmortyapi.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.*
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.data.remote.ApiStatus
import com.rickandmortyapi.data.repository.CharacterRepository
import java.util.*

class HomeViewModel(private val characterRepository: CharacterRepository) : ViewModel() {

    //Coroutines
    private var homeJob = Job()
    private val coroutineScope = CoroutineScope(homeJob + Dispatchers.Main)

    //Requests Status
    private val _requestStatus = MutableLiveData<ApiStatus>()
    val requestStatus: LiveData<ApiStatus>
        get() = _requestStatus

    //Data
    private val _allCharacterList = MutableLiveData<List<CharacterEntity>>()
    private val _presentationList = MutableLiveData<List<CharacterEntity>>()
    val characterList: LiveData<List<CharacterEntity>>
        get() = _presentationList

    init {
        _requestStatus.value = ApiStatus.LOADING
        fetchAllCharacters()
    }

    override fun onCleared() {
        super.onCleared()
        homeJob.cancel()
    }

    private fun fetchAllCharacters() {
        coroutineScope.launch {
            try {
                _allCharacterList.value = withContext(Dispatchers.IO) {
                    characterRepository.loadAllCharacters()
                }
                _presentationList.value = _allCharacterList.value
                _requestStatus.value = ApiStatus.DONE
            } catch (error: Throwable) {
                _requestStatus.value = ApiStatus.ERROR
            }
        }
    }

    fun tryAgain() {
        _requestStatus.value = ApiStatus.LOADING
        fetchAllCharacters()
    }

    fun filterCharacterList(charName: String) {
        when (charName.isEmpty()) {
            true -> {
                clearFilter()
            }
            false -> {
                _presentationList.value = _allCharacterList.value?.filter { character ->
                    character.name.toLowerCase(Locale.US)
                        .contains(charName.toLowerCase(Locale.US))
                }
            }
        }
    }

    private fun clearFilter() {
        _presentationList.value = _allCharacterList.value
    }
}