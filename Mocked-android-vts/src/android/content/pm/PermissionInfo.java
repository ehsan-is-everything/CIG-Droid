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
/*    */ public class PermissionInfo
/*    */   extends PackageItemInfo
/*    */   implements Parcelable
/*    */ {
/* 22 */   public PermissionInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public PermissionInfo(PermissionInfo orig) { throw new RuntimeException("Stub!"); }
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
/*    */ 
/* 54 */   public static final Parcelable.Creator<PermissionInfo> CREATOR = null;
/*    */   public static final int FLAG_COSTS_MONEY = 1;
/*    */   public static final int FLAG_INSTALLED = 1073741824;
/*    */   public static final int PROTECTION_DANGEROUS = 1;
/*    */   public static final int PROTECTION_FLAG_APPOP = 64;
/*    */   public static final int PROTECTION_FLAG_DEVELOPMENT = 32;
/*    */   public static final int PROTECTION_FLAG_INSTALLER = 256;
/*    */   public static final int PROTECTION_FLAG_PRE23 = 128;
/*    */   public static final int PROTECTION_FLAG_PREINSTALLED = 1024;
/*    */   public static final int PROTECTION_FLAG_PRIVILEGED = 16;
/*    */   public static final int PROTECTION_FLAG_RUNTIME_ONLY = 8192;
/*    */   public static final int PROTECTION_FLAG_SETUP = 2048;
/*    */   @Deprecated
/*    */   public static final int PROTECTION_FLAG_SYSTEM = 16;
/*    */   public static final int PROTECTION_FLAG_VERIFIER = 512;
/*    */   public static final int PROTECTION_MASK_BASE = 15;
/*    */   public static final int PROTECTION_MASK_FLAGS = 65520;
/*    */   public static final int PROTECTION_NORMAL = 0;
/*    */   public static final int PROTECTION_SIGNATURE = 2;
/*    */   @Deprecated
/*    */   public static final int PROTECTION_SIGNATURE_OR_SYSTEM = 3;
/*    */   public int descriptionRes;
/*    */   public int flags;
/*    */   public String group;
/*    */   public CharSequence nonLocalizedDescription;
/*    */   public int protectionLevel;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\PermissionInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */