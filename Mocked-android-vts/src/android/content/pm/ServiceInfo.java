/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
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
/*    */ public class ServiceInfo
/*    */   extends ComponentInfo
/*    */   implements Parcelable
/*    */ {
/* 22 */   public ServiceInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public ServiceInfo(ServiceInfo orig) { throw new RuntimeException("Stub!"); }
/* 24 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 35 */   public static final Parcelable.Creator<ServiceInfo> CREATOR = null;
/*    */   public static final int FLAG_EXTERNAL_SERVICE = 4;
/*    */   public static final int FLAG_ISOLATED_PROCESS = 2;
/*    */   public static final int FLAG_SINGLE_USER = 1073741824;
/*    */   public static final int FLAG_STOP_WITH_TASK = 1;
/*    */   public int flags;
/*    */   public String permission;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\ServiceInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */