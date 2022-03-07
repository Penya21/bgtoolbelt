package com.kitam.bgapp.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.kitam.bgapp.data.data.*


@Database(entities = [User::class, BoardGame::class, UserBoardGameCrossRef::class], version = 8)
@TypeConverters(BoardGameTypeConverter::class)

abstract class TaskDatabase : RoomDatabase(){
    abstract fun taskDao(): TaskDao


}