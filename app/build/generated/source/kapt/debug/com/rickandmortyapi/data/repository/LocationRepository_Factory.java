// Generated by Dagger (https://google.github.io/dagger).
package com.rickandmortyapi.data.repository;

import com.rickandmortyapi.data.local.dao.LocationDao;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class LocationRepository_Factory implements Factory<LocationRepository> {
  private final Provider<LocationDao> locationDaoProvider;

  public LocationRepository_Factory(Provider<LocationDao> locationDaoProvider) {
    this.locationDaoProvider = locationDaoProvider;
  }

  @Override
  public LocationRepository get() {
    return provideInstance(locationDaoProvider);
  }

  public static LocationRepository provideInstance(Provider<LocationDao> locationDaoProvider) {
    return new LocationRepository(locationDaoProvider.get());
  }

  public static LocationRepository_Factory create(Provider<LocationDao> locationDaoProvider) {
    return new LocationRepository_Factory(locationDaoProvider);
  }

  public static LocationRepository newLocationRepository(LocationDao locationDao) {
    return new LocationRepository(locationDao);
  }
}