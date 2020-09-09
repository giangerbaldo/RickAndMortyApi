package com.rickandmortyapi.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.rickandmortyapi.data.local.dao.CharacterDao
import com.rickandmortyapi.data.local.dao.LocationDao
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.data.local.entity.LocationEntity

@Database(
    entities = [CharacterEntity::class, LocationEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun characterDao(): CharacterDao
    abstract fun locationDao(): LocationDao
}