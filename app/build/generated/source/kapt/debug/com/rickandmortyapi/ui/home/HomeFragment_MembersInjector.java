// Generated by Dagger (https://google.github.io/dagger).
package com.rickandmortyapi.ui.home;

import dagger.MembersInjector;
import javax.inject.Provider;

public final class HomeFragment_MembersInjector implements MembersInjector<HomeFragment> {
  private final Provider<HomeViewModelFactory> homeViewModelFactoryProvider;

  public HomeFragment_MembersInjector(Provider<HomeViewModelFactory> homeViewModelFactoryProvider) {
    this.homeViewModelFactoryProvider = homeViewModelFactoryProvider;
  }

  public static MembersInjector<HomeFragment> create(
      Provider<HomeViewModelFactory> homeViewModelFactoryProvider) {
    return new HomeFragment_MembersInjector(homeViewModelFactoryProvider);
  }

  @Override
  public void injectMembers(HomeFragment instance) {
    injectHomeViewModelFactory(instance, homeViewModelFactoryProvider.get());
  }

  public static void injectHomeViewModelFactory(
      HomeFragment instance, HomeViewModelFactory homeViewModelFactory) {
    instance.homeViewModelFactory = homeViewModelFactory;
  }
}
