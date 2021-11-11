package com.wallia.bgtoolbelt.data

import com.wallia.bgtoolbelt.data.data.Root
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface APIClient {

    @GET
    suspend fun getBoardGameById(@Url id:String): Response<Root>

    @GET
    suspend fun getHotGames(@Url id:String):Response<Root>

}