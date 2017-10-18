/*    */ package android.app;
/*    */ 
/*    */ import android.content.ComponentCallbacks;
/*    */ import android.content.ComponentCallbacks2;
/*    */ import android.content.Context;
/*    */ import android.content.ContextWrapper;
/*    */ import android.content.res.Configuration;
/*    */ import android.os.Bundle;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Application
/*    */   extends ContextWrapper
/*    */   implements ComponentCallbacks2
/*    */ {
/*    */   public Application()
/*    */   {
/* 36 */     super((Context)null);throw new RuntimeException("Stub!"); }
/* 37 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 38 */   public void onTerminate() { throw new RuntimeException("Stub!"); }
/* 39 */   public void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 40 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 41 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/* 42 */   public void registerComponentCallbacks(ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
/* 43 */   public void unregisterComponentCallbacks(ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
/* 44 */   public void registerActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) { throw new RuntimeException("Stub!"); }
/* 45 */   public void unregisterActivityLifecycleCallbacks(ActivityLifecycleCallbacks callback) { throw new RuntimeException("Stub!"); }
/* 46 */   public void registerOnProvideAssistDataListener(OnProvideAssistDataListener callback) { throw new RuntimeException("Stub!"); }
/* 47 */   public void unregisterOnProvideAssistDataListener(OnProvideAssistDataListener callback) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnProvideAssistDataListener
/*    */   {
/*    */     public abstract void onProvideAssistData(Activity paramActivity, Bundle paramBundle);
/*    */   }
/*    */   
/*    */   public static abstract interface ActivityLifecycleCallbacks
/*    */   {
/*    */     public abstract void onActivityCreated(Activity paramActivity, Bundle paramBundle);
/*    */     
/*    */     public abstract void onActivityStarted(Activity paramActivity);
/*    */     
/*    */     public abstract void onActivityResumed(Activity paramActivity);
/*    */     
/*    */     public abstract void onActivityPaused(Activity paramActivity);
/*    */     
/*    */     public abstract void onActivityStopped(Activity paramActivity);
/*    */     
/*    */     public abstract void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle);
/*    */     
/*    */     public abstract void onActivityDestroyed(Activity paramActivity);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\Application.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */