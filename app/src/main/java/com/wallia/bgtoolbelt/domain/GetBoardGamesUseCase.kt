package com.wallia.bgtoolbelt.domain

import com.wallia.bgtoolbelt.data.APIRepository
import com.wallia.bgtoolbelt.data.data.Thing

class GetBoardGamesUseCase {

    private val repository = APIRepository()

    suspend operator fun invoke():List<Thing>? = repository.getHotGames()

}