package com.rickandmortyapi.ui.characterDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\b\u0010\u0015\u001a\u00020\u0013H\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/rickandmortyapi/ui/characterDetail/CharacterDetailViewModel;", "Landroidx/lifecycle/ViewModel;", "characterRepository", "Lcom/rickandmortyapi/data/repository/CharacterRepository;", "(Lcom/rickandmortyapi/data/repository/CharacterRepository;)V", "_characterWithLocation", "Landroidx/lifecycle/MutableLiveData;", "Lcom/rickandmortyapi/data/local/entity/CharacterWithLocations;", "charDetailJob", "Lkotlinx/coroutines/CompletableJob;", "characterId", "", "characterWithLocation", "Landroidx/lifecycle/LiveData;", "getCharacterWithLocation", "()Landroidx/lifecycle/LiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "fetchSingleCharacter", "", "charId", "onCleared", "app_debug"})
public final class CharacterDetailViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.CompletableJob charDetailJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private int characterId = 0;
    private final androidx.lifecycle.MutableLiveData<com.rickandmortyapi.data.local.entity.CharacterWithLocations> _characterWithLocation = null;
    private final com.rickandmortyapi.data.repository.CharacterRepository characterRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rickandmortyapi.data.local.entity.CharacterWithLocations> getCharacterWithLocation() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    public final void fetchSingleCharacter(int charId) {
    }
    
    public CharacterDetailViewModel(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.repository.CharacterRepository characterRepository) {
        super();
    }
}