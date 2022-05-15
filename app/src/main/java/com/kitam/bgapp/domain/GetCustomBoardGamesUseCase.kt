package com.kitam.bgapp.domain

import com.kitam.bgapp.data.APIRepository
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.ResponseBoardGamesLists

class GetCustomBoardGamesUseCase {

    private val repository = APIRepository()

    suspend operator fun invoke():List<BoardGame> = repository.getCustomGames()
}

