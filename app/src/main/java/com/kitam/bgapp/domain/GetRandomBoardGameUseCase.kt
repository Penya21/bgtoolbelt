package com.kitam.bgapp.domain

import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.model.BoardGameProvider

class GetRandomBoardGameUseCase {

    operator fun invoke(): BoardGame?{
        val boardGames = BoardGameProvider.hotGames
        if(!boardGames.isNullOrEmpty()){
            val randomNumber = (boardGames.indices).random()
            return boardGames[randomNumber]
        }
        return null
    }
}