package com.rickandmortyapi.data.local;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import com.rickandmortyapi.data.local.dao.CharacterDao;
import com.rickandmortyapi.data.local.dao.CharacterDao_Impl;
import com.rickandmortyapi.data.local.dao.LocationDao;
import com.rickandmortyapi.data.local.dao.LocationDao_Impl;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile CharacterDao _characterDao;

  private volatile LocationDao _locationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `CharacterEntity` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `image` TEXT NOT NULL, `species` TEXT NOT NULL, `total_episodes` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `LocationEntity` (`location_id` INTEGER PRIMARY KEY AUTOINCREMENT, `name` TEXT NOT NULL, `url` TEXT NOT NULL, `characterId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '74ad493aec5f3cfff4e7a40cf7e1dc71')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `CharacterEntity`");
        _db.execSQL("DROP TABLE IF EXISTS `LocationEntity`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsCharacterEntity = new HashMap<String, TableInfo.Column>(5);
        _columnsCharacterEntity.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterEntity.put("image", new TableInfo.Column("image", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterEntity.put("species", new TableInfo.Column("species", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsCharacterEntity.put("total_episodes", new TableInfo.Column("total_episodes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysCharacterEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesCharacterEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoCharacterEntity = new TableInfo("CharacterEntity", _columnsCharacterEntity, _foreignKeysCharacterEntity, _indicesCharacterEntity);
        final TableInfo _existingCharacterEntity = TableInfo.read(_db, "CharacterEntity");
        if (! _infoCharacterEntity.equals(_existingCharacterEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "CharacterEntity(com.rickandmortyapi.data.local.entity.CharacterEntity).\n"
                  + " Expected:\n" + _infoCharacterEntity + "\n"
                  + " Found:\n" + _existingCharacterEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsLocationEntity = new HashMap<String, TableInfo.Column>(4);
        _columnsLocationEntity.put("location_id", new TableInfo.Column("location_id", "INTEGER", false, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationEntity.put("name", new TableInfo.Column("name", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationEntity.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsLocationEntity.put("characterId", new TableInfo.Column("characterId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysLocationEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesLocationEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoLocationEntity = new TableInfo("LocationEntity", _columnsLocationEntity, _foreignKeysLocationEntity, _indicesLocationEntity);
        final TableInfo _existingLocationEntity = TableInfo.read(_db, "LocationEntity");
        if (! _infoLocationEntity.equals(_existingLocationEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "LocationEntity(com.rickandmortyapi.data.local.entity.LocationEntity).\n"
                  + " Expected:\n" + _infoLocationEntity + "\n"
                  + " Found:\n" + _existingLocationEntity);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "74ad493aec5f3cfff4e7a40cf7e1dc71", "0dc1151a3aebcf5e2c6cfbb77117c62a");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "CharacterEntity","LocationEntity");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `CharacterEntity`");
      _db.execSQL("DELETE FROM `LocationEntity`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public CharacterDao characterDao() {
    if (_characterDao != null) {
      return _characterDao;
    } else {
      synchronized(this) {
        if(_characterDao == null) {
          _characterDao = new CharacterDao_Impl(this);
        }
        return _characterDao;
      }
    }
  }

  @Override
  public LocationDao locationDao() {
    if (_locationDao != null) {
      return _locationDao;
    } else {
      synchronized(this) {
        if(_locationDao == null) {
          _locationDao = new LocationDao_Impl(this);
        }
        return _locationDao;
      }
    }
  }
}
