/*    */ package android.service.dreams;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.view.ActionMode;
/*    */ import android.view.ActionMode.Callback;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.Menu;
/*    */ import android.view.MenuItem;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup.LayoutParams;
/*    */ import android.view.WindowManager.LayoutParams;
/*    */ 
/*    */ public class DreamService
/*    */   extends android.app.Service
/*    */   implements android.view.Window.Callback
/*    */ {
/*    */   public static final String DREAM_META_DATA = "android.service.dream";
/*    */   public static final String SERVICE_INTERFACE = "android.service.dreams.DreamService";
/*    */   
/* 21 */   public DreamService() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean dispatchGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 28 */   public View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean onCreatePanelMenu(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean onPreparePanel(int featureId, View view, Menu menu) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean onMenuOpened(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean onMenuItemSelected(int featureId, MenuItem item) { throw new RuntimeException("Stub!"); }
/* 33 */   public void onWindowAttributesChanged(WindowManager.LayoutParams attrs) { throw new RuntimeException("Stub!"); }
/* 34 */   public void onContentChanged() { throw new RuntimeException("Stub!"); }
/* 35 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 36 */   public void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 37 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 38 */   public void onPanelClosed(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean onSearchRequested(android.view.SearchEvent event) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean onSearchRequested() { throw new RuntimeException("Stub!"); }
/* 41 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
/* 42 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
/* 43 */   public void onActionModeStarted(ActionMode mode) { throw new RuntimeException("Stub!"); }
/* 44 */   public void onActionModeFinished(ActionMode mode) { throw new RuntimeException("Stub!"); }
/* 45 */   public android.view.WindowManager getWindowManager() { throw new RuntimeException("Stub!"); }
/* 46 */   public android.view.Window getWindow() { throw new RuntimeException("Stub!"); }
/* 47 */   public void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setContentView(View view) { throw new RuntimeException("Stub!"); }
/* 49 */   public void setContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 50 */   public void addContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 51 */   public <T extends View> T findViewById(int id) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setInteractive(boolean interactive) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isInteractive() { throw new RuntimeException("Stub!"); }
/* 54 */   public void setFullscreen(boolean fullscreen) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isFullscreen() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setScreenBright(boolean screenBright) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isScreenBright() { throw new RuntimeException("Stub!"); }
/* 58 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 59 */   public void onDreamingStarted() { throw new RuntimeException("Stub!"); }
/* 60 */   public void onDreamingStopped() { throw new RuntimeException("Stub!"); }
/* 61 */   public void onWakeUp() { throw new RuntimeException("Stub!"); }
/* 62 */   public final android.os.IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 63 */   public final void finish() { throw new RuntimeException("Stub!"); }
/* 64 */   public final void wakeUp() { throw new RuntimeException("Stub!"); }
/* 65 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 66 */   protected void dump(java.io.FileDescriptor fd, java.io.PrintWriter pw, String[] args) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\dreams\DreamService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */