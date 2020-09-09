package com.rickandmortyapi.data.repository

import com.rickandmortyapi.data.local.dao.LocationDao
import com.rickandmortyapi.data.local.entity.LocationEntity
import com.rickandmortyapi.data.remote.model.Character
import javax.inject.Inject

class LocationRepository @Inject constructor(
    private val locationDao: LocationDao) {

    suspend fun saveLocationResultIntoDb(characterResultList: List<Character>) {
        characterResultList.forEach { character ->
            val location = LocationEntity(
                name = character.location.name,
                url = character.location.url,
                characterId = character.id
            )
            locationDao.insert(location)
        }
    }
}