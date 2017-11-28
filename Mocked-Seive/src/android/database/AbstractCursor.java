/*    */ package android.database;
/*    */ 
/*    */ import android.content.ContentResolver;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ public abstract class AbstractCursor
/*    */   implements CrossProcessCursor
/*    */ {
/*    */   @Deprecated
/*    */   protected boolean mClosed;
/*    */   @Deprecated
/*    */   protected ContentResolver mContentResolver;
/*    */   @Deprecated
/*    */   protected int mPos;
/*    */   
/*    */   protected static class SelfContentObserver
/*    */     extends ContentObserver
/*    */   {
/*    */     public SelfContentObserver(AbstractCursor cursor)
/*    */     {
/* 24 */       super();throw new RuntimeException("Stub!"); }
/* 25 */     public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); }
/* 26 */     public void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   public AbstractCursor() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getCount();
/*    */   public abstract String[] getColumnNames();
/*    */   public abstract String getString(int paramInt);
/*    */   public abstract short getShort(int paramInt);
/*    */   public abstract int getInt(int paramInt);
/*    */   public abstract long getLong(int paramInt);
/*    */   public abstract float getFloat(int paramInt);
/*    */   public abstract double getDouble(int paramInt);
/*    */   public abstract boolean isNull(int paramInt);
/* 38 */   public int getType(int column) { throw new RuntimeException("Stub!"); }
/* 39 */   public byte[] getBlob(int column) { throw new RuntimeException("Stub!"); }
/* 40 */   public CursorWindow getWindow() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getColumnCount() { throw new RuntimeException("Stub!"); }
/* 42 */   public void deactivate() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean requery() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 45 */   public void close() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean onMove(int oldPosition, int newPosition) { throw new RuntimeException("Stub!"); }
/* 47 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 48 */   public final int getPosition() { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean moveToPosition(int position) { throw new RuntimeException("Stub!"); }
/* 50 */   public void fillWindow(int position, CursorWindow window) { throw new RuntimeException("Stub!"); }
/* 51 */   public final boolean move(int offset) { throw new RuntimeException("Stub!"); }
/* 52 */   public final boolean moveToFirst() { throw new RuntimeException("Stub!"); }
/* 53 */   public final boolean moveToLast() { throw new RuntimeException("Stub!"); }
/* 54 */   public final boolean moveToNext() { throw new RuntimeException("Stub!"); }
/* 55 */   public final boolean moveToPrevious() { throw new RuntimeException("Stub!"); }
/* 56 */   public final boolean isFirst() { throw new RuntimeException("Stub!"); }
/* 57 */   public final boolean isLast() { throw new RuntimeException("Stub!"); }
/* 58 */   public final boolean isBeforeFirst() { throw new RuntimeException("Stub!"); }
/* 59 */   public final boolean isAfterLast() { throw new RuntimeException("Stub!"); }
/* 60 */   public int getColumnIndex(String columnName) { throw new RuntimeException("Stub!"); }
/* 61 */   public int getColumnIndexOrThrow(String columnName) { throw new RuntimeException("Stub!"); }
/* 62 */   public String getColumnName(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 63 */   public void registerContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 64 */   public void unregisterContentObserver(ContentObserver observer) { throw new RuntimeException("Stub!"); }
/* 65 */   public void registerDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 66 */   public void unregisterDataSetObserver(DataSetObserver observer) { throw new RuntimeException("Stub!"); }
/* 67 */   protected void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); }
/* 68 */   public void setNotificationUri(ContentResolver cr, Uri notifyUri) { throw new RuntimeException("Stub!"); }
/* 69 */   public Uri getNotificationUri() { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean getWantsAllOnMoveCalls() { throw new RuntimeException("Stub!"); }
/* 71 */   public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 72 */   public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 73 */   public Bundle respond(Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 75 */   protected boolean isFieldUpdated(int columnIndex) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 77 */   protected Object getUpdatedField(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 78 */   protected void checkPosition() { throw new RuntimeException("Stub!"); }
/* 79 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\AbstractCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */