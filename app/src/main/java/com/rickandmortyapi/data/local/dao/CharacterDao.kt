package com.rickandmortyapi.data.local.dao

import androidx.room.*
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.data.local.entity.CharacterWithLocations

@Dao
interface CharacterDao {
    @Query("SELECT * FROM characterentity")
    suspend fun getAll(): List<CharacterEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg character: CharacterEntity)

    @Update
    suspend fun update(vararg character: CharacterEntity)

    @Delete
    suspend fun delete(character: CharacterEntity)

    @Transaction
    @Query("SELECT * FROM characterentity WHERE id IN (:characterId)")
    suspend fun getCharacterWithLocationsById(characterId: Int): CharacterWithLocations
}
