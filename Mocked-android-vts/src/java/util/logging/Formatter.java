/*    */ package java.util.logging;
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
/*    */ public abstract class Formatter
/*    */ {
/* 30 */   protected Formatter() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String format(LogRecord paramLogRecord);
/* 32 */   public String getHead(Handler h) { throw new RuntimeException("Stub!"); }
/* 33 */   public String getTail(Handler h) { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized String formatMessage(LogRecord record) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\logging\Formatter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */