package com.rickandmortyapi.data.remote

import kotlinx.coroutines.Deferred
import com.rickandmortyapi.data.remote.model.Character
import com.rickandmortyapi.data.remote.model.CharacterResult
import retrofit2.http.GET
import retrofit2.http.Path

interface RickAndMortyAPIService {

    @GET("character")
    fun getAllCharacters(): Deferred<CharacterResult>

    @GET("character/{characterId}")
    fun getSingleCharacter(@Path("characterId") characterId: Int)
            : Deferred<Character>
}