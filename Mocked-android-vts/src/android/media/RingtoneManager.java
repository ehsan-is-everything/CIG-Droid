/*    */ package android.media;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class RingtoneManager
/*    */ {
/*    */   public static final String ACTION_RINGTONE_PICKER = "android.intent.action.RINGTONE_PICKER";
/*    */   public static final String EXTRA_RINGTONE_DEFAULT_URI = "android.intent.extra.ringtone.DEFAULT_URI";
/*    */   public static final String EXTRA_RINGTONE_EXISTING_URI = "android.intent.extra.ringtone.EXISTING_URI";
/*    */   @Deprecated
/*    */   public static final String EXTRA_RINGTONE_INCLUDE_DRM = "android.intent.extra.ringtone.INCLUDE_DRM";
/*    */   public static final String EXTRA_RINGTONE_PICKED_URI = "android.intent.extra.ringtone.PICKED_URI";
/*    */   public static final String EXTRA_RINGTONE_SHOW_DEFAULT = "android.intent.extra.ringtone.SHOW_DEFAULT";
/*    */   public static final String EXTRA_RINGTONE_SHOW_SILENT = "android.intent.extra.ringtone.SHOW_SILENT";
/*    */   public static final String EXTRA_RINGTONE_TITLE = "android.intent.extra.ringtone.TITLE";
/*    */   
/* 20 */   public RingtoneManager(android.app.Activity activity) { throw new RuntimeException("Stub!"); }
/* 21 */   public RingtoneManager(Context context) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setType(int type) { throw new RuntimeException("Stub!"); }
/* 23 */   public int inferStreamType() { throw new RuntimeException("Stub!"); }
/* 24 */   public void setStopPreviousRingtone(boolean stopPreviousRingtone) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean getStopPreviousRingtone() { throw new RuntimeException("Stub!"); }
/* 26 */   public void stopPreviousRingtone() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public boolean getIncludeDrm() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public void setIncludeDrm(boolean includeDrm) { throw new RuntimeException("Stub!"); }
/* 31 */   public android.database.Cursor getCursor() { throw new RuntimeException("Stub!"); }
/* 32 */   public Ringtone getRingtone(int position) { throw new RuntimeException("Stub!"); }
/* 33 */   public Uri getRingtoneUri(int position) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getRingtonePosition(Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
/* 35 */   public static Uri getValidRingtoneUri(Context context) { throw new RuntimeException("Stub!"); }
/* 36 */   public static Ringtone getRingtone(Context context, Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
/* 37 */   public static Uri getActualDefaultRingtoneUri(Context context, int type) { throw new RuntimeException("Stub!"); }
/* 38 */   public static void setActualDefaultRingtoneUri(Context context, int type, Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
/* 39 */   public static boolean isDefault(Uri ringtoneUri) { throw new RuntimeException("Stub!"); }
/* 40 */   public static int getDefaultType(Uri defaultRingtoneUri) { throw new RuntimeException("Stub!"); }
/* 41 */   public static Uri getDefaultUri(int type) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String EXTRA_RINGTONE_TYPE = "android.intent.extra.ringtone.TYPE";
/*    */   public static final int ID_COLUMN_INDEX = 0;
/*    */   public static final int TITLE_COLUMN_INDEX = 1;
/*    */   public static final int TYPE_ALARM = 4;
/*    */   public static final int TYPE_ALL = 7;
/*    */   public static final int TYPE_NOTIFICATION = 2;
/*    */   public static final int TYPE_RINGTONE = 1;
/*    */   public static final int URI_COLUMN_INDEX = 2;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\RingtoneManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */