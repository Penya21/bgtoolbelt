package com.kitam.bgapp

import android.app.Application
import androidx.room.Room
import com.google.android.gms.ads.MobileAds
import com.kitam.bgapp.database.TaskDatabase

class BGToolBeltApp : Application(){

    companion object {
        lateinit var database: TaskDatabase
    }
    override fun onCreate() {
        super.onCreate()
        BGToolBeltApp.database =  Room.databaseBuilder(this, TaskDatabase::class.java, "task-db").fallbackToDestructiveMigration().build()

        MobileAds.initialize(this) {}

    }



}