package com.kitam.bgapp.data.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007J\u001a\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/kitam/bgapp/data/data/BoardGameTypeConverter;", "", "()V", "gson", "Lcom/google/gson/Gson;", "listToString", "", "someObjects", "", "Lcom/kitam/bgapp/data/data/BoardGame;", "stringToList", "data", "app_release"})
public final class BoardGameTypeConverter {
    private final com.google.gson.Gson gson = null;
    
    public BoardGameTypeConverter() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.TypeConverter()
    public final java.util.List<com.kitam.bgapp.data.data.BoardGame> stringToList(@org.jetbrains.annotations.Nullable()
    java.lang.String data) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.TypeConverter()
    public final java.lang.String listToString(@org.jetbrains.annotations.Nullable()
    java.util.List<com.kitam.bgapp.data.data.BoardGame> someObjects) {
        return null;
    }
}