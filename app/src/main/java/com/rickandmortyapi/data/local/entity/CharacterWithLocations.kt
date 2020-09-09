package com.rickandmortyapi.data.local.entity

import androidx.room.Embedded
import androidx.room.Relation

data class CharacterWithLocations(
    @Embedded val character: CharacterEntity,
    @Relation(
        parentColumn = "id",
        entityColumn = "characterId"
    ) val locations: List<LocationEntity>
)