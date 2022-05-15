package com.kitam.bgapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\'\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ1\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\'\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/kitam/bgapp/data/APIClient;", "", "getBoardGameById", "Lretrofit2/Response;", "Lcom/kitam/bgapp/data/data/BoardGameDetail;", "id", "", "body", "Lcom/kitam/bgapp/data/data/RequestBoardGameDetail;", "(Ljava/lang/String;Lcom/kitam/bgapp/data/data/RequestBoardGameDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomGames", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotGames", "Lcom/kitam/bgapp/data/data/ResponseBoardGamesLists;", "getProductsInStoresByName", "Lcom/kitam/bgapp/data/data/Product;", "Lcom/kitam/bgapp/data/data/RequestProductsInStoresByName;", "(Ljava/lang/String;Lcom/kitam/bgapp/data/data/RequestProductsInStoresByName;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopGames", "app_debug"})
public abstract interface APIClient {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getHotGames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kitam.bgapp.data.data.ResponseBoardGamesLists>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getTopGames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.kitam.bgapp.data.data.BoardGame>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET()
    public abstract java.lang.Object getCustomGames(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.kitam.bgapp.data.data.BoardGame>>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST()
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getBoardGameById(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kitam.bgapp.data.data.RequestBoardGameDetail body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.kitam.bgapp.data.data.BoardGameDetail>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.POST()
    @retrofit2.http.Headers(value = {"Content-Type: application/json"})
    public abstract java.lang.Object getProductsInStoresByName(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Url()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    com.kitam.bgapp.data.data.RequestProductsInStoresByName body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.kitam.bgapp.data.data.Product>>> continuation);
}