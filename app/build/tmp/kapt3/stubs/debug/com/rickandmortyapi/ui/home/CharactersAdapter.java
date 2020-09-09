package com.rickandmortyapi.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0010\u0011\u0012B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/rickandmortyapi/ui/home/CharactersAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "Lcom/rickandmortyapi/ui/home/CharactersAdapter$CharactersViewHolder;", "onclickListener", "Lcom/rickandmortyapi/ui/home/CharactersAdapter$OnclickListener;", "(Lcom/rickandmortyapi/ui/home/CharactersAdapter$OnclickListener;)V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CharactersViewHolder", "DiffCallback", "OnclickListener", "app_debug"})
public final class CharactersAdapter extends androidx.recyclerview.widget.ListAdapter<com.rickandmortyapi.data.local.entity.CharacterEntity, com.rickandmortyapi.ui.home.CharactersAdapter.CharactersViewHolder> {
    private final com.rickandmortyapi.ui.home.CharactersAdapter.OnclickListener onclickListener = null;
    public static final com.rickandmortyapi.ui.home.CharactersAdapter.DiffCallback DiffCallback = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.rickandmortyapi.ui.home.CharactersAdapter.CharactersViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.ui.home.CharactersAdapter.CharactersViewHolder holder, int position) {
    }
    
    public CharactersAdapter(@org.jetbrains.annotations.NotNull()
    com.rickandmortyapi.ui.home.CharactersAdapter.OnclickListener onclickListener) {
        super(null);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/rickandmortyapi/ui/home/CharactersAdapter$CharactersViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/rickandmortyapi/databinding/ViewItemCharacterBinding;", "(Lcom/rickandmortyapi/databinding/ViewItemCharacterBinding;)V", "bind", "", "character", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "app_debug"})
    public static final class CharactersViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private com.rickandmortyapi.databinding.ViewItemCharacterBinding binding;
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.data.local.entity.CharacterEntity character) {
        }
        
        public CharactersViewHolder(@org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.databinding.ViewItemCharacterBinding binding) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/rickandmortyapi/ui/home/CharactersAdapter$OnclickListener;", "", "onCharacterClick", "", "character", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "app_debug"})
    public static abstract interface OnclickListener {
        
        public abstract void onCharacterClick(@org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.data.local.entity.CharacterEntity character);
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/rickandmortyapi/ui/home/CharactersAdapter$DiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/rickandmortyapi/data/local/entity/CharacterEntity;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class DiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.rickandmortyapi.data.local.entity.CharacterEntity> {
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.data.local.entity.CharacterEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.data.local.entity.CharacterEntity newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.data.local.entity.CharacterEntity oldItem, @org.jetbrains.annotations.NotNull()
        com.rickandmortyapi.data.local.entity.CharacterEntity newItem) {
            return false;
        }
        
        private DiffCallback() {
            super();
        }
    }
}