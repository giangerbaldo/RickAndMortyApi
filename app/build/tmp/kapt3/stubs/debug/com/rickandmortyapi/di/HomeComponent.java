package com.rickandmortyapi.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rickandmortyapi/di/HomeComponent;", "", "inject", "", "fragment", "Lcom/rickandmortyapi/ui/home/HomeFragment;", "app_debug"})
@dagger.Subcomponent(modules = {com.rickandmortyapi.di.HomeModule.class})
public abstract interface HomeComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.ui.home.HomeFragment fragment);
}