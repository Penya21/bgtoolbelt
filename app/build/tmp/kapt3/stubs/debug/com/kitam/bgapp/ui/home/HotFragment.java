package com.kitam.bgapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0016J&\u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\b\u00100\u001a\u0004\u0018\u000101H\u0016J \u00102\u001a\u00020\'2\u0006\u0010(\u001a\u00020)2\u0006\u00103\u001a\u00020\u00172\u0006\u00104\u001a\u00020\u0012H\u0016J\b\u00105\u001a\u00020\'H\u0016J\u001a\u00106\u001a\u00020\'2\u0006\u00107\u001a\u00020+2\b\u00100\u001a\u0004\u0018\u000101H\u0016J$\u00108\u001a\u00020\'2\f\u00109\u001a\b\u0012\u0004\u0012\u00020)0:2\u0006\u0010;\u001a\u00020\u00122\u0006\u0010<\u001a\u00020\u0012J\b\u0010=\u001a\u00020\'H\u0002J\b\u0010>\u001a\u00020\'H\u0002J\u000e\u0010?\u001a\u00020\'2\u0006\u00103\u001a\u00020\u0017R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u001d\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020!X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%\u00a8\u0006@"}, d2 = {"Lcom/kitam/bgapp/ui/home/HotFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter$Callback;", "()V", "_binding", "Lcom/kitam/bgapp/databinding/FragmentHotBinding;", "binding", "getBinding", "()Lcom/kitam/bgapp/databinding/FragmentHotBinding;", "boardGameViewModel", "Lcom/kitam/bgapp/model/BoardGameViewModel;", "getBoardGameViewModel", "()Lcom/kitam/bgapp/model/BoardGameViewModel;", "boardGameViewModel$delegate", "Lkotlin/Lazy;", "homeViewModel", "Lcom/kitam/bgapp/ui/home/HomeViewModel;", "isGrid", "", "()Z", "setGrid", "(Z)V", "lastFavoritedPosition", "", "getLastFavoritedPosition", "()I", "setLastFavoritedPosition", "(I)V", "mAdapter", "Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter;", "getMAdapter", "()Lcom/kitam/bgapp/ui/home/HotRecyclerAdapter;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "onBoardGameClicked", "", "boardGame", "Lcom/kitam/bgapp/data/data/BoardGame;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onFavBoardGameClicked", "position", "isFavorite", "onResume", "onViewCreated", "view", "setUpRecyclerView", "mList", "", "showYear", "showRank", "showGrid", "showList", "switchList", "app_debug"})
public final class HotFragment extends androidx.fragment.app.Fragment implements com.kitam.bgapp.ui.home.HotRecyclerAdapter.Callback {
    private com.kitam.bgapp.ui.home.HomeViewModel homeViewModel;
    private final kotlin.Lazy boardGameViewModel$delegate = null;
    private com.kitam.bgapp.databinding.FragmentHotBinding _binding;
    public androidx.recyclerview.widget.RecyclerView mRecyclerView;
    @org.jetbrains.annotations.NotNull()
    private final com.kitam.bgapp.ui.home.HotRecyclerAdapter mAdapter = null;
    private boolean isGrid = true;
    private int lastFavoritedPosition = 0;
    
    public HotFragment() {
        super();
    }
    
    private final com.kitam.bgapp.model.BoardGameViewModel getBoardGameViewModel() {
        return null;
    }
    
    private final com.kitam.bgapp.databinding.FragmentHotBinding getBinding() {
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
    public final com.kitam.bgapp.ui.home.HotRecyclerAdapter getMAdapter() {
        return null;
    }
    
    public final boolean isGrid() {
        return false;
    }
    
    public final void setGrid(boolean p0) {
    }
    
    public final int getLastFavoritedPosition() {
        return 0;
    }
    
    public final void setLastFavoritedPosition(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    public final void switchList(int position) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    public final void setUpRecyclerView(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> mList, boolean showYear, boolean showRank) {
    }
    
    private final void showList() {
    }
    
    private final void showGrid() {
    }
    
    @java.lang.Override()
    public void onBoardGameClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame) {
    }
    
    @java.lang.Override()
    public void onFavBoardGameClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.BoardGame boardGame, int position, boolean isFavorite) {
    }
}