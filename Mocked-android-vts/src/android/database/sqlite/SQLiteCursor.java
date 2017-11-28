/*    */ package android.database.sqlite;
/*    */ 
/*    */ import android.database.AbstractWindowedCursor;
/*    */ import android.database.CursorWindow;
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
/*    */ public class SQLiteCursor
/*    */   extends AbstractWindowedCursor
/*    */ {
/*    */   @Deprecated
/* 22 */   public SQLiteCursor(SQLiteDatabase db, SQLiteCursorDriver driver, String editTable, SQLiteQuery query) { throw new RuntimeException("Stub!"); }
/* 23 */   public SQLiteCursor(SQLiteCursorDriver driver, String editTable, SQLiteQuery query) { throw new RuntimeException("Stub!"); }
/* 24 */   public SQLiteDatabase getDatabase() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean onMove(int oldPosition, int newPosition) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); }
/* 28 */   public String[] getColumnNames() { throw new RuntimeException("Stub!"); }
/* 29 */   public void deactivate() { throw new RuntimeException("Stub!"); }
/* 30 */   public void close() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean requery() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setWindow(CursorWindow window) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setSelectionArguments(String[] selectionArgs) { throw new RuntimeException("Stub!"); }
/* 34 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\sqlite\SQLiteCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */