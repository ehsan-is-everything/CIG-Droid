/*    */ package android.app;
/*    */ 
/*    */ import android.accessibilityservice.AccessibilityServiceInfo;
/*    */ import android.graphics.Bitmap;
/*    */ import android.os.ParcelFileDescriptor;
/*    */ import android.view.InputEvent;
/*    */ import android.view.WindowAnimationFrameStats;
/*    */ import android.view.WindowContentFrameStats;
/*    */ import android.view.accessibility.AccessibilityEvent;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ import android.view.accessibility.AccessibilityWindowInfo;
/*    */ import java.util.List;
/*    */ import java.util.concurrent.TimeoutException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class UiAutomation
/*    */ {
/*    */   public static final int FLAG_DONT_SUPPRESS_ACCESSIBILITY_SERVICES = 1;
/*    */   public static final int ROTATION_FREEZE_0 = 0;
/*    */   public static final int ROTATION_FREEZE_180 = 2;
/*    */   public static final int ROTATION_FREEZE_270 = 3;
/*    */   public static final int ROTATION_FREEZE_90 = 1;
/*    */   public static final int ROTATION_FREEZE_CURRENT = -1;
/*    */   public static final int ROTATION_UNFREEZE = -2;
/*    */   
/* 28 */   UiAutomation() { throw new RuntimeException("Stub!"); }
/* 29 */   public void setOnAccessibilityEventListener(OnAccessibilityEventListener listener) { throw new RuntimeException("Stub!"); }
/* 30 */   public final boolean performGlobalAction(int action) { throw new RuntimeException("Stub!"); }
/* 31 */   public AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
/* 32 */   public final AccessibilityServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
/* 33 */   public final void setServiceInfo(AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); }
/* 34 */   public List<AccessibilityWindowInfo> getWindows() { throw new RuntimeException("Stub!"); }
/* 35 */   public AccessibilityNodeInfo getRootInActiveWindow() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean injectInputEvent(InputEvent event, boolean sync) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean setRotation(int rotation) { throw new RuntimeException("Stub!"); }
/* 38 */   public AccessibilityEvent executeAndWaitForEvent(Runnable command, AccessibilityEventFilter filter, long timeoutMillis) throws TimeoutException { throw new RuntimeException("Stub!"); }
/* 39 */   public void waitForIdle(long idleTimeoutMillis, long globalTimeoutMillis) throws TimeoutException { throw new RuntimeException("Stub!"); }
/* 40 */   public Bitmap takeScreenshot() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setRunAsMonkey(boolean enable) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean clearWindowContentFrameStats(int windowId) { throw new RuntimeException("Stub!"); }
/* 43 */   public WindowContentFrameStats getWindowContentFrameStats(int windowId) { throw new RuntimeException("Stub!"); }
/* 44 */   public void clearWindowAnimationFrameStats() { throw new RuntimeException("Stub!"); }
/* 45 */   public WindowAnimationFrameStats getWindowAnimationFrameStats() { throw new RuntimeException("Stub!"); }
/* 46 */   public ParcelFileDescriptor executeShellCommand(String command) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface AccessibilityEventFilter
/*    */   {
/*    */     public abstract boolean accept(AccessibilityEvent paramAccessibilityEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnAccessibilityEventListener
/*    */   {
/*    */     public abstract void onAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\UiAutomation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */