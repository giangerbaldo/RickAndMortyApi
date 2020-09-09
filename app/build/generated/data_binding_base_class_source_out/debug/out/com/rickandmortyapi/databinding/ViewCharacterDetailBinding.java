// Generated by data binding compiler. Do not edit!
package com.rickandmortyapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rickandmortyapi.R;
import com.rickandmortyapi.ui.characterDetail.CharacterDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ViewCharacterDetailBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatImageView imvCharDetailImage;

  @NonNull
  public final AppCompatTextView txvCharDetailEpisodes;

  @NonNull
  public final AppCompatTextView txvCharDetailEpisodesLabel;

  @NonNull
  public final AppCompatTextView txvCharDetailLocationLabel;

  @NonNull
  public final AppCompatTextView txvCharDetailLocationName;

  @NonNull
  public final AppCompatTextView txvCharDetailName;

  @NonNull
  public final AppCompatTextView txvCharDetailNameLabel;

  @NonNull
  public final AppCompatTextView txvCharDetailSpecies;

  @NonNull
  public final AppCompatTextView txvCharDetailSpeciesLabel;

  @Bindable
  protected CharacterDetailViewModel mDetailViewModel;

  protected ViewCharacterDetailBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatImageView imvCharDetailImage, AppCompatTextView txvCharDetailEpisodes,
      AppCompatTextView txvCharDetailEpisodesLabel, AppCompatTextView txvCharDetailLocationLabel,
      AppCompatTextView txvCharDetailLocationName, AppCompatTextView txvCharDetailName,
      AppCompatTextView txvCharDetailNameLabel, AppCompatTextView txvCharDetailSpecies,
      AppCompatTextView txvCharDetailSpeciesLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imvCharDetailImage = imvCharDetailImage;
    this.txvCharDetailEpisodes = txvCharDetailEpisodes;
    this.txvCharDetailEpisodesLabel = txvCharDetailEpisodesLabel;
    this.txvCharDetailLocationLabel = txvCharDetailLocationLabel;
    this.txvCharDetailLocationName = txvCharDetailLocationName;
    this.txvCharDetailName = txvCharDetailName;
    this.txvCharDetailNameLabel = txvCharDetailNameLabel;
    this.txvCharDetailSpecies = txvCharDetailSpecies;
    this.txvCharDetailSpeciesLabel = txvCharDetailSpeciesLabel;
  }

  public abstract void setDetailViewModel(@Nullable CharacterDetailViewModel detailViewModel);

  @Nullable
  public CharacterDetailViewModel getDetailViewModel() {
    return mDetailViewModel;
  }

  @NonNull
  public static ViewCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_character_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewCharacterDetailBinding>inflateInternal(inflater, R.layout.view_character_detail, root, attachToRoot, component);
  }

  @NonNull
  public static ViewCharacterDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_character_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewCharacterDetailBinding>inflateInternal(inflater, R.layout.view_character_detail, null, false, component);
  }

  public static ViewCharacterDetailBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ViewCharacterDetailBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewCharacterDetailBinding)bind(component, view, R.layout.view_character_detail);
  }
}
