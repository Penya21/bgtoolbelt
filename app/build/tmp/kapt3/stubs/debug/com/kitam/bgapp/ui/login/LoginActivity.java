package com.kitam.bgapp.ui.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\u0012\u0010\u0015\u001a\u00020\u00142\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0014H\u0014J\u0012\u0010\u001c\u001a\u00020\u00142\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0002J\u0010\u0010\u001f\u001a\u00020\u00142\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u0012*\u0004\u0018\u00010\r0\r0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/kitam/bgapp/ui/login/LoginActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/kitam/bgapp/databinding/ActivityLoginBinding;", "loginViewModel", "Lcom/kitam/bgapp/ui/login/LoginViewModel;", "providers", "Ljava/util/ArrayList;", "Lcom/firebase/ui/auth/AuthUI$IdpConfig;", "getProviders", "()Ljava/util/ArrayList;", "signInIntent", "Landroid/content/Intent;", "getSignInIntent", "()Landroid/content/Intent;", "signInLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "kotlin.jvm.PlatformType", "goToMainActivity", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onSignInResult", "result", "Lcom/firebase/ui/auth/data/model/FirebaseAuthUIAuthenticationResult;", "onStart", "showLoginFailed", "errorString", "", "updateUiWithUser", "model", "Lcom/kitam/bgapp/ui/login/LoggedInUserView;", "app_debug"})
public final class LoginActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.kitam.bgapp.ui.login.LoginViewModel loginViewModel;
    private com.kitam.bgapp.databinding.ActivityLoginBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<com.firebase.ui.auth.AuthUI.IdpConfig> providers = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Intent signInIntent = null;
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> signInLauncher = null;
    
    public LoginActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.firebase.ui.auth.AuthUI.IdpConfig> getProviders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Intent getSignInIntent() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onStart() {
    }
    
    private final void updateUiWithUser(com.kitam.bgapp.ui.login.LoggedInUserView model) {
    }
    
    private final void showLoginFailed(@androidx.annotation.StringRes()
    int errorString) {
    }
    
    private final void onSignInResult(com.firebase.ui.auth.data.model.FirebaseAuthUIAuthenticationResult result) {
    }
    
    private final void goToMainActivity() {
    }
}