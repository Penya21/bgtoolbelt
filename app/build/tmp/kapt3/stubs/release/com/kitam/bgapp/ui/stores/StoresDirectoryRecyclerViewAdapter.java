package com.kitam.bgapp.ui.stores;

import java.lang.System;

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0003J$\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u001c\u0010\u0015\u001a\u00020\u00102\n\u0010\u0016\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0014H\u0016J\u001c\u0010\u0018\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0014H\u0016J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$ViewHolder;", "()V", "callback", "Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$Callback;", "context", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", "values", "", "Lcom/kitam/bgapp/data/data/Store;", "MyBoardGameSearchRecyclerViewAdapter", "", "stores", "listener", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setListener", "Callback", "ViewHolder", "app_release"})
public final class StoresDirectoryRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.ViewHolder> {
    public android.content.Context context;
    private com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback callback;
    private java.util.List<com.kitam.bgapp.data.data.Store> values;
    
    public StoresDirectoryRecyclerViewAdapter() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public final void setContext(@org.jetbrains.annotations.NotNull()
    android.content.Context p0) {
    }
    
    public final void MyBoardGameSearchRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.Store> stores, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback listener) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.Callback listener) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.stores.StoresDirectoryRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\b\u00a8\u0006\u0013"}, d2 = {"Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kitam/bgapp/databinding/FragmentSearchBinding;", "(Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter;Lcom/kitam/bgapp/databinding/FragmentSearchBinding;)V", "contentView", "Landroid/widget/TextView;", "getContentView", "()Landroid/widget/TextView;", "idView", "getIdView", "logo", "Landroid/widget/ImageView;", "getLogo", "()Landroid/widget/ImageView;", "websiteView", "getWebsiteView", "toString", "", "app_release"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView idView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView contentView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView websiteView = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView logo = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.databinding.FragmentSearchBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getIdView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getContentView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getWebsiteView() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getLogo() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lcom/kitam/bgapp/ui/stores/StoresDirectoryRecyclerViewAdapter$Callback;", "", "onFavStoreClicked", "", "store", "Lcom/kitam/bgapp/data/data/Store;", "position", "", "onStoreClicked", "onWebsiteClicked", "app_release"})
    public static abstract interface Callback {
        
        public abstract void onStoreClicked(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.Store store);
        
        public abstract void onFavStoreClicked(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.Store store, int position);
        
        public abstract void onWebsiteClicked(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.Store store);
    }
}