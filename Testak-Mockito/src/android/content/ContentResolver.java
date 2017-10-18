/*    */ package android.content;
/*    */ 
/*    */ import android.accounts.Account;
/*    */ import android.net.Uri;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ContentResolver
/*    */ {
/*    */   public static final String ANY_CURSOR_ITEM_TYPE = "vnd.android.cursor.item/*";
/*    */   public static final String CURSOR_DIR_BASE_TYPE = "vnd.android.cursor.dir";
/*    */   public static final String CURSOR_ITEM_BASE_TYPE = "vnd.android.cursor.item";
/*    */   public static final String EXTRA_HONORED_ARGS = "android.content.extra.HONORED_ARGS";
/*    */   public static final String EXTRA_REFRESH_SUPPORTED = "android.content.extra.REFRESH_SUPPORTED";
/*    */   public static final String EXTRA_SIZE = "android.content.extra.SIZE";
/*    */   public static final String EXTRA_TOTAL_COUNT = "android.content.extra.TOTAL_COUNT";
/*    */   public static final int NOTIFY_SKIP_NOTIFY_FOR_DESCENDANTS = 2;
/*    */   public static final int NOTIFY_SYNC_TO_NETWORK = 1;
/*    */   
/* 20 */   public ContentResolver(Context context) { throw new RuntimeException("Stub!"); }
/* 21 */   public final String getType(Uri url) { throw new RuntimeException("Stub!"); }
/* 22 */   public String[] getStreamTypes(Uri url, String mimeTypeFilter) { throw new RuntimeException("Stub!"); }
/* 23 */   public final android.database.Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) { throw new RuntimeException("Stub!"); }
/* 24 */   public final android.database.Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 25 */   public final android.database.Cursor query(Uri uri, String[] projection, android.os.Bundle queryArgs, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 26 */   public final Uri canonicalize(Uri url) { throw new RuntimeException("Stub!"); }
/* 27 */   public final Uri uncanonicalize(Uri url) { throw new RuntimeException("Stub!"); }
/* 28 */   public final boolean refresh(Uri url, android.os.Bundle args, android.os.CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 29 */   public final java.io.InputStream openInputStream(Uri uri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 30 */   public final java.io.OutputStream openOutputStream(Uri uri) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 31 */   public final java.io.OutputStream openOutputStream(Uri uri, String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   public final android.os.ParcelFileDescriptor openFileDescriptor(Uri uri, String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 33 */   public final android.os.ParcelFileDescriptor openFileDescriptor(Uri uri, String mode, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 34 */   public final android.content.res.AssetFileDescriptor openAssetFileDescriptor(Uri uri, String mode) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 35 */   public final android.content.res.AssetFileDescriptor openAssetFileDescriptor(Uri uri, String mode, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 36 */   public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, android.os.Bundle opts) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 37 */   public final android.content.res.AssetFileDescriptor openTypedAssetFileDescriptor(Uri uri, String mimeType, android.os.Bundle opts, android.os.CancellationSignal cancellationSignal) throws java.io.FileNotFoundException { throw new RuntimeException("Stub!"); }
/* 38 */   public final Uri insert(Uri url, ContentValues values) { throw new RuntimeException("Stub!"); }
/* 39 */   public ContentProviderResult[] applyBatch(String authority, java.util.ArrayList<ContentProviderOperation> operations) throws android.os.RemoteException, OperationApplicationException { throw new RuntimeException("Stub!"); }
/* 40 */   public final int bulkInsert(Uri url, ContentValues[] values) { throw new RuntimeException("Stub!"); }
/* 41 */   public final int delete(Uri url, String where, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 42 */   public final int update(Uri uri, ContentValues values, String where, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 43 */   public final android.os.Bundle call(Uri uri, String method, String arg, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 44 */   public final ContentProviderClient acquireContentProviderClient(Uri uri) { throw new RuntimeException("Stub!"); }
/* 45 */   public final ContentProviderClient acquireContentProviderClient(String name) { throw new RuntimeException("Stub!"); }
/* 46 */   public final ContentProviderClient acquireUnstableContentProviderClient(Uri uri) { throw new RuntimeException("Stub!"); }
/* 47 */   public final ContentProviderClient acquireUnstableContentProviderClient(String name) { throw new RuntimeException("Stub!"); }
/* 48 */   public final void registerContentObserver(Uri uri, boolean notifyForDescendants, android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 49 */   public final void unregisterContentObserver(android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 50 */   public void notifyChange(Uri uri, android.database.ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 51 */   public void notifyChange(Uri uri, android.database.ContentObserver observer, boolean syncToNetwork) { throw new RuntimeException("Stub!"); }
/* 52 */   public void notifyChange(Uri uri, android.database.ContentObserver observer, int flags) { throw new RuntimeException("Stub!"); }
/* 53 */   public void takePersistableUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 54 */   public void releasePersistableUriPermission(Uri uri, int modeFlags) { throw new RuntimeException("Stub!"); }
/* 55 */   public java.util.List<UriPermission> getPersistedUriPermissions() { throw new RuntimeException("Stub!"); }
/* 56 */   public java.util.List<UriPermission> getOutgoingPersistedUriPermissions() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 58 */   public void startSync(Uri uri, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 59 */   public static void requestSync(Account account, String authority, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 60 */   public static void requestSync(SyncRequest request) { throw new RuntimeException("Stub!"); }
/* 61 */   public static void validateSyncExtrasBundle(android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 63 */   public void cancelSync(Uri uri) { throw new RuntimeException("Stub!"); }
/* 64 */   public static void cancelSync(Account account, String authority) { throw new RuntimeException("Stub!"); }
/* 65 */   public static SyncAdapterType[] getSyncAdapterTypes() { throw new RuntimeException("Stub!"); }
/* 66 */   public static boolean getSyncAutomatically(Account account, String authority) { throw new RuntimeException("Stub!"); }
/* 67 */   public static void setSyncAutomatically(Account account, String authority, boolean sync) { throw new RuntimeException("Stub!"); }
/* 68 */   public static void addPeriodicSync(Account account, String authority, android.os.Bundle extras, long pollFrequency) { throw new RuntimeException("Stub!"); }
/* 69 */   public static void removePeriodicSync(Account account, String authority, android.os.Bundle extras) { throw new RuntimeException("Stub!"); }
/* 70 */   public static void cancelSync(SyncRequest request) { throw new RuntimeException("Stub!"); }
/* 71 */   public static java.util.List<PeriodicSync> getPeriodicSyncs(Account account, String authority) { throw new RuntimeException("Stub!"); }
/* 72 */   public static int getIsSyncable(Account account, String authority) { throw new RuntimeException("Stub!"); }
/* 73 */   public static void setIsSyncable(Account account, String authority, int syncable) { throw new RuntimeException("Stub!"); }
/* 74 */   public static boolean getMasterSyncAutomatically() { throw new RuntimeException("Stub!"); }
/* 75 */   public static void setMasterSyncAutomatically(boolean sync) { throw new RuntimeException("Stub!"); }
/* 76 */   public static boolean isSyncActive(Account account, String authority) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 78 */   public static SyncInfo getCurrentSync() { throw new RuntimeException("Stub!"); }
/* 79 */   public static java.util.List<SyncInfo> getCurrentSyncs() { throw new RuntimeException("Stub!"); }
/* 80 */   public static boolean isSyncPending(Account account, String authority) { throw new RuntimeException("Stub!"); }
/* 81 */   public static Object addStatusChangeListener(int mask, SyncStatusObserver callback) { throw new RuntimeException("Stub!"); }
/* 82 */   public static void removeStatusChangeListener(Object handle) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final String QUERY_ARG_LIMIT = "android:query-arg-limit";
/*    */   public static final String QUERY_ARG_OFFSET = "android:query-arg-offset";
/*    */   public static final String QUERY_ARG_SORT_COLLATION = "android:query-arg-sort-collation";
/*    */   public static final String QUERY_ARG_SORT_COLUMNS = "android:query-arg-sort-columns";
/*    */   public static final String QUERY_ARG_SORT_DIRECTION = "android:query-arg-sort-direction";
/*    */   public static final String QUERY_ARG_SQL_SELECTION = "android:query-arg-sql-selection";
/*    */   public static final String QUERY_ARG_SQL_SELECTION_ARGS = "android:query-arg-sql-selection-args";
/*    */   public static final String QUERY_ARG_SQL_SORT_ORDER = "android:query-arg-sql-sort-order";
/*    */   public static final int QUERY_SORT_DIRECTION_ASCENDING = 0;
/*    */   public static final int QUERY_SORT_DIRECTION_DESCENDING = 1;
/*    */   public static final String SCHEME_ANDROID_RESOURCE = "android.resource";
/*    */   public static final String SCHEME_CONTENT = "content";
/*    */   public static final String SCHEME_FILE = "file";
/*    */   @Deprecated
/*    */   public static final String SYNC_EXTRAS_ACCOUNT = "account";
/*    */   public static final String SYNC_EXTRAS_DISCARD_LOCAL_DELETIONS = "discard_deletions";
/*    */   public static final String SYNC_EXTRAS_DO_NOT_RETRY = "do_not_retry";
/*    */   public static final String SYNC_EXTRAS_EXPEDITED = "expedited";
/*    */   @Deprecated
/*    */   public static final String SYNC_EXTRAS_FORCE = "force";
/*    */   public static final String SYNC_EXTRAS_IGNORE_BACKOFF = "ignore_backoff";
/*    */   public static final String SYNC_EXTRAS_IGNORE_SETTINGS = "ignore_settings";
/*    */   public static final String SYNC_EXTRAS_INITIALIZE = "initialize";
/*    */   public static final String SYNC_EXTRAS_MANUAL = "force";
/*    */   public static final String SYNC_EXTRAS_OVERRIDE_TOO_MANY_DELETIONS = "deletions_override";
/*    */   public static final String SYNC_EXTRAS_REQUIRE_CHARGING = "require_charging";
/*    */   public static final String SYNC_EXTRAS_UPLOAD = "upload";
/*    */   public static final int SYNC_OBSERVER_TYPE_ACTIVE = 4;
/*    */   public static final int SYNC_OBSERVER_TYPE_PENDING = 2;
/*    */   public static final int SYNC_OBSERVER_TYPE_SETTINGS = 1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\content\ContentResolver.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */