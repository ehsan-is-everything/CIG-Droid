/*    */ package android.view.accessibility;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public final class AccessibilityWindowInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   AccessibilityWindowInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public CharSequence getTitle() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getLayer() { throw new RuntimeException("Stub!"); }
/* 25 */   public AccessibilityNodeInfo getRoot() { throw new RuntimeException("Stub!"); }
/* 26 */   public AccessibilityNodeInfo getAnchor() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isInPictureInPictureMode() { throw new RuntimeException("Stub!"); }
/* 28 */   public AccessibilityWindowInfo getParent() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getId() { throw new RuntimeException("Stub!"); }
/* 30 */   public void getBoundsInScreen(Rect outBounds) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isActive() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isFocused() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isAccessibilityFocused() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getChildCount() { throw new RuntimeException("Stub!"); }
/* 35 */   public AccessibilityWindowInfo getChild(int index) { throw new RuntimeException("Stub!"); }
/* 36 */   public static AccessibilityWindowInfo obtain() { throw new RuntimeException("Stub!"); }
/* 37 */   public static AccessibilityWindowInfo obtain(AccessibilityWindowInfo info) { throw new RuntimeException("Stub!"); }
/* 38 */   public void recycle() { throw new RuntimeException("Stub!"); }
/* 39 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 40 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 41 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 43 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 50 */   public static final Parcelable.Creator<AccessibilityWindowInfo> CREATOR = null;
/*    */   public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
/*    */   public static final int TYPE_APPLICATION = 1;
/*    */   public static final int TYPE_INPUT_METHOD = 2;
/*    */   public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
/*    */   public static final int TYPE_SYSTEM = 3;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\accessibility\AccessibilityWindowInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */