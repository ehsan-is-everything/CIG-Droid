/*    */ package android.widget;
/*    */ 
/*    */ import android.app.LocalActivityManager;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewTreeObserver.OnTouchModeChangeListener;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class TabHost
/*    */   extends FrameLayout
/*    */   implements ViewTreeObserver.OnTouchModeChangeListener
/*    */ {
/*    */   public class TabSpec
/*    */   {
/* 32 */     TabSpec() { throw new RuntimeException("Stub!"); }
/* 33 */     public TabSpec setIndicator(CharSequence label) { throw new RuntimeException("Stub!"); }
/* 34 */     public TabSpec setIndicator(CharSequence label, Drawable icon) { throw new RuntimeException("Stub!"); }
/* 35 */     public TabSpec setIndicator(View view) { throw new RuntimeException("Stub!"); }
/* 36 */     public TabSpec setContent(int viewId) { throw new RuntimeException("Stub!"); }
/* 37 */     public TabSpec setContent(TabHost.TabContentFactory contentFactory) { throw new RuntimeException("Stub!"); }
/* 38 */     public TabSpec setContent(Intent intent) { throw new RuntimeException("Stub!"); }
/* 39 */     public String getTag() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 41 */   public TabHost(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 42 */   public TabHost(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 43 */   public TabHost(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 44 */   public TabHost(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 45 */   public TabSpec newTabSpec(String tag) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setup() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setup(LocalActivityManager activityGroup) { throw new RuntimeException("Stub!"); }
/* 48 */   public void onTouchModeChanged(boolean isInTouchMode) { throw new RuntimeException("Stub!"); }
/* 49 */   public void addTab(TabSpec tabSpec) { throw new RuntimeException("Stub!"); }
/* 50 */   public void clearAllTabs() { throw new RuntimeException("Stub!"); }
/* 51 */   public TabWidget getTabWidget() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getCurrentTab() { throw new RuntimeException("Stub!"); }
/* 53 */   public String getCurrentTabTag() { throw new RuntimeException("Stub!"); }
/* 54 */   public View getCurrentTabView() { throw new RuntimeException("Stub!"); }
/* 55 */   public View getCurrentView() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setCurrentTabByTag(String tag) { throw new RuntimeException("Stub!"); }
/* 57 */   public FrameLayout getTabContentView() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 59 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 60 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setCurrentTab(int index) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setOnTabChangedListener(OnTabChangeListener l) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface TabContentFactory
/*    */   {
/*    */     public abstract View createTabContent(String paramString);
/*    */   }
/*    */   
/*    */   public static abstract interface OnTabChangeListener
/*    */   {
/*    */     public abstract void onTabChanged(String paramString);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\TabHost.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */