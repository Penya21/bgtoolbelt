package com.wallia.bgtoolbelt.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0007\u00a8\u0006\u001f"}, d2 = {"Lcom/wallia/bgtoolbelt/model/BoardGameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "boardGameModel", "Landroidx/lifecycle/MutableLiveData;", "Lcom/wallia/bgtoolbelt/data/data/Thing;", "getBoardGameModel", "()Landroidx/lifecycle/MutableLiveData;", "getBoardGameByIdUseCase", "Lcom/wallia/bgtoolbelt/domain/GetBoardGameByIdUseCase;", "getGetBoardGameByIdUseCase", "()Lcom/wallia/bgtoolbelt/domain/GetBoardGameByIdUseCase;", "setGetBoardGameByIdUseCase", "(Lcom/wallia/bgtoolbelt/domain/GetBoardGameByIdUseCase;)V", "getBoardGamesUseCase", "Lcom/wallia/bgtoolbelt/domain/GetBoardGamesUseCase;", "getGetBoardGamesUseCase", "()Lcom/wallia/bgtoolbelt/domain/GetBoardGamesUseCase;", "setGetBoardGamesUseCase", "(Lcom/wallia/bgtoolbelt/domain/GetBoardGamesUseCase;)V", "getRandomBoardGameUseCase", "Lcom/wallia/bgtoolbelt/domain/GetRandomBoardGameUseCase;", "getGetRandomBoardGameUseCase", "()Lcom/wallia/bgtoolbelt/domain/GetRandomBoardGameUseCase;", "setGetRandomBoardGameUseCase", "(Lcom/wallia/bgtoolbelt/domain/GetRandomBoardGameUseCase;)V", "isLoading", "", "onCreate", "", "randomQuote", "app_debug"})
public final class BoardGameViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.wallia.bgtoolbelt.domain.GetBoardGamesUseCase getBoardGamesUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.wallia.bgtoolbelt.domain.GetRandomBoardGameUseCase getRandomBoardGameUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.wallia.bgtoolbelt.domain.GetBoardGameByIdUseCase getBoardGameByIdUseCase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.wallia.bgtoolbelt.data.data.Thing> boardGameModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.wallia.bgtoolbelt.domain.GetBoardGamesUseCase getGetBoardGamesUseCase() {
        return null;
    }
    
    public final void setGetBoardGamesUseCase(@org.jetbrains.annotations.NotNull()
    com.wallia.bgtoolbelt.domain.GetBoardGamesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wallia.bgtoolbelt.domain.GetRandomBoardGameUseCase getGetRandomBoardGameUseCase() {
        return null;
    }
    
    public final void setGetRandomBoardGameUseCase(@org.jetbrains.annotations.NotNull()
    com.wallia.bgtoolbelt.domain.GetRandomBoardGameUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.wallia.bgtoolbelt.domain.GetBoardGameByIdUseCase getGetBoardGameByIdUseCase() {
        return null;
    }
    
    public final void setGetBoardGameByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.wallia.bgtoolbelt.domain.GetBoardGameByIdUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.wallia.bgtoolbelt.data.data.Thing> getBoardGameModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    public final void randomQuote() {
    }
    
    public BoardGameViewModel() {
        super();
    }
}