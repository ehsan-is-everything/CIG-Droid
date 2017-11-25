/*    */ package android.view;
/*    */ 
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
/*    */ 
/*    */ public class WindowId
/*    */   implements Parcelable
/*    */ {
/*    */   public static abstract class FocusObserver
/*    */   {
/* 23 */     public FocusObserver() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onFocusGained(WindowId paramWindowId);
/*    */     public abstract void onFocusLost(WindowId paramWindowId); }
/* 27 */   WindowId() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isFocused() { throw new RuntimeException("Stub!"); }
/* 29 */   public void registerFocusObserver(FocusObserver observer) { throw new RuntimeException("Stub!"); }
/* 30 */   public void unregisterFocusObserver(FocusObserver observer) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object otherObj) { throw new RuntimeException("Stub!"); }
/* 32 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 35 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 37 */   public static final Parcelable.Creator<WindowId> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\WindowId.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */