package com.kitam.bgapp.data

import com.kitam.bgapp.data.data.ResponseBoardGamesLists
import com.kitam.bgapp.data.data.BoardGame
import com.kitam.bgapp.data.data.BoardGameDetail
import com.kitam.bgapp.data.data.Product
import com.kitam.bgapp.model.BoardGameProvider
import com.kitam.bgapp.tools.isNull

class APIRepository {

    private val api = APIService()

    suspend fun getHotGames(): ResponseBoardGamesLists? {
        val response = api.getHotGames();
        return if (response != null) {

            BoardGameProvider.upcomingGames = response.comingsoon!!
            BoardGameProvider.hotGames = response.hotness!!

            response
        }else{
            BoardGameProvider.upcomingGames = emptyList()
            BoardGameProvider.hotGames = emptyList()

            ResponseBoardGamesLists(emptyList(), emptyList())
        }

    }

    suspend fun getBoardGameById(query:String): BoardGameDetail? {
        val response = api.getBoardGameById(query);
        return if (response != null) {
            if(response.isNull()){
                null
            }else {
                response
            }
        }else{
            null
        }

    }

    suspend fun getProductsInStoreByName(query:String): List<Product> {
        val response = api.getProductsInStoresByName(query);
        return if (response != null) {
            if(response.isNull()){
                emptyList()
            }else {
                response
            }
        }else{
            emptyList()
        }

    }

    suspend fun getTopGames(): List<BoardGame>{
        val response = api.getTopGames();
        return if (response != null) {
            if(response.isNullOrEmpty()){
                emptyList()
            }else {
                response
            }
        }else{
            emptyList()
        }
    }


    suspend fun getCustomGames(): List<BoardGame>{
        val response = api.getCustomGames();
        return if (response != null) {
            if(response.isNullOrEmpty()){
                emptyList()
            }else {
                response
            }
        }else{
            emptyList()
        }
    }

}