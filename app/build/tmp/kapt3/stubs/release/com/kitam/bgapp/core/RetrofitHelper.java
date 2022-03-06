package com.kitam.bgapp.core;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/kitam/bgapp/core/RetrofitHelper;", "", "()V", "timeout", "", "getTimeout", "()J", "setTimeout", "(J)V", "getRetrofitForJSON", "Lretrofit2/Retrofit;", "getRetrofitForXML", "app_release"})
public final class RetrofitHelper {
    @org.jetbrains.annotations.NotNull()
    public static final com.kitam.bgapp.core.RetrofitHelper INSTANCE = null;
    private static long timeout = 30L;
    
    private RetrofitHelper() {
        super();
    }
    
    public final long getTimeout() {
        return 0L;
    }
    
    public final void setTimeout(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofitForXML() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final retrofit2.Retrofit getRetrofitForJSON() {
        return null;
    }
}