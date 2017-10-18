/*    */ package android.view.accessibility;
/*    */ 
/*    */ import android.accessibilityservice.AccessibilityServiceInfo;
/*    */ import android.content.pm.ServiceInfo;
/*    */ import android.os.Handler;
/*    */ import java.util.List;
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
/*    */ public final class AccessibilityManager
/*    */ {
/* 28 */   AccessibilityManager() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isTouchExplorationEnabled() { throw new RuntimeException("Stub!"); }
/* 31 */   public void sendAccessibilityEvent(AccessibilityEvent event) { throw new RuntimeException("Stub!"); }
/* 32 */   public void interrupt() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public List<ServiceInfo> getAccessibilityServiceList() { throw new RuntimeException("Stub!"); }
/* 35 */   public List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList() { throw new RuntimeException("Stub!"); }
/* 36 */   public List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(int feedbackTypeFlags) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean addAccessibilityStateChangeListener(AccessibilityStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 38 */   public void addAccessibilityStateChangeListener(AccessibilityStateChangeListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean removeAccessibilityStateChangeListener(AccessibilityStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean addTouchExplorationStateChangeListener(TouchExplorationStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 41 */   public void addTouchExplorationStateChangeListener(TouchExplorationStateChangeListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean removeTouchExplorationStateChangeListener(TouchExplorationStateChangeListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface TouchExplorationStateChangeListener
/*    */   {
/*    */     public abstract void onTouchExplorationStateChanged(boolean paramBoolean);
/*    */   }
/*    */   
/*    */   public static abstract interface AccessibilityStateChangeListener
/*    */   {
/*    */     public abstract void onAccessibilityStateChanged(boolean paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\accessibility\AccessibilityManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */