package com.kitam.bgapp.database

import androidx.room.*
import androidx.room.migration.AutoMigrationSpec
import com.kitam.bgapp.data.data.*


@Database(entities = [User::class, BoardGame::class, UserBoardGameCrossRef::class], version = 13,   autoMigrations = [
    AutoMigration (from = 12, to = 13, spec = TaskDatabase.MigrateDeleteCustomList::class)
])
@TypeConverters(BoardGameTypeConverter::class)

abstract class TaskDatabase : RoomDatabase(){
    abstract fun taskDao(): TaskDao

    @DeleteColumn(tableName = "user_entity",columnName = "customList")
    class MigrateDeleteCustomList : AutoMigrationSpec { }
}