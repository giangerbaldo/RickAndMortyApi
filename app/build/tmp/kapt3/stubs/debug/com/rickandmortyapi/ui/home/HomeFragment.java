package com.rickandmortyapi.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0012\u0010\u0016\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J$\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0012\u0010#\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"Lcom/rickandmortyapi/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "Landroid/widget/SearchView$OnQueryTextListener;", "Lcom/rickandmortyapi/ui/home/CharactersAdapter$OnclickListener;", "()V", "homeViewModelFactory", "Lcom/rickandmortyapi/ui/home/HomeViewModelFactory;", "getHomeViewModelFactory", "()Lcom/rickandmortyapi/ui/home/HomeViewModelFactory;", "setHomeViewModelFactory", "(Lcom/rickandmortyapi/ui/home/HomeViewModelFactory;)V", "viewModel", "Lcom/rickandmortyapi/ui/home/HomeViewModel;", "getViewModel", "()Lcom/rickandmortyapi/ui/home/HomeViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "inject", "", "onCharacterClick", "character", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onQueryTextChange", "", "query", "", "onQueryTextSubmit", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment implements android.widget.SearchView.OnQueryTextListener, com.rickandmortyapi.ui.home.CharactersAdapter.OnclickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.rickandmortyapi.ui.home.HomeViewModelFactory homeViewModelFactory;
    private final kotlin.Lazy viewModel$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.rickandmortyapi.ui.home.HomeViewModelFactory getHomeViewModelFactory() {
        return null;
    }
    
    public final void setHomeViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.ui.home.HomeViewModelFactory p0) {
    }
    
    private final com.rickandmortyapi.ui.home.HomeViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void inject() {
    }
    
    @java.lang.Override()
    public boolean onQueryTextSubmit(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onQueryTextChange(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return false;
    }
    
    @java.lang.Override()
    public void onCharacterClick(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.local.entity.CharacterEntity character) {
    }
    
    public HomeFragment() {
        super();
    }
}