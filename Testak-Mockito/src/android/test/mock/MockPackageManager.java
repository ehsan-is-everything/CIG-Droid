/*     */ package android.test.mock;
/*     */ 
/*     */ import android.content.ComponentName;
/*     */ import android.content.Intent;
/*     */ import android.content.IntentFilter;
/*     */ import android.content.pm.ApplicationInfo;
/*     */ import android.content.pm.PackageInfo;
/*     */ import android.content.pm.PackageManager.NameNotFoundException;
/*     */ import android.content.pm.PermissionInfo;
/*     */ import android.content.pm.ProviderInfo;
/*     */ import android.content.pm.ResolveInfo;
/*     */ import android.content.res.Resources;
/*     */ import android.graphics.drawable.Drawable;
/*     */ import android.os.UserHandle;
/*     */ import java.util.List;
/*     */ 
/*     */ 
/*     */ @Deprecated
/*     */ public class MockPackageManager
/*     */   extends android.content.pm.PackageManager
/*     */ {
/*  22 */   public MockPackageManager() { throw new RuntimeException("Stub!"); }
/*  23 */   public PackageInfo getPackageInfo(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  24 */   public PackageInfo getPackageInfo(android.content.pm.VersionedPackage versionedPackage, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  25 */   public String[] currentToCanonicalPackageNames(String[] names) { throw new RuntimeException("Stub!"); }
/*  26 */   public String[] canonicalToCurrentPackageNames(String[] names) { throw new RuntimeException("Stub!"); }
/*  27 */   public Intent getLaunchIntentForPackage(String packageName) { throw new RuntimeException("Stub!"); }
/*  28 */   public Intent getLeanbackLaunchIntentForPackage(String packageName) { throw new RuntimeException("Stub!"); }
/*  29 */   public int[] getPackageGids(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  30 */   public int[] getPackageGids(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  31 */   public int getPackageUid(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  32 */   public PermissionInfo getPermissionInfo(String name, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  33 */   public List<PermissionInfo> queryPermissionsByGroup(String group, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  34 */   public android.content.pm.PermissionGroupInfo getPermissionGroupInfo(String name, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  35 */   public List<android.content.pm.PermissionGroupInfo> getAllPermissionGroups(int flags) { throw new RuntimeException("Stub!"); }
/*  36 */   public ApplicationInfo getApplicationInfo(String packageName, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  37 */   public android.content.pm.ActivityInfo getActivityInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  38 */   public android.content.pm.ActivityInfo getReceiverInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  39 */   public android.content.pm.ServiceInfo getServiceInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  40 */   public ProviderInfo getProviderInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  41 */   public List<PackageInfo> getInstalledPackages(int flags) { throw new RuntimeException("Stub!"); }
/*  42 */   public List<PackageInfo> getPackagesHoldingPermissions(String[] permissions, int flags) { throw new RuntimeException("Stub!"); }
/*  43 */   public int checkPermission(String permName, String pkgName) { throw new RuntimeException("Stub!"); }
/*  44 */   public boolean canRequestPackageInstalls() { throw new RuntimeException("Stub!"); }
/*  45 */   public boolean isPermissionRevokedByPolicy(String permName, String pkgName) { throw new RuntimeException("Stub!"); }
/*  46 */   public boolean addPermission(PermissionInfo info) { throw new RuntimeException("Stub!"); }
/*  47 */   public boolean addPermissionAsync(PermissionInfo info) { throw new RuntimeException("Stub!"); }
/*  48 */   public void removePermission(String name) { throw new RuntimeException("Stub!"); }
/*  49 */   public int checkSignatures(String pkg1, String pkg2) { throw new RuntimeException("Stub!"); }
/*  50 */   public int checkSignatures(int uid1, int uid2) { throw new RuntimeException("Stub!"); }
/*  51 */   public String[] getPackagesForUid(int uid) { throw new RuntimeException("Stub!"); }
/*  52 */   public String getNameForUid(int uid) { throw new RuntimeException("Stub!"); }
/*  53 */   public List<ApplicationInfo> getInstalledApplications(int flags) { throw new RuntimeException("Stub!"); }
/*  54 */   public ResolveInfo resolveActivity(Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  55 */   public List<ResolveInfo> queryIntentActivities(Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  56 */   public List<ResolveInfo> queryIntentActivityOptions(ComponentName caller, Intent[] specifics, Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  57 */   public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  58 */   public ResolveInfo resolveService(Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  59 */   public List<ResolveInfo> queryIntentServices(Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  60 */   public List<ResolveInfo> queryIntentContentProviders(Intent intent, int flags) { throw new RuntimeException("Stub!"); }
/*  61 */   public ProviderInfo resolveContentProvider(String name, int flags) { throw new RuntimeException("Stub!"); }
/*  62 */   public List<ProviderInfo> queryContentProviders(String processName, int uid, int flags) { throw new RuntimeException("Stub!"); }
/*  63 */   public android.content.pm.InstrumentationInfo getInstrumentationInfo(ComponentName className, int flags) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  64 */   public List<android.content.pm.InstrumentationInfo> queryInstrumentation(String targetPackage, int flags) { throw new RuntimeException("Stub!"); }
/*  65 */   public Drawable getDrawable(String packageName, int resid, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
/*  66 */   public Drawable getActivityIcon(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  67 */   public Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  68 */   public Drawable getDefaultActivityIcon() { throw new RuntimeException("Stub!"); }
/*  69 */   public Drawable getActivityBanner(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  70 */   public Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  71 */   public Drawable getApplicationBanner(ApplicationInfo info) { throw new RuntimeException("Stub!"); }
/*  72 */   public Drawable getApplicationBanner(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  73 */   public Drawable getApplicationIcon(ApplicationInfo info) { throw new RuntimeException("Stub!"); }
/*  74 */   public Drawable getApplicationIcon(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  75 */   public Drawable getActivityLogo(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  76 */   public Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  77 */   public Drawable getApplicationLogo(ApplicationInfo info) { throw new RuntimeException("Stub!"); }
/*  78 */   public Drawable getApplicationLogo(String packageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  79 */   public Drawable getUserBadgedIcon(Drawable icon, UserHandle user) { throw new RuntimeException("Stub!"); }
/*  80 */   public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle user, android.graphics.Rect badgeLocation, int badgeDensity) { throw new RuntimeException("Stub!"); }
/*  81 */   public CharSequence getUserBadgedLabel(CharSequence label, UserHandle user) { throw new RuntimeException("Stub!"); }
/*  82 */   public CharSequence getText(String packageName, int resid, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
/*  83 */   public android.content.res.XmlResourceParser getXml(String packageName, int resid, ApplicationInfo appInfo) { throw new RuntimeException("Stub!"); }
/*  84 */   public CharSequence getApplicationLabel(ApplicationInfo info) { throw new RuntimeException("Stub!"); }
/*  85 */   public Resources getResourcesForActivity(ComponentName activityName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  86 */   public Resources getResourcesForApplication(ApplicationInfo app) { throw new RuntimeException("Stub!"); }
/*  87 */   public Resources getResourcesForApplication(String appPackageName) throws PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*  88 */   public PackageInfo getPackageArchiveInfo(String archiveFilePath, int flags) { throw new RuntimeException("Stub!"); }
/*  89 */   public void setInstallerPackageName(String targetPackage, String installerPackageName) { throw new RuntimeException("Stub!"); }
/*  90 */   public String getInstallerPackageName(String packageName) { throw new RuntimeException("Stub!"); }
/*  91 */   public void addPackageToPreferred(String packageName) { throw new RuntimeException("Stub!"); }
/*  92 */   public void removePackageFromPreferred(String packageName) { throw new RuntimeException("Stub!"); }
/*  93 */   public List<PackageInfo> getPreferredPackages(int flags) { throw new RuntimeException("Stub!"); }
/*  94 */   public void setComponentEnabledSetting(ComponentName componentName, int newState, int flags) { throw new RuntimeException("Stub!"); }
/*  95 */   public int getComponentEnabledSetting(ComponentName componentName) { throw new RuntimeException("Stub!"); }
/*  96 */   public void setApplicationEnabledSetting(String packageName, int newState, int flags) { throw new RuntimeException("Stub!"); }
/*  97 */   public int getApplicationEnabledSetting(String packageName) { throw new RuntimeException("Stub!"); }
/*  98 */   public void addPreferredActivity(IntentFilter filter, int match, ComponentName[] set, ComponentName activity) { throw new RuntimeException("Stub!"); }
/*  99 */   public void clearPackagePreferredActivities(String packageName) { throw new RuntimeException("Stub!"); }
/* 100 */   public int getPreferredActivities(List<IntentFilter> outFilters, List<ComponentName> outActivities, String packageName) { throw new RuntimeException("Stub!"); }
/* 101 */   public String[] getSystemSharedLibraryNames() { throw new RuntimeException("Stub!"); }
/* 102 */   public List<android.content.pm.SharedLibraryInfo> getSharedLibraries(int flags) { throw new RuntimeException("Stub!"); }
/* 103 */   public android.content.pm.FeatureInfo[] getSystemAvailableFeatures() { throw new RuntimeException("Stub!"); }
/* 104 */   public boolean hasSystemFeature(String name) { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean hasSystemFeature(String name, int version) { throw new RuntimeException("Stub!"); }
/* 106 */   public boolean isSafeMode() { throw new RuntimeException("Stub!"); }
/* 107 */   public void verifyPendingInstall(int id, int verificationCode) { throw new RuntimeException("Stub!"); }
/* 108 */   public void extendVerificationTimeout(int id, int verificationCodeAtTimeout, long millisecondsToDelay) { throw new RuntimeException("Stub!"); }
/* 109 */   public List<IntentFilter> getAllIntentFilters(String packageName) { throw new RuntimeException("Stub!"); }
/* 110 */   public byte[] getInstantAppCookie() { throw new RuntimeException("Stub!"); }
/* 111 */   public boolean isInstantApp() { throw new RuntimeException("Stub!"); }
/* 112 */   public boolean isInstantApp(String packageName) { throw new RuntimeException("Stub!"); }
/* 113 */   public int getInstantAppCookieMaxBytes() { throw new RuntimeException("Stub!"); }
/* 114 */   public void clearInstantAppCookie() { throw new RuntimeException("Stub!"); }
/* 115 */   public void updateInstantAppCookie(byte[] cookie) { throw new RuntimeException("Stub!"); }
/* 116 */   public android.content.pm.ChangedPackages getChangedPackages(int sequenceNumber) { throw new RuntimeException("Stub!"); }
/* 117 */   public void setApplicationCategoryHint(String packageName, int categoryHint) { throw new RuntimeException("Stub!"); }
/* 118 */   public android.content.pm.PackageInstaller getPackageInstaller() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\mock\MockPackageManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */