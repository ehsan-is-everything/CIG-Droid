/*    */ package android.app.admin;
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
/*    */ public final class SystemUpdateInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   SystemUpdateInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public long getReceivedTime() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getSecurityPatchState() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 25 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 28 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 33 */   public static final Parcelable.Creator<SystemUpdateInfo> CREATOR = null;
/*    */   public static final int SECURITY_PATCH_STATE_FALSE = 1;
/*    */   public static final int SECURITY_PATCH_STATE_TRUE = 2;
/*    */   public static final int SECURITY_PATCH_STATE_UNKNOWN = 0;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\admin\SystemUpdateInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */