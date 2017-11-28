/*    */ package android.test.mock;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.database.CharArrayBuffer;
/*    */ import android.database.ContentObserver;
/*    */ import android.database.Cursor;
/*    */ import android.database.DataSetObserver;
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
/*    */ @Deprecated
/*    */ public class MockCursor
/*    */   implements Cursor
/*    */ {
/* 22 */   public MockCursor() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getColumnCount() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getColumnIndexOrThrow(String columnName) { throw new RuntimeException("Stub!"); }
/* 26 */   public String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 27 */   public String[] getColumnNames() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 30 */   public int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 31 */   public long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 32 */   public short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 33 */   public float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 34 */   public double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 35 */   public byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 38 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getPosition() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isAfterLast() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isBeforeFirst() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isFirst() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isLast() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean move(int offset) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean moveToFirst() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean moveToLast() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean moveToNext() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean moveToPrevious() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); }
/* 50 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 52 */   public void deactivate() { throw new RuntimeException("Stub!"); }
/* 53 */   public void close() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 56 */   public boolean requery() { throw new RuntimeException("Stub!"); }
/* 57 */   public void registerContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 58 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 59 */   public Bundle respond(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setNotificationUri(ContentResolver cr, Uri uri) { throw new RuntimeException("Stub!"); }
/* 62 */   public Uri getNotificationUri() { throw new RuntimeException("Stub!"); }
/* 63 */   public void unregisterContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 64 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 65 */   public int getType(int columnIndex) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\test\mock\MockCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */