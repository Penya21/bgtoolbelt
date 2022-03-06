package com.kitam.bgapp.data.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bH\u00c6\u0003J5\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH\u00c6\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\bH\u00d6\u0001R$\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001e"}, d2 = {"Lcom/kitam/bgapp/data/data/Userplayers;", "", "best", "Ljava/util/ArrayList;", "Lcom/kitam/bgapp/data/data/Best;", "recommended", "Lcom/kitam/bgapp/data/data/Recommended;", "totalvotes", "", "(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;)V", "getBest", "()Ljava/util/ArrayList;", "setBest", "(Ljava/util/ArrayList;)V", "getRecommended", "setRecommended", "getTotalvotes", "()Ljava/lang/String;", "setTotalvotes", "(Ljava/lang/String;)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"})
public final class Userplayers {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "best")
    private java.util.ArrayList<com.kitam.bgapp.data.data.Best> best;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "recommended")
    private java.util.ArrayList<com.kitam.bgapp.data.data.Recommended> recommended;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "totalvotes")
    private java.lang.String totalvotes;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.data.data.Userplayers copy(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kitam.bgapp.data.data.Best> best, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kitam.bgapp.data.data.Recommended> recommended, @org.jetbrains.annotations.Nullable()
    java.lang.String totalvotes) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public Userplayers() {
        super();
    }
    
    public Userplayers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kitam.bgapp.data.data.Best> best, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kitam.bgapp.data.data.Recommended> recommended, @org.jetbrains.annotations.Nullable()
    java.lang.String totalvotes) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.kitam.bgapp.data.data.Best> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.kitam.bgapp.data.data.Best> getBest() {
        return null;
    }
    
    public final void setBest(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kitam.bgapp.data.data.Best> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.kitam.bgapp.data.data.Recommended> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.kitam.bgapp.data.data.Recommended> getRecommended() {
        return null;
    }
    
    public final void setRecommended(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.kitam.bgapp.data.data.Recommended> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTotalvotes() {
        return null;
    }
    
    public final void setTotalvotes(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
}