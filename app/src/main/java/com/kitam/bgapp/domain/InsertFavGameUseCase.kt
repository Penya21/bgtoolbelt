package com.kitam.bgapp.domain

import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.User

class InsertFavGameUseCase {

    suspend operator fun invoke(boardGame:BoardGame):Long? = BGToolBeltApp.database.taskDao().insertGame(boardGame)

}