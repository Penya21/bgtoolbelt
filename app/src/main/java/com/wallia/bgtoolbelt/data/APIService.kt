package com.wallia.bgtoolbelt.data

import android.util.Log
import com.wallia.bgtoolbelt.core.RetrofitHelper
import com.wallia.bgtoolbelt.data.data.Root
import com.wallia.bgtoolbelt.model.BoardGameModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class APIService {

    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getHotGames(): Root? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(APIClient::class.java).getHotGames("hot?type=boardgame")
            response.body() ?: null
        }
    }

    suspend fun searchById(query: String):Root? {
        return withContext(Dispatchers.IO) {
            val response = retrofit.create(APIClient::class.java).getBoardGameById("$query")
            response.body() ?: null
        }
    }
}