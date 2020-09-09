package com.rickandmortyapi.data.local;

import java.lang.System;

@androidx.room.Database(entities = {com.rickandmortyapi.data.local.entity.CharacterEntity.class, com.rickandmortyapi.data.local.entity.LocationEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/rickandmortyapi/data/local/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "characterDao", "Lcom/rickandmortyapi/data/local/dao/CharacterDao;", "locationDao", "Lcom/rickandmortyapi/data/local/dao/LocationDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rickandmortyapi.data.local.dao.CharacterDao characterDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rickandmortyapi.data.local.dao.LocationDao locationDao();
    
    public AppDatabase() {
        super();
    }
}