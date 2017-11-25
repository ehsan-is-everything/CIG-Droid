/*    */ package java.util.logging;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ErrorManager
/*    */ {
/*    */   public static final int CLOSE_FAILURE = 3;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int FLUSH_FAILURE = 2;
/*    */   
/*    */ 
/*    */   public static final int FORMAT_FAILURE = 5;
/*    */   
/*    */ 
/*    */   public static final int GENERIC_FAILURE = 0;
/*    */   
/*    */ 
/*    */   public static final int OPEN_FAILURE = 4;
/*    */   
/*    */ 
/*    */   public static final int WRITE_FAILURE = 1;
/*    */   
/*    */ 
/*    */ 
/* 30 */   public ErrorManager() { throw new RuntimeException("Stub!"); }
/* 31 */   public synchronized void error(String msg, Exception ex, int code) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\logging\ErrorManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */