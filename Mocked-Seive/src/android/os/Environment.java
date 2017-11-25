/*    */ package android.os;
/*    */ 
/*    */ import java.io.File;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Environment
/*    */ {
/*    */   public static String DIRECTORY_ALARMS;
/*    */   public static String DIRECTORY_DCIM;
/*    */   public static String DIRECTORY_DOCUMENTS;
/*    */   public static String DIRECTORY_DOWNLOADS;
/*    */   public static String DIRECTORY_MOVIES;
/*    */   public static String DIRECTORY_MUSIC;
/*    */   public static String DIRECTORY_NOTIFICATIONS;
/*    */   public static String DIRECTORY_PICTURES;
/*    */   public static String DIRECTORY_PODCASTS;
/*    */   public static String DIRECTORY_RINGTONES;
/*    */   
/* 20 */   public Environment() { throw new RuntimeException("Stub!"); }
/* 21 */   public static File getRootDirectory() { throw new RuntimeException("Stub!"); }
/* 22 */   public static File getDataDirectory() { throw new RuntimeException("Stub!"); }
/* 23 */   public static File getExternalStorageDirectory() { throw new RuntimeException("Stub!"); }
/* 24 */   public static File getExternalStoragePublicDirectory(String type) { throw new RuntimeException("Stub!"); }
/* 25 */   public static File getDownloadCacheDirectory() { throw new RuntimeException("Stub!"); }
/* 26 */   public static String getExternalStorageState() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public static String getStorageState(File path) { throw new RuntimeException("Stub!"); }
/* 29 */   public static String getExternalStorageState(File path) { throw new RuntimeException("Stub!"); }
/* 30 */   public static boolean isExternalStorageRemovable() { throw new RuntimeException("Stub!"); }
/* 31 */   public static boolean isExternalStorageRemovable(File path) { throw new RuntimeException("Stub!"); }
/* 32 */   public static boolean isExternalStorageEmulated() { throw new RuntimeException("Stub!"); }
/* 33 */   public static boolean isExternalStorageEmulated(File path) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String MEDIA_BAD_REMOVAL = "bad_removal";
/*    */   public static final String MEDIA_CHECKING = "checking";
/*    */   public static final String MEDIA_EJECTING = "ejecting";
/*    */   public static final String MEDIA_MOUNTED = "mounted";
/*    */   public static final String MEDIA_MOUNTED_READ_ONLY = "mounted_ro";
/*    */   public static final String MEDIA_NOFS = "nofs";
/*    */   public static final String MEDIA_REMOVED = "removed";
/*    */   public static final String MEDIA_SHARED = "shared";
/*    */   public static final String MEDIA_UNKNOWN = "unknown";
/*    */   public static final String MEDIA_UNMOUNTABLE = "unmountable";
/*    */   public static final String MEDIA_UNMOUNTED = "unmounted";
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\os\Environment.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */