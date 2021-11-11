package com.wallia.bgtoolbelt.ui.home;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010(\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u001a\u00100\u001a\u0002012\u0006\u00102\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010/H\u0016J\u0006\u00103\u001a\u000201J\u0006\u00104\u001a\u000201R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0006\"\u0004\b\'\u0010$\u00a8\u00065"}, d2 = {"Lcom/wallia/bgtoolbelt/ui/home/HomeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "SCROLL_THRESHOLD_X", "", "getSCROLL_THRESHOLD_X", "()F", "SCROLL_THRESHOLD_Y", "getSCROLL_THRESHOLD_Y", "_binding", "Lcom/wallia/bgtoolbelt/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/wallia/bgtoolbelt/databinding/FragmentHomeBinding;", "boardGameViewModel", "Lcom/wallia/bgtoolbelt/model/BoardGameViewModel;", "getBoardGameViewModel", "()Lcom/wallia/bgtoolbelt/model/BoardGameViewModel;", "boardGameViewModel$delegate", "Lkotlin/Lazy;", "constraintSet1", "Landroidx/constraintlayout/widget/ConstraintSet;", "getConstraintSet1", "()Landroidx/constraintlayout/widget/ConstraintSet;", "constraintSet2", "getConstraintSet2", "homeViewModel", "Lcom/wallia/bgtoolbelt/ui/home/HomeViewModel;", "isDescriptionShowing", "", "()Z", "setDescriptionShowing", "(Z)V", "x", "getX", "setX", "(F)V", "y", "getY", "setY", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "", "view", "startTransition", "toggleDescription", "app_debug"})
public final class HomeFragment extends androidx.fragment.app.Fragment {
    private com.wallia.bgtoolbelt.ui.home.HomeViewModel homeViewModel;
    private final kotlin.Lazy boardGameViewModel$delegate = null;
    private com.wallia.bgtoolbelt.databinding.FragmentHomeBinding _binding;
    private final float SCROLL_THRESHOLD_X = 10.0F;
    private final float SCROLL_THRESHOLD_Y = 10.0F;
    private float x = 0.0F;
    private float y = 0.0F;
    private boolean isDescriptionShowing = false;
    @org.jetbrains.annotations.NotNull()
    private final androidx.constraintlayout.widget.ConstraintSet constraintSet1 = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.constraintlayout.widget.ConstraintSet constraintSet2 = null;
    
    private final com.wallia.bgtoolbelt.model.BoardGameViewModel getBoardGameViewModel() {
        return null;
    }
    
    private final com.wallia.bgtoolbelt.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    public final float getSCROLL_THRESHOLD_X() {
        return 0.0F;
    }
    
    public final float getSCROLL_THRESHOLD_Y() {
        return 0.0F;
    }
    
    public final float getX() {
        return 0.0F;
    }
    
    public final void setX(float p0) {
    }
    
    public final float getY() {
        return 0.0F;
    }
    
    public final void setY(float p0) {
    }
    
    public final boolean isDescriptionShowing() {
        return false;
    }
    
    public final void setDescriptionShowing(boolean p0) {
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
    
    public HomeFragment() {
        super();
    }
}