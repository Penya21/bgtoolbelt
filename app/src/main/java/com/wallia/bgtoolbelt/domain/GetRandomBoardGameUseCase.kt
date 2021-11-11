package com.wallia.bgtoolbelt.domain

import com.wallia.bgtoolbelt.data.data.Thing
import com.wallia.bgtoolbelt.model.BoardGameProvider

class GetRandomBoardGameUseCase {

    operator fun invoke(): Thing?{
        val boardGames = BoardGameProvider.boardGames
        if(!boardGames.isNullOrEmpty()){
            val randomNumber = (boardGames.indices).random()
            return boardGames[randomNumber]
        }
        return null
    }
}