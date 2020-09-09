package com.rickandmortyapi.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/rickandmortyapi/data/remote/RickAndMortyAPIService;", "", "getAllCharacters", "Lkotlinx/coroutines/Deferred;", "Lcom/rickandmortyapi/data/remote/model/CharacterResult;", "getSingleCharacter", "Lcom/rickandmortyapi/data/remote/model/Character;", "characterId", "", "app_debug"})
public abstract interface RickAndMortyAPIService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "character")
    public abstract kotlinx.coroutines.Deferred<com.rickandmortyapi.data.remote.model.CharacterResult> getAllCharacters();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "character/{characterId}")
    public abstract kotlinx.coroutines.Deferred<com.rickandmortyapi.data.remote.model.Character> getSingleCharacter(@retrofit2.http.Path(value = "characterId")
    int characterId);
}