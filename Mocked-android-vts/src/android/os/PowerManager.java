/*    */ package android.os;
/*    */ 
/*    */ 
/*    */ public final class PowerManager
/*    */ {
/*    */   public static final int ACQUIRE_CAUSES_WAKEUP = 268435456;
/*    */   public static final String ACTION_DEVICE_IDLE_MODE_CHANGED = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
/*    */   public static final String ACTION_POWER_SAVE_MODE_CHANGED = "android.os.action.POWER_SAVE_MODE_CHANGED";
/*    */   @Deprecated
/*    */   public static final int FULL_WAKE_LOCK = 26;
/*    */   public static final int ON_AFTER_RELEASE = 536870912;
/*    */   public static final int PARTIAL_WAKE_LOCK = 1;
/*    */   public static final int PROXIMITY_SCREEN_OFF_WAKE_LOCK = 32;
/*    */   public static final int RELEASE_FLAG_WAIT_FOR_NO_PROXIMITY = 1;
/*    */   @Deprecated
/*    */   public static final int SCREEN_BRIGHT_WAKE_LOCK = 10;
/*    */   @Deprecated
/*    */   public static final int SCREEN_DIM_WAKE_LOCK = 6;
/*    */   
/*    */   public final class WakeLock
/*    */   {
/* 22 */     WakeLock() { throw new RuntimeException("Stub!"); }
/* 23 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 24 */     public void setReferenceCounted(boolean value) { throw new RuntimeException("Stub!"); }
/* 25 */     public void acquire() { throw new RuntimeException("Stub!"); }
/* 26 */     public void acquire(long timeout) { throw new RuntimeException("Stub!"); }
/* 27 */     public void release() { throw new RuntimeException("Stub!"); }
/* 28 */     public void release(int flags) { throw new RuntimeException("Stub!"); }
/* 29 */     public boolean isHeld() { throw new RuntimeException("Stub!"); }
/* 30 */     public void setWorkSource(WorkSource ws) { throw new RuntimeException("Stub!"); }
/* 31 */     public String toString() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   PowerManager() { throw new RuntimeException("Stub!"); }
/* 34 */   public WakeLock newWakeLock(int levelAndFlags, String tag) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isWakeLockLevelSupported(int level) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public boolean isScreenOn() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isInteractive() { throw new RuntimeException("Stub!"); }
/* 39 */   public void reboot(String reason) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isPowerSaveMode() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isDeviceIdleMode() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isIgnoringBatteryOptimizations(String packageName) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isSustainedPerformanceModeSupported() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\PowerManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */