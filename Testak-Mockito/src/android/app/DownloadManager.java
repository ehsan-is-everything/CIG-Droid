/*    */ package android.app;
/*    */ 
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DownloadManager
/*    */ {
/*    */   public static final String ACTION_DOWNLOAD_COMPLETE = "android.intent.action.DOWNLOAD_COMPLETE";
/*    */   public static final String ACTION_NOTIFICATION_CLICKED = "android.intent.action.DOWNLOAD_NOTIFICATION_CLICKED";
/*    */   public static final String ACTION_VIEW_DOWNLOADS = "android.intent.action.VIEW_DOWNLOADS";
/*    */   public static final String COLUMN_BYTES_DOWNLOADED_SO_FAR = "bytes_so_far";
/*    */   public static final String COLUMN_DESCRIPTION = "description";
/*    */   public static final String COLUMN_ID = "_id";
/*    */   public static final String COLUMN_LAST_MODIFIED_TIMESTAMP = "last_modified_timestamp";
/*    */   @Deprecated
/*    */   public static final String COLUMN_LOCAL_FILENAME = "local_filename";
/*    */   public static final String COLUMN_LOCAL_URI = "local_uri";
/*    */   
/*    */   public static class Request
/*    */   {
/* 22 */     public Request(Uri uri) { throw new RuntimeException("Stub!"); }
/* 23 */     public Request setDestinationUri(Uri uri) { throw new RuntimeException("Stub!"); }
/* 24 */     public Request setDestinationInExternalFilesDir(android.content.Context context, String dirType, String subPath) { throw new RuntimeException("Stub!"); }
/* 25 */     public Request setDestinationInExternalPublicDir(String dirType, String subPath) { throw new RuntimeException("Stub!"); }
/* 26 */     public void allowScanningByMediaScanner() { throw new RuntimeException("Stub!"); }
/* 27 */     public Request addRequestHeader(String header, String value) { throw new RuntimeException("Stub!"); }
/* 28 */     public Request setTitle(CharSequence title) { throw new RuntimeException("Stub!"); }
/* 29 */     public Request setDescription(CharSequence description) { throw new RuntimeException("Stub!"); }
/* 30 */     public Request setMimeType(String mimeType) { throw new RuntimeException("Stub!"); }
/*    */     @Deprecated
/* 32 */     public Request setShowRunningNotification(boolean show) { throw new RuntimeException("Stub!"); }
/* 33 */     public Request setNotificationVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/* 34 */     public Request setAllowedNetworkTypes(int flags) { throw new RuntimeException("Stub!"); }
/* 35 */     public Request setAllowedOverRoaming(boolean allowed) { throw new RuntimeException("Stub!"); }
/* 36 */     public Request setAllowedOverMetered(boolean allow) { throw new RuntimeException("Stub!"); }
/* 37 */     public Request setRequiresCharging(boolean requiresCharging) { throw new RuntimeException("Stub!"); }
/* 38 */     public Request setRequiresDeviceIdle(boolean requiresDeviceIdle) { throw new RuntimeException("Stub!"); }
/* 39 */     public Request setVisibleInDownloadsUi(boolean isVisible) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public static final int NETWORK_MOBILE = 1;
/*    */     public static final int NETWORK_WIFI = 2;
/*    */     public static final int VISIBILITY_HIDDEN = 2;
/*    */     public static final int VISIBILITY_VISIBLE = 0;
/*    */     public static final int VISIBILITY_VISIBLE_NOTIFY_COMPLETED = 1;
/*    */     public static final int VISIBILITY_VISIBLE_NOTIFY_ONLY_COMPLETION = 3;
/*    */   }
/*    */   
/* 49 */   public static class Query { public Query() { throw new RuntimeException("Stub!"); }
/* 50 */     public Query setFilterById(long... ids) { throw new RuntimeException("Stub!"); }
/* 51 */     public Query setFilterByStatus(int flags) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 53 */   public static final String COLUMN_MEDIAPROVIDER_URI = "mediaprovider_uri"; DownloadManager() { throw new RuntimeException("Stub!"); }
/* 54 */   public long enqueue(Request request) { throw new RuntimeException("Stub!"); }
/* 55 */   public int remove(long... ids) { throw new RuntimeException("Stub!"); }
/* 56 */   public android.database.Cursor query(Query query) { throw new RuntimeException("Stub!"); }
/* 57 */   public android.os.ParcelFileDescriptor openDownloadedFile(long id) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 58 */   public Uri getUriForDownloadedFile(long id) { throw new RuntimeException("Stub!"); }
/* 59 */   public String getMimeTypeForDownloadedFile(long id) { throw new RuntimeException("Stub!"); }
/* 60 */   public static Long getMaxBytesOverMobile(android.content.Context context) { throw new RuntimeException("Stub!"); }
/* 61 */   public static Long getRecommendedMaxBytesOverMobile(android.content.Context context) { throw new RuntimeException("Stub!"); }
/* 62 */   public long addCompletedDownload(String title, String description, boolean isMediaScannerScannable, String mimeType, String path, long length, boolean showNotification) { throw new RuntimeException("Stub!"); }
/* 63 */   public long addCompletedDownload(String title, String description, boolean isMediaScannerScannable, String mimeType, String path, long length, boolean showNotification, Uri uri, Uri referer) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String COLUMN_MEDIA_TYPE = "media_type";
/*    */   public static final String COLUMN_REASON = "reason";
/*    */   public static final String COLUMN_STATUS = "status";
/*    */   public static final String COLUMN_TITLE = "title";
/*    */   public static final String COLUMN_TOTAL_SIZE_BYTES = "total_size";
/*    */   public static final String COLUMN_URI = "uri";
/*    */   public static final int ERROR_CANNOT_RESUME = 1008;
/*    */   public static final int ERROR_DEVICE_NOT_FOUND = 1007;
/*    */   public static final int ERROR_FILE_ALREADY_EXISTS = 1009;
/*    */   public static final int ERROR_FILE_ERROR = 1001;
/*    */   public static final int ERROR_HTTP_DATA_ERROR = 1004;
/*    */   public static final int ERROR_INSUFFICIENT_SPACE = 1006;
/*    */   public static final int ERROR_TOO_MANY_REDIRECTS = 1005;
/*    */   public static final int ERROR_UNHANDLED_HTTP_CODE = 1002;
/*    */   public static final int ERROR_UNKNOWN = 1000;
/*    */   public static final String EXTRA_DOWNLOAD_ID = "extra_download_id";
/*    */   public static final String EXTRA_NOTIFICATION_CLICK_DOWNLOAD_IDS = "extra_click_download_ids";
/*    */   public static final String INTENT_EXTRAS_SORT_BY_SIZE = "android.app.DownloadManager.extra_sortBySize";
/*    */   public static final int PAUSED_QUEUED_FOR_WIFI = 3;
/*    */   public static final int PAUSED_UNKNOWN = 4;
/*    */   public static final int PAUSED_WAITING_FOR_NETWORK = 2;
/*    */   public static final int PAUSED_WAITING_TO_RETRY = 1;
/*    */   public static final int STATUS_FAILED = 16;
/*    */   public static final int STATUS_PAUSED = 4;
/*    */   public static final int STATUS_PENDING = 1;
/*    */   public static final int STATUS_RUNNING = 2;
/*    */   public static final int STATUS_SUCCESSFUL = 8;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\DownloadManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */