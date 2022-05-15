package com.kitam.bgapp.data.data;

import java.lang.System;

@androidx.room.Entity(tableName = "user_entity")
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010.\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u0010/\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0011\u00100\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u0096\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\n\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R\"\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001e\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0011\"\u0004\b \u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R&\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010\u0015\"\u0004\b(\u0010\u0017\u00a8\u0006:"}, d2 = {"Lcom/kitam/bgapp/data/data/User;", "", "email", "", "name", "phone", "hotList", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "upcomingList", "favList", "topList", "sponsoredList", "lastUpdate", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getFavList", "()Ljava/util/List;", "setFavList", "(Ljava/util/List;)V", "getHotList", "setHotList", "getLastUpdate", "()Ljava/lang/Long;", "setLastUpdate", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "getName", "setName", "getPhone", "setPhone", "getSponsoredList", "setSponsoredList", "getTopList", "setTopList", "getUpcomingList", "setUpcomingList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;)Lcom/kitam/bgapp/data/data/User;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
public final class User {
    @org.jetbrains.annotations.NotNull()
    @androidx.room.PrimaryKey()
    private java.lang.String email;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "name", defaultValue = "[value-unspecified]")
    private java.lang.String name;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "phone", defaultValue = "[value-unspecified]")
    private java.lang.String phone;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "hotList", defaultValue = "[value-unspecified]")
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> hotList;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "upcomingList", defaultValue = "[value-unspecified]")
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> upcomingList;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "favList", defaultValue = "[value-unspecified]")
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> favList;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "topList", defaultValue = "[value-unspecified]")
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> topList;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "sponsoredList", defaultValue = "[value-unspecified]")
    private java.util.List<com.kitam.bgapp.data.data.BoardGame> sponsoredList;
    @org.jetbrains.annotations.Nullable()
    @androidx.room.ColumnInfo(name = "lastUpdate", defaultValue = "[value-unspecified]")
    private java.lang.Long lastUpdate;
    
    @org.jetbrains.annotations.NotNull()
    public final com.kitam.bgapp.data.data.User copy(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> hotList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> upcomingList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> favList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> topList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> sponsoredList, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastUpdate) {
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
    
    public User(@org.jetbrains.annotations.NotNull()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String phone, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> hotList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> upcomingList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> favList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> topList, @org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> sponsoredList, @org.jetbrains.annotations.Nullable()
    java.lang.Long lastUpdate) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public final void setEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPhone() {
        return null;
    }
    
    public final void setPhone(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getHotList() {
        return null;
    }
    
    public final void setHotList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getUpcomingList() {
        return null;
    }
    
    public final void setUpcomingList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getFavList() {
        return null;
    }
    
    public final void setFavList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getTopList() {
        return null;
    }
    
    public final void setTopList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> getSponsoredList() {
        return null;
    }
    
    public final void setSponsoredList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getLastUpdate() {
        return null;
    }
    
    public final void setLastUpdate(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
}