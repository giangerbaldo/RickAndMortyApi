package com.rickandmortyapi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001f\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/rickandmortyapi/data/repository/CharacterRepository;", "", "apiService", "Lcom/rickandmortyapi/data/remote/RickAndMortyAPIService;", "characterDao", "Lcom/rickandmortyapi/data/local/dao/CharacterDao;", "locationRepository", "Lcom/rickandmortyapi/data/repository/LocationRepository;", "(Lcom/rickandmortyapi/data/remote/RickAndMortyAPIService;Lcom/rickandmortyapi/data/local/dao/CharacterDao;Lcom/rickandmortyapi/data/repository/LocationRepository;)V", "getAllCharactersFromDb", "", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCharacterByIdFromDb", "Lcom/rickandmortyapi/data/local/entity/CharacterWithLocations;", "characterId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadAllCharacters", "saveCharacterIntoDb", "", "charResultList", "Lcom/rickandmortyapi/data/remote/model/Character;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "syncAllCharacters", "Lkotlinx/coroutines/Deferred;", "Lcom/rickandmortyapi/data/remote/model/CharacterResult;", "syncAndSaveCharacters", "app_debug"})
public final class CharacterRepository {
    private final com.rickandmortyapi.data.remote.RickAndMortyAPIService apiService = null;
    private final com.rickandmortyapi.data.local.dao.CharacterDao characterDao = null;
    private final com.rickandmortyapi.data.repository.LocationRepository locationRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object loadAllCharacters(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>> p0) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCharacterByIdFromDb(int characterId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.rickandmortyapi.data.local.entity.CharacterWithLocations> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public CharacterRepository(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.remote.RickAndMortyAPIService apiService, @org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.dao.CharacterDao characterDao, @org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.repository.LocationRepository locationRepository) {
        super();
    }
}