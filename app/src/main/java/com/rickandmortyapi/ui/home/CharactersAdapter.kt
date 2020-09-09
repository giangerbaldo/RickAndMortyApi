package com.rickandmortyapi.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.databinding.ViewItemCharacterBinding

class CharactersAdapter(private val onclickListener: OnclickListener) :
    ListAdapter<CharacterEntity, CharactersAdapter.CharactersViewHolder>(DiffCallback) {

    companion object DiffCallback : DiffUtil.ItemCallback<CharacterEntity>() {
        override fun areItemsTheSame(oldItem: CharacterEntity, newItem: CharacterEntity): Boolean {
            return oldItem === newItem
        }

        override fun areContentsTheSame(
            oldItem: CharacterEntity,
            newItem: CharacterEntity
        ): Boolean {
            return oldItem.id == newItem.id
        }
    }

    class CharactersViewHolder(private var binding: ViewItemCharacterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(character: CharacterEntity) {
            binding.character = character
            binding.executePendingBindings()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactersViewHolder {
        return CharactersViewHolder(
            ViewItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CharactersViewHolder, position: Int) {
        val character = getItem(position)
        holder.itemView.setOnClickListener {
            onclickListener.onCharacterClick(character)
        }
        holder.bind(character)
    }

    interface OnclickListener {
        fun onCharacterClick(character: CharacterEntity)
    }
}