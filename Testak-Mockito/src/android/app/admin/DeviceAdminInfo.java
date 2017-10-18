/*    */ package android.app.admin;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.content.pm.ActivityInfo;
/*    */ import android.content.pm.PackageManager;
/*    */ import android.content.pm.ResolveInfo;
/*    */ import android.content.res.Resources.NotFoundException;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.Printer;
/*    */ import java.io.IOException;
/*    */ import org.xmlpull.v1.XmlPullParserException;
/*    */ 
/*    */ 
/*    */ public final class DeviceAdminInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public DeviceAdminInfo(Context context, ResolveInfo resolveInfo) throws XmlPullParserException, IOException { throw new RuntimeException("Stub!"); }
/* 22 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getReceiverName() { throw new RuntimeException("Stub!"); }
/* 24 */   public ActivityInfo getActivityInfo() { throw new RuntimeException("Stub!"); }
/* 25 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); }
/* 26 */   public CharSequence loadLabel(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence loadDescription(PackageManager pm) throws Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/* 28 */   public Drawable loadIcon(PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isVisible() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean usesPolicy(int policyIdent) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getTagForPolicy(int policyIdent) { throw new RuntimeException("Stub!"); }
/* 32 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/* 33 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public int describeContents() { throw new RuntimeException("Stub!"); }
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
/* 46 */   public static final Parcelable.Creator<DeviceAdminInfo> CREATOR = null;
/*    */   public static final int USES_ENCRYPTED_STORAGE = 7;
/*    */   public static final int USES_POLICY_DISABLE_CAMERA = 8;
/*    */   public static final int USES_POLICY_DISABLE_KEYGUARD_FEATURES = 9;
/*    */   public static final int USES_POLICY_EXPIRE_PASSWORD = 6;
/*    */   public static final int USES_POLICY_FORCE_LOCK = 3;
/*    */   public static final int USES_POLICY_LIMIT_PASSWORD = 0;
/*    */   public static final int USES_POLICY_RESET_PASSWORD = 2;
/*    */   public static final int USES_POLICY_WATCH_LOGIN = 1;
/*    */   public static final int USES_POLICY_WIPE_DATA = 4;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\admin\DeviceAdminInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */