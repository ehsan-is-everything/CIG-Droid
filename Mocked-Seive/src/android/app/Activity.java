/*     */ package android.app;
/*     */ 
/*     */ import android.content.Intent;
/*     */ import android.content.IntentSender;
/*     */ import android.os.Bundle;
/*     */ import android.view.ActionMode.Callback;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.Menu;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ 
/*     */ public class Activity
/*     */   extends android.view.ContextThemeWrapper
/*     */   implements android.view.LayoutInflater.Factory2, android.view.Window.Callback, android.view.KeyEvent.Callback, android.view.View.OnCreateContextMenuListener, android.content.ComponentCallbacks2
/*     */ {
/*     */   public static final int DEFAULT_KEYS_DIALER = 1;
/*     */   public static final int DEFAULT_KEYS_DISABLE = 0;
/*     */   public static final int DEFAULT_KEYS_SEARCH_GLOBAL = 4;
/*     */   public static final int DEFAULT_KEYS_SEARCH_LOCAL = 3;
/*     */   public static final int DEFAULT_KEYS_SHORTCUT = 2;
/*     */   
/*  22 */   public Activity() { throw new RuntimeException("Stub!"); }
/*  23 */   public Intent getIntent() { throw new RuntimeException("Stub!"); }
/*  24 */   public void setIntent(Intent newIntent) { throw new RuntimeException("Stub!"); }
/*  25 */   public final Application getApplication() { throw new RuntimeException("Stub!"); }
/*  26 */   public final boolean isChild() { throw new RuntimeException("Stub!"); }
/*  27 */   public final Activity getParent() { throw new RuntimeException("Stub!"); }
/*  28 */   public android.view.WindowManager getWindowManager() { throw new RuntimeException("Stub!"); }
/*  29 */   public android.view.Window getWindow() { throw new RuntimeException("Stub!"); }
/*  30 */   public LoaderManager getLoaderManager() { throw new RuntimeException("Stub!"); }
/*  31 */   public View getCurrentFocus() { throw new RuntimeException("Stub!"); }
/*  32 */   protected void onCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  33 */   public void onCreate(Bundle savedInstanceState, android.os.PersistableBundle persistentState) { throw new RuntimeException("Stub!"); }
/*  34 */   protected void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  35 */   public void onRestoreInstanceState(Bundle savedInstanceState, android.os.PersistableBundle persistentState) { throw new RuntimeException("Stub!"); }
/*  36 */   protected void onPostCreate(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  37 */   public void onPostCreate(Bundle savedInstanceState, android.os.PersistableBundle persistentState) { throw new RuntimeException("Stub!"); }
/*  38 */   protected void onStart() { throw new RuntimeException("Stub!"); }
/*  39 */   protected void onRestart() { throw new RuntimeException("Stub!"); }
/*  40 */   public void onStateNotSaved() { throw new RuntimeException("Stub!"); }
/*  41 */   protected void onResume() { throw new RuntimeException("Stub!"); }
/*  42 */   protected void onPostResume() { throw new RuntimeException("Stub!"); }
/*  43 */   public boolean isVoiceInteraction() { throw new RuntimeException("Stub!"); }
/*  44 */   public boolean isVoiceInteractionRoot() { throw new RuntimeException("Stub!"); }
/*  45 */   public VoiceInteractor getVoiceInteractor() { throw new RuntimeException("Stub!"); }
/*  46 */   public boolean isLocalVoiceInteractionSupported() { throw new RuntimeException("Stub!"); }
/*  47 */   public void startLocalVoiceInteraction(Bundle privateOptions) { throw new RuntimeException("Stub!"); }
/*  48 */   public void onLocalVoiceInteractionStarted() { throw new RuntimeException("Stub!"); }
/*  49 */   public void onLocalVoiceInteractionStopped() { throw new RuntimeException("Stub!"); }
/*  50 */   public void stopLocalVoiceInteraction() { throw new RuntimeException("Stub!"); }
/*  51 */   protected void onNewIntent(Intent intent) { throw new RuntimeException("Stub!"); }
/*  52 */   protected void onSaveInstanceState(Bundle outState) { throw new RuntimeException("Stub!"); }
/*  53 */   public void onSaveInstanceState(Bundle outState, android.os.PersistableBundle outPersistentState) { throw new RuntimeException("Stub!"); }
/*  54 */   protected void onPause() { throw new RuntimeException("Stub!"); }
/*  55 */   protected void onUserLeaveHint() { throw new RuntimeException("Stub!"); }
/*  56 */   public boolean onCreateThumbnail(android.graphics.Bitmap outBitmap, android.graphics.Canvas canvas) { throw new RuntimeException("Stub!"); }
/*  57 */   public CharSequence onCreateDescription() { throw new RuntimeException("Stub!"); }
/*  58 */   public void onProvideAssistData(Bundle data) { throw new RuntimeException("Stub!"); }
/*  59 */   public void onProvideAssistContent(android.app.assist.AssistContent outContent) { throw new RuntimeException("Stub!"); }
/*  60 */   public final void requestShowKeyboardShortcuts() { throw new RuntimeException("Stub!"); }
/*  61 */   public final void dismissKeyboardShortcutsHelper() { throw new RuntimeException("Stub!"); }
/*  62 */   public void onProvideKeyboardShortcuts(java.util.List<android.view.KeyboardShortcutGroup> data, Menu menu, int deviceId) { throw new RuntimeException("Stub!"); }
/*  63 */   public boolean showAssist(Bundle args) { throw new RuntimeException("Stub!"); }
/*  64 */   protected void onStop() { throw new RuntimeException("Stub!"); }
/*  65 */   protected void onDestroy() { throw new RuntimeException("Stub!"); }
/*  66 */   public void reportFullyDrawn() { throw new RuntimeException("Stub!"); }
/*  67 */   public void onMultiWindowModeChanged(boolean isInMultiWindowMode, android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  69 */   public void onMultiWindowModeChanged(boolean isInMultiWindowMode) { throw new RuntimeException("Stub!"); }
/*  70 */   public boolean isInMultiWindowMode() { throw new RuntimeException("Stub!"); }
/*  71 */   public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  73 */   public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) { throw new RuntimeException("Stub!"); }
/*  74 */   public boolean isInPictureInPictureMode() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  76 */   public void enterPictureInPictureMode() { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean enterPictureInPictureMode(PictureInPictureParams params) { throw new RuntimeException("Stub!"); }
/*  78 */   public void setPictureInPictureParams(PictureInPictureParams params) { throw new RuntimeException("Stub!"); }
/*  79 */   public int getMaxNumPictureInPictureActions() { throw new RuntimeException("Stub!"); }
/*  80 */   public void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*  81 */   public int getChangingConfigurations() { throw new RuntimeException("Stub!"); }
/*  82 */   public Object getLastNonConfigurationInstance() { throw new RuntimeException("Stub!"); }
/*  83 */   public Object onRetainNonConfigurationInstance() { throw new RuntimeException("Stub!"); }
/*  84 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/*  85 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/*  86 */   public FragmentManager getFragmentManager() { throw new RuntimeException("Stub!"); }
/*  87 */   public void onAttachFragment(Fragment fragment) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  89 */   public final android.database.Cursor managedQuery(android.net.Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  91 */   public void startManagingCursor(android.database.Cursor c) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  93 */   public void stopManagingCursor(android.database.Cursor c) { throw new RuntimeException("Stub!"); }
/*  94 */   public <T extends View> T findViewById(int id) { throw new RuntimeException("Stub!"); }
/*  95 */   public ActionBar getActionBar() { throw new RuntimeException("Stub!"); }
/*  96 */   public void setActionBar(android.widget.Toolbar toolbar) { throw new RuntimeException("Stub!"); }
/*  97 */   public void setContentView(int layoutResID) { throw new RuntimeException("Stub!"); }
/*  98 */   public void setContentView(View view) { throw new RuntimeException("Stub!"); }
/*  99 */   public void setContentView(View view, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 100 */   public void addContentView(View view, android.view.ViewGroup.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 101 */   public android.transition.TransitionManager getContentTransitionManager() { throw new RuntimeException("Stub!"); }
/* 102 */   public void setContentTransitionManager(android.transition.TransitionManager tm) { throw new RuntimeException("Stub!"); }
/* 103 */   public android.transition.Scene getContentScene() { throw new RuntimeException("Stub!"); }
/* 104 */   public void setFinishOnTouchOutside(boolean finish) { throw new RuntimeException("Stub!"); }
/* 105 */   public final void setDefaultKeyMode(int mode) { throw new RuntimeException("Stub!"); }
/* 106 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 107 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 108 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 109 */   public boolean onKeyMultiple(int keyCode, int repeatCount, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 110 */   public void onBackPressed() { throw new RuntimeException("Stub!"); }
/* 111 */   public boolean onKeyShortcut(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 112 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 113 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 114 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 115 */   public void onUserInteraction() { throw new RuntimeException("Stub!"); }
/* 116 */   public void onWindowAttributesChanged(android.view.WindowManager.LayoutParams params) { throw new RuntimeException("Stub!"); }
/* 117 */   public void onContentChanged() { throw new RuntimeException("Stub!"); }
/* 118 */   public void onWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 119 */   public void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 120 */   public void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 121 */   public boolean hasWindowFocus() { throw new RuntimeException("Stub!"); }
/* 122 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 123 */   public boolean dispatchKeyShortcutEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 124 */   public boolean dispatchTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 125 */   public boolean dispatchTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 126 */   public boolean dispatchGenericMotionEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 127 */   public boolean dispatchPopulateAccessibilityEvent(android.view.accessibility.AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 128 */   public View onCreatePanelView(int featureId) { throw new RuntimeException("Stub!"); }
/* 129 */   public boolean onCreatePanelMenu(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/* 130 */   public boolean onPreparePanel(int featureId, View view, Menu menu) { throw new RuntimeException("Stub!"); }
/* 131 */   public boolean onMenuOpened(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/* 132 */   public boolean onMenuItemSelected(int featureId, android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
/* 133 */   public void onPanelClosed(int featureId, Menu menu) { throw new RuntimeException("Stub!"); }
/* 134 */   public void invalidateOptionsMenu() { throw new RuntimeException("Stub!"); }
/* 135 */   public boolean onCreateOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); }
/* 136 */   public boolean onPrepareOptionsMenu(Menu menu) { throw new RuntimeException("Stub!"); }
/* 137 */   public boolean onOptionsItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
/* 138 */   public boolean onNavigateUp() { throw new RuntimeException("Stub!"); }
/* 139 */   public boolean onNavigateUpFromChild(Activity child) { throw new RuntimeException("Stub!"); }
/* 140 */   public void onCreateNavigateUpTaskStack(TaskStackBuilder builder) { throw new RuntimeException("Stub!"); }
/* 141 */   public void onPrepareNavigateUpTaskStack(TaskStackBuilder builder) { throw new RuntimeException("Stub!"); }
/* 142 */   public void onOptionsMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); }
/* 143 */   public void openOptionsMenu() { throw new RuntimeException("Stub!"); }
/* 144 */   public void closeOptionsMenu() { throw new RuntimeException("Stub!"); }
/* 145 */   public void onCreateContextMenu(android.view.ContextMenu menu, View v, android.view.ContextMenu.ContextMenuInfo menuInfo) { throw new RuntimeException("Stub!"); }
/* 146 */   public void registerForContextMenu(View view) { throw new RuntimeException("Stub!"); }
/* 147 */   public void unregisterForContextMenu(View view) { throw new RuntimeException("Stub!"); }
/* 148 */   public void openContextMenu(View view) { throw new RuntimeException("Stub!"); }
/* 149 */   public void closeContextMenu() { throw new RuntimeException("Stub!"); }
/* 150 */   public boolean onContextItemSelected(android.view.MenuItem item) { throw new RuntimeException("Stub!"); }
/* 151 */   public void onContextMenuClosed(Menu menu) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 153 */   protected Dialog onCreateDialog(int id) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 155 */   protected Dialog onCreateDialog(int id, Bundle args) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 157 */   protected void onPrepareDialog(int id, Dialog dialog) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 159 */   protected void onPrepareDialog(int id, Dialog dialog, Bundle args) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 161 */   public final void showDialog(int id) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 163 */   public final boolean showDialog(int id, Bundle args) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 165 */   public final void dismissDialog(int id) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 167 */   public final void removeDialog(int id) { throw new RuntimeException("Stub!"); }
/* 168 */   public boolean onSearchRequested(android.view.SearchEvent searchEvent) { throw new RuntimeException("Stub!"); }
/* 169 */   public boolean onSearchRequested() { throw new RuntimeException("Stub!"); }
/* 170 */   public final android.view.SearchEvent getSearchEvent() { throw new RuntimeException("Stub!"); }
/* 171 */   public void startSearch(String initialQuery, boolean selectInitialQuery, Bundle appSearchData, boolean globalSearch) { throw new RuntimeException("Stub!"); }
/* 172 */   public void triggerSearch(String query, Bundle appSearchData) { throw new RuntimeException("Stub!"); }
/* 173 */   public void takeKeyEvents(boolean get) { throw new RuntimeException("Stub!"); }
/* 174 */   public final boolean requestWindowFeature(int featureId) { throw new RuntimeException("Stub!"); }
/* 175 */   public final void setFeatureDrawableResource(int featureId, int resId) { throw new RuntimeException("Stub!"); }
/* 176 */   public final void setFeatureDrawableUri(int featureId, android.net.Uri uri) { throw new RuntimeException("Stub!"); }
/* 177 */   public final void setFeatureDrawable(int featureId, android.graphics.drawable.Drawable drawable) { throw new RuntimeException("Stub!"); }
/* 178 */   public final void setFeatureDrawableAlpha(int featureId, int alpha) { throw new RuntimeException("Stub!"); }
/* 179 */   public android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
/* 180 */   public android.view.MenuInflater getMenuInflater() { throw new RuntimeException("Stub!"); }
/* 181 */   public void setTheme(int resid) { throw new RuntimeException("Stub!"); }
/* 182 */   protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int resid, boolean first) { throw new RuntimeException("Stub!"); }
/* 183 */   public final void requestPermissions(String[] permissions, int requestCode) { throw new RuntimeException("Stub!"); }
/* 184 */   public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) { throw new RuntimeException("Stub!"); }
/* 185 */   public boolean shouldShowRequestPermissionRationale(String permission) { throw new RuntimeException("Stub!"); }
/* 186 */   public void startActivityForResult(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
/* 187 */   public void startActivityForResult(Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/* 188 */   public boolean isActivityTransitionRunning() { throw new RuntimeException("Stub!"); }
/* 189 */   public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 190 */   public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 191 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/* 192 */   public void startActivity(Intent intent, Bundle options) { throw new RuntimeException("Stub!"); }
/* 193 */   public void startActivities(Intent[] intents) { throw new RuntimeException("Stub!"); }
/* 194 */   public void startActivities(Intent[] intents, Bundle options) { throw new RuntimeException("Stub!"); }
/* 195 */   public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 196 */   public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 197 */   public boolean startActivityIfNeeded(Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
/* 198 */   public boolean startActivityIfNeeded(Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/* 199 */   public boolean startNextMatchingActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/* 200 */   public boolean startNextMatchingActivity(Intent intent, Bundle options) { throw new RuntimeException("Stub!"); }
/* 201 */   public void startActivityFromChild(Activity child, Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
/* 202 */   public void startActivityFromChild(Activity child, Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/* 203 */   public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode) { throw new RuntimeException("Stub!"); }
/* 204 */   public void startActivityFromFragment(Fragment fragment, Intent intent, int requestCode, Bundle options) { throw new RuntimeException("Stub!"); }
/* 205 */   public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 206 */   public void startIntentSenderFromChild(Activity child, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/* 207 */   public void overridePendingTransition(int enterAnim, int exitAnim) { throw new RuntimeException("Stub!"); }
/* 208 */   public final void setResult(int resultCode) { throw new RuntimeException("Stub!"); }
/* 209 */   public final void setResult(int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/* 210 */   public android.net.Uri getReferrer() { throw new RuntimeException("Stub!"); }
/* 211 */   public android.net.Uri onProvideReferrer() { throw new RuntimeException("Stub!"); }
/* 212 */   public String getCallingPackage() { throw new RuntimeException("Stub!"); }
/* 213 */   public android.content.ComponentName getCallingActivity() { throw new RuntimeException("Stub!"); }
/* 214 */   public void setVisible(boolean visible) { throw new RuntimeException("Stub!"); }
/* 215 */   public boolean isFinishing() { throw new RuntimeException("Stub!"); }
/* 216 */   public boolean isDestroyed() { throw new RuntimeException("Stub!"); }
/* 217 */   public boolean isChangingConfigurations() { throw new RuntimeException("Stub!"); }
/* 218 */   public void recreate() { throw new RuntimeException("Stub!"); }
/* 219 */   public void finish() { throw new RuntimeException("Stub!"); }
/* 220 */   public void finishAffinity() { throw new RuntimeException("Stub!"); }
/* 221 */   public void finishFromChild(Activity child) { throw new RuntimeException("Stub!"); }
/* 222 */   public void finishAfterTransition() { throw new RuntimeException("Stub!"); }
/* 223 */   public void finishActivity(int requestCode) { throw new RuntimeException("Stub!"); }
/* 224 */   public void finishActivityFromChild(Activity child, int requestCode) { throw new RuntimeException("Stub!"); }
/* 225 */   public void finishAndRemoveTask() { throw new RuntimeException("Stub!"); }
/* 226 */   public boolean releaseInstance() { throw new RuntimeException("Stub!"); }
/* 227 */   protected void onActivityResult(int requestCode, int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/* 228 */   public void onActivityReenter(int resultCode, Intent data) { throw new RuntimeException("Stub!"); }
/* 229 */   public PendingIntent createPendingResult(int requestCode, Intent data, int flags) { throw new RuntimeException("Stub!"); }
/* 230 */   public void setRequestedOrientation(int requestedOrientation) { throw new RuntimeException("Stub!"); }
/* 231 */   public int getRequestedOrientation() { throw new RuntimeException("Stub!"); }
/* 232 */   public int getTaskId() { throw new RuntimeException("Stub!"); }
/* 233 */   public boolean isTaskRoot() { throw new RuntimeException("Stub!"); }
/* 234 */   public boolean moveTaskToBack(boolean nonRoot) { throw new RuntimeException("Stub!"); }
/* 235 */   public String getLocalClassName() { throw new RuntimeException("Stub!"); }
/* 236 */   public android.content.ComponentName getComponentName() { throw new RuntimeException("Stub!"); }
/* 237 */   public android.content.SharedPreferences getPreferences(int mode) { throw new RuntimeException("Stub!"); }
/* 238 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); }
/* 239 */   public void setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 240 */   public void setTitle(int titleId) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 242 */   public void setTitleColor(int textColor) { throw new RuntimeException("Stub!"); }
/* 243 */   public final CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/* 244 */   public final int getTitleColor() { throw new RuntimeException("Stub!"); }
/* 245 */   protected void onTitleChanged(CharSequence title, int color) { throw new RuntimeException("Stub!"); }
/* 246 */   protected void onChildTitleChanged(Activity childActivity, CharSequence title) { throw new RuntimeException("Stub!"); }
/* 247 */   public void setTaskDescription(ActivityManager.TaskDescription taskDescription) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 249 */   public final void setProgressBarVisibility(boolean visible) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 251 */   public final void setProgressBarIndeterminateVisibility(boolean visible) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 253 */   public final void setProgressBarIndeterminate(boolean indeterminate) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 255 */   public final void setProgress(int progress) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 257 */   public final void setSecondaryProgress(int secondaryProgress) { throw new RuntimeException("Stub!"); }
/* 258 */   public final void setVolumeControlStream(int streamType) { throw new RuntimeException("Stub!"); }
/* 259 */   public final int getVolumeControlStream() { throw new RuntimeException("Stub!"); }
/* 260 */   public final void setMediaController(android.media.session.MediaController controller) { throw new RuntimeException("Stub!"); }
/* 261 */   public final android.media.session.MediaController getMediaController() { throw new RuntimeException("Stub!"); }
/* 262 */   public final void runOnUiThread(Runnable action) { throw new RuntimeException("Stub!"); }
/* 263 */   public View onCreateView(String name, android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 264 */   public View onCreateView(View parent, String name, android.content.Context context, android.util.AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 265 */   public void dump(String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/* 266 */   public boolean isImmersive() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 268 */   public boolean requestVisibleBehind(boolean visible) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 270 */   public void onVisibleBehindCanceled() { throw new RuntimeException("Stub!"); }
/* 271 */   public void onEnterAnimationComplete() { throw new RuntimeException("Stub!"); }
/* 272 */   public void setImmersive(boolean i) { throw new RuntimeException("Stub!"); }
/* 273 */   public void setVrModeEnabled(boolean enabled, android.content.ComponentName requestedComponent) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 274 */   public android.view.ActionMode startActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
/* 275 */   public android.view.ActionMode startActionMode(ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
/* 276 */   public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) { throw new RuntimeException("Stub!"); }
/* 277 */   public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) { throw new RuntimeException("Stub!"); }
/* 278 */   public void onActionModeStarted(android.view.ActionMode mode) { throw new RuntimeException("Stub!"); }
/* 279 */   public void onActionModeFinished(android.view.ActionMode mode) { throw new RuntimeException("Stub!"); }
/* 280 */   public boolean shouldUpRecreateTask(Intent targetIntent) { throw new RuntimeException("Stub!"); }
/* 281 */   public boolean navigateUpTo(Intent upIntent) { throw new RuntimeException("Stub!"); }
/* 282 */   public boolean navigateUpToFromChild(Activity child, Intent upIntent) { throw new RuntimeException("Stub!"); }
/* 283 */   public Intent getParentActivityIntent() { throw new RuntimeException("Stub!"); }
/* 284 */   public void setEnterSharedElementCallback(SharedElementCallback callback) { throw new RuntimeException("Stub!"); }
/* 285 */   public void setExitSharedElementCallback(SharedElementCallback callback) { throw new RuntimeException("Stub!"); }
/* 286 */   public void postponeEnterTransition() { throw new RuntimeException("Stub!"); }
/* 287 */   public void startPostponedEnterTransition() { throw new RuntimeException("Stub!"); }
/* 288 */   public android.view.DragAndDropPermissions requestDragAndDropPermissions(android.view.DragEvent event) { throw new RuntimeException("Stub!"); }
/* 289 */   public void startLockTask() { throw new RuntimeException("Stub!"); }
/* 290 */   public void stopLockTask() { throw new RuntimeException("Stub!"); }
/* 291 */   public void showLockTaskEscapeMessage() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 297 */   protected static final int[] FOCUSED_STATE_SET = null;
/*     */   public static final int RESULT_CANCELED = 0;
/*     */   public static final int RESULT_FIRST_USER = 1;
/*     */   public static final int RESULT_OK = -1;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\Activity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */