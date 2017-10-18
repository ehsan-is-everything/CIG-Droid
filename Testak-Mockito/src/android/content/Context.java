/*     */ package android.content;
/*     */ 
/*     */ import android.net.Uri;
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class Context
/*     */ {
/*     */   public static final String ACCESSIBILITY_SERVICE = "accessibility";
/*     */   public static final String ACCOUNT_SERVICE = "account";
/*     */   public static final String ACTIVITY_SERVICE = "activity";
/*     */   public static final String ALARM_SERVICE = "alarm";
/*     */   public static final String APPWIDGET_SERVICE = "appwidget";
/*     */   public static final String APP_OPS_SERVICE = "appops";
/*     */   public static final String AUDIO_SERVICE = "audio";
/*     */   public static final String BATTERY_SERVICE = "batterymanager";
/*     */   public static final int BIND_ABOVE_CLIENT = 8;
/*     */   public static final int BIND_ADJUST_WITH_ACTIVITY = 128;
/*     */   
/*  20 */   public Context() { throw new RuntimeException("Stub!"); }
/*     */   public abstract android.content.res.AssetManager getAssets();
/*     */   public abstract android.content.res.Resources getResources();
/*     */   public abstract android.content.pm.PackageManager getPackageManager();
/*     */   public abstract ContentResolver getContentResolver();
/*     */   public abstract android.os.Looper getMainLooper();
/*     */   public abstract Context getApplicationContext();
/*  27 */   public void registerComponentCallbacks(ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
/*  28 */   public void unregisterComponentCallbacks(ComponentCallbacks callback) { throw new RuntimeException("Stub!"); }
/*  29 */   public final CharSequence getText(int resId) { throw new RuntimeException("Stub!"); }
/*  30 */   public final String getString(int resId) { throw new RuntimeException("Stub!"); }
/*  31 */   public final String getString(int resId, Object... formatArgs) { throw new RuntimeException("Stub!"); }
/*  32 */   public final int getColor(int id) { throw new RuntimeException("Stub!"); }
/*  33 */   public final android.graphics.drawable.Drawable getDrawable(int id) { throw new RuntimeException("Stub!"); }
/*  34 */   public final android.content.res.ColorStateList getColorStateList(int id) { throw new RuntimeException("Stub!"); }
/*     */   public abstract void setTheme(int paramInt);
/*     */   @android.view.ViewDebug.ExportedProperty(deepExport=true)
/*     */   public abstract android.content.res.Resources.Theme getTheme();
/*  38 */   public final android.content.res.TypedArray obtainStyledAttributes(int[] attrs) { throw new RuntimeException("Stub!"); }
/*  39 */   public final android.content.res.TypedArray obtainStyledAttributes(int resid, int[] attrs) throws android.content.res.Resources.NotFoundException { throw new RuntimeException("Stub!"); }
/*  40 */   public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs) { throw new RuntimeException("Stub!"); }
/*  41 */   public final android.content.res.TypedArray obtainStyledAttributes(android.util.AttributeSet set, int[] attrs, int defStyleAttr, int defStyleRes) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public abstract ClassLoader getClassLoader();
/*     */   public abstract String getPackageName();
/*     */   public abstract android.content.pm.ApplicationInfo getApplicationInfo();
/*     */   public abstract String getPackageResourcePath();
/*     */   public abstract String getPackageCodePath();
/*     */   public abstract SharedPreferences getSharedPreferences(String paramString, int paramInt);
/*     */   public abstract boolean moveSharedPreferencesFrom(Context paramContext, String paramString);
/*     */   public abstract boolean deleteSharedPreferences(String paramString);
/*     */   public abstract java.io.FileInputStream openFileInput(String paramString) throws java.io.FileNotFoundException;
/*     */   public abstract java.io.FileOutputStream openFileOutput(String paramString, int paramInt) throws java.io.FileNotFoundException;
/*     */   public abstract boolean deleteFile(String paramString);
/*     */   public abstract java.io.File getFileStreamPath(String paramString);
/*     */   public abstract java.io.File getDataDir();
/*     */   public abstract java.io.File getFilesDir();
/*     */   public abstract java.io.File getNoBackupFilesDir();
/*     */   public abstract java.io.File getExternalFilesDir(String paramString);
/*     */   public abstract java.io.File[] getExternalFilesDirs(String paramString);
/*     */   public abstract java.io.File getObbDir();
/*     */   public abstract java.io.File[] getObbDirs();
/*     */   public abstract java.io.File getCacheDir();
/*     */   public abstract java.io.File getCodeCacheDir();
/*     */   public abstract java.io.File getExternalCacheDir();
/*     */   public abstract java.io.File[] getExternalCacheDirs();
/*     */   public abstract java.io.File[] getExternalMediaDirs();
/*     */   public abstract String[] fileList();
/*     */   public abstract java.io.File getDir(String paramString, int paramInt);
/*     */   public abstract android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, android.database.sqlite.SQLiteDatabase.CursorFactory paramCursorFactory);
/*     */   public abstract android.database.sqlite.SQLiteDatabase openOrCreateDatabase(String paramString, int paramInt, android.database.sqlite.SQLiteDatabase.CursorFactory paramCursorFactory, android.database.DatabaseErrorHandler paramDatabaseErrorHandler);
/*     */   public abstract boolean moveDatabaseFrom(Context paramContext, String paramString);
/*     */   public abstract boolean deleteDatabase(String paramString);
/*     */   public abstract java.io.File getDatabasePath(String paramString);
/*     */   public abstract String[] databaseList();
/*     */   @Deprecated
/*     */   public abstract android.graphics.drawable.Drawable getWallpaper();
/*     */   @Deprecated
/*     */   public abstract android.graphics.drawable.Drawable peekWallpaper();
/*     */   @Deprecated
/*     */   public abstract int getWallpaperDesiredMinimumWidth();
/*     */   @Deprecated
/*     */   public abstract int getWallpaperDesiredMinimumHeight();
/*     */   @Deprecated
/*     */   public abstract void setWallpaper(android.graphics.Bitmap paramBitmap) throws java.io.IOException;
/*     */   @Deprecated
/*     */   public abstract void setWallpaper(java.io.InputStream paramInputStream) throws java.io.IOException;
/*     */   @Deprecated
/*     */   public abstract void clearWallpaper() throws java.io.IOException;
/*     */   public abstract void startActivity(Intent paramIntent);
/*     */   public abstract void startActivity(Intent paramIntent, android.os.Bundle paramBundle);
/*     */   public abstract void startActivities(Intent[] paramArrayOfIntent);
/*     */   public abstract void startActivities(Intent[] paramArrayOfIntent, android.os.Bundle paramBundle);
/*     */   public abstract void startIntentSender(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2, int paramInt3) throws IntentSender.SendIntentException;
/*     */   public abstract void startIntentSender(IntentSender paramIntentSender, Intent paramIntent, int paramInt1, int paramInt2, int paramInt3, android.os.Bundle paramBundle) throws IntentSender.SendIntentException;
/*     */   public abstract void sendBroadcast(Intent paramIntent);
/*     */   public abstract void sendBroadcast(Intent paramIntent, String paramString);
/*     */   public abstract void sendOrderedBroadcast(Intent paramIntent, String paramString);
/*     */   public abstract void sendOrderedBroadcast(Intent paramIntent, String paramString1, BroadcastReceiver paramBroadcastReceiver, android.os.Handler paramHandler, int paramInt, String paramString2, android.os.Bundle paramBundle);
/*     */   public abstract void sendBroadcastAsUser(Intent paramIntent, android.os.UserHandle paramUserHandle);
/*     */   public abstract void sendBroadcastAsUser(Intent paramIntent, android.os.UserHandle paramUserHandle, String paramString);
/*     */   public abstract void sendOrderedBroadcastAsUser(Intent paramIntent, android.os.UserHandle paramUserHandle, String paramString1, BroadcastReceiver paramBroadcastReceiver, android.os.Handler paramHandler, int paramInt, String paramString2, android.os.Bundle paramBundle);
/*     */   @Deprecated
/*     */   public abstract void sendStickyBroadcast(Intent paramIntent);
/*     */   @Deprecated
/*     */   public abstract void sendStickyOrderedBroadcast(Intent paramIntent, BroadcastReceiver paramBroadcastReceiver, android.os.Handler paramHandler, int paramInt, String paramString, android.os.Bundle paramBundle);
/*     */   @Deprecated
/*     */   public abstract void removeStickyBroadcast(Intent paramIntent);
/*     */   @Deprecated
/*     */   public abstract void sendStickyBroadcastAsUser(Intent paramIntent, android.os.UserHandle paramUserHandle);
/*     */   @Deprecated
/*     */   public abstract void sendStickyOrderedBroadcastAsUser(Intent paramIntent, android.os.UserHandle paramUserHandle, BroadcastReceiver paramBroadcastReceiver, android.os.Handler paramHandler, int paramInt, String paramString, android.os.Bundle paramBundle);
/*     */   @Deprecated
/*     */   public abstract void removeStickyBroadcastAsUser(Intent paramIntent, android.os.UserHandle paramUserHandle);
/*     */   public abstract Intent registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter);
/*     */   public abstract Intent registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, int paramInt);
/*     */   public abstract Intent registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, android.os.Handler paramHandler);
/*     */   public abstract Intent registerReceiver(BroadcastReceiver paramBroadcastReceiver, IntentFilter paramIntentFilter, String paramString, android.os.Handler paramHandler, int paramInt);
/*     */   public abstract void unregisterReceiver(BroadcastReceiver paramBroadcastReceiver);
/*     */   public abstract ComponentName startService(Intent paramIntent);
/*     */   public abstract ComponentName startForegroundService(Intent paramIntent);
/*     */   public abstract boolean stopService(Intent paramIntent);
/*     */   public abstract boolean bindService(Intent paramIntent, ServiceConnection paramServiceConnection, int paramInt);
/*     */   public abstract void unbindService(ServiceConnection paramServiceConnection);
/*     */   public abstract boolean startInstrumentation(ComponentName paramComponentName, String paramString, android.os.Bundle paramBundle);
/*     */   public abstract Object getSystemService(String paramString);
/* 126 */   public final <T> T getSystemService(Class<T> serviceClass) { throw new RuntimeException("Stub!"); }
/*     */   public abstract String getSystemServiceName(Class<?> paramClass);
/*     */   public abstract int checkPermission(String paramString, int paramInt1, int paramInt2);
/*     */   public abstract int checkCallingPermission(String paramString);
/*     */   public abstract int checkCallingOrSelfPermission(String paramString);
/*     */   public abstract int checkSelfPermission(String paramString);
/*     */   public abstract void enforcePermission(String paramString1, int paramInt1, int paramInt2, String paramString2);
/*     */   public abstract void enforceCallingPermission(String paramString1, String paramString2);
/*     */   public abstract void enforceCallingOrSelfPermission(String paramString1, String paramString2);
/*     */   public abstract void grantUriPermission(String paramString, Uri paramUri, int paramInt);
/*     */   public abstract void revokeUriPermission(Uri paramUri, int paramInt);
/*     */   public abstract void revokeUriPermission(String paramString, Uri paramUri, int paramInt);
/*     */   public abstract int checkUriPermission(Uri paramUri, int paramInt1, int paramInt2, int paramInt3);
/*     */   public abstract int checkCallingUriPermission(Uri paramUri, int paramInt);
/*     */   public abstract int checkCallingOrSelfUriPermission(Uri paramUri, int paramInt);
/*     */   public abstract int checkUriPermission(Uri paramUri, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3);
/*     */   public abstract void enforceUriPermission(Uri paramUri, int paramInt1, int paramInt2, int paramInt3, String paramString);
/*     */   public abstract void enforceCallingUriPermission(Uri paramUri, int paramInt, String paramString);
/*     */   public abstract void enforceCallingOrSelfUriPermission(Uri paramUri, int paramInt, String paramString);
/*     */   public abstract void enforceUriPermission(Uri paramUri, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3);
/*     */   public abstract Context createPackageContext(String paramString, int paramInt) throws android.content.pm.PackageManager.NameNotFoundException;
/*     */   public abstract Context createContextForSplit(String paramString) throws android.content.pm.PackageManager.NameNotFoundException;
/*     */   public abstract Context createConfigurationContext(android.content.res.Configuration paramConfiguration);
/*     */   public abstract Context createDisplayContext(android.view.Display paramDisplay);
/*     */   public abstract Context createDeviceProtectedStorageContext();
/* 151 */   public boolean isRestricted() { throw new RuntimeException("Stub!"); }
/*     */   
/*     */   public static final int BIND_ALLOW_OOM_MANAGEMENT = 16;
/*     */   public static final int BIND_AUTO_CREATE = 1;
/*     */   public static final int BIND_DEBUG_UNBIND = 2;
/*     */   public static final int BIND_EXTERNAL_SERVICE = Integer.MIN_VALUE;
/*     */   public static final int BIND_IMPORTANT = 64;
/*     */   public static final int BIND_NOT_FOREGROUND = 4;
/*     */   public static final int BIND_WAIVE_PRIORITY = 32;
/*     */   public static final String BLUETOOTH_SERVICE = "bluetooth";
/*     */   public static final String CAMERA_SERVICE = "camera";
/*     */   public static final String CAPTIONING_SERVICE = "captioning";
/*     */   public static final String CARRIER_CONFIG_SERVICE = "carrier_config";
/*     */   public static final String CLIPBOARD_SERVICE = "clipboard";
/*     */   public static final String COMPANION_DEVICE_SERVICE = "companiondevice";
/*     */   public static final String CONNECTIVITY_SERVICE = "connectivity";
/*     */   public static final String CONSUMER_IR_SERVICE = "consumer_ir";
/*     */   public static final int CONTEXT_IGNORE_SECURITY = 2;
/*     */   public static final int CONTEXT_INCLUDE_CODE = 1;
/*     */   public static final int CONTEXT_RESTRICTED = 4;
/*     */   public static final String DEVICE_POLICY_SERVICE = "device_policy";
/*     */   public static final String DISPLAY_SERVICE = "display";
/*     */   public static final String DOWNLOAD_SERVICE = "download";
/*     */   public static final String DROPBOX_SERVICE = "dropbox";
/*     */   public static final String FINGERPRINT_SERVICE = "fingerprint";
/*     */   public static final String HARDWARE_PROPERTIES_SERVICE = "hardware_properties";
/*     */   public static final String INPUT_METHOD_SERVICE = "input_method";
/*     */   public static final String INPUT_SERVICE = "input";
/*     */   public static final String JOB_SCHEDULER_SERVICE = "jobscheduler";
/*     */   public static final String KEYGUARD_SERVICE = "keyguard";
/*     */   public static final String LAUNCHER_APPS_SERVICE = "launcherapps";
/*     */   public static final String LAYOUT_INFLATER_SERVICE = "layout_inflater";
/*     */   public static final String LOCATION_SERVICE = "location";
/*     */   public static final String MEDIA_PROJECTION_SERVICE = "media_projection";
/*     */   public static final String MEDIA_ROUTER_SERVICE = "media_router";
/*     */   public static final String MEDIA_SESSION_SERVICE = "media_session";
/*     */   public static final String MIDI_SERVICE = "midi";
/*     */   public static final int MODE_APPEND = 32768;
/*     */   public static final int MODE_ENABLE_WRITE_AHEAD_LOGGING = 8;
/*     */   @Deprecated
/*     */   public static final int MODE_MULTI_PROCESS = 4;
/*     */   public static final int MODE_NO_LOCALIZED_COLLATORS = 16;
/*     */   public static final int MODE_PRIVATE = 0;
/*     */   @Deprecated
/*     */   public static final int MODE_WORLD_READABLE = 1;
/*     */   @Deprecated
/*     */   public static final int MODE_WORLD_WRITEABLE = 2;
/*     */   public static final String NETWORK_STATS_SERVICE = "netstats";
/*     */   public static final String NFC_SERVICE = "nfc";
/*     */   public static final String NOTIFICATION_SERVICE = "notification";
/*     */   public static final String NSD_SERVICE = "servicediscovery";
/*     */   public static final String POWER_SERVICE = "power";
/*     */   public static final String PRINT_SERVICE = "print";
/*     */   public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
/*     */   public static final String RESTRICTIONS_SERVICE = "restrictions";
/*     */   public static final String SEARCH_SERVICE = "search";
/*     */   public static final String SENSOR_SERVICE = "sensor";
/*     */   public static final String SHORTCUT_SERVICE = "shortcut";
/*     */   public static final String STORAGE_SERVICE = "storage";
/*     */   public static final String STORAGE_STATS_SERVICE = "storagestats";
/*     */   public static final String SYSTEM_HEALTH_SERVICE = "systemhealth";
/*     */   public static final String TELECOM_SERVICE = "telecom";
/*     */   public static final String TELEPHONY_SERVICE = "phone";
/*     */   public static final String TELEPHONY_SUBSCRIPTION_SERVICE = "telephony_subscription_service";
/*     */   public static final String TEXT_CLASSIFICATION_SERVICE = "textclassification";
/*     */   public static final String TEXT_SERVICES_MANAGER_SERVICE = "textservices";
/*     */   public static final String TV_INPUT_SERVICE = "tv_input";
/*     */   public static final String UI_MODE_SERVICE = "uimode";
/*     */   public static final String USAGE_STATS_SERVICE = "usagestats";
/*     */   public static final String USB_SERVICE = "usb";
/*     */   public static final String USER_SERVICE = "user";
/*     */   public static final String VIBRATOR_SERVICE = "vibrator";
/*     */   public static final String WALLPAPER_SERVICE = "wallpaper";
/*     */   public static final String WIFI_AWARE_SERVICE = "wifiaware";
/*     */   public static final String WIFI_P2P_SERVICE = "wifip2p";
/*     */   public static final String WIFI_SERVICE = "wifi";
/*     */   public static final String WINDOW_SERVICE = "window";
/*     */   public abstract boolean isDeviceProtectedStorage();
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\Context.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */