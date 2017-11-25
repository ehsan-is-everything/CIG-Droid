/*     */ package android.content;
/*     */ 
/*     */ import android.net.Uri;
/*     */ import android.os.Parcelable;
/*     */ import java.util.ArrayList;
/*     */ 
/*     */ public class Intent implements Parcelable, Cloneable
/*     */ {
/*     */   public static final String ACTION_AIRPLANE_MODE_CHANGED = "android.intent.action.AIRPLANE_MODE";
/*     */   public static final String ACTION_ALL_APPS = "android.intent.action.ALL_APPS";
/*     */   public static final String ACTION_ANSWER = "android.intent.action.ANSWER";
/*     */   public static final String ACTION_APPLICATION_PREFERENCES = "android.intent.action.APPLICATION_PREFERENCES";
/*     */   public static final String ACTION_APPLICATION_RESTRICTIONS_CHANGED = "android.intent.action.APPLICATION_RESTRICTIONS_CHANGED";
/*     */   public static final String ACTION_APP_ERROR = "android.intent.action.APP_ERROR";
/*     */   public static final String ACTION_ASSIST = "android.intent.action.ASSIST";
/*     */   public static final String ACTION_ATTACH_DATA = "android.intent.action.ATTACH_DATA";
/*     */   public static final String ACTION_BATTERY_CHANGED = "android.intent.action.BATTERY_CHANGED";
/*     */   public static final String ACTION_BATTERY_LOW = "android.intent.action.BATTERY_LOW";
/*     */   
/*     */   public static class ShortcutIconResource implements Parcelable
/*     */   {
/*     */     public ShortcutIconResource()
/*     */     {
/*  24 */       throw new RuntimeException("Stub!"); }
/*  25 */     public static ShortcutIconResource fromContext(Context context, int resourceId) { throw new RuntimeException("Stub!"); }
/*  26 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*  27 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*  28 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */ 
/*     */ 
/*  32 */     public static final android.os.Parcelable.Creator<ShortcutIconResource> CREATOR = null;
/*     */     public String packageName;
/*     */     public String resourceName; }
/*     */   
/*  36 */   public static final class FilterComparison { public FilterComparison(Intent intent) { throw new RuntimeException("Stub!"); }
/*  37 */     public Intent getIntent() { throw new RuntimeException("Stub!"); }
/*  38 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/*  39 */     public int hashCode() { throw new RuntimeException("Stub!"); } }
/*     */   
/*  41 */   public Intent() { throw new RuntimeException("Stub!"); }
/*  42 */   public Intent(Intent o) { throw new RuntimeException("Stub!"); }
/*  43 */   public Intent(String action) { throw new RuntimeException("Stub!"); }
/*  44 */   public Intent(String action, Uri uri) { throw new RuntimeException("Stub!"); }
/*  45 */   public Intent(Context packageContext, Class<?> cls) { throw new RuntimeException("Stub!"); }
/*  46 */   public Intent(String action, Uri uri, Context packageContext, Class<?> cls) { throw new RuntimeException("Stub!"); }
/*  47 */   public static Intent createChooser(Intent target, CharSequence title) { throw new RuntimeException("Stub!"); }
/*  48 */   public static Intent createChooser(Intent target, CharSequence title, IntentSender sender) { throw new RuntimeException("Stub!"); }
/*  49 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*  50 */   public Intent cloneFilter() { throw new RuntimeException("Stub!"); }
/*  51 */   public static Intent makeMainActivity(ComponentName mainActivity) { throw new RuntimeException("Stub!"); }
/*  52 */   public static Intent makeMainSelectorActivity(String selectorAction, String selectorCategory) { throw new RuntimeException("Stub!"); }
/*  53 */   public static Intent makeRestartActivityTask(ComponentName mainActivity) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  55 */   public static Intent getIntent(String uri) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
/*  56 */   public static Intent parseUri(String uri, int flags) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
/*  57 */   public static Intent getIntentOld(String uri) throws java.net.URISyntaxException { throw new RuntimeException("Stub!"); }
/*  58 */   public String getAction() { throw new RuntimeException("Stub!"); }
/*  59 */   public Uri getData() { throw new RuntimeException("Stub!"); }
/*  60 */   public String getDataString() { throw new RuntimeException("Stub!"); }
/*  61 */   public String getScheme() { throw new RuntimeException("Stub!"); }
/*  62 */   public String getType() { throw new RuntimeException("Stub!"); }
/*  63 */   public String resolveType(Context context) { throw new RuntimeException("Stub!"); }
/*  64 */   public String resolveType(ContentResolver resolver) { throw new RuntimeException("Stub!"); }
/*  65 */   public String resolveTypeIfNeeded(ContentResolver resolver) { throw new RuntimeException("Stub!"); }
/*  66 */   public boolean hasCategory(String category) { throw new RuntimeException("Stub!"); }
/*  67 */   public java.util.Set<String> getCategories() { throw new RuntimeException("Stub!"); }
/*  68 */   public Intent getSelector() { throw new RuntimeException("Stub!"); }
/*  69 */   public ClipData getClipData() { throw new RuntimeException("Stub!"); }
/*  70 */   public void setExtrasClassLoader(ClassLoader loader) { throw new RuntimeException("Stub!"); }
/*  71 */   public boolean hasExtra(String name) { throw new RuntimeException("Stub!"); }
/*  72 */   public boolean hasFileDescriptors() { throw new RuntimeException("Stub!"); }
/*  73 */   public boolean getBooleanExtra(String name, boolean defaultValue) { throw new RuntimeException("Stub!"); }
/*  74 */   public byte getByteExtra(String name, byte defaultValue) { throw new RuntimeException("Stub!"); }
/*  75 */   public short getShortExtra(String name, short defaultValue) { throw new RuntimeException("Stub!"); }
/*  76 */   public char getCharExtra(String name, char defaultValue) { throw new RuntimeException("Stub!"); }
/*  77 */   public int getIntExtra(String name, int defaultValue) { throw new RuntimeException("Stub!"); }
/*  78 */   public long getLongExtra(String name, long defaultValue) { throw new RuntimeException("Stub!"); }
/*  79 */   public float getFloatExtra(String name, float defaultValue) { throw new RuntimeException("Stub!"); }
/*  80 */   public double getDoubleExtra(String name, double defaultValue) { throw new RuntimeException("Stub!"); }
/*  81 */   public String getStringExtra(String name) { throw new RuntimeException("Stub!"); }
/*  82 */   public CharSequence getCharSequenceExtra(String name) { throw new RuntimeException("Stub!"); }
/*  83 */   public <T extends Parcelable> T getParcelableExtra(String name) { throw new RuntimeException("Stub!"); }
/*  84 */   public Parcelable[] getParcelableArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  85 */   public <T extends Parcelable> ArrayList<T> getParcelableArrayListExtra(String name) { throw new RuntimeException("Stub!"); }
/*  86 */   public java.io.Serializable getSerializableExtra(String name) { throw new RuntimeException("Stub!"); }
/*  87 */   public ArrayList<Integer> getIntegerArrayListExtra(String name) { throw new RuntimeException("Stub!"); }
/*  88 */   public ArrayList<String> getStringArrayListExtra(String name) { throw new RuntimeException("Stub!"); }
/*  89 */   public ArrayList<CharSequence> getCharSequenceArrayListExtra(String name) { throw new RuntimeException("Stub!"); }
/*  90 */   public boolean[] getBooleanArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  91 */   public byte[] getByteArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  92 */   public short[] getShortArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  93 */   public char[] getCharArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  94 */   public int[] getIntArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  95 */   public long[] getLongArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  96 */   public float[] getFloatArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  97 */   public double[] getDoubleArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  98 */   public String[] getStringArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/*  99 */   public CharSequence[] getCharSequenceArrayExtra(String name) { throw new RuntimeException("Stub!"); }
/* 100 */   public android.os.Bundle getBundleExtra(String name) { throw new RuntimeException("Stub!"); }
/* 101 */   public android.os.Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 102 */   public int getFlags() { throw new RuntimeException("Stub!"); }
/* 103 */   public String getPackage() { throw new RuntimeException("Stub!"); }
/* 104 */   public ComponentName getComponent() { throw new RuntimeException("Stub!"); }
/* 105 */   public android.graphics.Rect getSourceBounds() { throw new RuntimeException("Stub!"); }
/* 106 */   public ComponentName resolveActivity(android.content.pm.PackageManager pm) { throw new RuntimeException("Stub!"); }
/* 107 */   public android.content.pm.ActivityInfo resolveActivityInfo(android.content.pm.PackageManager pm, int flags) { throw new RuntimeException("Stub!"); }
/* 108 */   public Intent setAction(String action) { throw new RuntimeException("Stub!"); }
/* 109 */   public Intent setData(Uri data) { throw new RuntimeException("Stub!"); }
/* 110 */   public Intent setDataAndNormalize(Uri data) { throw new RuntimeException("Stub!"); }
/* 111 */   public Intent setType(String type) { throw new RuntimeException("Stub!"); }
/* 112 */   public Intent setTypeAndNormalize(String type) { throw new RuntimeException("Stub!"); }
/* 113 */   public Intent setDataAndType(Uri data, String type) { throw new RuntimeException("Stub!"); }
/* 114 */   public Intent setDataAndTypeAndNormalize(Uri data, String type) { throw new RuntimeException("Stub!"); }
/* 115 */   public Intent addCategory(String category) { throw new RuntimeException("Stub!"); }
/* 116 */   public void removeCategory(String category) { throw new RuntimeException("Stub!"); }
/* 117 */   public void setSelector(Intent selector) { throw new RuntimeException("Stub!"); }
/* 118 */   public void setClipData(ClipData clip) { throw new RuntimeException("Stub!"); }
/* 119 */   public Intent putExtra(String name, boolean value) { throw new RuntimeException("Stub!"); }
/* 120 */   public Intent putExtra(String name, byte value) { throw new RuntimeException("Stub!"); }
/* 121 */   public Intent putExtra(String name, char value) { throw new RuntimeException("Stub!"); }
/* 122 */   public Intent putExtra(String name, short value) { throw new RuntimeException("Stub!"); }
/* 123 */   public Intent putExtra(String name, int value) { throw new RuntimeException("Stub!"); }
/* 124 */   public Intent putExtra(String name, long value) { throw new RuntimeException("Stub!"); }
/* 125 */   public Intent putExtra(String name, float value) { throw new RuntimeException("Stub!"); }
/* 126 */   public Intent putExtra(String name, double value) { throw new RuntimeException("Stub!"); }
/* 127 */   public Intent putExtra(String name, String value) { throw new RuntimeException("Stub!"); }
/* 128 */   public Intent putExtra(String name, CharSequence value) { throw new RuntimeException("Stub!"); }
/* 129 */   public Intent putExtra(String name, Parcelable value) { throw new RuntimeException("Stub!"); }
/* 130 */   public Intent putExtra(String name, Parcelable[] value) { throw new RuntimeException("Stub!"); }
/* 131 */   public Intent putParcelableArrayListExtra(String name, ArrayList<? extends Parcelable> value) { throw new RuntimeException("Stub!"); }
/* 132 */   public Intent putIntegerArrayListExtra(String name, ArrayList<Integer> value) { throw new RuntimeException("Stub!"); }
/* 133 */   public Intent putStringArrayListExtra(String name, ArrayList<String> value) { throw new RuntimeException("Stub!"); }
/* 134 */   public Intent putCharSequenceArrayListExtra(String name, ArrayList<CharSequence> value) { throw new RuntimeException("Stub!"); }
/* 135 */   public Intent putExtra(String name, java.io.Serializable value) { throw new RuntimeException("Stub!"); }
/* 136 */   public Intent putExtra(String name, boolean[] value) { throw new RuntimeException("Stub!"); }
/* 137 */   public Intent putExtra(String name, byte[] value) { throw new RuntimeException("Stub!"); }
/* 138 */   public Intent putExtra(String name, short[] value) { throw new RuntimeException("Stub!"); }
/* 139 */   public Intent putExtra(String name, char[] value) { throw new RuntimeException("Stub!"); }
/* 140 */   public Intent putExtra(String name, int[] value) { throw new RuntimeException("Stub!"); }
/* 141 */   public Intent putExtra(String name, long[] value) { throw new RuntimeException("Stub!"); }
/* 142 */   public Intent putExtra(String name, float[] value) { throw new RuntimeException("Stub!"); }
/* 143 */   public Intent putExtra(String name, double[] value) { throw new RuntimeException("Stub!"); }
/* 144 */   public Intent putExtra(String name, String[] value) { throw new RuntimeException("Stub!"); }
/* 145 */   public Intent putExtra(String name, CharSequence[] value) { throw new RuntimeException("Stub!"); }
/* 146 */   public Intent putExtra(String name, android.os.Bundle value) { throw new RuntimeException("Stub!"); }
/* 147 */   public Intent putExtras(Intent src) { throw new RuntimeException("Stub!"); }
/* 148 */   public Intent putExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 149 */   public Intent replaceExtras(Intent src) { throw new RuntimeException("Stub!"); }
/* 150 */   public Intent replaceExtras(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 151 */   public void removeExtra(String name) { throw new RuntimeException("Stub!"); }
/* 152 */   public Intent setFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 153 */   public Intent addFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 154 */   public void removeFlags(int flags) { throw new RuntimeException("Stub!"); }
/* 155 */   public Intent setPackage(String packageName) { throw new RuntimeException("Stub!"); }
/* 156 */   public Intent setComponent(ComponentName component) { throw new RuntimeException("Stub!"); }
/* 157 */   public Intent setClassName(Context packageContext, String className) { throw new RuntimeException("Stub!"); }
/* 158 */   public Intent setClassName(String packageName, String className) { throw new RuntimeException("Stub!"); }
/* 159 */   public Intent setClass(Context packageContext, Class<?> cls) { throw new RuntimeException("Stub!"); }
/* 160 */   public void setSourceBounds(android.graphics.Rect r) { throw new RuntimeException("Stub!"); }
/* 161 */   public int fillIn(Intent other, int flags) { throw new RuntimeException("Stub!"); }
/* 162 */   public boolean filterEquals(Intent other) { throw new RuntimeException("Stub!"); }
/* 163 */   public int filterHashCode() { throw new RuntimeException("Stub!"); }
/* 164 */   public String toString() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 166 */   public String toURI() { throw new RuntimeException("Stub!"); }
/* 167 */   public String toUri(int flags) { throw new RuntimeException("Stub!"); }
/* 168 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 169 */   public void writeToParcel(android.os.Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 170 */   public void readFromParcel(android.os.Parcel in) { throw new RuntimeException("Stub!"); }
/* 171 */   public static Intent parseIntent(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser parser, android.util.AttributeSet attrs) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException { throw new RuntimeException("Stub!"); }
/* 172 */   public static String normalizeMimeType(String type) { throw new RuntimeException("Stub!"); }
/*     */   
/*     */ 
/*     */   public static final String ACTION_BATTERY_OKAY = "android.intent.action.BATTERY_OKAY";
/*     */   
/*     */   public static final String ACTION_BOOT_COMPLETED = "android.intent.action.BOOT_COMPLETED";
/*     */   
/*     */   public static final String ACTION_BUG_REPORT = "android.intent.action.BUG_REPORT";
/*     */   
/*     */   public static final String ACTION_CALL = "android.intent.action.CALL";
/*     */   
/*     */   public static final String ACTION_CALL_BUTTON = "android.intent.action.CALL_BUTTON";
/*     */   
/*     */   public static final String ACTION_CAMERA_BUTTON = "android.intent.action.CAMERA_BUTTON";
/*     */   
/*     */   public static final String ACTION_CARRIER_SETUP = "android.intent.action.CARRIER_SETUP";
/*     */   
/*     */   public static final String ACTION_CHOOSER = "android.intent.action.CHOOSER";
/*     */   
/*     */   public static final String ACTION_CLOSE_SYSTEM_DIALOGS = "android.intent.action.CLOSE_SYSTEM_DIALOGS";
/*     */   
/*     */   public static final String ACTION_CONFIGURATION_CHANGED = "android.intent.action.CONFIGURATION_CHANGED";
/*     */   
/*     */   public static final String ACTION_CREATE_DOCUMENT = "android.intent.action.CREATE_DOCUMENT";
/*     */   
/*     */   public static final String ACTION_CREATE_SHORTCUT = "android.intent.action.CREATE_SHORTCUT";
/*     */   
/*     */   public static final String ACTION_DATE_CHANGED = "android.intent.action.DATE_CHANGED";
/*     */   
/*     */   public static final String ACTION_DEFAULT = "android.intent.action.VIEW";
/*     */   
/*     */   public static final String ACTION_DELETE = "android.intent.action.DELETE";
/*     */   
/*     */   @Deprecated
/*     */   public static final String ACTION_DEVICE_STORAGE_LOW = "android.intent.action.DEVICE_STORAGE_LOW";
/*     */   
/*     */   @Deprecated
/*     */   public static final String ACTION_DEVICE_STORAGE_OK = "android.intent.action.DEVICE_STORAGE_OK";
/*     */   
/*     */   public static final String ACTION_DIAL = "android.intent.action.DIAL";
/*     */   
/*     */   public static final String ACTION_DOCK_EVENT = "android.intent.action.DOCK_EVENT";
/*     */   
/*     */   public static final String ACTION_DREAMING_STARTED = "android.intent.action.DREAMING_STARTED";
/*     */   
/*     */   public static final String ACTION_DREAMING_STOPPED = "android.intent.action.DREAMING_STOPPED";
/*     */   
/*     */   public static final String ACTION_EDIT = "android.intent.action.EDIT";
/*     */   
/*     */   public static final String ACTION_EXTERNAL_APPLICATIONS_AVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_AVAILABLE";
/*     */   
/*     */   public static final String ACTION_EXTERNAL_APPLICATIONS_UNAVAILABLE = "android.intent.action.EXTERNAL_APPLICATIONS_UNAVAILABLE";
/*     */   
/*     */   public static final String ACTION_FACTORY_TEST = "android.intent.action.FACTORY_TEST";
/*     */   
/*     */   public static final String ACTION_GET_CONTENT = "android.intent.action.GET_CONTENT";
/*     */   
/*     */   public static final String ACTION_GET_RESTRICTION_ENTRIES = "android.intent.action.GET_RESTRICTION_ENTRIES";
/*     */   
/*     */   public static final String ACTION_GTALK_SERVICE_CONNECTED = "android.intent.action.GTALK_CONNECTED";
/*     */   
/*     */   public static final String ACTION_GTALK_SERVICE_DISCONNECTED = "android.intent.action.GTALK_DISCONNECTED";
/*     */   
/*     */   public static final String ACTION_HEADSET_PLUG = "android.intent.action.HEADSET_PLUG";
/*     */   
/*     */   public static final String ACTION_INPUT_METHOD_CHANGED = "android.intent.action.INPUT_METHOD_CHANGED";
/*     */   
/*     */   public static final String ACTION_INSERT = "android.intent.action.INSERT";
/*     */   
/*     */   public static final String ACTION_INSERT_OR_EDIT = "android.intent.action.INSERT_OR_EDIT";
/*     */   
/*     */   public static final String ACTION_INSTALL_PACKAGE = "android.intent.action.INSTALL_PACKAGE";
/*     */   
/*     */   public static final String ACTION_LOCALE_CHANGED = "android.intent.action.LOCALE_CHANGED";
/*     */   
/*     */   public static final String ACTION_LOCKED_BOOT_COMPLETED = "android.intent.action.LOCKED_BOOT_COMPLETED";
/*     */   
/*     */   public static final String ACTION_MAIN = "android.intent.action.MAIN";
/*     */   
/*     */   public static final String ACTION_MANAGED_PROFILE_ADDED = "android.intent.action.MANAGED_PROFILE_ADDED";
/*     */   
/*     */   public static final String ACTION_MANAGED_PROFILE_AVAILABLE = "android.intent.action.MANAGED_PROFILE_AVAILABLE";
/*     */   
/*     */   public static final String ACTION_MANAGED_PROFILE_REMOVED = "android.intent.action.MANAGED_PROFILE_REMOVED";
/*     */   
/*     */   public static final String ACTION_MANAGED_PROFILE_UNAVAILABLE = "android.intent.action.MANAGED_PROFILE_UNAVAILABLE";
/*     */   
/*     */   public static final String ACTION_MANAGED_PROFILE_UNLOCKED = "android.intent.action.MANAGED_PROFILE_UNLOCKED";
/*     */   
/*     */   public static final String ACTION_MANAGE_NETWORK_USAGE = "android.intent.action.MANAGE_NETWORK_USAGE";
/*     */   
/*     */   public static final String ACTION_MANAGE_PACKAGE_STORAGE = "android.intent.action.MANAGE_PACKAGE_STORAGE";
/*     */   
/*     */   public static final String ACTION_MEDIA_BAD_REMOVAL = "android.intent.action.MEDIA_BAD_REMOVAL";
/*     */   
/*     */   public static final String ACTION_MEDIA_BUTTON = "android.intent.action.MEDIA_BUTTON";
/*     */   
/*     */   public static final String ACTION_MEDIA_CHECKING = "android.intent.action.MEDIA_CHECKING";
/*     */   
/*     */   public static final String ACTION_MEDIA_EJECT = "android.intent.action.MEDIA_EJECT";
/*     */   
/*     */   public static final String ACTION_MEDIA_MOUNTED = "android.intent.action.MEDIA_MOUNTED";
/*     */   
/*     */   public static final String ACTION_MEDIA_NOFS = "android.intent.action.MEDIA_NOFS";
/*     */   
/*     */   public static final String ACTION_MEDIA_REMOVED = "android.intent.action.MEDIA_REMOVED";
/*     */   
/*     */   public static final String ACTION_MEDIA_SCANNER_FINISHED = "android.intent.action.MEDIA_SCANNER_FINISHED";
/*     */   
/*     */   public static final String ACTION_MEDIA_SCANNER_SCAN_FILE = "android.intent.action.MEDIA_SCANNER_SCAN_FILE";
/*     */   
/*     */   public static final String ACTION_MEDIA_SCANNER_STARTED = "android.intent.action.MEDIA_SCANNER_STARTED";
/*     */   
/*     */   public static final String ACTION_MEDIA_SHARED = "android.intent.action.MEDIA_SHARED";
/*     */   
/*     */   public static final String ACTION_MEDIA_UNMOUNTABLE = "android.intent.action.MEDIA_UNMOUNTABLE";
/*     */   
/*     */   public static final String ACTION_MEDIA_UNMOUNTED = "android.intent.action.MEDIA_UNMOUNTED";
/*     */   
/*     */   public static final String ACTION_MY_PACKAGE_REPLACED = "android.intent.action.MY_PACKAGE_REPLACED";
/*     */   
/*     */   public static final String ACTION_NEW_OUTGOING_CALL = "android.intent.action.NEW_OUTGOING_CALL";
/*     */   
/*     */   public static final String ACTION_OPEN_DOCUMENT = "android.intent.action.OPEN_DOCUMENT";
/*     */   
/*     */   public static final String ACTION_OPEN_DOCUMENT_TREE = "android.intent.action.OPEN_DOCUMENT_TREE";
/*     */   
/*     */   public static final String ACTION_PACKAGES_SUSPENDED = "android.intent.action.PACKAGES_SUSPENDED";
/*     */   
/*     */   public static final String ACTION_PACKAGES_UNSUSPENDED = "android.intent.action.PACKAGES_UNSUSPENDED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_ADDED = "android.intent.action.PACKAGE_ADDED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_CHANGED = "android.intent.action.PACKAGE_CHANGED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_DATA_CLEARED = "android.intent.action.PACKAGE_DATA_CLEARED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_FIRST_LAUNCH = "android.intent.action.PACKAGE_FIRST_LAUNCH";
/*     */   
/*     */   public static final String ACTION_PACKAGE_FULLY_REMOVED = "android.intent.action.PACKAGE_FULLY_REMOVED";
/*     */   
/*     */   @Deprecated
/*     */   public static final String ACTION_PACKAGE_INSTALL = "android.intent.action.PACKAGE_INSTALL";
/*     */   
/*     */   public static final String ACTION_PACKAGE_NEEDS_VERIFICATION = "android.intent.action.PACKAGE_NEEDS_VERIFICATION";
/*     */   
/*     */   public static final String ACTION_PACKAGE_REMOVED = "android.intent.action.PACKAGE_REMOVED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_REPLACED = "android.intent.action.PACKAGE_REPLACED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_RESTARTED = "android.intent.action.PACKAGE_RESTARTED";
/*     */   
/*     */   public static final String ACTION_PACKAGE_VERIFIED = "android.intent.action.PACKAGE_VERIFIED";
/*     */   
/*     */   public static final String ACTION_PASTE = "android.intent.action.PASTE";
/*     */   
/*     */   public static final String ACTION_PICK = "android.intent.action.PICK";
/*     */   
/*     */   public static final String ACTION_PICK_ACTIVITY = "android.intent.action.PICK_ACTIVITY";
/*     */   
/*     */   public static final String ACTION_POWER_CONNECTED = "android.intent.action.ACTION_POWER_CONNECTED";
/*     */   
/*     */   public static final String ACTION_POWER_DISCONNECTED = "android.intent.action.ACTION_POWER_DISCONNECTED";
/*     */   
/*     */   public static final String ACTION_POWER_USAGE_SUMMARY = "android.intent.action.POWER_USAGE_SUMMARY";
/*     */   
/*     */   public static final String ACTION_PROCESS_TEXT = "android.intent.action.PROCESS_TEXT";
/*     */   
/*     */   public static final String ACTION_PROVIDER_CHANGED = "android.intent.action.PROVIDER_CHANGED";
/*     */   
/*     */   public static final String ACTION_QUICK_CLOCK = "android.intent.action.QUICK_CLOCK";
/*     */   
/*     */   public static final String ACTION_QUICK_VIEW = "android.intent.action.QUICK_VIEW";
/*     */   
/*     */   public static final String ACTION_REBOOT = "android.intent.action.REBOOT";
/*     */   
/*     */   public static final String ACTION_RUN = "android.intent.action.RUN";
/*     */   
/*     */   public static final String ACTION_SCREEN_OFF = "android.intent.action.SCREEN_OFF";
/*     */   
/*     */   public static final String ACTION_SCREEN_ON = "android.intent.action.SCREEN_ON";
/*     */   
/*     */   public static final String ACTION_SEARCH = "android.intent.action.SEARCH";
/*     */   
/*     */   public static final String ACTION_SEARCH_LONG_PRESS = "android.intent.action.SEARCH_LONG_PRESS";
/*     */   
/*     */   public static final String ACTION_SEND = "android.intent.action.SEND";
/*     */   
/*     */   public static final String ACTION_SENDTO = "android.intent.action.SENDTO";
/*     */   
/*     */   public static final String ACTION_SEND_MULTIPLE = "android.intent.action.SEND_MULTIPLE";
/*     */   
/*     */   public static final String ACTION_SET_WALLPAPER = "android.intent.action.SET_WALLPAPER";
/*     */   
/*     */   public static final String ACTION_SHOW_APP_INFO = "android.intent.action.SHOW_APP_INFO";
/*     */   
/*     */   public static final String ACTION_SHUTDOWN = "android.intent.action.ACTION_SHUTDOWN";
/*     */   
/*     */   public static final String ACTION_SYNC = "android.intent.action.SYNC";
/*     */   
/*     */   public static final String ACTION_SYSTEM_TUTORIAL = "android.intent.action.SYSTEM_TUTORIAL";
/*     */   
/*     */   public static final String ACTION_TIMEZONE_CHANGED = "android.intent.action.TIMEZONE_CHANGED";
/*     */   
/*     */   public static final String ACTION_TIME_CHANGED = "android.intent.action.TIME_SET";
/*     */   
/*     */   public static final String ACTION_TIME_TICK = "android.intent.action.TIME_TICK";
/*     */   
/*     */   public static final String ACTION_UID_REMOVED = "android.intent.action.UID_REMOVED";
/*     */   
/*     */   @Deprecated
/*     */   public static final String ACTION_UMS_CONNECTED = "android.intent.action.UMS_CONNECTED";
/*     */   
/*     */   @Deprecated
/*     */   public static final String ACTION_UMS_DISCONNECTED = "android.intent.action.UMS_DISCONNECTED";
/*     */   
/*     */   public static final String ACTION_UNINSTALL_PACKAGE = "android.intent.action.UNINSTALL_PACKAGE";
/*     */   
/*     */   public static final String ACTION_USER_BACKGROUND = "android.intent.action.USER_BACKGROUND";
/*     */   
/*     */   public static final String ACTION_USER_FOREGROUND = "android.intent.action.USER_FOREGROUND";
/*     */   
/*     */   public static final String ACTION_USER_INITIALIZE = "android.intent.action.USER_INITIALIZE";
/*     */   
/*     */   public static final String ACTION_USER_PRESENT = "android.intent.action.USER_PRESENT";
/*     */   
/*     */   public static final String ACTION_USER_UNLOCKED = "android.intent.action.USER_UNLOCKED";
/*     */   
/*     */   public static final String ACTION_VIEW = "android.intent.action.VIEW";
/*     */   
/*     */   public static final String ACTION_VOICE_COMMAND = "android.intent.action.VOICE_COMMAND";
/*     */   
/*     */   @Deprecated
/*     */   public static final String ACTION_WALLPAPER_CHANGED = "android.intent.action.WALLPAPER_CHANGED";
/*     */   
/*     */   public static final String ACTION_WEB_SEARCH = "android.intent.action.WEB_SEARCH";
/*     */   
/*     */   public static final String CATEGORY_ALTERNATIVE = "android.intent.category.ALTERNATIVE";
/*     */   
/*     */   public static final String CATEGORY_APP_BROWSER = "android.intent.category.APP_BROWSER";
/*     */   
/*     */   public static final String CATEGORY_APP_CALCULATOR = "android.intent.category.APP_CALCULATOR";
/*     */   
/*     */   public static final String CATEGORY_APP_CALENDAR = "android.intent.category.APP_CALENDAR";
/*     */   
/*     */   public static final String CATEGORY_APP_CONTACTS = "android.intent.category.APP_CONTACTS";
/*     */   
/*     */   public static final String CATEGORY_APP_EMAIL = "android.intent.category.APP_EMAIL";
/*     */   
/*     */   public static final String CATEGORY_APP_GALLERY = "android.intent.category.APP_GALLERY";
/*     */   
/*     */   public static final String CATEGORY_APP_MAPS = "android.intent.category.APP_MAPS";
/*     */   
/*     */   public static final String CATEGORY_APP_MARKET = "android.intent.category.APP_MARKET";
/*     */   
/*     */   public static final String CATEGORY_APP_MESSAGING = "android.intent.category.APP_MESSAGING";
/*     */   
/*     */   public static final String CATEGORY_APP_MUSIC = "android.intent.category.APP_MUSIC";
/*     */   
/*     */   public static final String CATEGORY_BROWSABLE = "android.intent.category.BROWSABLE";
/*     */   
/*     */   public static final String CATEGORY_CAR_DOCK = "android.intent.category.CAR_DOCK";
/*     */   
/*     */   public static final String CATEGORY_CAR_MODE = "android.intent.category.CAR_MODE";
/*     */   
/*     */   public static final String CATEGORY_DEFAULT = "android.intent.category.DEFAULT";
/*     */   
/*     */   public static final String CATEGORY_DESK_DOCK = "android.intent.category.DESK_DOCK";
/*     */   
/*     */   public static final String CATEGORY_DEVELOPMENT_PREFERENCE = "android.intent.category.DEVELOPMENT_PREFERENCE";
/*     */   
/*     */   public static final String CATEGORY_EMBED = "android.intent.category.EMBED";
/*     */   
/*     */   public static final String CATEGORY_FRAMEWORK_INSTRUMENTATION_TEST = "android.intent.category.FRAMEWORK_INSTRUMENTATION_TEST";
/*     */   public static final String CATEGORY_HE_DESK_DOCK = "android.intent.category.HE_DESK_DOCK";
/*     */   public static final String CATEGORY_HOME = "android.intent.category.HOME";
/*     */   public static final String CATEGORY_INFO = "android.intent.category.INFO";
/*     */   public static final String CATEGORY_LAUNCHER = "android.intent.category.LAUNCHER";
/*     */   public static final String CATEGORY_LEANBACK_LAUNCHER = "android.intent.category.LEANBACK_LAUNCHER";
/*     */   public static final String CATEGORY_LE_DESK_DOCK = "android.intent.category.LE_DESK_DOCK";
/*     */   public static final String CATEGORY_MONKEY = "android.intent.category.MONKEY";
/*     */   public static final String CATEGORY_OPENABLE = "android.intent.category.OPENABLE";
/*     */   public static final String CATEGORY_PREFERENCE = "android.intent.category.PREFERENCE";
/*     */   public static final String CATEGORY_SAMPLE_CODE = "android.intent.category.SAMPLE_CODE";
/*     */   public static final String CATEGORY_SELECTED_ALTERNATIVE = "android.intent.category.SELECTED_ALTERNATIVE";
/*     */   public static final String CATEGORY_TAB = "android.intent.category.TAB";
/*     */   public static final String CATEGORY_TEST = "android.intent.category.TEST";
/*     */   public static final String CATEGORY_TYPED_OPENABLE = "android.intent.category.TYPED_OPENABLE";
/*     */   public static final String CATEGORY_UNIT_TEST = "android.intent.category.UNIT_TEST";
/*     */   public static final String CATEGORY_VOICE = "android.intent.category.VOICE";
/*     */   public static final String CATEGORY_VR_HOME = "android.intent.category.VR_HOME";
/* 463 */   public static final android.os.Parcelable.Creator<Intent> CREATOR = null;
/*     */   public static final String EXTRA_ALARM_COUNT = "android.intent.extra.ALARM_COUNT";
/*     */   public static final String EXTRA_ALLOW_MULTIPLE = "android.intent.extra.ALLOW_MULTIPLE";
/*     */   @Deprecated
/*     */   public static final String EXTRA_ALLOW_REPLACE = "android.intent.extra.ALLOW_REPLACE";
/*     */   public static final String EXTRA_ALTERNATE_INTENTS = "android.intent.extra.ALTERNATE_INTENTS";
/*     */   public static final String EXTRA_ASSIST_CONTEXT = "android.intent.extra.ASSIST_CONTEXT";
/*     */   public static final String EXTRA_ASSIST_INPUT_DEVICE_ID = "android.intent.extra.ASSIST_INPUT_DEVICE_ID";
/*     */   public static final String EXTRA_ASSIST_INPUT_HINT_KEYBOARD = "android.intent.extra.ASSIST_INPUT_HINT_KEYBOARD";
/*     */   public static final String EXTRA_ASSIST_PACKAGE = "android.intent.extra.ASSIST_PACKAGE";
/*     */   public static final String EXTRA_ASSIST_UID = "android.intent.extra.ASSIST_UID";
/*     */   public static final String EXTRA_BCC = "android.intent.extra.BCC";
/*     */   public static final String EXTRA_BUG_REPORT = "android.intent.extra.BUG_REPORT";
/*     */   public static final String EXTRA_CC = "android.intent.extra.CC";
/*     */   @Deprecated
/*     */   public static final String EXTRA_CHANGED_COMPONENT_NAME = "android.intent.extra.changed_component_name";
/*     */   public static final String EXTRA_CHANGED_COMPONENT_NAME_LIST = "android.intent.extra.changed_component_name_list";
/*     */   public static final String EXTRA_CHANGED_PACKAGE_LIST = "android.intent.extra.changed_package_list";
/*     */   public static final String EXTRA_CHANGED_UID_LIST = "android.intent.extra.changed_uid_list";
/*     */   public static final String EXTRA_CHOOSER_REFINEMENT_INTENT_SENDER = "android.intent.extra.CHOOSER_REFINEMENT_INTENT_SENDER";
/*     */   public static final String EXTRA_CHOOSER_TARGETS = "android.intent.extra.CHOOSER_TARGETS";
/*     */   public static final String EXTRA_CHOSEN_COMPONENT = "android.intent.extra.CHOSEN_COMPONENT";
/*     */   public static final String EXTRA_CHOSEN_COMPONENT_INTENT_SENDER = "android.intent.extra.CHOSEN_COMPONENT_INTENT_SENDER";
/*     */   public static final String EXTRA_COMPONENT_NAME = "android.intent.extra.COMPONENT_NAME";
/*     */   public static final String EXTRA_CONTENT_ANNOTATIONS = "android.intent.extra.CONTENT_ANNOTATIONS";
/*     */   public static final String EXTRA_DATA_REMOVED = "android.intent.extra.DATA_REMOVED";
/*     */   public static final String EXTRA_DOCK_STATE = "android.intent.extra.DOCK_STATE";
/*     */   public static final int EXTRA_DOCK_STATE_CAR = 2;
/*     */   public static final int EXTRA_DOCK_STATE_DESK = 1;
/*     */   public static final int EXTRA_DOCK_STATE_HE_DESK = 4;
/*     */   public static final int EXTRA_DOCK_STATE_LE_DESK = 3;
/*     */   public static final int EXTRA_DOCK_STATE_UNDOCKED = 0;
/*     */   public static final String EXTRA_DONT_KILL_APP = "android.intent.extra.DONT_KILL_APP";
/*     */   public static final String EXTRA_EMAIL = "android.intent.extra.EMAIL";
/*     */   public static final String EXTRA_EXCLUDE_COMPONENTS = "android.intent.extra.EXCLUDE_COMPONENTS";
/*     */   public static final String EXTRA_FROM_STORAGE = "android.intent.extra.FROM_STORAGE";
/*     */   public static final String EXTRA_HTML_TEXT = "android.intent.extra.HTML_TEXT";
/*     */   public static final String EXTRA_INDEX = "android.intent.extra.INDEX";
/*     */   public static final String EXTRA_INITIAL_INTENTS = "android.intent.extra.INITIAL_INTENTS";
/*     */   public static final String EXTRA_INSTALLER_PACKAGE_NAME = "android.intent.extra.INSTALLER_PACKAGE_NAME";
/*     */   public static final String EXTRA_INTENT = "android.intent.extra.INTENT";
/*     */   public static final String EXTRA_KEY_EVENT = "android.intent.extra.KEY_EVENT";
/*     */   public static final String EXTRA_LOCAL_ONLY = "android.intent.extra.LOCAL_ONLY";
/*     */   public static final String EXTRA_MIME_TYPES = "android.intent.extra.MIME_TYPES";
/*     */   public static final String EXTRA_NOT_UNKNOWN_SOURCE = "android.intent.extra.NOT_UNKNOWN_SOURCE";
/*     */   public static final String EXTRA_ORIGINATING_URI = "android.intent.extra.ORIGINATING_URI";
/*     */   public static final String EXTRA_PACKAGE_NAME = "android.intent.extra.PACKAGE_NAME";
/*     */   public static final String EXTRA_PHONE_NUMBER = "android.intent.extra.PHONE_NUMBER";
/*     */   public static final String EXTRA_PROCESS_TEXT = "android.intent.extra.PROCESS_TEXT";
/*     */   public static final String EXTRA_PROCESS_TEXT_READONLY = "android.intent.extra.PROCESS_TEXT_READONLY";
/*     */   public static final String EXTRA_QUICK_VIEW_FEATURES = "android.intent.extra.QUICK_VIEW_FEATURES";
/*     */   public static final String EXTRA_QUIET_MODE = "android.intent.extra.QUIET_MODE";
/*     */   public static final String EXTRA_REFERRER = "android.intent.extra.REFERRER";
/*     */   public static final String EXTRA_REFERRER_NAME = "android.intent.extra.REFERRER_NAME";
/*     */   public static final String EXTRA_REMOTE_INTENT_TOKEN = "android.intent.extra.remote_intent_token";
/*     */   public static final String EXTRA_REPLACEMENT_EXTRAS = "android.intent.extra.REPLACEMENT_EXTRAS";
/*     */   public static final String EXTRA_REPLACING = "android.intent.extra.REPLACING";
/*     */   public static final String EXTRA_RESTRICTIONS_BUNDLE = "android.intent.extra.restrictions_bundle";
/*     */   public static final String EXTRA_RESTRICTIONS_INTENT = "android.intent.extra.restrictions_intent";
/*     */   public static final String EXTRA_RESTRICTIONS_LIST = "android.intent.extra.restrictions_list";
/*     */   public static final String EXTRA_RESULT_RECEIVER = "android.intent.extra.RESULT_RECEIVER";
/*     */   public static final String EXTRA_RETURN_RESULT = "android.intent.extra.RETURN_RESULT";
/*     */   @Deprecated
/*     */   public static final String EXTRA_SHORTCUT_ICON = "android.intent.extra.shortcut.ICON";
/*     */   @Deprecated
/*     */   public static final String EXTRA_SHORTCUT_ICON_RESOURCE = "android.intent.extra.shortcut.ICON_RESOURCE";
/*     */   @Deprecated
/*     */   public static final String EXTRA_SHORTCUT_INTENT = "android.intent.extra.shortcut.INTENT";
/*     */   @Deprecated
/*     */   public static final String EXTRA_SHORTCUT_NAME = "android.intent.extra.shortcut.NAME";
/*     */   public static final String EXTRA_SHUTDOWN_USERSPACE_ONLY = "android.intent.extra.SHUTDOWN_USERSPACE_ONLY";
/*     */   public static final String EXTRA_STREAM = "android.intent.extra.STREAM";
/*     */   public static final String EXTRA_SUBJECT = "android.intent.extra.SUBJECT";
/*     */   public static final String EXTRA_TEMPLATE = "android.intent.extra.TEMPLATE";
/*     */   public static final String EXTRA_TEXT = "android.intent.extra.TEXT";
/*     */   public static final String EXTRA_TITLE = "android.intent.extra.TITLE";
/*     */   public static final String EXTRA_UID = "android.intent.extra.UID";
/*     */   public static final String EXTRA_USER = "android.intent.extra.USER";
/*     */   public static final int FILL_IN_ACTION = 1;
/*     */   public static final int FILL_IN_CATEGORIES = 4;
/*     */   public static final int FILL_IN_CLIP_DATA = 128;
/*     */   public static final int FILL_IN_COMPONENT = 8;
/*     */   public static final int FILL_IN_DATA = 2;
/*     */   public static final int FILL_IN_PACKAGE = 16;
/*     */   public static final int FILL_IN_SELECTOR = 64;
/*     */   public static final int FILL_IN_SOURCE_BOUNDS = 32;
/*     */   public static final int FLAG_ACTIVITY_BROUGHT_TO_FRONT = 4194304;
/*     */   public static final int FLAG_ACTIVITY_CLEAR_TASK = 32768;
/*     */   public static final int FLAG_ACTIVITY_CLEAR_TOP = 67108864;
/*     */   @Deprecated
/*     */   public static final int FLAG_ACTIVITY_CLEAR_WHEN_TASK_RESET = 524288;
/*     */   public static final int FLAG_ACTIVITY_EXCLUDE_FROM_RECENTS = 8388608;
/*     */   public static final int FLAG_ACTIVITY_FORWARD_RESULT = 33554432;
/*     */   public static final int FLAG_ACTIVITY_LAUNCHED_FROM_HISTORY = 1048576;
/*     */   public static final int FLAG_ACTIVITY_LAUNCH_ADJACENT = 4096;
/*     */   public static final int FLAG_ACTIVITY_MULTIPLE_TASK = 134217728;
/*     */   public static final int FLAG_ACTIVITY_NEW_DOCUMENT = 524288;
/*     */   public static final int FLAG_ACTIVITY_NEW_TASK = 268435456;
/*     */   public static final int FLAG_ACTIVITY_NO_ANIMATION = 65536;
/*     */   public static final int FLAG_ACTIVITY_NO_HISTORY = 1073741824;
/*     */   public static final int FLAG_ACTIVITY_NO_USER_ACTION = 262144;
/*     */   public static final int FLAG_ACTIVITY_PREVIOUS_IS_TOP = 16777216;
/*     */   public static final int FLAG_ACTIVITY_REORDER_TO_FRONT = 131072;
/*     */   public static final int FLAG_ACTIVITY_RESET_TASK_IF_NEEDED = 2097152;
/*     */   public static final int FLAG_ACTIVITY_RETAIN_IN_RECENTS = 8192;
/*     */   public static final int FLAG_ACTIVITY_SINGLE_TOP = 536870912;
/*     */   public static final int FLAG_ACTIVITY_TASK_ON_HOME = 16384;
/*     */   public static final int FLAG_DEBUG_LOG_RESOLUTION = 8;
/*     */   public static final int FLAG_EXCLUDE_STOPPED_PACKAGES = 16;
/*     */   public static final int FLAG_FROM_BACKGROUND = 4;
/*     */   public static final int FLAG_GRANT_PERSISTABLE_URI_PERMISSION = 64;
/*     */   public static final int FLAG_GRANT_PREFIX_URI_PERMISSION = 128;
/*     */   public static final int FLAG_GRANT_READ_URI_PERMISSION = 1;
/*     */   public static final int FLAG_GRANT_WRITE_URI_PERMISSION = 2;
/*     */   public static final int FLAG_INCLUDE_STOPPED_PACKAGES = 32;
/*     */   public static final int FLAG_RECEIVER_FOREGROUND = 268435456;
/*     */   public static final int FLAG_RECEIVER_NO_ABORT = 134217728;
/*     */   public static final int FLAG_RECEIVER_REGISTERED_ONLY = 1073741824;
/*     */   public static final int FLAG_RECEIVER_REPLACE_PENDING = 536870912;
/*     */   public static final int FLAG_RECEIVER_VISIBLE_TO_INSTANT_APPS = 2097152;
/*     */   public static final String METADATA_DOCK_HOME = "android.dock_home";
/*     */   public static final int URI_ALLOW_UNSAFE = 4;
/*     */   public static final int URI_ANDROID_APP_SCHEME = 2;
/*     */   public static final int URI_INTENT_SCHEME = 1;
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\content\Intent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */