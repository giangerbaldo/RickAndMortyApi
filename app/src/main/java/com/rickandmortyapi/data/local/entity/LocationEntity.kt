package com.rickandmortyapi.data.local.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class LocationEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "location_id") var locationId: Int?,
    @ColumnInfo(name = "name") var name: String,
    @ColumnInfo(name = "url") var url: String,
    var characterId: Int
) {
    constructor(name: String, url: String, characterId: Int) : this(null, name, url, characterId)
}