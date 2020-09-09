package com.rickandmortyapi.data.local.dao;

import android.database.Cursor;
import androidx.collection.LongSparseArray;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.rickandmortyapi.data.local.entity.CharacterEntity;
import com.rickandmortyapi.data.local.entity.CharacterWithLocations;
import com.rickandmortyapi.data.local.entity.LocationEntity;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class CharacterDao_Impl implements CharacterDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<CharacterEntity> __insertionAdapterOfCharacterEntity;

  private final EntityDeletionOrUpdateAdapter<CharacterEntity> __deletionAdapterOfCharacterEntity;

  private final EntityDeletionOrUpdateAdapter<CharacterEntity> __updateAdapterOfCharacterEntity;

  public CharacterDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfCharacterEntity = new EntityInsertionAdapter<CharacterEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `CharacterEntity` (`id`,`name`,`image`,`species`,`total_episodes`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CharacterEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getSpecies() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSpecies());
        }
        stmt.bindLong(5, value.getTotalEpisodes());
      }
    };
    this.__deletionAdapterOfCharacterEntity = new EntityDeletionOrUpdateAdapter<CharacterEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `CharacterEntity` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CharacterEntity value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfCharacterEntity = new EntityDeletionOrUpdateAdapter<CharacterEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `CharacterEntity` SET `id` = ?,`name` = ?,`image` = ?,`species` = ?,`total_episodes` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, CharacterEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getImage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImage());
        }
        if (value.getSpecies() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getSpecies());
        }
        stmt.bindLong(5, value.getTotalEpisodes());
        stmt.bindLong(6, value.getId());
      }
    };
  }

  @Override
  public Object insert(final CharacterEntity[] character, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfCharacterEntity.insert(character);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final CharacterEntity character, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfCharacterEntity.handle(character);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final CharacterEntity[] character, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfCharacterEntity.handleMultiple(character);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object getAll(final Continuation<? super List<CharacterEntity>> p0) {
    final String _sql = "SELECT * FROM characterentity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.execute(__db, false, new Callable<List<CharacterEntity>>() {
      @Override
      public List<CharacterEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
          final int _cursorIndexOfTotalEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "total_episodes");
          final List<CharacterEntity> _result = new ArrayList<CharacterEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final CharacterEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpImage;
            _tmpImage = _cursor.getString(_cursorIndexOfImage);
            final String _tmpSpecies;
            _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
            final int _tmpTotalEpisodes;
            _tmpTotalEpisodes = _cursor.getInt(_cursorIndexOfTotalEpisodes);
            _item = new CharacterEntity(_tmpId,_tmpName,_tmpImage,_tmpSpecies,_tmpTotalEpisodes);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  @Override
  public Object getCharacterWithLocationsById(final int characterId,
      final Continuation<? super CharacterWithLocations> p1) {
    final String _sql = "SELECT * FROM characterentity WHERE id IN (?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, characterId);
    return CoroutinesRoom.execute(__db, true, new Callable<CharacterWithLocations>() {
      @Override
      public CharacterWithLocations call() throws Exception {
        __db.beginTransaction();
        try {
          final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
          try {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
            final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
            final int _cursorIndexOfSpecies = CursorUtil.getColumnIndexOrThrow(_cursor, "species");
            final int _cursorIndexOfTotalEpisodes = CursorUtil.getColumnIndexOrThrow(_cursor, "total_episodes");
            final LongSparseArray<ArrayList<LocationEntity>> _collectionLocations = new LongSparseArray<ArrayList<LocationEntity>>();
            while (_cursor.moveToNext()) {
              final long _tmpKey = _cursor.getLong(_cursorIndexOfId);
              ArrayList<LocationEntity> _tmpLocationsCollection = _collectionLocations.get(_tmpKey);
              if (_tmpLocationsCollection == null) {
                _tmpLocationsCollection = new ArrayList<LocationEntity>();
                _collectionLocations.put(_tmpKey, _tmpLocationsCollection);
              }
            }
            _cursor.moveToPosition(-1);
            __fetchRelationshipLocationEntityAscomRickandmortyapiDataLocalEntityLocationEntity(_collectionLocations);
            final CharacterWithLocations _result;
            if(_cursor.moveToFirst()) {
              final CharacterEntity _tmpCharacter;
              if (! (_cursor.isNull(_cursorIndexOfId) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfImage) && _cursor.isNull(_cursorIndexOfSpecies) && _cursor.isNull(_cursorIndexOfTotalEpisodes))) {
                final int _tmpId;
                _tmpId = _cursor.getInt(_cursorIndexOfId);
                final String _tmpName;
                _tmpName = _cursor.getString(_cursorIndexOfName);
                final String _tmpImage;
                _tmpImage = _cursor.getString(_cursorIndexOfImage);
                final String _tmpSpecies;
                _tmpSpecies = _cursor.getString(_cursorIndexOfSpecies);
                final int _tmpTotalEpisodes;
                _tmpTotalEpisodes = _cursor.getInt(_cursorIndexOfTotalEpisodes);
                _tmpCharacter = new CharacterEntity(_tmpId,_tmpName,_tmpImage,_tmpSpecies,_tmpTotalEpisodes);
              }  else  {
                _tmpCharacter = null;
              }
              ArrayList<LocationEntity> _tmpLocationsCollection_1 = null;
              final long _tmpKey_1 = _cursor.getLong(_cursorIndexOfId);
              _tmpLocationsCollection_1 = _collectionLocations.get(_tmpKey_1);
              if (_tmpLocationsCollection_1 == null) {
                _tmpLocationsCollection_1 = new ArrayList<LocationEntity>();
              }
              _result = new CharacterWithLocations(_tmpCharacter,_tmpLocationsCollection_1);
            } else {
              _result = null;
            }
            __db.setTransactionSuccessful();
            return _result;
          } finally {
            _cursor.close();
            _statement.release();
          }
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  private void __fetchRelationshipLocationEntityAscomRickandmortyapiDataLocalEntityLocationEntity(
      final LongSparseArray<ArrayList<LocationEntity>> _map) {
    if (_map.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      LongSparseArray<ArrayList<LocationEntity>> _tmpInnerMap = new LongSparseArray<ArrayList<LocationEntity>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipLocationEntityAscomRickandmortyapiDataLocalEntityLocationEntity(_tmpInnerMap);
          _tmpInnerMap = new LongSparseArray<ArrayList<LocationEntity>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipLocationEntityAscomRickandmortyapiDataLocalEntityLocationEntity(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `location_id`,`name`,`url`,`characterId` FROM `LocationEntity` WHERE `characterId` IN (");
    final int _inputSize = _map.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (int i = 0; i < _map.size(); i++) {
      long _item = _map.keyAt(i);
      _stmt.bindLong(_argIndex, _item);
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = CursorUtil.getColumnIndex(_cursor, "characterId");
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfLocationId = CursorUtil.getColumnIndex(_cursor, "location_id");
      final int _cursorIndexOfName = CursorUtil.getColumnIndex(_cursor, "name");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndex(_cursor, "url");
      final int _cursorIndexOfCharacterId = CursorUtil.getColumnIndex(_cursor, "characterId");
      while(_cursor.moveToNext()) {
        final long _tmpKey = _cursor.getLong(_itemKeyIndex);
        ArrayList<LocationEntity> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final LocationEntity _item_1;
          final Integer _tmpLocationId;
          if (_cursorIndexOfLocationId == -1) {
            _tmpLocationId = null;
          } else {
            if (_cursor.isNull(_cursorIndexOfLocationId)) {
              _tmpLocationId = null;
            } else {
              _tmpLocationId = _cursor.getInt(_cursorIndexOfLocationId);
            }
          }
          final String _tmpName;
          if (_cursorIndexOfName == -1) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpUrl;
          if (_cursorIndexOfUrl == -1) {
            _tmpUrl = null;
          } else {
            _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
          }
          final int _tmpCharacterId;
          if (_cursorIndexOfCharacterId == -1) {
            _tmpCharacterId = 0;
          } else {
            _tmpCharacterId = _cursor.getInt(_cursorIndexOfCharacterId);
          }
          _item_1 = new LocationEntity(_tmpLocationId,_tmpName,_tmpUrl,_tmpCharacterId);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
