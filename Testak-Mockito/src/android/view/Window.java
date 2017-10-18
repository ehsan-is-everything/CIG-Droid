/*     */ package android.view;
/*     */ 
/*     */ import android.transition.Transition;
/*     */ 
/*     */ public abstract class Window { public static abstract interface OnFrameMetricsAvailableListener { public abstract void onFrameMetricsAvailable(Window paramWindow, FrameMetrics paramFrameMetrics, int paramInt); }
/*     */   
/*     */   public static abstract interface OnRestrictedCaptionAreaChangedListener { public abstract void onRestrictedCaptionAreaChanged(android.graphics.Rect paramRect); }
/*     */   
/*     */   public static abstract interface Callback { public abstract boolean dispatchKeyEvent(KeyEvent paramKeyEvent);
/*     */     
/*     */     public abstract boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent);
/*     */     
/*     */     public abstract boolean dispatchTouchEvent(MotionEvent paramMotionEvent);
/*     */     
/*     */     public abstract boolean dispatchTrackballEvent(MotionEvent paramMotionEvent);
/*     */     
/*     */     public abstract boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent);
/*     */     
/*     */     public abstract boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent paramAccessibilityEvent);
/*     */     
/*     */     public abstract View onCreatePanelView(int paramInt);
/*     */     
/*     */     public abstract boolean onCreatePanelMenu(int paramInt, Menu paramMenu);
/*     */     
/*     */     public abstract boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu);
/*     */     
/*     */     public abstract boolean onMenuOpened(int paramInt, Menu paramMenu);
/*     */     
/*     */     public abstract boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem);
/*     */     
/*     */     public abstract void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams);
/*     */     
/*     */     public abstract void onContentChanged();
/*     */     
/*     */     public abstract void onWindowFocusChanged(boolean paramBoolean);
/*     */     public abstract void onAttachedToWindow();
/*     */     public abstract void onDetachedFromWindow();
/*     */     public abstract void onPanelClosed(int paramInt, Menu paramMenu);
/*     */     public abstract boolean onSearchRequested();
/*     */     public abstract boolean onSearchRequested(SearchEvent paramSearchEvent);
/*     */     public abstract ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback);
/*     */     public abstract ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt);
/*     */     public abstract void onActionModeStarted(ActionMode paramActionMode);
/*     */     public abstract void onActionModeFinished(ActionMode paramActionMode);
/*  45 */     public void onProvideKeyboardShortcuts(java.util.List<KeyboardShortcutGroup> data, Menu menu, int deviceId) { throw new RuntimeException("Stub!"); }
/*  46 */     public void onPointerCaptureChanged(boolean hasCapture) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */ 
/*     */   public static final int DECOR_CAPTION_SHADE_AUTO = 0;
/*     */   public static final int DECOR_CAPTION_SHADE_DARK = 2;
/*     */   public static final int DECOR_CAPTION_SHADE_LIGHT = 1;
/*     */   @Deprecated
/*     */   protected static final int DEFAULT_FEATURES = 65;
/*     */   
/*  56 */   public Window(android.content.Context context) { throw new RuntimeException("Stub!"); }
/*  57 */   public final android.content.Context getContext() { throw new RuntimeException("Stub!"); }
/*  58 */   public final android.content.res.TypedArray getWindowStyle() { throw new RuntimeException("Stub!"); }
/*  59 */   public void setContainer(Window container) { throw new RuntimeException("Stub!"); }
/*  60 */   public final Window getContainer() { throw new RuntimeException("Stub!"); }
/*  61 */   public final boolean hasChildren() { throw new RuntimeException("Stub!"); }
/*  62 */   public void setWindowManager(WindowManager wm, android.os.IBinder appToken, String appName) { throw new RuntimeException("Stub!"); }
/*  63 */   public void setWindowManager(WindowManager wm, android.os.IBinder appToken, String appName, boolean hardwareAccelerated) { throw new RuntimeException("Stub!"); }
/*  64 */   public WindowManager getWindowManager() { throw new RuntimeException("Stub!"); }
/*  65 */   public void setCallback(Callback callback) { throw new RuntimeException("Stub!"); }
/*  66 */   public final Callback getCallback() { throw new RuntimeException("Stub!"); }
/*  67 */   public final void addOnFrameMetricsAvailableListener(OnFrameMetricsAvailableListener listener, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/*  68 */   public final void removeOnFrameMetricsAvailableListener(OnFrameMetricsAvailableListener listener) { throw new RuntimeException("Stub!"); }
/*  69 */   public final void setRestrictedCaptionAreaListener(OnRestrictedCaptionAreaChangedListener listener) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void takeSurface(SurfaceHolder.Callback2 paramCallback2);
/*     */   public abstract void takeInputQueue(InputQueue.Callback paramCallback);
/*     */   public abstract boolean isFloating();
/*  73 */   public void setLayout(int width, int height) { throw new RuntimeException("Stub!"); }
/*  74 */   public void setGravity(int gravity) { throw new RuntimeException("Stub!"); }
/*  75 */   public void setType(int type) { throw new RuntimeException("Stub!"); }
/*  76 */   public void setFormat(int format) { throw new RuntimeException("Stub!"); }
/*  77 */   public void setWindowAnimations(int resId) { throw new RuntimeException("Stub!"); }
/*  78 */   public void setSoftInputMode(int mode) { throw new RuntimeException("Stub!"); }
/*  79 */   public void addFlags(int flags) { throw new RuntimeException("Stub!"); }
/*  80 */   public void clearFlags(int flags) { throw new RuntimeException("Stub!"); }
/*  81 */   public void setFlags(int flags, int mask) { throw new RuntimeException("Stub!"); }
/*  82 */   public void setColorMode(int colorMode) { throw new RuntimeException("Stub!"); }
/*  83 */   public int getColorMode() { throw new RuntimeException("Stub!"); }
/*  84 */   public void setDimAmount(float amount) { throw new RuntimeException("Stub!"); }
/*  85 */   public void setAttributes(WindowManager.LayoutParams a) { throw new RuntimeException("Stub!"); }
/*  86 */   public final WindowManager.LayoutParams getAttributes() { throw new RuntimeException("Stub!"); }
/*  87 */   protected final int getForcedWindowFlags() { throw new RuntimeException("Stub!"); }
/*  88 */   protected final boolean hasSoftInputMode() { throw new RuntimeException("Stub!"); }
/*  89 */   public void setSustainedPerformanceMode(boolean enable) { throw new RuntimeException("Stub!"); }
/*  90 */   public boolean requestFeature(int featureId) { throw new RuntimeException("Stub!"); }
/*  91 */   public final void makeActive() { throw new RuntimeException("Stub!"); }
/*  92 */   public final boolean isActive() { throw new RuntimeException("Stub!"); }
/*  93 */   public <T extends View> T findViewById(int id) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setContentView(int paramInt);
/*     */   public abstract void setContentView(View paramView);
/*     */   public abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
/*     */   public abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);
/*     */   public abstract View getCurrentFocus();
/*     */   public abstract LayoutInflater getLayoutInflater();
/*     */   public abstract void setTitle(CharSequence paramCharSequence);
/*     */   @Deprecated
/*     */   public abstract void setTitleColor(int paramInt);
/*     */   public abstract void openPanel(int paramInt, KeyEvent paramKeyEvent);
/*     */   public abstract void closePanel(int paramInt);
/*     */   public abstract void togglePanel(int paramInt, KeyEvent paramKeyEvent);
/*     */   public abstract void invalidatePanelMenu(int paramInt);
/*     */   public abstract boolean performPanelShortcut(int paramInt1, int paramInt2, KeyEvent paramKeyEvent, int paramInt3);
/*     */   public abstract boolean performPanelIdentifierAction(int paramInt1, int paramInt2, int paramInt3);
/*     */   public abstract void closeAllPanels();
/*     */   public abstract boolean performContextMenuIdentifierAction(int paramInt1, int paramInt2);
/*     */   public abstract void onConfigurationChanged(android.content.res.Configuration paramConfiguration);
/* 112 */   public void setElevation(float elevation) { throw new RuntimeException("Stub!"); }
/* 113 */   public void setClipToOutline(boolean clipToOutline) { throw new RuntimeException("Stub!"); }
/* 114 */   public void setBackgroundDrawableResource(int resId) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setBackgroundDrawable(android.graphics.drawable.Drawable paramDrawable);
/*     */   public abstract void setFeatureDrawableResource(int paramInt1, int paramInt2);
/*     */   public abstract void setFeatureDrawableUri(int paramInt, android.net.Uri paramUri);
/*     */   public abstract void setFeatureDrawable(int paramInt, android.graphics.drawable.Drawable paramDrawable);
/*     */   public abstract void setFeatureDrawableAlpha(int paramInt1, int paramInt2);
/*     */   public abstract void setFeatureInt(int paramInt1, int paramInt2);
/*     */   public abstract void takeKeyEvents(boolean paramBoolean);
/*     */   public abstract boolean superDispatchKeyEvent(KeyEvent paramKeyEvent);
/*     */   public abstract boolean superDispatchKeyShortcutEvent(KeyEvent paramKeyEvent);
/*     */   public abstract boolean superDispatchTouchEvent(MotionEvent paramMotionEvent);
/*     */   public abstract boolean superDispatchTrackballEvent(MotionEvent paramMotionEvent);
/*     */   public abstract boolean superDispatchGenericMotionEvent(MotionEvent paramMotionEvent);
/*     */   public abstract View getDecorView();
/*     */   public abstract View peekDecorView();
/*     */   public abstract android.os.Bundle saveHierarchyState();
/*     */   public abstract void restoreHierarchyState(android.os.Bundle paramBundle);
/*     */   protected abstract void onActive();
/* 132 */   protected final int getFeatures() { throw new RuntimeException("Stub!"); }
/* 133 */   public static int getDefaultFeatures(android.content.Context context) { throw new RuntimeException("Stub!"); }
/* 134 */   public boolean hasFeature(int feature) { throw new RuntimeException("Stub!"); }
/* 135 */   protected final int getLocalFeatures() { throw new RuntimeException("Stub!"); }
/* 136 */   protected void setDefaultWindowFormat(int format) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setChildDrawable(int paramInt, android.graphics.drawable.Drawable paramDrawable);
/*     */   public abstract void setChildInt(int paramInt1, int paramInt2);
/*     */   public abstract boolean isShortcutKey(int paramInt, KeyEvent paramKeyEvent);
/*     */   public abstract void setVolumeControlStream(int paramInt);
/*     */   public abstract int getVolumeControlStream();
/* 142 */   public void setMediaController(android.media.session.MediaController controller) { throw new RuntimeException("Stub!"); }
/* 143 */   public android.media.session.MediaController getMediaController() { throw new RuntimeException("Stub!"); }
/* 144 */   public void setUiOptions(int uiOptions) { throw new RuntimeException("Stub!"); }
/* 145 */   public void setUiOptions(int uiOptions, int mask) { throw new RuntimeException("Stub!"); }
/* 146 */   public void setIcon(int resId) { throw new RuntimeException("Stub!"); }
/* 147 */   public void setLogo(int resId) { throw new RuntimeException("Stub!"); }
/* 148 */   public void setLocalFocus(boolean hasFocus, boolean inTouchMode) { throw new RuntimeException("Stub!"); }
/* 149 */   public void injectInputEvent(InputEvent event) { throw new RuntimeException("Stub!"); }
/* 150 */   public android.transition.TransitionManager getTransitionManager() { throw new RuntimeException("Stub!"); }
/* 151 */   public void setTransitionManager(android.transition.TransitionManager tm) { throw new RuntimeException("Stub!"); }
/* 152 */   public android.transition.Scene getContentScene() { throw new RuntimeException("Stub!"); }
/* 153 */   public void setEnterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 154 */   public void setReturnTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 155 */   public void setExitTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 156 */   public void setReenterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 157 */   public Transition getEnterTransition() { throw new RuntimeException("Stub!"); }
/* 158 */   public Transition getReturnTransition() { throw new RuntimeException("Stub!"); }
/* 159 */   public Transition getExitTransition() { throw new RuntimeException("Stub!"); }
/* 160 */   public Transition getReenterTransition() { throw new RuntimeException("Stub!"); }
/* 161 */   public void setSharedElementEnterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 162 */   public void setSharedElementReturnTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 163 */   public Transition getSharedElementEnterTransition() { throw new RuntimeException("Stub!"); }
/* 164 */   public Transition getSharedElementReturnTransition() { throw new RuntimeException("Stub!"); }
/* 165 */   public void setSharedElementExitTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 166 */   public void setSharedElementReenterTransition(Transition transition) { throw new RuntimeException("Stub!"); }
/* 167 */   public Transition getSharedElementExitTransition() { throw new RuntimeException("Stub!"); }
/* 168 */   public Transition getSharedElementReenterTransition() { throw new RuntimeException("Stub!"); }
/* 169 */   public void setAllowEnterTransitionOverlap(boolean allow) { throw new RuntimeException("Stub!"); }
/* 170 */   public boolean getAllowEnterTransitionOverlap() { throw new RuntimeException("Stub!"); }
/* 171 */   public void setAllowReturnTransitionOverlap(boolean allow) { throw new RuntimeException("Stub!"); }
/* 172 */   public boolean getAllowReturnTransitionOverlap() { throw new RuntimeException("Stub!"); }
/* 173 */   public long getTransitionBackgroundFadeDuration() { throw new RuntimeException("Stub!"); }
/* 174 */   public void setTransitionBackgroundFadeDuration(long fadeDurationMillis) { throw new RuntimeException("Stub!"); }
/* 175 */   public boolean getSharedElementsUseOverlay() { throw new RuntimeException("Stub!"); }
/* 176 */   public void setSharedElementsUseOverlay(boolean sharedElementsUseOverlay) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int FEATURE_ACTION_BAR = 8;
/*     */   public static final int FEATURE_ACTION_BAR_OVERLAY = 9;
/*     */   public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
/*     */   public static final int FEATURE_ACTIVITY_TRANSITIONS = 13;
/*     */   public static final int FEATURE_CONTENT_TRANSITIONS = 12;
/*     */   public static final int FEATURE_CONTEXT_MENU = 6;
/*     */   public static final int FEATURE_CUSTOM_TITLE = 7;
/*     */   @Deprecated
/*     */   public static final int FEATURE_INDETERMINATE_PROGRESS = 5;
/*     */   public static final int FEATURE_LEFT_ICON = 3;
/*     */   public static final int FEATURE_NO_TITLE = 1;
/*     */   public static final int FEATURE_OPTIONS_PANEL = 0;
/*     */   @Deprecated
/*     */   public static final int FEATURE_PROGRESS = 2;
/*     */   public static final int FEATURE_RIGHT_ICON = 4;
/*     */   public static final int FEATURE_SWIPE_TO_DISMISS = 11;
/*     */   public static final int ID_ANDROID_CONTENT = 16908290;
/*     */   public static final String NAVIGATION_BAR_BACKGROUND_TRANSITION_NAME = "android:navigation:background";
/*     */   @Deprecated
/*     */   public static final int PROGRESS_END = 10000;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_INDETERMINATE_OFF = -4;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_INDETERMINATE_ON = -3;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_SECONDARY_END = 30000;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_SECONDARY_START = 20000;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_START = 0;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_VISIBILITY_OFF = -2;
/*     */   @Deprecated
/*     */   public static final int PROGRESS_VISIBILITY_ON = -1;
/*     */   public static final String STATUS_BAR_BACKGROUND_TRANSITION_NAME = "android:status:background";
/*     */   public abstract int getStatusBarColor();
/*     */   
/*     */   public abstract void setStatusBarColor(int paramInt);
/*     */   
/*     */   public abstract int getNavigationBarColor();
/*     */   
/*     */   public abstract void setNavigationBarColor(int paramInt);
/*     */   
/*     */   public abstract void setDecorCaptionShade(int paramInt);
/*     */   
/*     */   public abstract void setResizingCaptionDrawable(android.graphics.drawable.Drawable paramDrawable);
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\Window.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */