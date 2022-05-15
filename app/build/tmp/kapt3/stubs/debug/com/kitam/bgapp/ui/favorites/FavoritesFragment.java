package com.kitam.bgapp.ui.favorites;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0015H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0018\u0010+\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J\u0018\u0010.\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010,\u001a\u00020-H\u0016J\u001a\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020$2\b\u0010)\u001a\u0004\u0018\u00010*H\u0016J\u0014\u00101\u001a\u00020!2\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u00063"}, d2 = {"Lcom/kitam/bgapp/ui/favorites/FavoritesFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kitam/bgapp/ui/favorites/FavRecyclerAdapter$Callback;", "()V", "_binding", "Lcom/kitam/bgapp/databinding/FragmentNotificationsBinding;", "binding", "getBinding", "()Lcom/kitam/bgapp/databinding/FragmentNotificationsBinding;", "boardGameViewModel", "Lcom/kitam/bgapp/model/BoardGameViewModel;", "getBoardGameViewModel", "()Lcom/kitam/bgapp/model/BoardGameViewModel;", "boardGameViewModel$delegate", "Lkotlin/Lazy;", "mAdapter", "Lcom/kitam/bgapp/ui/favorites/FavRecyclerAdapter;", "getMAdapter", "()Lcom/kitam/bgapp/ui/favorites/FavRecyclerAdapter;", "mList", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "getMList", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onBoardGameClicked", "", "boardGame", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFavBoardGameClicked", "position", "", "onShareBoardGameClicked", "onViewCreated", "view", "updateList", "list", "app_debug"})
public final class FavoritesFragment extends androidx.fragment.app.Fragment implements com.kitam.bgapp.ui.favorites.FavRecyclerAdapter.Callback {
    private final kotlin.Lazy boardGameViewModel$delegate = null;
    private com.kitam.bgapp.databinding.FragmentNotificationsBinding _binding;
    public androidx.recyclerview.widget.RecyclerView mRecyclerView;
    @org.jetbrains.annotations.NotNull()
    private final com.kitam.bgapp.ui.favorites.FavRecyclerAdapter mAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> mList;
    
    public FavoritesFragment() {
        super();
    }
    
    private final com.kitam.bgapp.model.BoardGameViewModel getBoardGameViewModel() {
        return null;
    }
    
    private final com.kitam.bgapp.databinding.FragmentNotificationsBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.recyclerview.widget.RecyclerView getMRecyclerView() {
        return null;
    }
    
    public final void setMRecyclerView(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.ui.favorites.FavRecyclerAdapter getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getMList() {
        return null;
    }
    
    public final void setMList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void updateList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> list) {
    }
    
    @java.lang.Override()
    public void onBoardGameClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame) {
    }
    
    @java.lang.Override()
    public void onFavBoardGameClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame, int position) {
    }
    
    @java.lang.Override()
    public void onShareBoardGameClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame, int position) {
    }
}