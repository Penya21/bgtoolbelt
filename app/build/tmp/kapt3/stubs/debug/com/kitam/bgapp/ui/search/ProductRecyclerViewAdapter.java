package com.kitam.bgapp.ui.search;

import java.lang.System;

/**
 * [RecyclerView.Adapter] that can display a [PlaceholderItem].
 * TODO: Replace the implementation with code for your data type.
 */
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u00012\u00020\u0003:\u0002()B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0002\u0010\rJ\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001c\u0010\u001c\u001a\u00020\u001d2\n\u0010\u001e\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u001f\u001a\u00020\u001bH\u0016J\u001c\u0010 \u001a\u00060\u0002R\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u001bH\u0016J\u000e\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0014J\u0014\u0010&\u001a\u00020\u001d2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006*"}, d2 = {"Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter$ViewHolder;", "Landroid/widget/Filterable;", "values", "", "Lcom/kitam/bgapp/data/data/Product;", "stores", "Lcom/kitam/bgapp/data/data/Store;", "context", "Landroid/content/Context;", "callback", "Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter$Callback;", "(Ljava/util/List;Ljava/util/List;Landroid/content/Context;Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter$Callback;)V", "filterList", "getFilterList", "()Ljava/util/List;", "setFilterList", "(Ljava/util/List;)V", "isReversed", "", "()Z", "setReversed", "(Z)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "revert", "boolean", "update", "list", "Callback", "ViewHolder", "app_debug"})
public final class ProductRecyclerViewAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter.ViewHolder> implements android.widget.Filterable {
    private java.util.List<com.kitam.bgapp.data.data.Product> values;
    private final java.util.List<com.kitam.bgapp.data.data.Store> stores = null;
    private final android.content.Context context = null;
    private final com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter.Callback callback = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.kitam.bgapp.data.data.Product> filterList;
    private boolean isReversed = false;
    
    public ProductRecyclerViewAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.Product> values, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.Store> stores, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter.Callback callback) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.kitam.bgapp.data.data.Product> getFilterList() {
        return null;
    }
    
    public final void setFilterList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.Product> p0) {
    }
    
    public final boolean isReversed() {
        return false;
    }
    
    public final void setReversed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.kitam.bgapp.ui.search.ProductRecyclerViewAdapter.ViewHolder holder, int position) {
    }
    
    public final void revert(boolean p0_32355860) {
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    java.util.List<com.kitam.bgapp.data.data.Product> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.widget.Filter getFilter() {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\b"}, d2 = {"Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter$Callback;", "", "onGoToMap", "", "product", "Lcom/kitam/bgapp/data/data/Product;", "onGoToStore", "onImageSelected", "app_debug"})
    public static abstract interface Callback {
        
        public abstract void onGoToStore(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.Product product);
        
        public abstract void onGoToMap(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.Product product);
        
        public abstract void onImageSelected(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.data.data.Product product);
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\bR\u0011\u0010\u0015\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/kitam/bgapp/databinding/FragmentProductBinding;", "(Lcom/kitam/bgapp/ui/search/ProductRecyclerViewAdapter;Lcom/kitam/bgapp/databinding/FragmentProductBinding;)V", "buttonMap", "Landroid/widget/ImageView;", "getButtonMap", "()Landroid/widget/ImageView;", "buttonStore", "getButtonStore", "image", "getImage", "price", "Landroid/widget/TextView;", "getPrice", "()Landroid/widget/TextView;", "store", "getStore", "storeImage", "getStoreImage", "title", "getTitle", "toString", "", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView title = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView store = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView storeImage = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.TextView price = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView image = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView buttonMap = null;
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView buttonStore = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.databinding.FragmentProductBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getStore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getStoreImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.TextView getPrice() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getButtonMap() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getButtonStore() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
    }
}