package com.kitam.bgapp.ui.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002./B\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u001f\u001a\u00020 2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\fJ\b\u0010\"\u001a\u00020\u0014H\u0016J\u0018\u0010#\u001a\u00020 2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u0014H\u0016J\u0018\u0010&\u001a\u00020\u00022\u0006\u0010\'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0014H\u0016J\u000e\u0010*\u001a\u00020 2\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020\fJ\u0014\u0010,\u001a\u00020 2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u00060"}, d2 = {"Lcom/kitam/bgapp/ui/notifications/FavRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kitam/bgapp/ui/notifications/FavRecyclerAdapter$ViewHolder;", "()V", "boardGames", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "getBoardGames", "()Ljava/util/List;", "setBoardGames", "(Ljava/util/List;)V", "callback", "Lcom/kitam/bgapp/ui/notifications/FavRecyclerAdapter$Callback;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "layoutId", "", "getLayoutId", "()I", "setLayoutId", "(I)V", "showYear", "", "getShowYear", "()Z", "setShowYear", "(Z)V", "FavRecyclerAdapter", "", "listener", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setLayoutResourceId", "setListener", "update", "modelList", "Callback", "ViewHolder", "app_debug"})
public final class FavRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> boardGames;
    public android.content.Context context;
    private int layoutId = com.kitam.bgapp.R.layout.item_favorite;
    private com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.Callback callback;
    private boolean showYear = false;
    
    public FavRecyclerAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getBoardGames() {
        return null;
    }
    
    public final void setBoardGames(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final int getLayoutId() {
        return 0;
    }
    
    public final void setLayoutId(int p0) {
    }
    
    public final boolean getShowYear() {
        return false;
    }
    
    public final void setShowYear(boolean p0) {
    }
    
    public final void FavRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> boardGames, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.Callback listener) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.Callback listener) {
    }
    
    public final void setLayoutResourceId(int layoutId) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> modelList) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/kitam/bgapp/ui/notifications/FavRecyclerAdapter$Callback;", "", "onBoardGameClicked", "", "boardGame", "Lcom/kitam/bgapp/data/data/BoardGame;", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onBoardGameClicked(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.BoardGame boardGame);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/kitam/bgapp/ui/notifications/FavRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "boardGameName", "Landroid/widget/TextView;", "getBoardGameName", "()Landroid/widget/TextView;", "bind", "", "boardGame", "Lcom/kitam/bgapp/data/data/BoardGame;", "position", "", "context", "Landroid/content/Context;", "callback", "Lcom/kitam/bgapp/ui/notifications/FavRecyclerAdapter$Callback;", "app_debug"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView boardGameName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView avatar = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBoardGameName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getAvatar() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.BoardGame boardGame, int position, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.kitam.bgapp.ui.notifications.FavRecyclerAdapter.Callback callback) {
        }
    }
}