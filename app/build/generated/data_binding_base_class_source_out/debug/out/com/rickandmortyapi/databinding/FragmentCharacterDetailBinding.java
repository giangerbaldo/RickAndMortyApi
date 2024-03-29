// Generated by data binding compiler. Do not edit!
package com.rickandmortyapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rickandmortyapi.R;
import com.rickandmortyapi.ui.characterDetail.CharacterDetailViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentCharacterDetailBinding extends ViewDataBinding {
  @NonNull
  public final ViewCharacterDetailBinding includeCharacterDetail;

  @Bindable
  protected CharacterDetailViewModel mDetailViewModel;

  protected FragmentCharacterDetailBinding(Object _bindingComponent, View _root,
      int _localFieldCount, ViewCharacterDetailBinding includeCharacterDetail) {
    super(_bindingComponent, _root, _localFieldCount);
    this.includeCharacterDetail = includeCharacterDetail;
    setContainedBinding(this.includeCharacterDetail);
  }

  public abstract void setDetailViewModel(@Nullable CharacterDetailViewModel detailViewModel);

  @Nullable
  public CharacterDetailViewModel getDetailViewModel() {
    return mDetailViewModel;
  }

  @NonNull
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_character_detail, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentCharacterDetailBinding>inflateInternal(inflater, R.layout.fragment_character_detail, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_character_detail, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentCharacterDetailBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentCharacterDetailBinding>inflateInternal(inflater, R.layout.fragment_character_detail, null, false, component);
  }

  public static FragmentCharacterDetailBinding bind(@NonNull View view) {
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
  public static FragmentCharacterDetailBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (FragmentCharacterDetailBinding)bind(component, view, R.layout.fragment_character_detail);
  }
}
