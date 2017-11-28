/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.graphics.Region;
/*    */ import android.os.Handler;
/*    */ import android.view.accessibility.AccessibilityNodeInfo;
/*    */ 
/*    */ 
/*    */ public abstract class AccessibilityService
/*    */   extends android.app.Service
/*    */ {
/*    */   public static final int GESTURE_SWIPE_DOWN = 2;
/*    */   public static final int GESTURE_SWIPE_DOWN_AND_LEFT = 15;
/*    */   public static final int GESTURE_SWIPE_DOWN_AND_RIGHT = 16;
/*    */   public static final int GESTURE_SWIPE_DOWN_AND_UP = 8;
/*    */   public static final int GESTURE_SWIPE_LEFT = 3;
/*    */   public static final int GESTURE_SWIPE_LEFT_AND_DOWN = 10;
/*    */   public static final int GESTURE_SWIPE_LEFT_AND_RIGHT = 5;
/*    */   public static final int GESTURE_SWIPE_LEFT_AND_UP = 9;
/*    */   public static final int GESTURE_SWIPE_RIGHT = 4;
/*    */   public static final int GESTURE_SWIPE_RIGHT_AND_DOWN = 12;
/*    */   public static final int GESTURE_SWIPE_RIGHT_AND_LEFT = 6;
/*    */   public static final int GESTURE_SWIPE_RIGHT_AND_UP = 11;
/*    */   public static final int GESTURE_SWIPE_UP = 1;
/*    */   
/*    */   public static final class MagnificationController
/*    */   {
/* 27 */     MagnificationController() { throw new RuntimeException("Stub!"); }
/* 28 */     public void addListener(OnMagnificationChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 29 */     public void addListener(OnMagnificationChangedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 30 */     public boolean removeListener(OnMagnificationChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 31 */     public float getScale() { throw new RuntimeException("Stub!"); }
/* 32 */     public float getCenterX() { throw new RuntimeException("Stub!"); }
/* 33 */     public float getCenterY() { throw new RuntimeException("Stub!"); }
/* 34 */     public Region getMagnificationRegion() { throw new RuntimeException("Stub!"); }
/* 35 */     public boolean reset(boolean animate) { throw new RuntimeException("Stub!"); }
/* 36 */     public boolean setScale(float scale, boolean animate) { throw new RuntimeException("Stub!"); }
/* 37 */     public boolean setCenter(float centerX, float centerY, boolean animate) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static abstract interface OnMagnificationChangedListener { public abstract void onMagnificationChanged(AccessibilityService.MagnificationController paramMagnificationController, Region paramRegion, float paramFloat1, float paramFloat2, float paramFloat3); } }
/*    */   
/*    */   public static final int GESTURE_SWIPE_UP_AND_DOWN = 7;
/*    */   public static final int GESTURE_SWIPE_UP_AND_LEFT = 13;
/*    */   public static final int GESTURE_SWIPE_UP_AND_RIGHT = 14;
/*    */   
/* 45 */   public static final class SoftKeyboardController { SoftKeyboardController() { throw new RuntimeException("Stub!"); }
/* 46 */     public void addOnShowModeChangedListener(OnShowModeChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 47 */     public void addOnShowModeChangedListener(OnShowModeChangedListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 48 */     public boolean removeOnShowModeChangedListener(OnShowModeChangedListener listener) { throw new RuntimeException("Stub!"); }
/* 49 */     public int getShowMode() { throw new RuntimeException("Stub!"); }
/* 50 */     public boolean setShowMode(int showMode) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static abstract interface OnShowModeChangedListener { public abstract void onShowModeChanged(AccessibilityService.SoftKeyboardController paramSoftKeyboardController, int paramInt); } }
/*    */   
/* 54 */   public static abstract class GestureResultCallback { public GestureResultCallback() { throw new RuntimeException("Stub!"); }
/* 55 */     public void onCompleted(GestureDescription gestureDescription) { throw new RuntimeException("Stub!"); }
/* 56 */     public void onCancelled(GestureDescription gestureDescription) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 58 */   public AccessibilityService() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onAccessibilityEvent(android.view.accessibility.AccessibilityEvent paramAccessibilityEvent);
/*    */   public abstract void onInterrupt();
/* 61 */   protected void onServiceConnected() { throw new RuntimeException("Stub!"); }
/* 62 */   protected boolean onGesture(int gestureId) { throw new RuntimeException("Stub!"); }
/* 63 */   protected boolean onKeyEvent(android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 64 */   public java.util.List<android.view.accessibility.AccessibilityWindowInfo> getWindows() { throw new RuntimeException("Stub!"); }
/* 65 */   public AccessibilityNodeInfo getRootInActiveWindow() { throw new RuntimeException("Stub!"); }
/* 66 */   public final void disableSelf() { throw new RuntimeException("Stub!"); }
/* 67 */   public final MagnificationController getMagnificationController() { throw new RuntimeException("Stub!"); }
/* 68 */   public final FingerprintGestureController getFingerprintGestureController() { throw new RuntimeException("Stub!"); }
/* 69 */   public final boolean dispatchGesture(GestureDescription gesture, GestureResultCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 70 */   public final SoftKeyboardController getSoftKeyboardController() { throw new RuntimeException("Stub!"); }
/* 71 */   public final AccessibilityButtonController getAccessibilityButtonController() { throw new RuntimeException("Stub!"); }
/* 72 */   public final boolean performGlobalAction(int action) { throw new RuntimeException("Stub!"); }
/* 73 */   public AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
/* 74 */   public final AccessibilityServiceInfo getServiceInfo() { throw new RuntimeException("Stub!"); }
/* 75 */   public final void setServiceInfo(AccessibilityServiceInfo info) { throw new RuntimeException("Stub!"); }
/* 76 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); }
/* 77 */   public final android.os.IBinder onBind(android.content.Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int GLOBAL_ACTION_BACK = 1;
/*    */   public static final int GLOBAL_ACTION_HOME = 2;
/*    */   public static final int GLOBAL_ACTION_NOTIFICATIONS = 4;
/*    */   public static final int GLOBAL_ACTION_POWER_DIALOG = 6;
/*    */   public static final int GLOBAL_ACTION_QUICK_SETTINGS = 5;
/*    */   public static final int GLOBAL_ACTION_RECENTS = 3;
/*    */   public static final int GLOBAL_ACTION_TOGGLE_SPLIT_SCREEN = 7;
/*    */   public static final String SERVICE_INTERFACE = "android.accessibilityservice.AccessibilityService";
/*    */   public static final String SERVICE_META_DATA = "android.accessibilityservice";
/*    */   public static final int SHOW_MODE_AUTO = 0;
/*    */   public static final int SHOW_MODE_HIDDEN = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\accessibilityservice\AccessibilityService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */