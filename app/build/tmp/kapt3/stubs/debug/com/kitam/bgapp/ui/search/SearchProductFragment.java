package com.kitam.bgapp.ui.search;

import java.lang.System;

/**
 * A fragment representing a list of Items.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001QB\u0005\u00a2\u0006\u0002\u0010\u0004J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u0001092\b\u0010:\u001a\u0004\u0018\u00010;H\u0016J\b\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u00020&H\u0016J\u0010\u0010@\u001a\u00020=2\u0006\u0010?\u001a\u00020&H\u0016J\u0010\u0010A\u001a\u00020=2\u0006\u0010?\u001a\u00020&H\u0016J0\u0010B\u001a\u00020=2\f\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u0001052\u0006\u0010F\u001a\u00020\u00112\u0006\u0010G\u001a\u00020HH\u0016J\u0016\u0010I\u001a\u00020=2\f\u0010C\u001a\b\u0012\u0002\b\u0003\u0018\u00010DH\u0016J\b\u0010J\u001a\u00020=H\u0016J\u000e\u0010K\u001a\u00020=2\u0006\u0010E\u001a\u000205J\u000e\u0010L\u001a\u00020=2\u0006\u0010M\u001a\u00020\u0014J\u000e\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020\u001aJ\u000e\u0010P\u001a\u00020=2\u0006\u0010O\u001a\u00020\u001aR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u001fX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018\u00a8\u0006R"}, d2 = {"Lcom/kitam/bgapp/ui/search/SearchProductFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter$Callback;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "_binding", "Lcom/kitam/bgapp/databinding/FragmentProductListBinding;", "binding", "getBinding", "()Lcom/kitam/bgapp/databinding/FragmentProductListBinding;", "boardGameViewModel", "Lcom/kitam/bgapp/model/BoardGameViewModel;", "getBoardGameViewModel", "()Lcom/kitam/bgapp/model/BoardGameViewModel;", "boardGameViewModel$delegate", "Lkotlin/Lazy;", "columnCount", "", "filterList", "Ljava/util/ArrayList;", "", "getFilterList", "()Ljava/util/ArrayList;", "setFilterList", "(Ljava/util/ArrayList;)V", "isSearchBarModified", "", "()Z", "setSearchBarModified", "(Z)V", "mAdapter", "Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter;", "getMAdapter", "()Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter;", "setMAdapter", "(Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter;)V", "mList", "", "Lcom/kitam/bgapp/data/data/Product;", "getMList", "()Ljava/util/List;", "setMList", "(Ljava/util/List;)V", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "getMRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setMRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "storeFilterList", "getStoreFilterList", "setStoreFilterList", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "", "onGoToMap", "product", "onGoToStore", "onImageSelected", "onItemSelected", "parent", "Landroid/widget/AdapterView;", "view", "position", "id", "", "onNothingSelected", "onResume", "onSingleSectionWithIconsClicked", "setEmptyMessage", "string", "showEmptyMessage", "boolean", "showSearchBar", "Companion", "app_debug"})
public final class SearchProductFragment extends androidx.fragment.app.Fragment implements com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter.Callback, android.widget.AdapterView.OnItemSelectedListener {
    private int columnCount = 1;
    private final kotlin.Lazy boardGameViewModel$delegate = null;
    private com.kitam.bgapp.databinding.FragmentProductListBinding _binding;
    public androidx.recyclerview.widget.RecyclerView mRecyclerView;
    public com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter mAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.Product> mList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> filterList;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> storeFilterList;
    private boolean isSearchBarModified = false;
    @org.jetbrains.annotations.NotNull()
    public static final com.kitam.bgapp.ui.search.SearchProductFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ARG_COLUMN_COUNT = "column-count";
    
    public SearchProductFragment() {
        super();
    }
    
    private final com.kitam.bgapp.model.BoardGameViewModel getBoardGameViewModel() {
        return null;
    }
    
    private final com.kitam.bgapp.databinding.FragmentProductListBinding getBinding() {
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
    public final com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter getMAdapter() {
        return null;
    }
    
    public final void setMAdapter(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kitam.bgapp.data.data.Product> getMList() {
        return null;
    }
    
    public final void setMList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.Product> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getFilterList() {
        return null;
    }
    
    public final void setFilterList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getStoreFilterList() {
        return null;
    }
    
    public final void setStoreFilterList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    public final boolean isSearchBarModified() {
        return false;
    }
    
    public final void setSearchBarModified(boolean p0) {
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
    public void onResume() {
    }
    
    public final void onSingleSectionWithIconsClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void showSearchBar(boolean p0_32355860) {
    }
    
    public final void showEmptyMessage(boolean p0_32355860) {
    }
    
    public final void setEmptyMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String string) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.kitam.bgapp.ui.search.SearchProductFragment newInstance(int columnCount) {
        return null;
    }
    
    @java.lang.Override()
    public void onGoToStore(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.Product product) {
    }
    
    @java.lang.Override()
    public void onGoToMap(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.Product product) {
    }
    
    @java.lang.Override()
    public void onImageSelected(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.data.data.Product product) {
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent, @org.jetbrains.annotations.Nullable()
    android.view.View view, int position, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.Nullable()
    android.widget.AdapterView<?> parent) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/kitam/bgapp/ui/search/SearchProductFragment$Companion;", "", "()V", "ARG_COLUMN_COUNT", "", "newInstance", "Lcom/kitam/bgapp/ui/search/SearchProductFragment;", "columnCount", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final com.kitam.bgapp.ui.search.SearchProductFragment newInstance(int columnCount) {
            return null;
        }
    }
}