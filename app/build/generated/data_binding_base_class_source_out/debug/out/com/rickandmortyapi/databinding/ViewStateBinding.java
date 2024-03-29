// Generated by data binding compiler. Do not edit!
package com.rickandmortyapi.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.rickandmortyapi.R;
import com.rickandmortyapi.data.remote.ApiStatus;
import java.lang.Deprecated;
import java.lang.Object;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

public abstract class ViewStateBinding extends ViewDataBinding {
  @NonNull
  public final AppCompatButton btnTryAgain;

  @NonNull
  public final ProgressBar progressRequest;

  @Bindable
  protected ApiStatus mApiStatus;

  @Bindable
  protected Function0<Unit> mTryAgainClick;

  protected ViewStateBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppCompatButton btnTryAgain, ProgressBar progressRequest) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnTryAgain = btnTryAgain;
    this.progressRequest = progressRequest;
  }

  public abstract void setApiStatus(@Nullable ApiStatus apiStatus);

  @Nullable
  public ApiStatus getApiStatus() {
    return mApiStatus;
  }

  public abstract void setTryAgainClick(@Nullable Function0<Unit> tryAgainClick);

  @Nullable
  public Function0<Unit> getTryAgainClick() {
    return mTryAgainClick;
  }

  @NonNull
  public static ViewStateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_state, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ViewStateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ViewStateBinding>inflateInternal(inflater, R.layout.view_state, root, attachToRoot, component);
  }

  @NonNull
  public static ViewStateBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.view_state, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ViewStateBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ViewStateBinding>inflateInternal(inflater, R.layout.view_state, null, false, component);
  }

  public static ViewStateBinding bind(@NonNull View view) {
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
  public static ViewStateBinding bind(@NonNull View view, @Nullable Object component) {
    return (ViewStateBinding)bind(component, view, R.layout.view_state);
  }
}
