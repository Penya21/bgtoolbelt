package com.wallia.bgtoolbelt.model

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.wallia.bgtoolbelt.data.data.Thing
import com.wallia.bgtoolbelt.domain.GetBoardGameByIdUseCase
import com.wallia.bgtoolbelt.domain.GetBoardGamesUseCase
import com.wallia.bgtoolbelt.domain.GetRandomBoardGameUseCase
import kotlinx.coroutines.launch

class BoardGameViewModel : ViewModel() {
    var getBoardGamesUseCase = GetBoardGamesUseCase()
    var getRandomBoardGameUseCase = GetRandomBoardGameUseCase()
    var getBoardGameByIdUseCase = GetBoardGameByIdUseCase()
    val boardGameModel = MutableLiveData<Thing>()
    val isLoading = MutableLiveData<Boolean>()

    fun onCreate() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val result = getBoardGamesUseCase()
            if(!result.isNullOrEmpty()){
                boardGameModel.postValue(result[0])
                val fullBoardGame = getBoardGameByIdUseCase("thing?id=" + result[0].id)
                if (!fullBoardGame.isNullOrEmpty()) {
                    boardGameModel.postValue(fullBoardGame[0])
                }
                isLoading.postValue(false)


            }
        }
    }

    fun randomQuote() {
        isLoading.postValue(true)
        val boardGame = getRandomBoardGameUseCase()
        if(boardGame!=null){
            boardGameModel.postValue(boardGame!!)
            viewModelScope.launch {
                val fullBoardGame = getBoardGameByIdUseCase("thing?id=" + boardGame.id)
                if (!fullBoardGame.isNullOrEmpty()) {
                    boardGameModel.postValue(fullBoardGame[0])
                }
            }

        }
        isLoading.postValue(false)
    }
}