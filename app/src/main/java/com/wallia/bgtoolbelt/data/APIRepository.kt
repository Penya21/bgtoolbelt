package com.wallia.bgtoolbelt.data

import com.wallia.bgtoolbelt.data.data.Root
import com.wallia.bgtoolbelt.data.data.Thing
import com.wallia.bgtoolbelt.model.BoardGameProvider

class APIRepository {

    private val api = APIService()

    suspend fun getHotGames(): List<Thing>? {
        val response = api.getHotGames();
        return if (response != null) {
            BoardGameProvider.boardGames = response.item!!
            response.item!!
        }else{
            emptyList()
        }

    }

    suspend fun getBoardGameById(query:String): List<Thing>? {
        val response = api.searchById(query);
        return if (response != null) {
            if(response.item.isNullOrEmpty()){
                emptyList()
            }else {
                response.item!!
            }
        }else{
            emptyList()
        }

    }



}