package com.kitam.bgapp.database

import androidx.room.*
import com.kitam.bgapp.data.data.*
import androidx.room.OnConflictStrategy




@Dao
interface TaskDao {
    @Query("SELECT * FROM user_entity")
    fun getAllUsers(): MutableList<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUser(user: User): Long

    @Query("SELECT * FROM user_entity where email = :email")
    fun getUserByEmail(email: String): User

    @Query("UPDATE user_entity SET hotList = :list WHERE email = :email")
    fun updateHotList(email: String, list: List<BoardGame>):Int

    @Query("UPDATE user_entity SET upcomingList = :list WHERE email = :email")
    fun updateUpcomingList(email: String, list: List<BoardGame>):Int

    @Query("UPDATE user_entity SET topList = :list WHERE email = :email")
    fun updateTopList(email: String, list: List<BoardGame>):Int

    @Query("SELECT * FROM boardgame_entity")
    fun getAllGames(): MutableList<BoardGame>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertGame(boardGame: BoardGame): Long

    @Query("SELECT * FROM boardgame_entity where id = :id")
    fun getBoardGameById(id: String): BoardGame

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserWithBoardGames(userBoardGameCrossRef: UserBoardGameCrossRef?): Long

    @Delete
    fun removeUserWithBoardGames(userBoardGameCrossRef: UserBoardGameCrossRef?): Int


    @Transaction
    @Query("SELECT * FROM user_entity where email = :email")
    fun getUserFavGames(email: String): List<UserFavBoardGames>

}