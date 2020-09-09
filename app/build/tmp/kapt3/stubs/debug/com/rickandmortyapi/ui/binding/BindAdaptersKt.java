package com.rickandmortyapi.ui.binding;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 2, d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007\u001a\u001a\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007\u001a\u0018\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"bindCharacterRecyclerView", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "characters", "", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "bindImage", "imgView", "Landroid/widget/ImageView;", "imgUrl", "", "bindStatus", "view", "Landroid/view/View;", "status", "Lcom/rickandmortyapi/data/remote/ApiStatus;", "app_debug"})
public final class BindAdaptersKt {
    
    @androidx.databinding.BindingAdapter(value = {"requestStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.data.remote.ApiStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView imgView, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"listCharacter"})
    public static final void bindCharacterRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    java.util.List<com.rickandmortyapi.data.local.entity.CharacterEntity> characters) {
    }
}