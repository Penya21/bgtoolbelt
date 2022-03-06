package com.kitam.bgapp.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0006\u0010+\u001a\u00020)J\u0006\u0010,\u001a\u00020)R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001e\u001a\u00020\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019\u00a8\u0006-"}, d2 = {"Lcom/kitam/bgapp/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/kitam/bgapp/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/kitam/bgapp/databinding/FragmentHomeBinding;", "boardGameViewModel", "Lcom/kitam/bgapp/model/BoardGameViewModel;", "getBoardGameViewModel", "()Lcom/kitam/bgapp/model/BoardGameViewModel;", "boardGameViewModel$delegate", "Lkotlin/Lazy;", "constraintSet1", "Landroidx/constraintlayout/widget/ConstraintSet;", "getConstraintSet1", "()Landroidx/constraintlayout/widget/ConstraintSet;", "constraintSet2", "getConstraintSet2", "firstLoad", "", "getFirstLoad", "()Z", "setFirstLoad", "(Z)V", "homeViewModel", "Lcom/kitam/bgapp/ui/home/HomeViewModel;", "isDescriptionExpanded", "setDescriptionExpanded", "isDescriptionShowing", "setDescriptionShowing", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "startTransition", "toggleDescription", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.kitam.bgapp.ui.home.HomeViewModel homeViewModel;
    private final kotlin.Lazy boardGameViewModel$delegate = null;
    private com.kitam.bgapp.databinding.FragmentHomeBinding _binding;
    private boolean isDescriptionShowing = false;
    private boolean firstLoad = true;
    private boolean isDescriptionExpanded = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.constraintlayout.widget.ConstraintSet constraintSet1 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.constraintlayout.widget.ConstraintSet constraintSet2 = null;
    
    public HomeFragment() {
        super();
    }
    
    private final com.kitam.bgapp.model.BoardGameViewModel getBoardGameViewModel() {
        return null;
    }
    
    private final com.kitam.bgapp.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final boolean isDescriptionShowing() {
        return false;
    }
    
    public final void setDescriptionShowing(boolean p0) {
    }
    
    public final boolean getFirstLoad() {
        return false;
    }
    
    public final void setFirstLoad(boolean p0) {
    }
    
    public final boolean isDescriptionExpanded() {
        return false;
    }
    
    public final void setDescriptionExpanded(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintSet getConstraintSet1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.constraintlayout.widget.ConstraintSet getConstraintSet2() {
        return null;
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
    
    public final void startTransition() {
    }
    
    public final void toggleDescription() {
    }
}