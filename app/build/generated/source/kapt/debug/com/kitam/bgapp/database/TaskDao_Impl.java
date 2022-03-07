package com.kitam.bgapp.database;

import android.database.Cursor;
import androidx.collection.ArrayMap;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.kitam.bgapp.data.data.BoardGame;
import com.kitam.bgapp.data.data.BoardGameTypeConverter;
import com.kitam.bgapp.data.data.User;
import com.kitam.bgapp.data.data.UserBoardGameCrossRef;
import com.kitam.bgapp.data.data.UserFavBoardGames;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDao_Impl implements TaskDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<User> __insertionAdapterOfUser;

  private final BoardGameTypeConverter __boardGameTypeConverter = new BoardGameTypeConverter();

  private final EntityInsertionAdapter<BoardGame> __insertionAdapterOfBoardGame;

  private final EntityInsertionAdapter<UserBoardGameCrossRef> __insertionAdapterOfUserBoardGameCrossRef;

  private final EntityDeletionOrUpdateAdapter<UserBoardGameCrossRef> __deletionAdapterOfUserBoardGameCrossRef;

  private final SharedSQLiteStatement __preparedStmtOfUpdateHotList;

  private final SharedSQLiteStatement __preparedStmtOfUpdateUpcomingList;

  private final SharedSQLiteStatement __preparedStmtOfUpdateTopList;

  public TaskDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user_entity` (`email`,`name`,`phone`,`hotList`,`upcomingList`,`favList`,`topList`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getEmail() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEmail());
        }
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getPhone() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPhone());
        }
        final String _tmp;
        _tmp = __boardGameTypeConverter.listToString(value.getHotList());
        if (_tmp == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __boardGameTypeConverter.listToString(value.getUpcomingList());
        if (_tmp_1 == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __boardGameTypeConverter.listToString(value.getFavList());
        if (_tmp_2 == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __boardGameTypeConverter.listToString(value.getTopList());
        if (_tmp_3 == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp_3);
        }
      }
    };
    this.__insertionAdapterOfBoardGame = new EntityInsertionAdapter<BoardGame>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `boardgame_entity` (`id`,`type`,`imageurl`,`name`,`yearpublished`,`description`,`rank`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, BoardGame value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getId());
        }
        if (value.getType() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getType());
        }
        if (value.getImageurl() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getImageurl());
        }
        if (value.getName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getName());
        }
        if (value.getYearpublished() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getYearpublished());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        if (value.getRank() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getRank());
        }
      }
    };
    this.__insertionAdapterOfUserBoardGameCrossRef = new EntityInsertionAdapter<UserBoardGameCrossRef>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `UserBoardGameCrossRef` (`email`,`id`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserBoardGameCrossRef value) {
        if (value.getEmail() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEmail());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
      }
    };
    this.__deletionAdapterOfUserBoardGameCrossRef = new EntityDeletionOrUpdateAdapter<UserBoardGameCrossRef>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `UserBoardGameCrossRef` WHERE `email` = ? AND `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, UserBoardGameCrossRef value) {
        if (value.getEmail() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getEmail());
        }
        if (value.getId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getId());
        }
      }
    };
    this.__preparedStmtOfUpdateHotList = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE user_entity SET hotList = ? WHERE email = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateUpcomingList = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE user_entity SET upcomingList = ? WHERE email = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateTopList = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE user_entity SET topList = ? WHERE email = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertUser(final User user) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insertGame(final BoardGame boardGame) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfBoardGame.insertAndReturnId(boardGame);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insertUserWithBoardGames(final UserBoardGameCrossRef userBoardGameCrossRef) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUserBoardGameCrossRef.insertAndReturnId(userBoardGameCrossRef);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int removeUserWithBoardGames(final UserBoardGameCrossRef userBoardGameCrossRef) {
    __db.assertNotSuspendingTransaction();
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfUserBoardGameCrossRef.handle(userBoardGameCrossRef);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int updateHotList(final String email, final List<BoardGame> list) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateHotList.acquire();
    int _argIndex = 1;
    final String _tmp;
    _tmp = __boardGameTypeConverter.listToString(list);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (email == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, email);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateHotList.release(_stmt);
    }
  }

  @Override
  public int updateUpcomingList(final String email, final List<BoardGame> list) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateUpcomingList.acquire();
    int _argIndex = 1;
    final String _tmp;
    _tmp = __boardGameTypeConverter.listToString(list);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (email == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, email);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateUpcomingList.release(_stmt);
    }
  }

  @Override
  public int updateTopList(final String email, final List<BoardGame> list) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateTopList.acquire();
    int _argIndex = 1;
    final String _tmp;
    _tmp = __boardGameTypeConverter.listToString(list);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (email == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, email);
    }
    __db.beginTransaction();
    try {
      final int _result = _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateTopList.release(_stmt);
    }
  }

  @Override
  public List<User> getAllUsers() {
    final String _sql = "SELECT * FROM user_entity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfHotList = CursorUtil.getColumnIndexOrThrow(_cursor, "hotList");
      final int _cursorIndexOfUpcomingList = CursorUtil.getColumnIndexOrThrow(_cursor, "upcomingList");
      final int _cursorIndexOfFavList = CursorUtil.getColumnIndexOrThrow(_cursor, "favList");
      final int _cursorIndexOfTopList = CursorUtil.getColumnIndexOrThrow(_cursor, "topList");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPhone;
        _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        final List<BoardGame> _tmpHotList;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfHotList);
        _tmpHotList = __boardGameTypeConverter.stringToList(_tmp);
        final List<BoardGame> _tmpUpcomingList;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfUpcomingList);
        _tmpUpcomingList = __boardGameTypeConverter.stringToList(_tmp_1);
        final List<BoardGame> _tmpFavList;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfFavList);
        _tmpFavList = __boardGameTypeConverter.stringToList(_tmp_2);
        final List<BoardGame> _tmpTopList;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfTopList);
        _tmpTopList = __boardGameTypeConverter.stringToList(_tmp_3);
        _item = new User(_tmpEmail,_tmpName,_tmpPhone,_tmpHotList,_tmpUpcomingList,_tmpFavList,_tmpTopList);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public User getUserByEmail(final String email) {
    final String _sql = "SELECT * FROM user_entity where email = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
      final int _cursorIndexOfHotList = CursorUtil.getColumnIndexOrThrow(_cursor, "hotList");
      final int _cursorIndexOfUpcomingList = CursorUtil.getColumnIndexOrThrow(_cursor, "upcomingList");
      final int _cursorIndexOfFavList = CursorUtil.getColumnIndexOrThrow(_cursor, "favList");
      final int _cursorIndexOfTopList = CursorUtil.getColumnIndexOrThrow(_cursor, "topList");
      final User _result;
      if(_cursor.moveToFirst()) {
        final String _tmpEmail;
        _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpPhone;
        _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
        final List<BoardGame> _tmpHotList;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfHotList);
        _tmpHotList = __boardGameTypeConverter.stringToList(_tmp);
        final List<BoardGame> _tmpUpcomingList;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfUpcomingList);
        _tmpUpcomingList = __boardGameTypeConverter.stringToList(_tmp_1);
        final List<BoardGame> _tmpFavList;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfFavList);
        _tmpFavList = __boardGameTypeConverter.stringToList(_tmp_2);
        final List<BoardGame> _tmpTopList;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfTopList);
        _tmpTopList = __boardGameTypeConverter.stringToList(_tmp_3);
        _result = new User(_tmpEmail,_tmpName,_tmpPhone,_tmpHotList,_tmpUpcomingList,_tmpFavList,_tmpTopList);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<BoardGame> getAllGames() {
    final String _sql = "SELECT * FROM boardgame_entity";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfImageurl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageurl");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfYearpublished = CursorUtil.getColumnIndexOrThrow(_cursor, "yearpublished");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfRank = CursorUtil.getColumnIndexOrThrow(_cursor, "rank");
      final List<BoardGame> _result = new ArrayList<BoardGame>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final BoardGame _item;
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpType;
        _tmpType = _cursor.getString(_cursorIndexOfType);
        final String _tmpImageurl;
        _tmpImageurl = _cursor.getString(_cursorIndexOfImageurl);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpYearpublished;
        _tmpYearpublished = _cursor.getString(_cursorIndexOfYearpublished);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpRank;
        _tmpRank = _cursor.getString(_cursorIndexOfRank);
        _item = new BoardGame(_tmpId,_tmpType,_tmpImageurl,_tmpName,_tmpYearpublished,_tmpDescription,_tmpRank);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public BoardGame getBoardGameById(final String id) {
    final String _sql = "SELECT * FROM boardgame_entity where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (id == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, id);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
      final int _cursorIndexOfImageurl = CursorUtil.getColumnIndexOrThrow(_cursor, "imageurl");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfYearpublished = CursorUtil.getColumnIndexOrThrow(_cursor, "yearpublished");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfRank = CursorUtil.getColumnIndexOrThrow(_cursor, "rank");
      final BoardGame _result;
      if(_cursor.moveToFirst()) {
        final String _tmpId;
        _tmpId = _cursor.getString(_cursorIndexOfId);
        final String _tmpType;
        _tmpType = _cursor.getString(_cursorIndexOfType);
        final String _tmpImageurl;
        _tmpImageurl = _cursor.getString(_cursorIndexOfImageurl);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpYearpublished;
        _tmpYearpublished = _cursor.getString(_cursorIndexOfYearpublished);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final String _tmpRank;
        _tmpRank = _cursor.getString(_cursorIndexOfRank);
        _result = new BoardGame(_tmpId,_tmpType,_tmpImageurl,_tmpName,_tmpYearpublished,_tmpDescription,_tmpRank);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<UserFavBoardGames> getUserFavGames(final String email) {
    final String _sql = "SELECT * FROM user_entity where email = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (email == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, email);
    }
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      final Cursor _cursor = DBUtil.query(__db, _statement, true, null);
      try {
        final int _cursorIndexOfEmail = CursorUtil.getColumnIndexOrThrow(_cursor, "email");
        final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
        final int _cursorIndexOfPhone = CursorUtil.getColumnIndexOrThrow(_cursor, "phone");
        final int _cursorIndexOfHotList = CursorUtil.getColumnIndexOrThrow(_cursor, "hotList");
        final int _cursorIndexOfUpcomingList = CursorUtil.getColumnIndexOrThrow(_cursor, "upcomingList");
        final int _cursorIndexOfFavList = CursorUtil.getColumnIndexOrThrow(_cursor, "favList");
        final int _cursorIndexOfTopList = CursorUtil.getColumnIndexOrThrow(_cursor, "topList");
        final ArrayMap<String, ArrayList<BoardGame>> _collectionBoardGames = new ArrayMap<String, ArrayList<BoardGame>>();
        while (_cursor.moveToNext()) {
          final String _tmpKey = _cursor.getString(_cursorIndexOfEmail);
          ArrayList<BoardGame> _tmpBoardGamesCollection = _collectionBoardGames.get(_tmpKey);
          if (_tmpBoardGamesCollection == null) {
            _tmpBoardGamesCollection = new ArrayList<BoardGame>();
            _collectionBoardGames.put(_tmpKey, _tmpBoardGamesCollection);
          }
        }
        _cursor.moveToPosition(-1);
        __fetchRelationshipboardgameEntityAscomKitamBgappDataDataBoardGame(_collectionBoardGames);
        final List<UserFavBoardGames> _result = new ArrayList<UserFavBoardGames>(_cursor.getCount());
        while(_cursor.moveToNext()) {
          final UserFavBoardGames _item;
          final User _tmpUser;
          if (! (_cursor.isNull(_cursorIndexOfEmail) && _cursor.isNull(_cursorIndexOfName) && _cursor.isNull(_cursorIndexOfPhone) && _cursor.isNull(_cursorIndexOfHotList) && _cursor.isNull(_cursorIndexOfUpcomingList) && _cursor.isNull(_cursorIndexOfFavList) && _cursor.isNull(_cursorIndexOfTopList))) {
            final String _tmpEmail;
            _tmpEmail = _cursor.getString(_cursorIndexOfEmail);
            final String _tmpName;
            _tmpName = _cursor.getString(_cursorIndexOfName);
            final String _tmpPhone;
            _tmpPhone = _cursor.getString(_cursorIndexOfPhone);
            final List<BoardGame> _tmpHotList;
            final String _tmp;
            _tmp = _cursor.getString(_cursorIndexOfHotList);
            _tmpHotList = __boardGameTypeConverter.stringToList(_tmp);
            final List<BoardGame> _tmpUpcomingList;
            final String _tmp_1;
            _tmp_1 = _cursor.getString(_cursorIndexOfUpcomingList);
            _tmpUpcomingList = __boardGameTypeConverter.stringToList(_tmp_1);
            final List<BoardGame> _tmpFavList;
            final String _tmp_2;
            _tmp_2 = _cursor.getString(_cursorIndexOfFavList);
            _tmpFavList = __boardGameTypeConverter.stringToList(_tmp_2);
            final List<BoardGame> _tmpTopList;
            final String _tmp_3;
            _tmp_3 = _cursor.getString(_cursorIndexOfTopList);
            _tmpTopList = __boardGameTypeConverter.stringToList(_tmp_3);
            _tmpUser = new User(_tmpEmail,_tmpName,_tmpPhone,_tmpHotList,_tmpUpcomingList,_tmpFavList,_tmpTopList);
          }  else  {
            _tmpUser = null;
          }
          ArrayList<BoardGame> _tmpBoardGamesCollection_1 = null;
          final String _tmpKey_1 = _cursor.getString(_cursorIndexOfEmail);
          _tmpBoardGamesCollection_1 = _collectionBoardGames.get(_tmpKey_1);
          if (_tmpBoardGamesCollection_1 == null) {
            _tmpBoardGamesCollection_1 = new ArrayList<BoardGame>();
          }
          _item = new UserFavBoardGames(_tmpUser,_tmpBoardGamesCollection_1);
          _result.add(_item);
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

  private void __fetchRelationshipboardgameEntityAscomKitamBgappDataDataBoardGame(
      final ArrayMap<String, ArrayList<BoardGame>> _map) {
    final Set<String> __mapKeySet = _map.keySet();
    if (__mapKeySet.isEmpty()) {
      return;
    }
    // check if the size is too big, if so divide;
    if(_map.size() > RoomDatabase.MAX_BIND_PARAMETER_CNT) {
      ArrayMap<String, ArrayList<BoardGame>> _tmpInnerMap = new ArrayMap<String, ArrayList<BoardGame>>(androidx.room.RoomDatabase.MAX_BIND_PARAMETER_CNT);
      int _tmpIndex = 0;
      int _mapIndex = 0;
      final int _limit = _map.size();
      while(_mapIndex < _limit) {
        _tmpInnerMap.put(_map.keyAt(_mapIndex), _map.valueAt(_mapIndex));
        _mapIndex++;
        _tmpIndex++;
        if(_tmpIndex == RoomDatabase.MAX_BIND_PARAMETER_CNT) {
          __fetchRelationshipboardgameEntityAscomKitamBgappDataDataBoardGame(_tmpInnerMap);
          _tmpInnerMap = new ArrayMap<String, ArrayList<BoardGame>>(RoomDatabase.MAX_BIND_PARAMETER_CNT);
          _tmpIndex = 0;
        }
      }
      if(_tmpIndex > 0) {
        __fetchRelationshipboardgameEntityAscomKitamBgappDataDataBoardGame(_tmpInnerMap);
      }
      return;
    }
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT `boardgame_entity`.`id` AS `id`,`boardgame_entity`.`type` AS `type`,`boardgame_entity`.`imageurl` AS `imageurl`,`boardgame_entity`.`name` AS `name`,`boardgame_entity`.`yearpublished` AS `yearpublished`,`boardgame_entity`.`description` AS `description`,`boardgame_entity`.`rank` AS `rank`,_junction.`email` FROM `UserBoardGameCrossRef` AS _junction INNER JOIN `boardgame_entity` ON (_junction.`id` = `boardgame_entity`.`id`) WHERE _junction.`email` IN (");
    final int _inputSize = __mapKeySet.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _stmt = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : __mapKeySet) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    final Cursor _cursor = DBUtil.query(__db, _stmt, false, null);
    try {
      final int _itemKeyIndex = 7; // _junction.email;
      if (_itemKeyIndex == -1) {
        return;
      }
      final int _cursorIndexOfId = CursorUtil.getColumnIndex(_cursor, "id");
      final int _cursorIndexOfType = CursorUtil.getColumnIndex(_cursor, "type");
      final int _cursorIndexOfImageurl = CursorUtil.getColumnIndex(_cursor, "imageurl");
      final int _cursorIndexOfName = CursorUtil.getColumnIndex(_cursor, "name");
      final int _cursorIndexOfYearpublished = CursorUtil.getColumnIndex(_cursor, "yearpublished");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndex(_cursor, "description");
      final int _cursorIndexOfRank = CursorUtil.getColumnIndex(_cursor, "rank");
      while(_cursor.moveToNext()) {
        final String _tmpKey = _cursor.getString(_itemKeyIndex);
        ArrayList<BoardGame> _tmpRelation = _map.get(_tmpKey);
        if (_tmpRelation != null) {
          final BoardGame _item_1;
          final String _tmpId;
          if (_cursorIndexOfId == -1) {
            _tmpId = null;
          } else {
            _tmpId = _cursor.getString(_cursorIndexOfId);
          }
          final String _tmpType;
          if (_cursorIndexOfType == -1) {
            _tmpType = null;
          } else {
            _tmpType = _cursor.getString(_cursorIndexOfType);
          }
          final String _tmpImageurl;
          if (_cursorIndexOfImageurl == -1) {
            _tmpImageurl = null;
          } else {
            _tmpImageurl = _cursor.getString(_cursorIndexOfImageurl);
          }
          final String _tmpName;
          if (_cursorIndexOfName == -1) {
            _tmpName = null;
          } else {
            _tmpName = _cursor.getString(_cursorIndexOfName);
          }
          final String _tmpYearpublished;
          if (_cursorIndexOfYearpublished == -1) {
            _tmpYearpublished = null;
          } else {
            _tmpYearpublished = _cursor.getString(_cursorIndexOfYearpublished);
          }
          final String _tmpDescription;
          if (_cursorIndexOfDescription == -1) {
            _tmpDescription = null;
          } else {
            _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
          }
          final String _tmpRank;
          if (_cursorIndexOfRank == -1) {
            _tmpRank = null;
          } else {
            _tmpRank = _cursor.getString(_cursorIndexOfRank);
          }
          _item_1 = new BoardGame(_tmpId,_tmpType,_tmpImageurl,_tmpName,_tmpYearpublished,_tmpDescription,_tmpRank);
          _tmpRelation.add(_item_1);
        }
      }
    } finally {
      _cursor.close();
    }
  }
}
