package com.kitam.bgapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u000208J\u0006\u0010A\u001a\u00020?J\u000e\u0010B\u001a\u00020?2\u0006\u0010C\u001a\u00020/J\u0006\u0010D\u001a\u00020?J\u0006\u0010E\u001a\u00020?R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u001d\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u000eR\u0017\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010\u000eR\u0017\u00103\u001a\b\u0012\u0004\u0012\u0002020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010\u000eR\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020/0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010\u000eR\u0017\u00107\u001a\b\u0012\u0004\u0012\u0002080\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010\u000eR\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000eR\u001d\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020/0.0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u000e\u00a8\u0006F"}, d2 = {"Lcom/kitam/bgapp/model/BoardGameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "boardGameModel", "Lcom/kitam/bgapp/tools/SingleLiveEvent;", "Lcom/kitam/bgapp/data/data/BoardGameDetail;", "getBoardGameModel", "()Lcom/kitam/bgapp/tools/SingleLiveEvent;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "currentUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kitam/bgapp/data/data/User;", "getCurrentUser", "()Landroidx/lifecycle/MutableLiveData;", "getBoardGameByIdUseCase", "Lcom/kitam/bgapp/domain/GetBoardGameByIdUseCase;", "getGetBoardGameByIdUseCase", "()Lcom/kitam/bgapp/domain/GetBoardGameByIdUseCase;", "setGetBoardGameByIdUseCase", "(Lcom/kitam/bgapp/domain/GetBoardGameByIdUseCase;)V", "getBoardGamesUseCase", "Lcom/kitam/bgapp/domain/GetBoardGamesUseCase;", "getGetBoardGamesUseCase", "()Lcom/kitam/bgapp/domain/GetBoardGamesUseCase;", "setGetBoardGamesUseCase", "(Lcom/kitam/bgapp/domain/GetBoardGamesUseCase;)V", "getDatabaseBoardGamesUseCase", "Lcom/kitam/bgapp/domain/GetDatabaseBoardGamesUseCase;", "getGetDatabaseBoardGamesUseCase", "()Lcom/kitam/bgapp/domain/GetDatabaseBoardGamesUseCase;", "setGetDatabaseBoardGamesUseCase", "(Lcom/kitam/bgapp/domain/GetDatabaseBoardGamesUseCase;)V", "getRandomBoardGameUseCase", "Lcom/kitam/bgapp/domain/GetRandomBoardGameUseCase;", "getGetRandomBoardGameUseCase", "()Lcom/kitam/bgapp/domain/GetRandomBoardGameUseCase;", "setGetRandomBoardGameUseCase", "(Lcom/kitam/bgapp/domain/GetRandomBoardGameUseCase;)V", "getTopBoardGamesUseCase", "Lcom/kitam/bgapp/domain/GetTopBoardGamesUseCase;", "getGetTopBoardGamesUseCase", "()Lcom/kitam/bgapp/domain/GetTopBoardGamesUseCase;", "setGetTopBoardGamesUseCase", "(Lcom/kitam/bgapp/domain/GetTopBoardGamesUseCase;)V", "hotGamesList", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "getHotGamesList", "isLoading", "", "needsSessionRefresh", "getNeedsSessionRefresh", "selectedBoardGame", "getSelectedBoardGame", "toastText", "", "getToastText", "topGamesList", "getTopGamesList", "upcomingGamesList", "getUpcomingGamesList", "boardGameDescription", "", "id", "onCreate", "updateHotListByItem", "boardGame", "updateHotUpcomingList", "updateTopList", "app_release"})
public final class BoardGameViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.domain.GetBoardGamesUseCase getBoardGamesUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.domain.GetTopBoardGamesUseCase getTopBoardGamesUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.domain.GetRandomBoardGameUseCase getRandomBoardGameUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.domain.GetBoardGameByIdUseCase getBoardGameByIdUseCase;
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.domain.GetDatabaseBoardGamesUseCase getDatabaseBoardGamesUseCase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> hotGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> topGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> upcomingGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kitam.bgapp.tools.SingleLiveEvent<com.kitam.bgapp.data.data.BoardGameDetail> boardGameModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> needsSessionRefresh = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.kitam.bgapp.data.data.User> currentUser = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.kitam.bgapp.data.data.BoardGame> selectedBoardGame = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.String> toastText = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler coroutineExceptionHandler = null;
    
    public BoardGameViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.domain.GetBoardGamesUseCase getGetBoardGamesUseCase() {
        return null;
    }
    
    public final void setGetBoardGamesUseCase(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.GetBoardGamesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.domain.GetTopBoardGamesUseCase getGetTopBoardGamesUseCase() {
        return null;
    }
    
    public final void setGetTopBoardGamesUseCase(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.GetTopBoardGamesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.domain.GetRandomBoardGameUseCase getGetRandomBoardGameUseCase() {
        return null;
    }
    
    public final void setGetRandomBoardGameUseCase(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.GetRandomBoardGameUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.domain.GetBoardGameByIdUseCase getGetBoardGameByIdUseCase() {
        return null;
    }
    
    public final void setGetBoardGameByIdUseCase(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.GetBoardGameByIdUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.domain.GetDatabaseBoardGamesUseCase getGetDatabaseBoardGamesUseCase() {
        return null;
    }
    
    public final void setGetDatabaseBoardGamesUseCase(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.GetDatabaseBoardGamesUseCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> getHotGamesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> getTopGamesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> getUpcomingGamesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.tools.SingleLiveEvent<com.kitam.bgapp.data.data.BoardGameDetail> getBoardGameModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getNeedsSessionRefresh() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kitam.bgapp.data.data.User> getCurrentUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.kitam.bgapp.data.data.BoardGame> getSelectedBoardGame() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getToastText() {
        return null;
    }
    
    public final void onCreate() {
    }
    
    public final void updateHotUpcomingList() {
    }
    
    public final void updateTopList() {
    }
    
    public final void updateHotListByItem(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame) {
    }
    
    public final void boardGameDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
}