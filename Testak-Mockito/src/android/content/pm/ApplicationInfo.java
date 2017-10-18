/*     */ package android.content.pm;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.os.Parcel;
/*     */ import android.os.Parcelable;
/*     */ import android.os.Parcelable.Creator;
/*     */ import android.util.Printer;
/*     */ import java.util.Comparator;
/*     */ import java.util.UUID;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ApplicationInfo
/*     */   extends PackageItemInfo
/*     */   implements Parcelable
/*     */ {
/*     */   public static class DisplayNameComparator
/*     */     implements Comparator<ApplicationInfo>
/*     */   {
/*  25 */     public DisplayNameComparator(PackageManager pm) { throw new RuntimeException("Stub!"); }
/*  26 */     public final int compare(ApplicationInfo aa, ApplicationInfo ab) { throw new RuntimeException("Stub!"); } }
/*     */   
/*  28 */   public ApplicationInfo() { throw new RuntimeException("Stub!"); }
/*  29 */   public ApplicationInfo(ApplicationInfo orig) { throw new RuntimeException("Stub!"); }
/*  30 */   public static CharSequence getCategoryTitle(Context context, int category) { throw new RuntimeException("Stub!"); }
/*  31 */   public void dump(Printer pw, String prefix) { throw new RuntimeException("Stub!"); }
/*  32 */   public String toString() { throw new RuntimeException("Stub!"); }
/*  33 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*     */   
/*  35 */   public void writeToParcel(Parcel dest, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*  36 */   public CharSequence loadDescription(PackageManager pm) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*  97 */   public String[] sharedLibraryFiles = null;
/*     */   
/*  99 */   public String[] splitNames = null;
/* 100 */   public String[] splitPublicSourceDirs = null;
/* 101 */   public String[] splitSourceDirs = null;
/*     */   
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/* 108 */   public static final Parcelable.Creator<ApplicationInfo> CREATOR = null;
/*     */   public static final int CATEGORY_AUDIO = 1;
/*     */   public static final int CATEGORY_GAME = 0;
/*     */   public static final int CATEGORY_IMAGE = 3;
/*     */   public static final int CATEGORY_MAPS = 6;
/*     */   public static final int CATEGORY_NEWS = 5;
/*     */   public static final int CATEGORY_PRODUCTIVITY = 7;
/*     */   public static final int CATEGORY_SOCIAL = 4;
/*     */   public static final int CATEGORY_UNDEFINED = -1;
/*     */   public static final int CATEGORY_VIDEO = 2;
/*     */   public static final int FLAG_ALLOW_BACKUP = 32768;
/*     */   public static final int FLAG_ALLOW_CLEAR_USER_DATA = 64;
/*     */   public static final int FLAG_ALLOW_TASK_REPARENTING = 32;
/*     */   public static final int FLAG_DEBUGGABLE = 2;
/*     */   public static final int FLAG_EXTERNAL_STORAGE = 262144;
/*     */   public static final int FLAG_EXTRACT_NATIVE_LIBS = 268435456;
/*     */   public static final int FLAG_FACTORY_TEST = 16;
/*     */   public static final int FLAG_FULL_BACKUP_ONLY = 67108864;
/*     */   public static final int FLAG_HARDWARE_ACCELERATED = 536870912;
/*     */   public static final int FLAG_HAS_CODE = 4;
/*     */   public static final int FLAG_INSTALLED = 8388608;
/*     */   public static final int FLAG_IS_DATA_ONLY = 16777216;
/*     */   @Deprecated
/*     */   public static final int FLAG_IS_GAME = 33554432;
/*     */   public static final int FLAG_KILL_AFTER_RESTORE = 65536;
/*     */   public static final int FLAG_LARGE_HEAP = 1048576;
/*     */   public static final int FLAG_MULTIARCH = Integer.MIN_VALUE;
/*     */   public static final int FLAG_PERSISTENT = 8;
/*     */   public static final int FLAG_RESIZEABLE_FOR_SCREENS = 4096;
/*     */   public static final int FLAG_RESTORE_ANY_VERSION = 131072;
/*     */   public static final int FLAG_STOPPED = 2097152;
/*     */   public static final int FLAG_SUPPORTS_LARGE_SCREENS = 2048;
/*     */   public static final int FLAG_SUPPORTS_NORMAL_SCREENS = 1024;
/*     */   public static final int FLAG_SUPPORTS_RTL = 4194304;
/*     */   public static final int FLAG_SUPPORTS_SCREEN_DENSITIES = 8192;
/*     */   public static final int FLAG_SUPPORTS_SMALL_SCREENS = 512;
/*     */   public static final int FLAG_SUPPORTS_XLARGE_SCREENS = 524288;
/*     */   public static final int FLAG_SUSPENDED = 1073741824;
/*     */   public static final int FLAG_SYSTEM = 1;
/*     */   public static final int FLAG_TEST_ONLY = 256;
/*     */   public static final int FLAG_UPDATED_SYSTEM_APP = 128;
/*     */   public static final int FLAG_USES_CLEARTEXT_TRAFFIC = 134217728;
/*     */   public static final int FLAG_VM_SAFE_MODE = 16384;
/*     */   public String backupAgentName;
/*     */   public int category;
/*     */   public String className;
/*     */   public int compatibleWidthLimitDp;
/*     */   public String dataDir;
/*     */   public int descriptionRes;
/*     */   public String deviceProtectedDataDir;
/*     */   public boolean enabled;
/*     */   public int flags;
/*     */   public int largestWidthLimitDp;
/*     */   public String manageSpaceActivityName;
/*     */   public int minSdkVersion;
/*     */   public String nativeLibraryDir;
/*     */   public String permission;
/*     */   public String processName;
/*     */   public String publicSourceDir;
/*     */   public int requiresSmallestWidthDp;
/*     */   public String sourceDir;
/*     */   public UUID storageUuid;
/*     */   public int targetSdkVersion;
/*     */   public String taskAffinity;
/*     */   public int theme;
/*     */   public int uiOptions;
/*     */   public int uid;
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\pm\ApplicationInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */