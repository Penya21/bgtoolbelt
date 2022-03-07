package com.kitam.bgapp.domain

import com.kitam.bgapp.BGToolBeltApp
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.UserBoardGameCrossRef

class InsertUserWithBoardGamesUseCase {

    suspend operator fun invoke(userBoardGameCrossRef: UserBoardGameCrossRef):Long? = BGToolBeltApp.database.taskDao().insertUserWithBoardGames(userBoardGameCrossRef)

}