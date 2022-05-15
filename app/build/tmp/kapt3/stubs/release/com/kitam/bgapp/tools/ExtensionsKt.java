package com.kitam.bgapp.tools;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0000\u001a\u00020\u0001\u001a\n\u0010\u0003\u001a\u00020\u0004*\u00020\u0005\u001a\f\u0010\u0006\u001a\u00020\u0007*\u0004\u0018\u00010\b\u001a\u0012\u0010\t\u001a\u00020\u0004*\u00020\n2\u0006\u0010\u000b\u001a\u00020\f\u001a,\u0010\r\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0013\u001a\n\u0010\u0014\u001a\u00020\f*\u00020\f\u001a\n\u0010\u0015\u001a\u00020\f*\u00020\f\u001a\u001c\u0010\u0016\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0017\u001a\u00020\f2\b\b\u0002\u0010\u0018\u001a\u00020\u0001\u00a8\u0006\u0019"}, d2 = {"color", "", "Landroid/app/Activity;", "hideKeyboard", "", "Landroid/view/View;", "isNull", "", "", "load", "Landroid/widget/ImageView;", "url", "", "observeOnce", "T", "Landroidx/lifecycle/LiveData;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "observer", "Landroidx/lifecycle/Observer;", "removeFirstLastChar", "removeHTML", "toast", "text", "duration", "app_release"})
public final class ExtensionsKt {
    
    public static final boolean isNull(@org.jetbrains.annotations.Nullable()
    java.lang.Object $this$isNull) {
        return false;
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$toast, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final int color(@org.jetbrains.annotations.NotNull()
    android.app.Activity $this$color, @androidx.annotation.ColorRes()
    int color) {
        return 0;
    }
    
    public static final void load(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$load, @org.jetbrains.annotations.NotNull()
    java.lang.String url) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String removeHTML(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$removeHTML) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String removeFirstLastChar(@org.jetbrains.annotations.NotNull()
    java.lang.String $this$removeFirstLastChar) {
        return null;
    }
    
    public static final <T extends java.lang.Object>void observeOnce(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LiveData<T> $this$observeOnce, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.LifecycleOwner lifecycleOwner, @org.jetbrains.annotations.NotNull()
    androidx.lifecycle.Observer<T> observer) {
    }
    
    public static final void hideKeyboard(@org.jetbrains.annotations.NotNull()
    android.view.View $this$hideKeyboard) {
    }
}