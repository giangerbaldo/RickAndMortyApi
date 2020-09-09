package com.rickandmortyapi.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.rickandmortyapi.data.local.entity.LocationEntity

@Dao
interface LocationDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(vararg location: LocationEntity)

    @Delete
    suspend fun delete(location: LocationEntity)
}

