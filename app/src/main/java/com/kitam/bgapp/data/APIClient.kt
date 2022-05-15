package com.kitam.bgapp.data

import com.kitam.bgapp.data.data.*
import retrofit2.Response
import retrofit2.http.*

interface APIClient {


    @GET
    suspend fun getHotGames(@Url id:String):Response<ResponseBoardGamesLists>

    @GET
    suspend fun getTopGames(@Url id:String):Response<List<BoardGame>>

    @GET
    suspend fun getCustomGames(@Url id: String):Response<List<BoardGame>>

    @Headers("Content-Type: application/json")
    @POST
    suspend fun getBoardGameById(@Url id:String, @Body body: RequestBoardGameDetail): Response<BoardGameDetail>

    @Headers("Content-Type: application/json")
    @POST
    suspend fun getProductsInStoresByName(@Url id:String, @Body body: RequestProductsInStoresByName): Response<List<Product>>
}