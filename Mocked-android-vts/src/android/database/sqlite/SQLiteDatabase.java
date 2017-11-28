/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.content.ContentValues;
/*    */ import android.database.Cursor;
/*    */ import android.os.CancellationSignal;
/*    */ 
/*    */ 
/*    */ public final class SQLiteDatabase
/*    */   extends SQLiteClosable
/*    */ {
/*    */   public static final int CONFLICT_ABORT = 2;
/*    */   public static final int CONFLICT_FAIL = 3;
/*    */   public static final int CONFLICT_IGNORE = 4;
/*    */   public static final int CONFLICT_NONE = 0;
/*    */   public static final int CONFLICT_REPLACE = 5;
/*    */   public static final int CONFLICT_ROLLBACK = 1;
/*    */   public static final int CREATE_IF_NECESSARY = 268435456;
/*    */   public static final int ENABLE_WRITE_AHEAD_LOGGING = 536870912;
/*    */   public static final int MAX_SQL_CACHE_SIZE = 100;
/*    */   public static final int NO_LOCALIZED_COLLATORS = 16;
/*    */   public static final int OPEN_READONLY = 1;
/*    */   public static final int OPEN_READWRITE = 0;
/*    */   public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
/*    */   
/* 25 */   SQLiteDatabase() { throw new RuntimeException("Stub!"); }
/* 26 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 27 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
/* 28 */   public static int releaseMemory() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public void setLockingEnabled(boolean lockingEnabled) { throw new RuntimeException("Stub!"); }
/* 31 */   public void beginTransaction() { throw new RuntimeException("Stub!"); }
/* 32 */   public void beginTransactionNonExclusive() { throw new RuntimeException("Stub!"); }
/* 33 */   public void beginTransactionWithListener(SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); }
/* 34 */   public void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener transactionListener) { throw new RuntimeException("Stub!"); }
/* 35 */   public void endTransaction() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setTransactionSuccessful() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean inTransaction() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isDbLockedByCurrentThread() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public boolean isDbLockedByOtherThreads() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 42 */   public boolean yieldIfContended() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean yieldIfContendedSafely() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean yieldIfContendedSafely(long sleepAfterYieldDelay) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 46 */   public java.util.Map<String, String> getSyncedTables() { throw new RuntimeException("Stub!"); }
/* 47 */   public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags) { throw new RuntimeException("Stub!"); }
/* 48 */   public static SQLiteDatabase openDatabase(String path, CursorFactory factory, int flags, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
/* 49 */   public static SQLiteDatabase openOrCreateDatabase(java.io.File file, CursorFactory factory) { throw new RuntimeException("Stub!"); }
/* 50 */   public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory) { throw new RuntimeException("Stub!"); }
/* 51 */   public static SQLiteDatabase openOrCreateDatabase(String path, CursorFactory factory, android.database.DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
/* 52 */   public static boolean deleteDatabase(java.io.File file) { throw new RuntimeException("Stub!"); }
/* 53 */   public static SQLiteDatabase create(CursorFactory factory) { throw new RuntimeException("Stub!"); }
/* 54 */   public int getVersion() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setVersion(int version) { throw new RuntimeException("Stub!"); }
/* 56 */   public long getMaximumSize() { throw new RuntimeException("Stub!"); }
/* 57 */   public long setMaximumSize(long numBytes) { throw new RuntimeException("Stub!"); }
/* 58 */   public long getPageSize() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setPageSize(long numBytes) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 61 */   public void markTableSyncable(String table, String deletedTable) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 63 */   public void markTableSyncable(String table, String foreignKey, String updateTable) { throw new RuntimeException("Stub!"); }
/* 64 */   public static String findEditTable(String tables) { throw new RuntimeException("Stub!"); }
/* 65 */   public SQLiteStatement compileStatement(String sql) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
/* 66 */   public Cursor query(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); }
/* 67 */   public Cursor query(boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 68 */   public Cursor queryWithFactory(CursorFactory cursorFactory, boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); }
/* 69 */   public Cursor queryWithFactory(CursorFactory cursorFactory, boolean distinct, String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 70 */   public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) { throw new RuntimeException("Stub!"); }
/* 71 */   public Cursor query(String table, String[] columns, String selection, String[] selectionArgs, String groupBy, String having, String orderBy, String limit) { throw new RuntimeException("Stub!"); }
/* 72 */   public Cursor rawQuery(String sql, String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 73 */   public Cursor rawQuery(String sql, String[] selectionArgs, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 74 */   public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String[] selectionArgs, String editTable) { throw new RuntimeException("Stub!"); }
/* 75 */   public Cursor rawQueryWithFactory(CursorFactory cursorFactory, String sql, String[] selectionArgs, String editTable, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 76 */   public long insert(String table, String nullColumnHack, ContentValues values) { throw new RuntimeException("Stub!"); }
/* 77 */   public long insertOrThrow(String table, String nullColumnHack, ContentValues values) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
/* 78 */   public long replace(String table, String nullColumnHack, ContentValues initialValues) { throw new RuntimeException("Stub!"); }
/* 79 */   public long replaceOrThrow(String table, String nullColumnHack, ContentValues initialValues) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
/* 80 */   public long insertWithOnConflict(String table, String nullColumnHack, ContentValues initialValues, int conflictAlgorithm) { throw new RuntimeException("Stub!"); }
/* 81 */   public int delete(String table, String whereClause, String[] whereArgs) { throw new RuntimeException("Stub!"); }
/* 82 */   public int update(String table, ContentValues values, String whereClause, String[] whereArgs) { throw new RuntimeException("Stub!"); }
/* 83 */   public int updateWithOnConflict(String table, ContentValues values, String whereClause, String[] whereArgs, int conflictAlgorithm) { throw new RuntimeException("Stub!"); }
/* 84 */   public void execSQL(String sql) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
/* 85 */   public void execSQL(String sql, Object[] bindArgs) throws android.database.SQLException { throw new RuntimeException("Stub!"); }
/* 86 */   public void validateSql(String sql, CancellationSignal cancellationSignal) { throw new RuntimeException("Stub!"); }
/* 87 */   public boolean isReadOnly() { throw new RuntimeException("Stub!"); }
/* 88 */   public boolean isOpen() { throw new RuntimeException("Stub!"); }
/* 89 */   public boolean needUpgrade(int newVersion) { throw new RuntimeException("Stub!"); }
/* 90 */   public final String getPath() { throw new RuntimeException("Stub!"); }
/* 91 */   public void setLocale(java.util.Locale locale) { throw new RuntimeException("Stub!"); }
/* 92 */   public void setMaxSqlCacheSize(int cacheSize) { throw new RuntimeException("Stub!"); }
/* 93 */   public void setForeignKeyConstraintsEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
/* 94 */   public boolean enableWriteAheadLogging() { throw new RuntimeException("Stub!"); }
/* 95 */   public void disableWriteAheadLogging() { throw new RuntimeException("Stub!"); }
/* 96 */   public boolean isWriteAheadLoggingEnabled() { throw new RuntimeException("Stub!"); }
/* 97 */   public java.util.List<android.util.Pair<String, String>> getAttachedDbs() { throw new RuntimeException("Stub!"); }
/* 98 */   public boolean isDatabaseIntegrityOk() { throw new RuntimeException("Stub!"); }
/* 99 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface CursorFactory
/*    */   {
/*    */     public abstract Cursor newCursor(SQLiteDatabase paramSQLiteDatabase, SQLiteCursorDriver paramSQLiteCursorDriver, String paramString, SQLiteQuery paramSQLiteQuery);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\sqlite\SQLiteDatabase.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */