package com.rickandmortyapi.di

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import com.rickandmortyapi.data.local.AppDatabase
import com.rickandmortyapi.data.local.dao.CharacterDao
import com.rickandmortyapi.data.local.dao.LocationDao
import com.rickandmortyapi.data.remote.RickAndMortyAPIService
import com.rickandmortyapi.data.repository.CharacterRepository
import com.rickandmortyapi.data.repository.LocationRepository
import javax.inject.Singleton

private const val DB_NAME = "rick_and_morty_db"

@Module
class AppModules(val application: Application) {

    @Provides
    @Singleton
    fun providesApplication(): Application = application

    @Provides
    @Singleton
    fun providesRickAndMortyDatabase(): AppDatabase = Room.databaseBuilder(
        application,
        AppDatabase::class.java, DB_NAME
    ).fallbackToDestructiveMigration().build()

    @Provides
    @Singleton
    fun providesCharacterDao(database: AppDatabase): CharacterDao = database.characterDao()

    @Provides
    @Singleton
    fun providesLocationDao(database: AppDatabase): LocationDao = database.locationDao()

    @Provides
    @Singleton
    fun providesCharacterRepository(
        api: RickAndMortyAPIService,
        dao: CharacterDao,
        locationRepository: LocationRepository) =
        CharacterRepository(api, dao, locationRepository)

    @Provides
    @Singleton
    fun providesLocationRepository(locationDao: LocationDao) =
        LocationRepository(locationDao)
}