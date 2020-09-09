package com.rickandmortyapi.ui.binding

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import com.rickandmortyapi.R
import com.rickandmortyapi.data.local.entity.CharacterEntity
import com.rickandmortyapi.data.remote.ApiStatus
import com.rickandmortyapi.ui.home.CharactersAdapter

@BindingAdapter("requestStatus")
fun bindStatus(view: View, status: ApiStatus) {
    when (status) {
        ApiStatus.LOADING -> {
            view.visibility = View.VISIBLE
        }
        ApiStatus.ERROR -> {
            view.visibility = View.GONE
        }
        ApiStatus.DONE -> {
            view.visibility = View.GONE
        }
    }
}

@BindingAdapter("imageUrl")
fun bindImage(imgView: ImageView, imgUrl: String?) {
    Picasso.get().load(imgUrl)
        .placeholder(R.drawable.loading_animation)
        .into(imgView)
}

@BindingAdapter("listCharacter")
fun bindCharacterRecyclerView(recyclerView: RecyclerView, characters: List<CharacterEntity>?) {
    val adapter = recyclerView.adapter as CharactersAdapter
    adapter.submitList(characters)
}