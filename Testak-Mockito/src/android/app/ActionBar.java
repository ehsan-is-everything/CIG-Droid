/*     */ package android.app;
/*     */ 
/*     */ import android.graphics.drawable.Drawable;
/*     */ 
/*     */ 
/*     */ public abstract class ActionBar {
/*     */   public static final int DISPLAY_HOME_AS_UP = 4;
/*     */   public static final int DISPLAY_SHOW_CUSTOM = 16;
/*     */   public static final int DISPLAY_SHOW_HOME = 2;
/*     */   public static final int DISPLAY_SHOW_TITLE = 8;
/*     */   public static final int DISPLAY_USE_LOGO = 1;
/*     */   @Deprecated
/*     */   public static final int NAVIGATION_MODE_LIST = 1;
/*     */   @Deprecated
/*     */   public static final int NAVIGATION_MODE_STANDARD = 0;
/*     */   @Deprecated
/*     */   public static final int NAVIGATION_MODE_TABS = 2;
/*     */   
/*     */   @Deprecated
/*     */   public static abstract interface OnNavigationListener {
/*     */     public abstract boolean onNavigationItemSelected(int paramInt, long paramLong);
/*     */   }
/*     */   
/*     */   public static abstract interface OnMenuVisibilityListener {
/*     */     public abstract void onMenuVisibilityChanged(boolean paramBoolean);
/*     */   }
/*     */   
/*     */   @Deprecated
/*     */   public static abstract class Tab {
/*     */     public static final int INVALID_POSITION = -1;
/*     */     
/*  32 */     public Tab() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public abstract int getPosition();
/*     */     
/*     */     public abstract Drawable getIcon();
/*     */     
/*     */     public abstract CharSequence getText();
/*     */     
/*     */     public abstract Tab setIcon(Drawable paramDrawable);
/*     */     
/*     */     public abstract Tab setIcon(int paramInt);
/*     */     
/*     */     public abstract Tab setText(CharSequence paramCharSequence);
/*     */     
/*     */     public abstract Tab setText(int paramInt);
/*     */     
/*     */     public abstract Tab setCustomView(android.view.View paramView);
/*     */     public abstract Tab setCustomView(int paramInt);
/*     */     public abstract android.view.View getCustomView();
/*     */     public abstract Tab setTag(Object paramObject);
/*     */     public abstract Object getTag();
/*     */     public abstract Tab setTabListener(ActionBar.TabListener paramTabListener);
/*     */     public abstract void select();
/*     */     public abstract Tab setContentDescription(int paramInt);
/*     */     public abstract Tab setContentDescription(CharSequence paramCharSequence);
/*     */     public abstract CharSequence getContentDescription(); }
/*     */   @Deprecated
/*     */   public static abstract interface TabListener { public abstract void onTabSelected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*     */     public abstract void onTabUnselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction);
/*     */     public abstract void onTabReselected(ActionBar.Tab paramTab, FragmentTransaction paramFragmentTransaction); }
/*  62 */   public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams { public LayoutParams(android.content.Context c, android.util.AttributeSet attrs) { super();throw new RuntimeException("Stub!"); }
/*  63 */     public LayoutParams(int width, int height) { super();throw new RuntimeException("Stub!"); }
/*  64 */     public LayoutParams(int width, int height, int gravity) { super();throw new RuntimeException("Stub!"); }
/*  65 */     public LayoutParams(int gravity) { super();throw new RuntimeException("Stub!"); }
/*  66 */     public LayoutParams(LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*  67 */     public LayoutParams(android.view.ViewGroup.LayoutParams source) { super();throw new RuntimeException("Stub!"); }
/*     */     
/*     */     @android.view.ViewDebug.ExportedProperty(category="layout", mapping={@android.view.ViewDebug.IntToString(from=-1, to="NONE"), @android.view.ViewDebug.IntToString(from=0, to="NONE"), @android.view.ViewDebug.IntToString(from=48, to="TOP"), @android.view.ViewDebug.IntToString(from=80, to="BOTTOM"), @android.view.ViewDebug.IntToString(from=3, to="LEFT"), @android.view.ViewDebug.IntToString(from=5, to="RIGHT"), @android.view.ViewDebug.IntToString(from=8388611, to="START"), @android.view.ViewDebug.IntToString(from=8388613, to="END"), @android.view.ViewDebug.IntToString(from=16, to="CENTER_VERTICAL"), @android.view.ViewDebug.IntToString(from=112, to="FILL_VERTICAL"), @android.view.ViewDebug.IntToString(from=1, to="CENTER_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=7, to="FILL_HORIZONTAL"), @android.view.ViewDebug.IntToString(from=17, to="CENTER"), @android.view.ViewDebug.IntToString(from=119, to="FILL")})
/*     */     public int gravity; }
/*  71 */   public ActionBar() { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setCustomView(android.view.View paramView);
/*     */   public abstract void setCustomView(android.view.View paramView, LayoutParams paramLayoutParams);
/*     */   public abstract void setCustomView(int paramInt);
/*     */   public abstract void setIcon(int paramInt);
/*     */   public abstract void setIcon(Drawable paramDrawable);
/*     */   public abstract void setLogo(int paramInt);
/*     */   public abstract void setLogo(Drawable paramDrawable);
/*     */   @Deprecated
/*     */   public abstract void setListNavigationCallbacks(android.widget.SpinnerAdapter paramSpinnerAdapter, OnNavigationListener paramOnNavigationListener);
/*     */   @Deprecated
/*     */   public abstract void setSelectedNavigationItem(int paramInt);
/*     */   @Deprecated
/*     */   public abstract int getSelectedNavigationIndex();
/*     */   @Deprecated
/*     */   public abstract int getNavigationItemCount();
/*     */   public abstract void setTitle(CharSequence paramCharSequence);
/*     */   public abstract void setTitle(int paramInt);
/*     */   public abstract void setSubtitle(CharSequence paramCharSequence);
/*     */   public abstract void setSubtitle(int paramInt);
/*     */   public abstract void setDisplayOptions(int paramInt);
/*     */   public abstract void setDisplayOptions(int paramInt1, int paramInt2);
/*     */   public abstract void setDisplayUseLogoEnabled(boolean paramBoolean);
/*     */   public abstract void setDisplayShowHomeEnabled(boolean paramBoolean);
/*     */   public abstract void setDisplayHomeAsUpEnabled(boolean paramBoolean);
/*     */   public abstract void setDisplayShowTitleEnabled(boolean paramBoolean);
/*     */   public abstract void setDisplayShowCustomEnabled(boolean paramBoolean);
/*     */   public abstract void setBackgroundDrawable(Drawable paramDrawable);
/*  99 */   public void setStackedBackgroundDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/* 100 */   public void setSplitBackgroundDrawable(Drawable d) { throw new RuntimeException("Stub!"); }
/*     */   public abstract android.view.View getCustomView();
/*     */   public abstract CharSequence getTitle();
/*     */   public abstract CharSequence getSubtitle();
/*     */   @Deprecated
/*     */   public abstract int getNavigationMode();
/*     */   @Deprecated
/*     */   public abstract void setNavigationMode(int paramInt);
/*     */   public abstract int getDisplayOptions();
/*     */   @Deprecated
/*     */   public abstract Tab newTab();
/*     */   @Deprecated
/*     */   public abstract void addTab(Tab paramTab);
/*     */   @Deprecated
/*     */   public abstract void addTab(Tab paramTab, boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract void addTab(Tab paramTab, int paramInt);
/*     */   @Deprecated
/*     */   public abstract void addTab(Tab paramTab, int paramInt, boolean paramBoolean);
/*     */   @Deprecated
/*     */   public abstract void removeTab(Tab paramTab);
/*     */   @Deprecated
/*     */   public abstract void removeTabAt(int paramInt);
/*     */   @Deprecated
/*     */   public abstract void removeAllTabs();
/*     */   @Deprecated
/*     */   public abstract void selectTab(Tab paramTab);
/*     */   @Deprecated
/*     */   public abstract Tab getSelectedTab();
/*     */   @Deprecated
/*     */   public abstract Tab getTabAt(int paramInt);
/*     */   @Deprecated
/*     */   public abstract int getTabCount();
/*     */   public abstract int getHeight();
/*     */   public abstract void show();
/*     */   public abstract void hide();
/*     */   public abstract boolean isShowing();
/*     */   public abstract void addOnMenuVisibilityListener(OnMenuVisibilityListener paramOnMenuVisibilityListener);
/*     */   public abstract void removeOnMenuVisibilityListener(OnMenuVisibilityListener paramOnMenuVisibilityListener);
/* 139 */   public void setHomeButtonEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 140 */   public android.content.Context getThemedContext() { throw new RuntimeException("Stub!"); }
/* 141 */   public void setHomeAsUpIndicator(Drawable indicator) { throw new RuntimeException("Stub!"); }
/* 142 */   public void setHomeAsUpIndicator(int resId) { throw new RuntimeException("Stub!"); }
/* 143 */   public void setHomeActionContentDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/* 144 */   public void setHomeActionContentDescription(int resId) { throw new RuntimeException("Stub!"); }
/* 145 */   public void setHideOnContentScrollEnabled(boolean hideOnContentScroll) { throw new RuntimeException("Stub!"); }
/* 146 */   public boolean isHideOnContentScrollEnabled() { throw new RuntimeException("Stub!"); }
/* 147 */   public int getHideOffset() { throw new RuntimeException("Stub!"); }
/* 148 */   public void setHideOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 149 */   public void setElevation(float elevation) { throw new RuntimeException("Stub!"); }
/* 150 */   public float getElevation() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\ActionBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */