package com.rickandmortyapi.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u001bJ\b\u0010\u001c\u001a\u00020\u0017H\u0014J\u0006\u0010\u001d\u001a\u00020\u0017R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/rickandmortyapi/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "characterRepository", "Lcom/rickandmortyapi/data/repository/CharacterRepository;", "(Lcom/rickandmortyapi/data/repository/CharacterRepository;)V", "_allCharacterList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "_presentationList", "_requestStatus", "Lcom/rickandmortyapi/data/remote/ApiStatus;", "characterList", "Landroidx/lifecycle/LiveData;", "getCharacterList", "()Landroidx/lifecycle/LiveData;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "homeJob", "Lkotlinx/coroutines/CompletableJob;", "requestStatus", "getRequestStatus", "clearFilter", "", "fetchAllCharacters", "filterCharacterList", "charName", "", "onCleared", "tryAgain", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private kotlinx.coroutines.CompletableJob homeJob;
    private final kotlinx.coroutines.CoroutineScope coroutineScope = null;
    private final androidx.lifecycle.MutableLiveData<com.rickandmortyapi.data.remote.ApiStatus> _requestStatus = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>> _allCharacterList = null;
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>> _presentationList = null;
    private final com.rickandmortyapi.data.repository.CharacterRepository characterRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.rickandmortyapi.data.remote.ApiStatus> getRequestStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity>> getCharacterList() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
    
    private final void fetchAllCharacters() {
    }
    
    public final void tryAgain() {
    }
    
    public final void filterCharacterList(@org.jetbrains.annotations.NotNull()
    java.lang.String charName) {
    }
    
    private final void clearFilter() {
    }
    
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.repository.CharacterRepository characterRepository) {
        super();
    }
}