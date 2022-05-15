package com.kitam.bgapp.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TaskDatabase_Impl extends TaskDatabase {
  private volatile TaskDao _taskDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(13) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user_entity` (`email` TEXT NOT NULL, `name` TEXT, `phone` TEXT, `hotList` TEXT, `upcomingList` TEXT, `favList` TEXT, `topList` TEXT, `sponsoredList` TEXT, `lastUpdate` INTEGER, PRIMARY KEY(`email`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `boardgame_entity` (`id` TEXT NOT NULL, `type` TEXT, `imageurl` TEXT, `name` TEXT, `yearpublished` TEXT, `description` TEXT, `rank` TEXT, `href` TEXT, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `UserBoardGameCrossRef` (`email` TEXT NOT NULL, `id` TEXT NOT NULL, PRIMARY KEY(`email`, `id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3546e2b24f44adf4e5fddfd6fbabd313')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user_entity`");
        _db.execSQL("DROP TABLE IF EXISTS `boardgame_entity`");
        _db.execSQL("DROP TABLE IF EXISTS `UserBoardGameCrossRef`");
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
        final HashMap<String, TableInfo.Column> _columnsUserEntity = new HashMap<String, TableInfo.Column>(9);
        _columnsUserEntity.put("email", new TableInfo.Column("email", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("phone", new TableInfo.Column("phone", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("hotList", new TableInfo.Column("hotList", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("upcomingList", new TableInfo.Column("upcomingList", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("favList", new TableInfo.Column("favList", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("topList", new TableInfo.Column("topList", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("sponsoredList", new TableInfo.Column("sponsoredList", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserEntity.put("lastUpdate", new TableInfo.Column("lastUpdate", "INTEGER", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserEntity = new TableInfo("user_entity", _columnsUserEntity, _foreignKeysUserEntity, _indicesUserEntity);
        final TableInfo _existingUserEntity = TableInfo.read(_db, "user_entity");
        if (! _infoUserEntity.equals(_existingUserEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "user_entity(com.kitam.bgapp.data.data.User).\n"
                  + " Expected:\n" + _infoUserEntity + "\n"
                  + " Found:\n" + _existingUserEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsBoardgameEntity = new HashMap<String, TableInfo.Column>(8);
        _columnsBoardgameEntity.put("id", new TableInfo.Column("id", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("type", new TableInfo.Column("type", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("imageurl", new TableInfo.Column("imageurl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("name", new TableInfo.Column("name", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("yearpublished", new TableInfo.Column("yearpublished", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("rank", new TableInfo.Column("rank", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsBoardgameEntity.put("href", new TableInfo.Column("href", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysBoardgameEntity = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesBoardgameEntity = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoBoardgameEntity = new TableInfo("boardgame_entity", _columnsBoardgameEntity, _foreignKeysBoardgameEntity, _indicesBoardgameEntity);
        final TableInfo _existingBoardgameEntity = TableInfo.read(_db, "boardgame_entity");
        if (! _infoBoardgameEntity.equals(_existingBoardgameEntity)) {
          return new RoomOpenHelper.ValidationResult(false, "boardgame_entity(com.kitam.bgapp.data.data.BoardGame).\n"
                  + " Expected:\n" + _infoBoardgameEntity + "\n"
                  + " Found:\n" + _existingBoardgameEntity);
        }
        final HashMap<String, TableInfo.Column> _columnsUserBoardGameCrossRef = new HashMap<String, TableInfo.Column>(2);
        _columnsUserBoardGameCrossRef.put("email", new TableInfo.Column("email", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsUserBoardGameCrossRef.put("id", new TableInfo.Column("id", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUserBoardGameCrossRef = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUserBoardGameCrossRef = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUserBoardGameCrossRef = new TableInfo("UserBoardGameCrossRef", _columnsUserBoardGameCrossRef, _foreignKeysUserBoardGameCrossRef, _indicesUserBoardGameCrossRef);
        final TableInfo _existingUserBoardGameCrossRef = TableInfo.read(_db, "UserBoardGameCrossRef");
        if (! _infoUserBoardGameCrossRef.equals(_existingUserBoardGameCrossRef)) {
          return new RoomOpenHelper.ValidationResult(false, "UserBoardGameCrossRef(com.kitam.bgapp.data.data.UserBoardGameCrossRef).\n"
                  + " Expected:\n" + _infoUserBoardGameCrossRef + "\n"
                  + " Found:\n" + _existingUserBoardGameCrossRef);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "3546e2b24f44adf4e5fddfd6fbabd313", "36d3f488594b2422c4c6f7cd7e17cf27");
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
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "user_entity","boardgame_entity","UserBoardGameCrossRef");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user_entity`");
      _db.execSQL("DELETE FROM `boardgame_entity`");
      _db.execSQL("DELETE FROM `UserBoardGameCrossRef`");
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
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(TaskDao.class, TaskDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
    final HashSet<Class<? extends AutoMigrationSpec>> _autoMigrationSpecsSet = new HashSet<Class<? extends AutoMigrationSpec>>();
    return _autoMigrationSpecsSet;
  }

  @Override
  public List<Migration> getAutoMigrations(
      @NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecsMap) {
    return Arrays.asList(new TaskDatabase_AutoMigration_12_13_Impl());
  }

  @Override
  public TaskDao taskDao() {
    if (_taskDao != null) {
      return _taskDao;
    } else {
      synchronized(this) {
        if(_taskDao == null) {
          _taskDao = new TaskDao_Impl(this);
        }
        return _taskDao;
      }
    }
  }
}
