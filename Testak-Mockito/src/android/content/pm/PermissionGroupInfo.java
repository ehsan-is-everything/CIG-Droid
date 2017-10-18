/*    */ package android.content.pm;
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
/*    */ public class PermissionGroupInfo
/*    */   extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/* 22 */   public PermissionGroupInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public PermissionGroupInfo(PermissionGroupInfo orig) { throw new RuntimeException("Stub!"); }
/* 24 */   public CharSequence loadDescription(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 25 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 26 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 27 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 34 */   public static final Parcelable.Creator<PermissionGroupInfo> CREATOR = null;
/*    */   public static final int FLAG_PERSONAL_INFO = 1;
/*    */   public int descriptionRes;
/*    */   public int flags;
/*    */   public CharSequence nonLocalizedDescription;
/*    */   public int priority;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\PermissionGroupInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */