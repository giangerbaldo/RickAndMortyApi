package com.rickandmortyapi.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0002\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/rickandmortyapi/di/AppComponent;", "", "plus", "Lcom/rickandmortyapi/di/CharacterDetailComponent;", "module", "Lcom/rickandmortyapi/di/CharacterDetailModule;", "Lcom/rickandmortyapi/di/HomeComponent;", "Lcom/rickandmortyapi/di/HomeModule;", "app_debug"})
@dagger.Component(modules = {com.rickandmortyapi.di.NetModule.class, com.rickandmortyapi.di.AppModules.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rickandmortyapi.di.HomeComponent plus(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.di.HomeModule module);
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.rickandmortyapi.di.CharacterDetailComponent plus(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.di.CharacterDetailModule module);
}