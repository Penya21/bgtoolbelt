package com.kitam.bgapp.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {com.kitam.bgapp.data.data.BoardGameTypeConverter.class})
@androidx.room.Database(entities = {com.kitam.bgapp.data.data.User.class, com.kitam.bgapp.data.data.BoardGame.class, com.kitam.bgapp.data.data.UserBoardGameCrossRef.class}, version = 13, autoMigrations = {@androidx.room.AutoMigration(from = 12, to = 13, spec = com.kitam.bgapp.database.TaskDatabase.MigrateDeleteCustomList.class)})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u00002\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kitam/bgapp/database/TaskDatabase;", "Landroidx/room/RoomDatabase;", "()V", "taskDao", "Lcom/kitam/bgapp/database/TaskDao;", "MigrateDeleteCustomList", "app_release"})
public abstract class TaskDatabase extends androidx.room.RoomDatabase {
    
    public TaskDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.kitam.bgapp.database.TaskDao taskDao();
    
    @androidx.room.DeleteColumn(tableName = "user_entity", columnName = "customList")
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/kitam/bgapp/database/TaskDatabase$MigrateDeleteCustomList;", "Landroidx/room/migration/AutoMigrationSpec;", "()V", "app_release"})
    public static final class MigrateDeleteCustomList implements androidx.room.migration.AutoMigrationSpec {
        
        public MigrateDeleteCustomList() {
            super();
        }
    }
}