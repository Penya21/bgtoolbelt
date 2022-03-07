package com.kitam.bgapp.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\'J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tH\'J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000b\u001a\u00020\tH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\'J\u0010\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0006H\'J\u0012\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\'J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\'J\u001e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\'J\u001e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\'J\u001e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\t2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\rH\'\u00a8\u0006\u001d"}, d2 = {"Lcom/kitam/bgapp/database/TaskDao;", "", "getAllGames", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "getAllUsers", "Lcom/kitam/bgapp/data/data/User;", "getBoardGameById", "id", "", "getUserByEmail", "email", "getUserFavGames", "", "Lcom/kitam/bgapp/data/data/UserFavBoardGames;", "insertGame", "", "boardGame", "insertUser", "user", "insertUserWithBoardGames", "userBoardGameCrossRef", "Lcom/kitam/bgapp/data/data/UserBoardGameCrossRef;", "removeUserWithBoardGames", "", "updateHotList", "list", "updateTopList", "updateUpcomingList", "app_release"})
public abstract interface TaskDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_entity")
    public abstract java.util.List<com.kitam.bgapp.data.data.User> getAllUsers();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertUser(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.User user);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_entity where email = :email")
    public abstract com.kitam.bgapp.data.data.User getUserByEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @androidx.room.Query(value = "UPDATE user_entity SET hotList = :list WHERE email = :email")
    public abstract int updateHotList(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> list);
    
    @androidx.room.Query(value = "UPDATE user_entity SET upcomingList = :list WHERE email = :email")
    public abstract int updateUpcomingList(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> list);
    
    @androidx.room.Query(value = "UPDATE user_entity SET topList = :list WHERE email = :email")
    public abstract int updateTopList(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> list);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM boardgame_entity")
    public abstract java.util.List<com.kitam.bgapp.data.data.BoardGame> getAllGames();
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertGame(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM boardgame_entity where id = :id")
    public abstract com.kitam.bgapp.data.data.BoardGame getBoardGameById(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertUserWithBoardGames(@org.jetbrains.annotations.Nullable()
    com.kitam.bgapp.data.data.UserBoardGameCrossRef userBoardGameCrossRef);
    
    @androidx.room.Delete()
    public abstract int removeUserWithBoardGames(@org.jetbrains.annotations.Nullable()
    com.kitam.bgapp.data.data.UserBoardGameCrossRef userBoardGameCrossRef);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user_entity where email = :email")
    @androidx.room.Transaction()
    public abstract java.util.List<com.kitam.bgapp.data.data.UserFavBoardGames> getUserFavGames(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
}