package com.rickandmortyapi.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\u0003H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J \u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0014H\u0007J\b\u0010\u0017\u001a\u00020\u000bH\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0018"}, d2 = {"Lcom/rickandmortyapi/di/AppModules;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "providesApplication", "providesCharacterDao", "Lcom/rickandmortyapi/data/local/dao/CharacterDao;", "database", "Lcom/rickandmortyapi/data/local/AppDatabase;", "providesCharacterRepository", "Lcom/rickandmortyapi/data/repository/CharacterRepository;", "api", "Lcom/rickandmortyapi/data/remote/RickAndMortyAPIService;", "dao", "locationRepository", "Lcom/rickandmortyapi/data/repository/LocationRepository;", "providesLocationDao", "Lcom/rickandmortyapi/data/local/dao/LocationDao;", "providesLocationRepository", "locationDao", "providesRickAndMortyDatabase", "app_debug"})
@dagger.Module()
public final class AppModules {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application providesApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rickandmortyapi.data.local.AppDatabase providesRickAndMortyDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rickandmortyapi.data.local.dao.CharacterDao providesCharacterDao(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rickandmortyapi.data.local.dao.LocationDao providesLocationDao(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rickandmortyapi.data.repository.CharacterRepository providesCharacterRepository(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.remote.RickAndMortyAPIService api, @org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.dao.CharacterDao dao, @org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.repository.LocationRepository locationRepository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.rickandmortyapi.data.repository.LocationRepository providesLocationRepository(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.dao.LocationDao locationDao) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public AppModules(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}