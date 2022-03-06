package com.kitam.bgapp.domain

import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.data.data.User

class GetDatabaseBoardGamesUseCase {

    suspend operator fun invoke():List<User>? = BGToolBeltApp.database.taskDao().getAllUsers()


}