package com.kitam.bgapp.domain

import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.data.data.User
import com.kitam.bgapp.data.data.UserFavBoardGames

class GetDatabaseFavGamesByUserCase {

    suspend operator fun invoke(email:String):List<UserFavBoardGames>? = BGToolBeltApp.database.taskDao().getUserFavGames(email)

}