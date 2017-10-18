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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AccessibilityButtonController
/*    */ {
/*    */   public static abstract class AccessibilityButtonCallback
/*    */   {
/* 22 */     public AccessibilityButtonCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onClicked(AccessibilityButtonController controller) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onAvailabilityChanged(AccessibilityButtonController controller, boolean available) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 26 */   AccessibilityButtonController() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isAccessibilityButtonAvailable() { throw new RuntimeException("Stub!"); }
/* 28 */   public void registerAccessibilityButtonCallback(AccessibilityButtonCallback callback) { throw new RuntimeException("Stub!"); }
/* 29 */   public void registerAccessibilityButtonCallback(AccessibilityButtonCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 30 */   public void unregisterAccessibilityButtonCallback(AccessibilityButtonCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\accessibilityservice\AccessibilityButtonController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */