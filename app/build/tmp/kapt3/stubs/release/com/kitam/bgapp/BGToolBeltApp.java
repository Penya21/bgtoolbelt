package com.kitam.bgapp;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lcom/kitam/bgapp/BGToolBeltApp;", "Landroid/app/Application;", "()V", "onCreate", "", "Companion", "app_release"})
public final class BGToolBeltApp extends android.app.Application {
    @org.jetbrains.annotations.NotNull()
    public static final com.kitam.bgapp.BGToolBeltApp.Companion Companion = null;
    public static com.kitam.bgapp.database.TaskDatabase database;
    
    public BGToolBeltApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/kitam/bgapp/BGToolBeltApp$Companion;", "", "()V", "database", "Lcom/kitam/bgapp/database/TaskDatabase;", "getDatabase", "()Lcom/kitam/bgapp/database/TaskDatabase;", "setDatabase", "(Lcom/kitam/bgapp/database/TaskDatabase;)V", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.kitam.bgapp.database.TaskDatabase getDatabase() {
            return null;
        }
        
        public final void setDatabase(@org.jetbrains.annotations.NotNull()
        com.kitam.bgapp.database.TaskDatabase p0) {
        }
    }
}