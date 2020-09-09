package com.rickandmortyapi.data.repository

import kotlinx.coroutines.Deferred
import com.rickandmortyapi.data.local.dao.CharacterDao
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.data.local.entity.CharacterWithLocations
import com.rickandmortyapi.data.remote.RickAndMortyAPIService
import com.rickandmortyapi.data.remote.model.Character
import com.rickandmortyapi.data.remote.model.CharacterResult
import javax.inject.Inject

class CharacterRepository @Inject constructor(
    private val apiService: RickAndMortyAPIService,
    private val characterDao: CharacterDao,
    private val locationRepository: LocationRepository
) {

    suspend fun loadAllCharacters(): List<CharacterEntity> {
        var characters = getAllCharactersFromDb()
        if (characters.isNullOrEmpty()) {
            characters = syncAndSaveCharacters()
        }
        return characters
    }

    suspend private fun syncAllCharacters(): Deferred<CharacterResult> {
        return apiService.getAllCharacters()
    }

    suspend private fun syncAndSaveCharacters(): List<CharacterEntity> {
        val characterResult = syncAllCharacters().await().characters
        return characterResult?.let { characterList -> // TODO ta usando o ?.let mas o  syncAllCharacters().await().characters nao retorna nullable
            saveCharacterIntoDb(characterList)
            getAllCharactersFromDb()
        }
    }

    suspend private fun saveCharacterIntoDb(charResultList: List<Character>) {
        val characterDbList = charResultList.map { character ->
            CharacterEntity(
                character.id, character.name, character.image,
                character.species, character.episodes.size
            )
        }
        characterDbList.forEach { characterDao.insert(it) }
        locationRepository.saveLocationResultIntoDb(charResultList)
    }

    suspend private fun getAllCharactersFromDb(): List<CharacterEntity> {
        return characterDao.getAll()
    }

    suspend fun getCharacterByIdFromDb(characterId: Int): CharacterWithLocations {
        return characterDao.getCharacterWithLocationsById(characterId)
    }
}