package com.kitam.bgapp.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\f2\u0006\u0010\b\u001a\u00020\tH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/kitam/bgapp/data/APIService;", "", "()V", "retrofitJson", "Lretrofit2/Retrofit;", "retrofitXML", "getBoardGameById", "Lcom/kitam/bgapp/data/data/BoardGameDetail;", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCustomGames", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getHotGames", "Lcom/kitam/bgapp/data/data/ResponseBoardGamesLists;", "getProductsInStoresByName", "Lcom/kitam/bgapp/data/data/Product;", "getTopGames", "app_debug"})
public final class APIService {
    private final retrofit2.Retrofit retrofitXML = null;
    private final retrofit2.Retrofit retrofitJson = null;
    
    public APIService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getHotGames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kitam.bgapp.data.data.ResponseBoardGamesLists> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTopGames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.kitam.bgapp.data.data.BoardGame>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCustomGames(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.kitam.bgapp.data.data.BoardGame>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBoardGameById(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.kitam.bgapp.data.data.BoardGameDetail> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getProductsInStoresByName(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.kitam.bgapp.data.data.Product>> continuation) {
        return null;
    }
}