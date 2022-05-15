package com.kitam.bgapp.ui.stores;

import java.lang.System;

/**
 * A fragment representing a list of Items.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001?B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0016J&\u00101\u001a\u0004\u0018\u0001022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0018\u00107\u001a\u00020.2\u0006\u00108\u001a\u00020*2\u0006\u00109\u001a\u00020\u0016H\u0016J\u0010\u0010:\u001a\u00020.2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0010\u0010;\u001a\u00020.2\u0006\u00108\u001a\u00020*H\u0016J\u001a\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u0002022\b\u0010/\u001a\u0004\u0018\u000100H\u0016J\u0010\u0010>\u001a\u00020.2\u0006\u00108\u001a\u00020*H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\"\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'R \u0010(\u001a\b\u0012\u0004\u0012\u00020*0)X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010%\"\u0004\b,\u0010\'\u00a8\u0006@"}, d2 = {"Lcom/kitam/bgapp/ui/stores/StoresDirectoryFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$Callback;", "()V", "_binding", "Lcom/kitam/bgapp/databinding/FragmentSearchListBinding;", "binding", "getBinding", "()Lcom/kitam/bgapp/databinding/FragmentSearchListBinding;", "boardGameViewModel", "Lcom/kitam/bgapp/model/BoardGameViewModel;", "getBoardGameViewModel", "()Lcom/kitam/bgapp/model/BoardGameViewModel;", "boardGameViewModel$delegate", "Lkotlin/Lazy;", "callback", "getCallback", "()Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$Callback;", "setCallback", "(Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$Callback;)V", "columnCount", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "getGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setGoogleMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "mAdapter", "Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter;", "getMAdapter", "()Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter;", "markers", "", "Lcom/google/android/gms/maps/model/Marker;", "getMarkers", "()Ljava/util/List;", "setMarkers", "(Ljava/util/List;)V", "stores", "", "Lcom/kitam/bgapp/data/data/Store;", "getStores", "setStores", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onFavStoreClicked", "store", "position", "onMapReady", "onStoreClicked", "onViewCreated", "view", "onWebsiteClicked", "Companion", "app_release"})
public final class StoresDirectoryFragment extends androidx.fragment.app.Fragment implements com.google.android.gms.maps.OnMapReadyCallback, com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback {
    private int columnCount = 2;
    private com.kitam.bgapp.databinding.FragmentSearchListBinding _binding;
    private final kotlin.Lazy boardGameViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter mAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback callback;
    public com.google.android.gms.maps.GoogleMap googleMap;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.Store> stores;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.google.android.gms.maps.model.Marker> markers;
    @org.jetbrains.annotations.NotNull()
    public static final com.kitam.bgapp.ui.stores.StoresDirectoryFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_COLUMN_COUNT = "column-count";
    
    public StoresDirectoryFragment() {
        super();
    }
    
    private final com.kitam.bgapp.model.BoardGameViewModel getBoardGameViewModel() {
        return null;
    }
    
    private final com.kitam.bgapp.databinding.FragmentSearchListBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter getMAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getGoogleMap() {
        return null;
    }
    
    public final void setGoogleMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kitam.bgapp.data.data.Store> getStores() {
        return null;
    }
    
    public final void setStores(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.Store> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.google.android.gms.maps.model.Marker> getMarkers() {
        return null;
    }
    
    public final void setMarkers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.google.android.gms.maps.model.Marker> p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.kitam.bgapp.ui.stores.StoresDirectoryFragment newInstance(int columnCount) {
        return null;
    }
    
    @java.lang.Override()
    public void onMapReady(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap googleMap) {
    }
    
    @java.lang.Override()
    public void onStoreClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.Store store) {
    }
    
    @java.lang.Override()
    public void onFavStoreClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.Store store, int position) {
    }
    
    @java.lang.Override()
    public void onWebsiteClicked(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.Store store) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kitam/bgapp/ui/stores/StoresDirectoryFragment$Companion;", "", "()V", "ARG_COLUMN_COUNT", "", "newInstance", "Lcom/kitam/bgapp/ui/stores/StoresDirectoryFragment;", "columnCount", "", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.kitam.bgapp.ui.stores.StoresDirectoryFragment newInstance(int columnCount) {
            return null;
        }
    }
}