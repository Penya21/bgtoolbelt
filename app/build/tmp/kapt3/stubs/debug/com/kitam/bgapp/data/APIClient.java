package com.kitam.bgapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/kitam/bgapp/data/APIClient;", "", "getBoardGameById", "Lretrofit2/Response;", "Lcom/kitam/bgapp/data/data/BoardGameDetail;", "body", "Lcom/kitam/bgapp/data/data/RequestBoardGameDetail;", "(Lcom/kitam/bgapp/data/data/RequestBoardGameDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotGames", "Lcom/kitam/bgapp/data/data/ResponseBoardGamesLists;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopGames", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface APIClient {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getHotGames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kitam.bgapp.data.data.ResponseBoardGamesLists>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "https://upiefiw3p4.execute-api.us-east-2.amazonaws.com/api/boardgame/top")
    public abstract java.lang.Object getTopGames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.kitam.bgapp.data.data.BoardGame>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST(value = "https://2gkrwf3vg9.execute-api.us-east-2.amazonaws.com/api/game-detail")
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getBoardGameById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kitam.bgapp.data.data.RequestBoardGameDetail body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kitam.bgapp.data.data.BoardGameDetail>> continuation);
}