/*    */ package android.database.sqlite;
/*    */ 
/*    */ import java.io.Closeable;
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
/*    */ public abstract class SQLiteClosable
/*    */   implements Closeable
/*    */ {
/* 21 */   public SQLiteClosable() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void onAllReferencesReleased();
/*    */   @Deprecated
/* 24 */   protected void onAllReferencesReleasedFromContainer() { throw new RuntimeException("Stub!"); }
/* 25 */   public void acquireReference() { throw new RuntimeException("Stub!"); }
/* 26 */   public void releaseReference() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public void releaseReferenceFromContainer() { throw new RuntimeException("Stub!"); }
/* 29 */   public void close() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\database\sqlite\SQLiteClosable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */