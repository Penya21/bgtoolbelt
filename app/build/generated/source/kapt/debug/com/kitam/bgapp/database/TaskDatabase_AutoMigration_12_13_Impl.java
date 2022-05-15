package com.kitam.bgapp.database;

import androidx.annotation.NonNull;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import java.lang.Override;
import java.lang.SuppressWarnings;

@SuppressWarnings({"unchecked", "deprecation"})
class TaskDatabase_AutoMigration_12_13_Impl extends Migration {
  private final AutoMigrationSpec callback = new TaskDatabase.MigrateDeleteCustomList();

  public TaskDatabase_AutoMigration_12_13_Impl() {
    super(12, 13);
  }

  @Override
  public void migrate(@NonNull SupportSQLiteDatabase database) {
    database.execSQL("ALTER TABLE `user_entity` ADD COLUMN `sponsoredList` TEXT DEFAULT NULL");
    database.execSQL("CREATE TABLE IF NOT EXISTS `_new_user_entity` (`email` TEXT NOT NULL, `name` TEXT, `phone` TEXT, `hotList` TEXT, `upcomingList` TEXT, `favList` TEXT, `topList` TEXT, `sponsoredList` TEXT, `lastUpdate` INTEGER, PRIMARY KEY(`email`))");
    database.execSQL("INSERT INTO `_new_user_entity` (`hotList`,`phone`,`lastUpdate`,`name`,`topList`,`favList`,`email`,`upcomingList`) SELECT `hotList`,`phone`,`lastUpdate`,`name`,`topList`,`favList`,`email`,`upcomingList` FROM `user_entity`");
    database.execSQL("DROP TABLE `user_entity`");
    database.execSQL("ALTER TABLE `_new_user_entity` RENAME TO `user_entity`");
    callback.onPostMigrate(database);
  }
}
