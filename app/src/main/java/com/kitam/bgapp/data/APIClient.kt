package com.kitam.bgapp.data

import com.kitam.bgapp.data.data.*
import retrofit2.Response
import retrofit2.http.*

interface APIClient {


    @GET
    suspend fun getHotGames(@Url id:String):Response<ResponseBoardGamesLists>

    @GET("https://upiefiw3p4.execute-api.us-east-2.amazonaws.com/api/boardgame/top")
    suspend fun getTopGames():Response<List<BoardGame>>


    @Headers("Content-Type: application/json")
    @POST("https://2gkrwf3vg9.execute-api.us-east-2.amazonaws.com/api/game-detail")
    suspend fun getBoardGameById(@Body body: RequestBoardGameDetail): Response<BoardGameDetail>

}