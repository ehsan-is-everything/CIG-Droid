/*    */ package android.database.sqlite;
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
/*    */ public abstract class SQLiteProgram
/*    */   extends SQLiteClosable
/*    */ {
/* 21 */   SQLiteProgram() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public final int getUniqueId() { throw new RuntimeException("Stub!"); }
/* 24 */   public void bindNull(int index) { throw new RuntimeException("Stub!"); }
/* 25 */   public void bindLong(int index, long value) { throw new RuntimeException("Stub!"); }
/* 26 */   public void bindDouble(int index, double value) { throw new RuntimeException("Stub!"); }
/* 27 */   public void bindString(int index, String value) { throw new RuntimeException("Stub!"); }
/* 28 */   public void bindBlob(int index, byte[] value) { throw new RuntimeException("Stub!"); }
/* 29 */   public void clearBindings() { throw new RuntimeException("Stub!"); }
/* 30 */   public void bindAllArgsAsStrings(String[] bindArgs) { throw new RuntimeException("Stub!"); }
/* 31 */   protected void onAllReferencesReleased() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\database\sqlite\SQLiteProgram.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */