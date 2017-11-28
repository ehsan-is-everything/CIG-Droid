/*    */ package android.webkit;
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
/*    */ public class ConsoleMessage
/*    */ {
/*    */   public static enum MessageLevel
/*    */   {
/* 22 */     DEBUG, 
/* 23 */     ERROR, 
/* 24 */     LOG, 
/* 25 */     TIP, 
/* 26 */     WARNING;
/*    */     private MessageLevel() {} }
/* 28 */   public ConsoleMessage(String message, String sourceId, int lineNumber, MessageLevel msgLevel) { throw new RuntimeException("Stub!"); }
/* 29 */   public MessageLevel messageLevel() { throw new RuntimeException("Stub!"); }
/* 30 */   public String message() { throw new RuntimeException("Stub!"); }
/* 31 */   public String sourceId() { throw new RuntimeException("Stub!"); }
/* 32 */   public int lineNumber() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\webkit\ConsoleMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */