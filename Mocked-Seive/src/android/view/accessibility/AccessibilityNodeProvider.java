/*    */ package android.view.accessibility;
/*    */ 
/*    */ import android.os.Bundle;
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
/*    */ public abstract class AccessibilityNodeProvider
/*    */ {
/*    */   public static final int HOST_VIEW_ID = -1;
/*    */   
/* 20 */   public AccessibilityNodeProvider() { throw new RuntimeException("Stub!"); }
/* 21 */   public AccessibilityNodeInfo createAccessibilityNodeInfo(int virtualViewId) { throw new RuntimeException("Stub!"); }
/* 22 */   public void addExtraDataToAccessibilityNodeInfo(int virtualViewId, AccessibilityNodeInfo info, String extraDataKey, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean performAction(int virtualViewId, int action, Bundle arguments) { throw new RuntimeException("Stub!"); }
/* 24 */   public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String text, int virtualViewId) { throw new RuntimeException("Stub!"); }
/* 25 */   public AccessibilityNodeInfo findFocus(int focus) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\accessibility\AccessibilityNodeProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */