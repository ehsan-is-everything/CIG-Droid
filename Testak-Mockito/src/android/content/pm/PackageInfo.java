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
/*    */ public class PackageInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   public PackageInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 30 */   public ActivityInfo[] activities = null;
/*    */   
/*    */ 
/* 33 */   public ConfigurationInfo[] configPreferences = null;
/* 34 */   public FeatureGroupInfo[] featureGroups = null;
/*    */   
/* 36 */   public int[] gids = null;
/*    */   
/* 38 */   public InstrumentationInfo[] instrumentation = null;
/*    */   
/*    */ 
/* 41 */   public PermissionInfo[] permissions = null;
/* 42 */   public ProviderInfo[] providers = null;
/* 43 */   public ActivityInfo[] receivers = null;
/* 44 */   public FeatureInfo[] reqFeatures = null;
/* 45 */   public String[] requestedPermissions = null;
/* 46 */   public int[] requestedPermissionsFlags = null;
/* 47 */   public ServiceInfo[] services = null;
/*    */   
/*    */ 
/* 50 */   public Signature[] signatures = null;
/* 51 */   public String[] splitNames = null;
/* 52 */   public int[] splitRevisionCodes = null;
/*    */   
/*    */ 
/* 55 */   public static final Parcelable.Creator<PackageInfo> CREATOR = null;
/*    */   public static final int INSTALL_LOCATION_AUTO = 0;
/*    */   public static final int INSTALL_LOCATION_INTERNAL_ONLY = 1;
/*    */   public static final int INSTALL_LOCATION_PREFER_EXTERNAL = 2;
/*    */   public static final int REQUESTED_PERMISSION_GRANTED = 2;
/*    */   public ApplicationInfo applicationInfo;
/*    */   public int baseRevisionCode;
/*    */   public long firstInstallTime;
/*    */   public int installLocation;
/*    */   public long lastUpdateTime;
/*    */   public String packageName;
/*    */   public String sharedUserId;
/*    */   public int sharedUserLabel;
/*    */   public int versionCode;
/*    */   public String versionName;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\PackageInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */