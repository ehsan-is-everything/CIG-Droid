/*    */ package android.database;
/*    */ 
/*    */ import android.database.sqlite.SQLiteClosable;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public class CursorWindow
/*    */   extends SQLiteClosable
/*    */   implements Parcelable
/*    */ {
/* 22 */   public CursorWindow(String name) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 24 */   public CursorWindow(boolean localWindow) { throw new RuntimeException("Stub!"); }
/* 25 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 26 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getStartPosition() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setStartPosition(int pos) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getNumRows() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean setNumColumns(int columnNum) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean allocRow() { throw new RuntimeException("Stub!"); }
/* 32 */   public void freeLastRow() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public boolean isNull(int row, int column) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public boolean isBlob(int row, int column) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 38 */   public boolean isLong(int row, int column) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public boolean isFloat(int row, int column) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 42 */   public boolean isString(int row, int column) { throw new RuntimeException("Stub!"); }
/* 43 */   public int getType(int row, int column) { throw new RuntimeException("Stub!"); }
/* 44 */   public byte[] getBlob(int row, int column) { throw new RuntimeException("Stub!"); }
/* 45 */   public String getString(int row, int column) { throw new RuntimeException("Stub!"); }
/* 46 */   public void copyStringToBuffer(int row, int column, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 47 */   public long getLong(int row, int column) { throw new RuntimeException("Stub!"); }
/* 48 */   public double getDouble(int row, int column) { throw new RuntimeException("Stub!"); }
/* 49 */   public short getShort(int row, int column) { throw new RuntimeException("Stub!"); }
/* 50 */   public int getInt(int row, int column) { throw new RuntimeException("Stub!"); }
/* 51 */   public float getFloat(int row, int column) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean putBlob(byte[] value, int row, int column) { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean putString(String value, int row, int column) { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean putLong(long value, int row, int column) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean putDouble(double value, int row, int column) { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean putNull(int row, int column) { throw new RuntimeException("Stub!"); }
/* 57 */   public static CursorWindow newFromParcel(Parcel p) { throw new RuntimeException("Stub!"); }
/* 58 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 59 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 60 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
/* 61 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 63 */   public static final Parcelable.Creator<CursorWindow> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\CursorWindow.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */