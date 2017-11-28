/*    */ package android.database;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class MatrixCursor
/*    */   extends AbstractCursor
/*    */ {
/*    */   public class RowBuilder
/*    */   {
/* 23 */     RowBuilder() { throw new RuntimeException("Stub!"); }
/* 24 */     public RowBuilder add(Object columnValue) { throw new RuntimeException("Stub!"); }
/* 25 */     public RowBuilder add(String columnName, Object value) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 27 */   public MatrixCursor(String[] columnNames, int initialCapacity) { throw new RuntimeException("Stub!"); }
/* 28 */   public MatrixCursor(String[] columnNames) { throw new RuntimeException("Stub!"); }
/* 29 */   public RowBuilder newRow() { throw new RuntimeException("Stub!"); }
/* 30 */   public void addRow(Object[] columnValues) { throw new RuntimeException("Stub!"); }
/* 31 */   public void addRow(Iterable<?> columnValues) { throw new RuntimeException("Stub!"); }
/* 32 */   public int getCount() { throw new RuntimeException("Stub!"); }
/* 33 */   public String[] getColumnNames() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getString(int column) { throw new RuntimeException("Stub!"); }
/* 35 */   public short getShort(int column) { throw new RuntimeException("Stub!"); }
/* 36 */   public int getInt(int column) { throw new RuntimeException("Stub!"); }
/* 37 */   public long getLong(int column) { throw new RuntimeException("Stub!"); }
/* 38 */   public float getFloat(int column) { throw new RuntimeException("Stub!"); }
/* 39 */   public double getDouble(int column) { throw new RuntimeException("Stub!"); }
/* 40 */   public byte[] getBlob(int column) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getType(int column) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isNull(int column) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\MatrixCursor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */