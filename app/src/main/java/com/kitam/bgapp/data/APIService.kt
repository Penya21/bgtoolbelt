package com.kitam.bgapp.data

import com.kitam.bgapp.core.RetrofitHelper
import com.kitam.bgapp.data.data.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class APIService {

    private val retrofitXML = RetrofitHelper.getRetrofitForXML()
    private val retrofitJson = RetrofitHelper.getRetrofitForJSON()

    suspend fun getHotGames(): ResponseBoardGamesLists? {
        return withContext(Dispatchers.IO) {
            val response = retrofitJson.create(APIClient::class.java).getHotGames("boardgame/hotness")
            response.body() ?: null
        }
    }

    suspend fun getTopGames(): List<BoardGame> {
        return withContext(Dispatchers.IO) {
            val response = retrofitJson.create(APIClient::class.java).getTopGames()
            response.body() ?: emptyList()
        }
    }


    suspend fun getBoardGameById(id: String): BoardGameDetail? {
        return withContext(Dispatchers.IO) {
            val response = retrofitJson.create(APIClient::class.java).getBoardGameById(
                RequestBoardGameDetail(id)
            )
            response.body() ?: null
        }
    }
}