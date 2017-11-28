/*    */ package android.database;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AbstractWindowedCursor
/*    */   extends AbstractCursor
/*    */ {
/*    */   protected CursorWindow mWindow;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 21 */   public AbstractWindowedCursor() { throw new RuntimeException("Stub!"); }
/* 22 */   public byte[] getBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 23 */   public String getString(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 24 */   public void copyStringToBuffer(int columnIndex, CharArrayBuffer buffer) { throw new RuntimeException("Stub!"); }
/* 25 */   public short getShort(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getInt(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 27 */   public long getLong(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 28 */   public float getFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 29 */   public double getDouble(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isNull(int columnIndex) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public boolean isBlob(int columnIndex) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public boolean isString(int columnIndex) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public boolean isLong(int columnIndex) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 38 */   public boolean isFloat(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 39 */   public int getType(int columnIndex) { throw new RuntimeException("Stub!"); }
/* 40 */   protected void checkPosition() { throw new RuntimeException("Stub!"); }
/* 41 */   public CursorWindow getWindow() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setWindow(CursorWindow window) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean hasWindow() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\AbstractWindowedCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */