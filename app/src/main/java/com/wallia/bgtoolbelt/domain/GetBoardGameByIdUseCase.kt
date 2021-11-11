package com.wallia.bgtoolbelt.domain

import com.wallia.bgtoolbelt.data.APIRepository
import com.wallia.bgtoolbelt.data.data.Thing

class GetBoardGameByIdUseCase {

    private val repository = APIRepository()

    suspend operator fun invoke(query:String):List<Thing>? = repository.getBoardGameById(query)

}