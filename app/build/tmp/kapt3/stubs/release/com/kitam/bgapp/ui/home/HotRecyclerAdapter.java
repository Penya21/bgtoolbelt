package com.kitam.bgapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002/0B\u0005\u00a2\u0006\u0002\u0010\u0003J2\u0010\"\u001a\u00020#2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\fJ\b\u0010%\u001a\u00020\u0017H\u0016J\u0018\u0010&\u001a\u00020#2\u0006\u0010\'\u001a\u00020\u00022\u0006\u0010(\u001a\u00020\u0017H\u0016J\u0018\u0010)\u001a\u00020\u00022\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0017H\u0016J\u000e\u0010-\u001a\u00020#2\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010.\u001a\u00020#2\u0006\u0010$\u001a\u00020\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\b\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!\u00a8\u00061"}, d2 = {"Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter$ViewHolder;", "()V", "boardGames", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "getBoardGames", "()Ljava/util/List;", "setBoardGames", "(Ljava/util/List;)V", "callback", "Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter$Callback;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "favGames", "getFavGames", "setFavGames", "layoutId", "", "getLayoutId", "()I", "setLayoutId", "(I)V", "showYear", "", "getShowYear", "()Z", "setShowYear", "(Z)V", "HotRecyclerAdapter", "", "listener", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setLayoutResourceId", "setListener", "Callback", "ViewHolder", "app_release"})
public final class HotRecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kitam.bgapp.ui.home.HotRecyclerAdapter.ViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> boardGames;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> favGames;
    public android.content.Context context;
    private int layoutId = com.kitam.bgapp.R.layout.item_hot_grid;
    private com.kitam.bgapp.ui.home.HotRecyclerAdapter.Callback callback;
    private boolean showYear = false;
    
    public HotRecyclerAdapter() {
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
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getFavGames() {
        return null;
    }
    
    public final void setFavGames(@org.jetbrains.annotations.NotNull()
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
    
    public final void HotRecyclerAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> boardGames, @org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> favGames, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.home.HotRecyclerAdapter.Callback listener) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.home.HotRecyclerAdapter.Callback listener) {
    }
    
    public final void setLayoutResourceId(int layoutId) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.home.HotRecyclerAdapter.ViewHolder holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kitam.bgapp.ui.home.HotRecyclerAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&\u00a8\u0006\u000b"}, d2 = {"Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter$Callback;", "", "onBoardGameClicked", "", "boardGame", "Lcom/kitam/bgapp/data/data/BoardGame;", "onFavBoardGameClicked", "position", "", "isFavorite", "", "app_release"})
    public static abstract interface Callback {
        
        public abstract void onBoardGameClicked(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.BoardGame boardGame);
        
        public abstract void onFavBoardGameClicked(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.BoardGame boardGame, int position, boolean isFavorite);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J8\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\bR\u0011\u0010\u000f\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\u0011\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\f\u00a8\u0006\""}, d2 = {"Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Landroid/view/View;)V", "avatar", "Landroid/widget/ImageView;", "getAvatar", "()Landroid/widget/ImageView;", "boardGameName", "Landroid/widget/TextView;", "getBoardGameName", "()Landroid/widget/TextView;", "favButton", "getFavButton", "rank", "getRank", "subtitle", "getSubtitle", "year", "getYear", "bind", "", "boardGame", "Lcom/kitam/bgapp/data/data/BoardGame;", "position", "", "context", "Landroid/content/Context;", "callback", "Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter$Callback;", "showYear", "", "isFavorite", "app_release"})
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView boardGameName = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView subtitle = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView year = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView rank = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView avatar = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView favButton = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getBoardGameName() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getSubtitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getYear() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getRank() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getAvatar() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getFavButton() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.BoardGame boardGame, int position, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.Nullable()
        com.kitam.bgapp.ui.home.HotRecyclerAdapter.Callback callback, boolean showYear, boolean isFavorite) {
        }
    }
}