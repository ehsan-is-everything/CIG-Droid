/*    */ package android.accessibilityservice;
/*    */ 
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class FingerprintGestureController
/*    */ {
/*    */   public static final int FINGERPRINT_GESTURE_SWIPE_DOWN = 8;
/*    */   public static final int FINGERPRINT_GESTURE_SWIPE_LEFT = 2;
/*    */   public static final int FINGERPRINT_GESTURE_SWIPE_RIGHT = 1;
/*    */   public static final int FINGERPRINT_GESTURE_SWIPE_UP = 4;
/*    */   
/*    */   public static abstract class FingerprintGestureCallback
/*    */   {
/* 22 */     public FingerprintGestureCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onGestureDetectionAvailabilityChanged(boolean available) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onGestureDetected(int gesture) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 26 */   FingerprintGestureController() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isGestureDetectionAvailable() { throw new RuntimeException("Stub!"); }
/* 28 */   public void registerFingerprintGestureCallback(FingerprintGestureCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 29 */   public void unregisterFingerprintGestureCallback(FingerprintGestureCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\accessibilityservice\FingerprintGestureController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */