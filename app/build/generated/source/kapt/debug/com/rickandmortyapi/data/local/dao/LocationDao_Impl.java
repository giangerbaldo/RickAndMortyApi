package com.rickandmortyapi.data.local.dao;

import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.rickandmortyapi.data.local.entity.LocationEntity;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class LocationDao_Impl implements LocationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocationEntity> __insertionAdapterOfLocationEntity;

  private final EntityDeletionOrUpdateAdapter<LocationEntity> __deletionAdapterOfLocationEntity;

  public LocationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocationEntity = new EntityInsertionAdapter<LocationEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `LocationEntity` (`location_id`,`name`,`url`,`characterId`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationEntity value) {
        if (value.getLocationId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getLocationId());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getUrl());
        }
        stmt.bindLong(4, value.getCharacterId());
      }
    };
    this.__deletionAdapterOfLocationEntity = new EntityDeletionOrUpdateAdapter<LocationEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `LocationEntity` WHERE `location_id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocationEntity value) {
        if (value.getLocationId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getLocationId());
        }
      }
    };
  }

  @Override
  public Object insert(final LocationEntity[] location, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfLocationEntity.insert(location);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final LocationEntity location, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfLocationEntity.handle(location);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }
}
