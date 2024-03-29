package com.rickandmortyapi.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/rickandmortyapi/data/repository/LocationRepository;", "", "locationDao", "Lcom/rickandmortyapi/data/local/dao/LocationDao;", "(Lcom/rickandmortyapi/data/local/dao/LocationDao;)V", "saveLocationResultIntoDb", "", "characterResultList", "", "Lcom/rickandmortyapi/data/remote/model/Character;", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocationRepository {
    private final com.rickandmortyapi.data.local.dao.LocationDao locationDao = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object saveLocationResultIntoDb(@org.jetbrains.annotations.NotNull()
    java.util.List<com.rickandmortyapi.data.remote.model.Character> characterResultList, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> p1) {
        return null;
    }
    
    @javax.inject.Inject()
    public LocationRepository(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.dao.LocationDao locationDao) {
        super();
    }
}