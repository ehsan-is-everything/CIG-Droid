/*    */ package android.content.pm;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.os.PatternMatcher;
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
/*    */ public final class ProviderInfo
/*    */   extends ComponentInfo
/*    */   implements Parcelable
/*    */ {
/* 22 */   public ProviderInfo() { throw new RuntimeException("Stub!"); }
/* 23 */   public ProviderInfo(ProviderInfo orig) { throw new RuntimeException("Stub!"); }
/* 24 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 37 */   public PathPermission[] pathPermissions = null;
/*    */   
/* 39 */   public PatternMatcher[] uriPermissionPatterns = null;
/*    */   
/* 41 */   public static final Parcelable.Creator<ProviderInfo> CREATOR = null;
/*    */   public static final int FLAG_SINGLE_USER = 1073741824;
/*    */   public String authority;
/*    */   public int flags;
/*    */   public boolean grantUriPermissions;
/*    */   public int initOrder;
/*    */   @Deprecated
/*    */   public boolean isSyncable;
/*    */   public boolean multiprocess;
/*    */   public String readPermission;
/*    */   public String writePermission;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\pm\ProviderInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */