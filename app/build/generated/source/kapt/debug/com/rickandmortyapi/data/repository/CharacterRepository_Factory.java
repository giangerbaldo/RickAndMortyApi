// Generated by Dagger (https://google.github.io/dagger).
package com.rickandmortyapi.data.repository;

import com.rickandmortyapi.data.local.dao.CharacterDao;
import com.rickandmortyapi.data.remote.RickAndMortyAPIService;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class CharacterRepository_Factory implements Factory<CharacterRepository> {
  private final Provider<RickAndMortyAPIService> apiServiceProvider;

  private final Provider<CharacterDao> characterDaoProvider;

  private final Provider<LocationRepository> locationRepositoryProvider;

  public CharacterRepository_Factory(
      Provider<RickAndMortyAPIService> apiServiceProvider,
      Provider<CharacterDao> characterDaoProvider,
      Provider<LocationRepository> locationRepositoryProvider) {
    this.apiServiceProvider = apiServiceProvider;
    this.characterDaoProvider = characterDaoProvider;
    this.locationRepositoryProvider = locationRepositoryProvider;
  }

  @Override
  public CharacterRepository get() {
    return provideInstance(apiServiceProvider, characterDaoProvider, locationRepositoryProvider);
  }

  public static CharacterRepository provideInstance(
      Provider<RickAndMortyAPIService> apiServiceProvider,
      Provider<CharacterDao> characterDaoProvider,
      Provider<LocationRepository> locationRepositoryProvider) {
    return new CharacterRepository(
        apiServiceProvider.get(), characterDaoProvider.get(), locationRepositoryProvider.get());
  }

  public static CharacterRepository_Factory create(
      Provider<RickAndMortyAPIService> apiServiceProvider,
      Provider<CharacterDao> characterDaoProvider,
      Provider<LocationRepository> locationRepositoryProvider) {
    return new CharacterRepository_Factory(
        apiServiceProvider, characterDaoProvider, locationRepositoryProvider);
  }

  public static CharacterRepository newCharacterRepository(
      RickAndMortyAPIService apiService,
      CharacterDao characterDao,
      LocationRepository locationRepository) {
    return new CharacterRepository(apiService, characterDao, locationRepository);
  }
}