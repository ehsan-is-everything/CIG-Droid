/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.DialogInterface.OnCancelListener;
/*     */ import android.os.Bundle;
/*     */ import android.os.Message;
/*     */ import android.view.ActionMode;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.Menu;
/*     */ import android.view.MenuItem;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.SearchEvent;
/*     */ import android.view.View;
/*     */ import android.view.ViewGroup.LayoutParams;
/*     */ 
/*     */ 
/*     */ public class Dialog
/*     */   implements android.content.DialogInterface, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener
/*     */ {
/*  21 */   public Dialog(Context context) { throw new RuntimeException("Stub!"); }
/*  22 */   public Dialog(Context context, int themeResId) { throw new RuntimeException("Stub!"); }
/*  23 */   protected Dialog(Context context, boolean cancelable, DialogInterface.OnCancelListener cancelListener) { throw new RuntimeException("Stub!"); }
/*  24 */   public final Context getContext() { throw new RuntimeException("Stub!"); }
/*  25 */   public ActionBar getActionBar() { throw new RuntimeException("Stub!"); }
/*  26 */   public final void setOwnerActivity(Activity activity) { throw new RuntimeException("Stub!"); }
/*  27 */   public final Activity getOwnerActivity() { throw new RuntimeException("Stub!"); }
/*  28 */   public boolean isShowing() { throw new RuntimeException("Stub!"); }
/*  29 */   public void create() { throw new RuntimeException("Stub!"); }
/*  30 */   public void show() { throw new RuntimeException("Stub!"); }
/*  31 */   public void hide() { throw new RuntimeException("Stub!"); }
/*  32 */   public void dismiss() { throw new RuntimeException("Stub!"); }
/*  33 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  34 */   protected void onStart() { throw new RuntimeException("Stub!"); }
/*  35 */   protected void onStop() { throw new RuntimeException("Stub!"); }
/*  36 */   public Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/*  37 */   public void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  38 */   public android.view.Window getWindow() { throw new RuntimeException("Stub!"); }
/*  39 */   public View getCurrentFocus() { throw new RuntimeException("Stub!"); }
/*  40 */   public <T extends View> T findViewById(int id) { throw new RuntimeException("Stub!"); }
/*  41 */   public void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); }
/*  42 */   public void setContentView(View view) { throw new RuntimeException("Stub!"); }
/*  43 */   public void setContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/*  44 */   public void addContentView(View view, ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/*  45 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/*  46 */   public void setTitle(int titleId) { throw new RuntimeException("Stub!"); }
/*  47 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  48 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  49 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  50 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  51 */   public void onBackPressed() { throw new RuntimeException("Stub!"); }
/*  52 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  53 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*  54 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*  55 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*  56 */   public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams params) { throw new RuntimeException("Stub!"); }
/*  57 */   public void onContentChanged() { throw new RuntimeException("Stub!"); }
/*  58 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/*  59 */   public void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/*  60 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/*  61 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  62 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  63 */   public boolean dispatchTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/*  64 */   public boolean dispatchTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/*  65 */   public boolean dispatchGenericMotionEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/*  66 */   public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/*  67 */   public View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); }
/*  68 */   public boolean onCreatePanelMenu(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/*  69 */   public boolean onPreparePanel(int featureId, View view, Menu menu) { throw new RuntimeException("Stub!"); }
/*  70 */   public boolean onMenuOpened(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean onMenuItemSelected(int featureId, MenuItem item) { throw new RuntimeException("Stub!"); }
/*  72 */   public void onPanelClosed(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/*  73 */   public boolean onCreateOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); }
/*  75 */   public boolean onOptionsItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/*  76 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); }
/*  77 */   public void openOptionsMenu() { throw new RuntimeException("Stub!"); }
/*  78 */   public void closeOptionsMenu() { throw new RuntimeException("Stub!"); }
/*  79 */   public void invalidateOptionsMenu() { throw new RuntimeException("Stub!"); }
/*  80 */   public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
/*  81 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); }
/*  82 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); }
/*  83 */   public void openContextMenu(View view) { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean onContextItemSelected(MenuItem item) { throw new RuntimeException("Stub!"); }
/*  85 */   public void onContextMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); }
/*  86 */   public boolean onSearchRequested(SearchEvent searchEvent) { throw new RuntimeException("Stub!"); }
/*  87 */   public boolean onSearchRequested() { throw new RuntimeException("Stub!"); }
/*  88 */   public final SearchEvent getSearchEvent() { throw new RuntimeException("Stub!"); }
/*  89 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
/*  90 */   public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
/*  91 */   public void onActionModeStarted(ActionMode mode) { throw new RuntimeException("Stub!"); }
/*  92 */   public void onActionModeFinished(ActionMode mode) { throw new RuntimeException("Stub!"); }
/*  93 */   public void takeKeyEvents(boolean get) { throw new RuntimeException("Stub!"); }
/*  94 */   public final boolean requestWindowFeature(int featureId) { throw new RuntimeException("Stub!"); }
/*  95 */   public final void setFeatureDrawableResource(int featureId, int resId) { throw new RuntimeException("Stub!"); }
/*  96 */   public final void setFeatureDrawableUri(int featureId, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
/*  97 */   public final void setFeatureDrawable(int featureId, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
/*  98 */   public final void setFeatureDrawableAlpha(int featureId, int alpha) { throw new RuntimeException("Stub!"); }
/*  99 */   public android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
/* 100 */   public void setCancelable(boolean flag) { throw new RuntimeException("Stub!"); }
/* 101 */   public void setCanceledOnTouchOutside(boolean cancel) { throw new RuntimeException("Stub!"); }
/* 102 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 103 */   public void setOnCancelListener(DialogInterface.OnCancelListener listener) { throw new RuntimeException("Stub!"); }
/* 104 */   public void setCancelMessage(Message msg) { throw new RuntimeException("Stub!"); }
/* 105 */   public void setOnDismissListener(android.content.DialogInterface.OnDismissListener listener) { throw new RuntimeException("Stub!"); }
/* 106 */   public void setOnShowListener(android.content.DialogInterface.OnShowListener listener) { throw new RuntimeException("Stub!"); }
/* 107 */   public void setDismissMessage(Message msg) { throw new RuntimeException("Stub!"); }
/* 108 */   public final void setVolumeControlStream(int streamType) { throw new RuntimeException("Stub!"); }
/* 109 */   public final int getVolumeControlStream() { throw new RuntimeException("Stub!"); }
/* 110 */   public void setOnKeyListener(android.content.DialogInterface.OnKeyListener onKeyListener) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\Dialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */