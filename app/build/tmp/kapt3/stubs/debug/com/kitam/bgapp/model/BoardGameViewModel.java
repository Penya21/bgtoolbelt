package com.kitam.bgapp.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0011J\u000e\u0010Q\u001a\u00020O2\u0006\u0010R\u001a\u00020HJ\u0006\u0010S\u001a\u00020OJ\u000e\u0010T\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0011J\u000e\u0010U\u001a\u00020O2\u0006\u0010V\u001a\u00020HJ\u000e\u0010W\u001a\u00020O2\u0006\u0010P\u001a\u00020\u0011J\u0006\u0010X\u001a\u00020OJ\u0006\u0010Y\u001a\u00020OR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020#X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001a\u0010(\u001a\u00020)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001a\u0010.\u001a\u00020/X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u000205X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001d\u0010:\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u000eR\u001a\u0010<\u001a\u00020=X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010\u000eR\u0017\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u000eR\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00110\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010\u000eR\u0017\u0010G\u001a\b\u0012\u0004\u0012\u00020H0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010\u000eR\u001d\u0010J\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010\u000eR\u001d\u0010L\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010\u000e\u00a8\u0006Z"}, d2 = {"Lcom/kitam/bgapp/model/BoardGameViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "boardGameModel", "Lcom/kitam/bgapp/tools/SingleLiveEvent;", "Lcom/kitam/bgapp/data/data/BoardGameDetail;", "getBoardGameModel", "()Lcom/kitam/bgapp/tools/SingleLiveEvent;", "coroutineExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "currentUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/kitam/bgapp/data/data/User;", "getCurrentUser", "()Landroidx/lifecycle/MutableLiveData;", "favGamesList", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "getFavGamesList", "firstSetup", "", "getFirstSetup", "getBoardGameByIdUseCase", "Lcom/kitam/bgapp/domain/GetBoardGameByIdUseCase;", "getGetBoardGameByIdUseCase", "()Lcom/kitam/bgapp/domain/GetBoardGameByIdUseCase;", "setGetBoardGameByIdUseCase", "(Lcom/kitam/bgapp/domain/GetBoardGameByIdUseCase;)V", "getBoardGamesUseCase", "Lcom/kitam/bgapp/domain/GetBoardGamesUseCase;", "getGetBoardGamesUseCase", "()Lcom/kitam/bgapp/domain/GetBoardGamesUseCase;", "setGetBoardGamesUseCase", "(Lcom/kitam/bgapp/domain/GetBoardGamesUseCase;)V", "getDatabaseBoardGamesUseCase", "Lcom/kitam/bgapp/domain/GetDatabaseBoardGamesUseCase;", "getGetDatabaseBoardGamesUseCase", "()Lcom/kitam/bgapp/domain/GetDatabaseBoardGamesUseCase;", "setGetDatabaseBoardGamesUseCase", "(Lcom/kitam/bgapp/domain/GetDatabaseBoardGamesUseCase;)V", "getDatabaseFavGamesByUser", "Lcom/kitam/bgapp/domain/GetDatabaseFavGamesByUserCase;", "getGetDatabaseFavGamesByUser", "()Lcom/kitam/bgapp/domain/GetDatabaseFavGamesByUserCase;", "setGetDatabaseFavGamesByUser", "(Lcom/kitam/bgapp/domain/GetDatabaseFavGamesByUserCase;)V", "getRandomBoardGameUseCase", "Lcom/kitam/bgapp/domain/GetRandomBoardGameUseCase;", "getGetRandomBoardGameUseCase", "()Lcom/kitam/bgapp/domain/GetRandomBoardGameUseCase;", "setGetRandomBoardGameUseCase", "(Lcom/kitam/bgapp/domain/GetRandomBoardGameUseCase;)V", "getTopBoardGamesUseCase", "Lcom/kitam/bgapp/domain/GetTopBoardGamesUseCase;", "getGetTopBoardGamesUseCase", "()Lcom/kitam/bgapp/domain/GetTopBoardGamesUseCase;", "setGetTopBoardGamesUseCase", "(Lcom/kitam/bgapp/domain/GetTopBoardGamesUseCase;)V", "hotGamesList", "getHotGamesList", "insertFavGameUseCase", "Lcom/kitam/bgapp/domain/InsertFavGameUseCase;", "getInsertFavGameUseCase", "()Lcom/kitam/bgapp/domain/InsertFavGameUseCase;", "setInsertFavGameUseCase", "(Lcom/kitam/bgapp/domain/InsertFavGameUseCase;)V", "isLoading", "needsSessionRefresh", "getNeedsSessionRefresh", "selectedBoardGame", "getSelectedBoardGame", "toastText", "", "getToastText", "topGamesList", "getTopGamesList", "upcomingGamesList", "getUpcomingGamesList", "addFavorite", "", "boardGame", "boardGameDescription", "id", "onCreate", "removeFavorite", "updateFavoriteGamesByUser", "email", "updateHotListByItem", "updateHotUpcomingList", "updateTopList", "app_debug"})
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
    private com.kitam.bgapp.domain.GetDatabaseFavGamesByUserCase getDatabaseFavGamesByUser;
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.domain.InsertFavGameUseCase insertFavGameUseCase;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> hotGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> topGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> upcomingGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> favGamesList = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kitam.bgapp.tools.SingleLiveEvent<com.kitam.bgapp.data.data.BoardGameDetail> boardGameModel = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> firstSetup = null;
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
    public final com.kitam.bgapp.domain.GetDatabaseFavGamesByUserCase getGetDatabaseFavGamesByUser() {
        return null;
    }
    
    public final void setGetDatabaseFavGamesByUser(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.GetDatabaseFavGamesByUserCase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.domain.InsertFavGameUseCase getInsertFavGameUseCase() {
        return null;
    }
    
    public final void setInsertFavGameUseCase(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.domain.InsertFavGameUseCase p0) {
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
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.kitam.bgapp.data.data.BoardGame>> getFavGamesList() {
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
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getFirstSetup() {
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
    
    public final void addFavorite(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame) {
    }
    
    public final void removeFavorite(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame) {
    }
    
    public final void updateFavoriteGamesByUser(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
}