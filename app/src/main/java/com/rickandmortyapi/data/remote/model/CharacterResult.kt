package com.rickandmortyapi.data.remote.model

import com.squareup.moshi.Json

data class CharacterResult(
    @Json(name = "info") val info: Info,
    @Json(name = "results") val characters: List<Character>
)

data class Info(
    val count: Int,
    val pages: Int,
    val next: String? = "",
    val prev: String? = ""
)

data class Character(
    val id: Int,
    val name: String,
    val image: String,
    val species: String,
    @Json(name = "episode") val episodes: List<String>,
    val location: Location
)

data class Location(
    val name: String,
    val url: String
)