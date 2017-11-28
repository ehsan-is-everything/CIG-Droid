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
/*    */ public class SystemUpdatePolicy
/*    */   implements Parcelable
/*    */ {
/* 21 */   SystemUpdatePolicy() { throw new RuntimeException("Stub!"); }
/* 22 */   public static SystemUpdatePolicy createAutomaticInstallPolicy() { throw new RuntimeException("Stub!"); }
/* 23 */   public static SystemUpdatePolicy createWindowedInstallPolicy(int startTime, int endTime) { throw new RuntimeException("Stub!"); }
/* 24 */   public static SystemUpdatePolicy createPostponeInstallPolicy() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getPolicyType() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getInstallWindowStart() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getInstallWindowEnd() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 29 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 30 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public static final Parcelable.Creator<SystemUpdatePolicy> CREATOR = null;
/*    */   public static final int TYPE_INSTALL_AUTOMATIC = 1;
/*    */   public static final int TYPE_INSTALL_WINDOWED = 2;
/*    */   public static final int TYPE_POSTPONE = 3;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\admin\SystemUpdatePolicy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */