/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.CallSuper;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import android.support.annotation.StyleRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.TaskStackBuilder;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;

import static android.support.annotation.RestrictTo.Scope.GROUP_ID;

import android.app.ActionBar;


public class AppCompatActivity extends FragmentActivity implements AppCompatCallback,
        TaskStackBuilder.SupportParentable {

    private AppCompatDelegate mDelegate;
    private int mThemeId = 0;
    private boolean mEatKeyUpEvent;
    private Resources mResources;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void setTheme(@StyleRes final int resid) {
        super.setTheme(resid);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
    }

    
    @Nullable
    public ActionBar getSupportActionBar() {
    	throw new RuntimeException("Stub!");
    }

    public void setSupportActionBar(@Nullable Toolbar toolbar) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public MenuInflater getMenuInflater() {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void setContentView(@LayoutRes int layoutResID) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void setContentView(View view) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void setContentView(View view, ViewGroup.LayoutParams params) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
        
    }

    @Override
    public View findViewById(@IdRes int id) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public final boolean onMenuItemSelected(int featureId, android.view.MenuItem item) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        
    }

    @Override
    protected void onTitleChanged(CharSequence title, int color) {
        super.onTitleChanged(title, color);
        
    }

    
    public boolean supportRequestWindowFeature(int featureId) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void supportInvalidateOptionsMenu() {
    	throw new RuntimeException("Stub!");
    }

    
    @RestrictTo(GROUP_ID)
    public void invalidateOptionsMenu() {
    	throw new RuntimeException("Stub!");
    }

    @Override
    @CallSuper
    public void onSupportActionModeStarted(@NonNull ActionMode mode) {
    }

   
    @Override
    @CallSuper
    public void onSupportActionModeFinished(@NonNull ActionMode mode) {
    }

    
    @Nullable
    @Override
    public ActionMode onWindowStartingSupportActionMode(@NonNull ActionMode.Callback callback) {
    	throw new RuntimeException("Stub!");
    }

    
    @Nullable
    public ActionMode startSupportActionMode(@NonNull ActionMode.Callback callback) {
    	throw new RuntimeException("Stub!");
    }

    
    @Deprecated
    public void setSupportProgressBarVisibility(boolean visible) {
    }

    
    @Deprecated
    public void setSupportProgressBarIndeterminateVisibility(boolean visible) {
    }

    
    @Deprecated
    public void setSupportProgressBarIndeterminate(boolean indeterminate) {
    }

    
    @Deprecated
    public void setSupportProgress(int progress) {
    }

    
    public void onCreateSupportNavigateUpTaskStack(@NonNull TaskStackBuilder builder) {
    	throw new RuntimeException("Stub!");
    }

    
    public void onPrepareSupportNavigateUpTaskStack(@NonNull TaskStackBuilder builder) {
    }

    public boolean onSupportNavigateUp() {
    	throw new RuntimeException("Stub!");
    }

    @Nullable
    @Override
    public Intent getSupportParentActivityIntent() {
    	throw new RuntimeException("Stub!");
    }

    public boolean supportShouldUpRecreateTask(@NonNull Intent targetIntent) {
    	throw new RuntimeException("Stub!");
    }

    public void supportNavigateUpTo(@NonNull Intent upIntent) {
        throw new RuntimeException("Stub!");
    }

    @Override
    public void onContentChanged() {
    	throw new RuntimeException("Stub!");
    }

    @Deprecated
    public void onSupportContentChanged() {
    }

    @Nullable
    
    public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public void onPanelClosed(int featureId, Menu menu) {
        super.onPanelClosed(featureId, menu);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        
    }
    @NonNull
    public AppCompatDelegate getDelegate() {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent event) {
    	throw new RuntimeException("Stub!");
    }

    @Override
    public Resources getResources() {
    	throw new RuntimeException("Stub!");
    }
}
