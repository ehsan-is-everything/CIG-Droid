/*    */ package android.database;
/*    */ 
/*    */ import java.util.Iterator;
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
/*    */ public final class CursorJoiner
/*    */   implements Iterator<Result>, Iterable<Result>
/*    */ {
/*    */   public static enum Result
/*    */   {
/* 23 */     BOTH, 
/* 24 */     LEFT, 
/* 25 */     RIGHT;
/*    */     private Result() {} }
/* 27 */   public CursorJoiner(Cursor cursorLeft, String[] columnNamesLeft, Cursor cursorRight, String[] columnNamesRight) { throw new RuntimeException("Stub!"); }
/* 28 */   public Iterator<Result> iterator() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean hasNext() { throw new RuntimeException("Stub!"); }
/* 30 */   public Result next() { throw new RuntimeException("Stub!"); }
/* 31 */   public void remove() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\database\CursorJoiner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */