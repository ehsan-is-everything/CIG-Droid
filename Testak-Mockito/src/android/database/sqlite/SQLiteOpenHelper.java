/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.database.DatabaseErrorHandler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SQLiteOpenHelper
/*    */ {
/* 20 */   public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) { throw new RuntimeException("Stub!"); }
/* 21 */   public SQLiteOpenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getDatabaseName() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setWriteAheadLoggingEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 24 */   public SQLiteDatabase getWritableDatabase() { throw new RuntimeException("Stub!"); }
/* 25 */   public SQLiteDatabase getReadableDatabase() { throw new RuntimeException("Stub!"); }
/* 26 */   public synchronized void close() { throw new RuntimeException("Stub!"); }
/* 27 */   public void onConfigure(SQLiteDatabase db) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onCreate(SQLiteDatabase paramSQLiteDatabase);
/*    */   public abstract void onUpgrade(SQLiteDatabase paramSQLiteDatabase, int paramInt1, int paramInt2);
/* 30 */   public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) { throw new RuntimeException("Stub!"); }
/* 31 */   public void onOpen(SQLiteDatabase db) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\database\sqlite\SQLiteOpenHelper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */