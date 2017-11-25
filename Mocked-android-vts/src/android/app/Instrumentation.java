/*     */ package android.app;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.IntentFilter;
/*     */ import android.content.pm.ActivityInfo;
/*     */ import android.os.Bundle;
/*     */ import android.os.Looper;
/*     */ import android.os.PersistableBundle;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class Instrumentation
/*     */ {
/*     */   public static final String REPORT_KEY_IDENTIFIER = "id";
/*     */   public static final String REPORT_KEY_STREAMRESULT = "stream";
/*     */   
/*     */   public static class ActivityMonitor
/*     */   {
/*  22 */     public ActivityMonitor(IntentFilter which, Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
/*  23 */     public ActivityMonitor(String cls, Instrumentation.ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
/*  24 */     public ActivityMonitor() { throw new RuntimeException("Stub!"); }
/*  25 */     public final IntentFilter getFilter() { throw new RuntimeException("Stub!"); }
/*  26 */     public final Instrumentation.ActivityResult getResult() { throw new RuntimeException("Stub!"); }
/*  27 */     public final boolean isBlocking() { throw new RuntimeException("Stub!"); }
/*  28 */     public final int getHits() { throw new RuntimeException("Stub!"); }
/*  29 */     public final Activity getLastActivity() { throw new RuntimeException("Stub!"); }
/*  30 */     public final Activity waitForActivity() { throw new RuntimeException("Stub!"); }
/*  31 */     public final Activity waitForActivityWithTimeout(long timeOut) { throw new RuntimeException("Stub!"); }
/*  32 */     public Instrumentation.ActivityResult onStartActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class ActivityResult {
/*  36 */     public ActivityResult(int resultCode, Intent resultData) { throw new RuntimeException("Stub!"); }
/*  37 */     public int getResultCode() { throw new RuntimeException("Stub!"); }
/*  38 */     public Intent getResultData() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  40 */   public Instrumentation() { throw new RuntimeException("Stub!"); }
/*  41 */   public void onCreate(Bundle arguments) { throw new RuntimeException("Stub!"); }
/*  42 */   public void start() { throw new RuntimeException("Stub!"); }
/*  43 */   public void onStart() { throw new RuntimeException("Stub!"); }
/*  44 */   public boolean onException(Object obj, Throwable e) { throw new RuntimeException("Stub!"); }
/*  45 */   public void sendStatus(int resultCode, Bundle results) { throw new RuntimeException("Stub!"); }
/*  46 */   public void addResults(Bundle results) { throw new RuntimeException("Stub!"); }
/*  47 */   public void finish(int resultCode, Bundle results) { throw new RuntimeException("Stub!"); }
/*  48 */   public void setAutomaticPerformanceSnapshots() { throw new RuntimeException("Stub!"); }
/*  49 */   public void startPerformanceSnapshot() { throw new RuntimeException("Stub!"); }
/*  50 */   public void endPerformanceSnapshot() { throw new RuntimeException("Stub!"); }
/*  51 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/*  52 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/*  53 */   public android.content.ComponentName getComponentName() { throw new RuntimeException("Stub!"); }
/*  54 */   public Context getTargetContext() { throw new RuntimeException("Stub!"); }
/*  55 */   public String getProcessName() { throw new RuntimeException("Stub!"); }
/*  56 */   public boolean isProfiling() { throw new RuntimeException("Stub!"); }
/*  57 */   public void startProfiling() { throw new RuntimeException("Stub!"); }
/*  58 */   public void stopProfiling() { throw new RuntimeException("Stub!"); }
/*  59 */   public void setInTouchMode(boolean inTouch) { throw new RuntimeException("Stub!"); }
/*  60 */   public void waitForIdle(Runnable recipient) { throw new RuntimeException("Stub!"); }
/*  61 */   public void waitForIdleSync() { throw new RuntimeException("Stub!"); }
/*  62 */   public void runOnMainSync(Runnable runner) { throw new RuntimeException("Stub!"); }
/*  63 */   public Activity startActivitySync(Intent intent) { throw new RuntimeException("Stub!"); }
/*  64 */   public void addMonitor(ActivityMonitor monitor) { throw new RuntimeException("Stub!"); }
/*  65 */   public ActivityMonitor addMonitor(IntentFilter filter, ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
/*  66 */   public ActivityMonitor addMonitor(String cls, ActivityResult result, boolean block) { throw new RuntimeException("Stub!"); }
/*  67 */   public boolean checkMonitorHit(ActivityMonitor monitor, int minHits) { throw new RuntimeException("Stub!"); }
/*  68 */   public Activity waitForMonitor(ActivityMonitor monitor) { throw new RuntimeException("Stub!"); }
/*  69 */   public Activity waitForMonitorWithTimeout(ActivityMonitor monitor, long timeOut) { throw new RuntimeException("Stub!"); }
/*  70 */   public void removeMonitor(ActivityMonitor monitor) { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean invokeMenuActionSync(Activity targetActivity, int id, int flag) { throw new RuntimeException("Stub!"); }
/*  72 */   public boolean invokeContextMenuAction(Activity targetActivity, int id, int flag) { throw new RuntimeException("Stub!"); }
/*  73 */   public void sendStringSync(String text) { throw new RuntimeException("Stub!"); }
/*  74 */   public void sendKeySync(KeyEvent event) { throw new RuntimeException("Stub!"); }
/*  75 */   public void sendKeyDownUpSync(int key) { throw new RuntimeException("Stub!"); }
/*  76 */   public void sendCharacterSync(int keyCode) { throw new RuntimeException("Stub!"); }
/*  77 */   public void sendPointerSync(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*  78 */   public void sendTrackballEventSync(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*  79 */   public Application newApplication(ClassLoader cl, String className, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/*  80 */   public static Application newApplication(Class<?> clazz, Context context) throws InstantiationException, IllegalAccessException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/*  81 */   public void callApplicationOnCreate(Application app) { throw new RuntimeException("Stub!"); }
/*  82 */   public Activity newActivity(Class<?> clazz, Context context, android.os.IBinder token, Application application, Intent intent, ActivityInfo info, CharSequence title, Activity parent, String id, Object lastNonConfigurationInstance) throws InstantiationException, IllegalAccessException { throw new RuntimeException("Stub!"); }
/*  83 */   public Activity newActivity(ClassLoader cl, String className, Intent intent) throws InstantiationException, IllegalAccessException, ClassNotFoundException { throw new RuntimeException("Stub!"); }
/*  84 */   public void callActivityOnCreate(Activity activity, Bundle icicle) { throw new RuntimeException("Stub!"); }
/*  85 */   public void callActivityOnCreate(Activity activity, Bundle icicle, PersistableBundle persistentState) { throw new RuntimeException("Stub!"); }
/*  86 */   public void callActivityOnDestroy(Activity activity) { throw new RuntimeException("Stub!"); }
/*  87 */   public void callActivityOnRestoreInstanceState(Activity activity, Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*  88 */   public void callActivityOnRestoreInstanceState(Activity activity, Bundle savedInstanceState, PersistableBundle persistentState) { throw new RuntimeException("Stub!"); }
/*  89 */   public void callActivityOnPostCreate(Activity activity, Bundle icicle) { throw new RuntimeException("Stub!"); }
/*  90 */   public void callActivityOnPostCreate(Activity activity, Bundle icicle, PersistableBundle persistentState) { throw new RuntimeException("Stub!"); }
/*  91 */   public void callActivityOnNewIntent(Activity activity, Intent intent) { throw new RuntimeException("Stub!"); }
/*  92 */   public void callActivityOnStart(Activity activity) { throw new RuntimeException("Stub!"); }
/*  93 */   public void callActivityOnRestart(Activity activity) { throw new RuntimeException("Stub!"); }
/*  94 */   public void callActivityOnResume(Activity activity) { throw new RuntimeException("Stub!"); }
/*  95 */   public void callActivityOnStop(Activity activity) { throw new RuntimeException("Stub!"); }
/*  96 */   public void callActivityOnSaveInstanceState(Activity activity, Bundle outState) { throw new RuntimeException("Stub!"); }
/*  97 */   public void callActivityOnSaveInstanceState(Activity activity, Bundle outState, PersistableBundle outPersistentState) { throw new RuntimeException("Stub!"); }
/*  98 */   public void callActivityOnPause(Activity activity) { throw new RuntimeException("Stub!"); }
/*  99 */   public void callActivityOnUserLeaving(Activity activity) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 101 */   public void startAllocCounting() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 103 */   public void stopAllocCounting() { throw new RuntimeException("Stub!"); }
/* 104 */   public Bundle getAllocCounts() { throw new RuntimeException("Stub!"); }
/* 105 */   public Bundle getBinderCounts() { throw new RuntimeException("Stub!"); }
/* 106 */   public UiAutomation getUiAutomation() { throw new RuntimeException("Stub!"); }
/* 107 */   public UiAutomation getUiAutomation(int flags) { throw new RuntimeException("Stub!"); }
/* 108 */   public android.os.TestLooperManager acquireLooperManager(Looper looper) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\Instrumentation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */