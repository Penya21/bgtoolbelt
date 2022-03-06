package com.kitam.bgapp.domain

import com.kitam.bgapp.data.APIRepository
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.BoardGameDetail

class GetBoardGameByIdUseCase {

    private val repository = APIRepository()

    suspend operator fun invoke(query:String):BoardGameDetail? = repository.getBoardGameById(query)

}