/*    */ package android.database;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
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
/*    */ public class CursorWrapper
/*    */   implements Cursor
/*    */ {
/* 21 */   public CursorWrapper(Cursor cursor) { throw new RuntimeException("Stub!"); }
/* 22 */   public Cursor getWrappedCursor() { throw new RuntimeException("Stub!"); }
/* 23 */   public void close() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getCount() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 27 */   public void deactivate() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean moveToFirst() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getColumnCount() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getColumnIndexOrThrow(String columnName) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 32 */   public String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 33 */   public String[] getColumnNames() { throw new RuntimeException("Stub!"); }
/* 34 */   public double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 36 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 37 */   public float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 38 */   public int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 39 */   public long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 40 */   public short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 41 */   public String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 42 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 43 */   public byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isAfterLast() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isBeforeFirst() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isFirst() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean isLast() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getType(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean moveToLast() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean move(int offset) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean moveToNext() { throw new RuntimeException("Stub!"); }
/* 55 */   public int getPosition() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean moveToPrevious() { throw new RuntimeException("Stub!"); }
/* 57 */   public void registerContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 58 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 60 */   public boolean requery() { throw new RuntimeException("Stub!"); }
/* 61 */   public Bundle respond(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setNotificationUri(ContentResolver cr, Uri uri) { throw new RuntimeException("Stub!"); }
/* 63 */   public Uri getNotificationUri() { throw new RuntimeException("Stub!"); }
/* 64 */   public void unregisterContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 65 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\CursorWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */