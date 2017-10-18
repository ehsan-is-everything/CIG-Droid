/*     */ package android.test.mock;
/*     */ 
/*     */ import android.content.BroadcastReceiver;
/*     */ import android.content.ComponentName;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.content.IntentFilter;
/*     */ import android.content.IntentSender;
/*     */ import android.content.ServiceConnection;
/*     */ import android.database.sqlite.SQLiteDatabase.CursorFactory;
/*     */ import android.net.Uri;
/*     */ import android.os.Bundle;
/*     */ import android.os.Handler;
/*     */ import android.os.UserHandle;
/*     */ import java.io.File;
/*     */ 
/*     */ 
/*     */ public class MockContext
/*     */   extends Context
/*     */ {
/*  21 */   public MockContext() { throw new RuntimeException("Stub!"); }
/*  22 */   public android.content.res.AssetManager getAssets() { throw new RuntimeException("Stub!"); }
/*  23 */   public android.content.res.Resources getResources() { throw new RuntimeException("Stub!"); }
/*  24 */   public android.content.pm.PackageManager getPackageManager() { throw new RuntimeException("Stub!"); }
/*  25 */   public android.content.ContentResolver getContentResolver() { throw new RuntimeException("Stub!"); }
/*  26 */   public android.os.Looper getMainLooper() { throw new RuntimeException("Stub!"); }
/*  27 */   public Context getApplicationContext() { throw new RuntimeException("Stub!"); }
/*  28 */   public void setTheme(int resid) { throw new RuntimeException("Stub!"); }
/*  29 */   public android.content.res.Resources.Theme getTheme() { throw new RuntimeException("Stub!"); }
/*  30 */   public ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }
/*  31 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/*  32 */   public android.content.pm.ApplicationInfo getApplicationInfo() { throw new RuntimeException("Stub!"); }
/*  33 */   public String getPackageResourcePath() { throw new RuntimeException("Stub!"); }
/*  34 */   public String getPackageCodePath() { throw new RuntimeException("Stub!"); }
/*  35 */   public android.content.SharedPreferences getSharedPreferences(String name, int mode) { throw new RuntimeException("Stub!"); }
/*  36 */   public boolean moveSharedPreferencesFrom(Context sourceContext, String name) { throw new RuntimeException("Stub!"); }
/*  37 */   public boolean deleteSharedPreferences(String name) { throw new RuntimeException("Stub!"); }
/*  38 */   public java.io.FileInputStream openFileInput(String name) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/*  39 */   public java.io.FileOutputStream openFileOutput(String name, int mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/*  40 */   public boolean deleteFile(String name) { throw new RuntimeException("Stub!"); }
/*  41 */   public File getFileStreamPath(String name) { throw new RuntimeException("Stub!"); }
/*  42 */   public String[] fileList() { throw new RuntimeException("Stub!"); }
/*  43 */   public File getDataDir() { throw new RuntimeException("Stub!"); }
/*  44 */   public File getFilesDir() { throw new RuntimeException("Stub!"); }
/*  45 */   public File getNoBackupFilesDir() { throw new RuntimeException("Stub!"); }
/*  46 */   public File getExternalFilesDir(String type) { throw new RuntimeException("Stub!"); }
/*  47 */   public File getObbDir() { throw new RuntimeException("Stub!"); }
/*  48 */   public File getCacheDir() { throw new RuntimeException("Stub!"); }
/*  49 */   public File getCodeCacheDir() { throw new RuntimeException("Stub!"); }
/*  50 */   public File getExternalCacheDir() { throw new RuntimeException("Stub!"); }
/*  51 */   public File getDir(String name, int mode) { throw new RuntimeException("Stub!"); }
/*  52 */   public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String file, int mode, SQLiteDatabase.CursorFactory factory) { throw new RuntimeException("Stub!"); }
/*  53 */   public android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String file, int mode, SQLiteDatabase.CursorFactory factory, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
/*  54 */   public File getDatabasePath(String name) { throw new RuntimeException("Stub!"); }
/*  55 */   public String[] databaseList() { throw new RuntimeException("Stub!"); }
/*  56 */   public boolean moveDatabaseFrom(Context sourceContext, String name) { throw new RuntimeException("Stub!"); }
/*  57 */   public boolean deleteDatabase(String name) { throw new RuntimeException("Stub!"); }
/*  58 */   public android.graphics.drawable.Drawable getWallpaper() { throw new RuntimeException("Stub!"); }
/*  59 */   public android.graphics.drawable.Drawable peekWallpaper() { throw new RuntimeException("Stub!"); }
/*  60 */   public int getWallpaperDesiredMinimumWidth() { throw new RuntimeException("Stub!"); }
/*  61 */   public int getWallpaperDesiredMinimumHeight() { throw new RuntimeException("Stub!"); }
/*  62 */   public void setWallpaper(android.graphics.Bitmap bitmap) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/*  63 */   public void setWallpaper(java.io.InputStream data) throws java.io.IOException { throw new RuntimeException("Stub!"); }
/*  64 */   public void clearWallpaper() { throw new RuntimeException("Stub!"); }
/*  65 */   public void startActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/*  66 */   public void startActivity(Intent intent, Bundle options) { throw new RuntimeException("Stub!"); }
/*  67 */   public void startActivities(Intent[] intents) { throw new RuntimeException("Stub!"); }
/*  68 */   public void startActivities(Intent[] intents, Bundle options) { throw new RuntimeException("Stub!"); }
/*  69 */   public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/*  70 */   public void startIntentSender(IntentSender intent, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws android.content.IntentSender.SendIntentException { throw new RuntimeException("Stub!"); }
/*  71 */   public void sendBroadcast(Intent intent) { throw new RuntimeException("Stub!"); }
/*  72 */   public void sendBroadcast(Intent intent, String receiverPermission) { throw new RuntimeException("Stub!"); }
/*  73 */   public void sendOrderedBroadcast(Intent intent, String receiverPermission) { throw new RuntimeException("Stub!"); }
/*  74 */   public void sendOrderedBroadcast(Intent intent, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); }
/*  75 */   public void sendBroadcastAsUser(Intent intent, UserHandle user) { throw new RuntimeException("Stub!"); }
/*  76 */   public void sendBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission) { throw new RuntimeException("Stub!"); }
/*  77 */   public void sendOrderedBroadcastAsUser(Intent intent, UserHandle user, String receiverPermission, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); }
/*  78 */   public void sendStickyBroadcast(Intent intent) { throw new RuntimeException("Stub!"); }
/*  79 */   public void sendStickyOrderedBroadcast(Intent intent, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); }
/*  80 */   public void removeStickyBroadcast(Intent intent) { throw new RuntimeException("Stub!"); }
/*  81 */   public void sendStickyBroadcastAsUser(Intent intent, UserHandle user) { throw new RuntimeException("Stub!"); }
/*  82 */   public void sendStickyOrderedBroadcastAsUser(Intent intent, UserHandle user, BroadcastReceiver resultReceiver, Handler scheduler, int initialCode, String initialData, Bundle initialExtras) { throw new RuntimeException("Stub!"); }
/*  83 */   public void removeStickyBroadcastAsUser(Intent intent, UserHandle user) { throw new RuntimeException("Stub!"); }
/*  84 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) { throw new RuntimeException("Stub!"); }
/*  85 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, int flags) { throw new RuntimeException("Stub!"); }
/*  86 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler) { throw new RuntimeException("Stub!"); }
/*  87 */   public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter, String broadcastPermission, Handler scheduler, int flags) { throw new RuntimeException("Stub!"); }
/*  88 */   public void unregisterReceiver(BroadcastReceiver receiver) { throw new RuntimeException("Stub!"); }
/*  89 */   public ComponentName startService(Intent service) { throw new RuntimeException("Stub!"); }
/*  90 */   public ComponentName startForegroundService(Intent service) { throw new RuntimeException("Stub!"); }
/*  91 */   public boolean stopService(Intent service) { throw new RuntimeException("Stub!"); }
/*  92 */   public boolean bindService(Intent service, ServiceConnection conn, int flags) { throw new RuntimeException("Stub!"); }
/*  93 */   public void unbindService(ServiceConnection conn) { throw new RuntimeException("Stub!"); }
/*  94 */   public boolean startInstrumentation(ComponentName className, String profileFile, Bundle arguments) { throw new RuntimeException("Stub!"); }
/*  95 */   public Object getSystemService(String name) { throw new RuntimeException("Stub!"); }
/*  96 */   public String getSystemServiceName(Class<?> serviceClass) { throw new RuntimeException("Stub!"); }
/*  97 */   public int checkPermission(String permission, int pid, int uid) { throw new RuntimeException("Stub!"); }
/*  98 */   public int checkCallingPermission(String permission) { throw new RuntimeException("Stub!"); }
/*  99 */   public int checkCallingOrSelfPermission(String permission) { throw new RuntimeException("Stub!"); }
/* 100 */   public int checkSelfPermission(String permission) { throw new RuntimeException("Stub!"); }
/* 101 */   public void enforcePermission(String permission, int pid, int uid, String message) { throw new RuntimeException("Stub!"); }
/* 102 */   public void enforceCallingPermission(String permission, String message) { throw new RuntimeException("Stub!"); }
/* 103 */   public void enforceCallingOrSelfPermission(String permission, String message) { throw new RuntimeException("Stub!"); }
/* 104 */   public void grantUriPermission(String toPackage, Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 105 */   public void revokeUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 106 */   public void revokeUriPermission(String targetPackage, Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 107 */   public int checkUriPermission(Uri uri, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 108 */   public int checkCallingUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 109 */   public int checkCallingOrSelfUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 110 */   public int checkUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 111 */   public void enforceUriPermission(Uri uri, int pid, int uid, int modeFlags, String message) { throw new RuntimeException("Stub!"); }
/* 112 */   public void enforceCallingUriPermission(Uri uri, int modeFlags, String message) { throw new RuntimeException("Stub!"); }
/* 113 */   public void enforceCallingOrSelfUriPermission(Uri uri, int modeFlags, String message) { throw new RuntimeException("Stub!"); }
/* 114 */   public void enforceUriPermission(Uri uri, String readPermission, String writePermission, int pid, int uid, int modeFlags, String message) { throw new RuntimeException("Stub!"); }
/* 115 */   public Context createPackageContext(String packageName, int flags) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/* 116 */   public Context createConfigurationContext(android.content.res.Configuration overrideConfiguration) { throw new RuntimeException("Stub!"); }
/* 117 */   public Context createDisplayContext(android.view.Display display) { throw new RuntimeException("Stub!"); }
/* 118 */   public boolean isRestricted() { throw new RuntimeException("Stub!"); }
/* 119 */   public File[] getExternalFilesDirs(String type) { throw new RuntimeException("Stub!"); }
/* 120 */   public File[] getObbDirs() { throw new RuntimeException("Stub!"); }
/* 121 */   public File[] getExternalCacheDirs() { throw new RuntimeException("Stub!"); }
/* 122 */   public File[] getExternalMediaDirs() { throw new RuntimeException("Stub!"); }
/* 123 */   public Context createDeviceProtectedStorageContext() { throw new RuntimeException("Stub!"); }
/* 124 */   public boolean isDeviceProtectedStorage() { throw new RuntimeException("Stub!"); }
/* 125 */   public Context createContextForSplit(String splitName) throws android.content.pm.PackageManager.NameNotFoundException { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\test\mock\MockContext.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */