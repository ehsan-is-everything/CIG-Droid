/*    */ package javax.net.ssl;
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
/*    */ public class SSLEngineResult
/*    */ {
/*    */   public static enum Status
/*    */   {
/* 31 */     BUFFER_OVERFLOW, 
/* 32 */     BUFFER_UNDERFLOW, 
/* 33 */     CLOSED, 
/* 34 */     OK;
/*    */     
/*    */     private Status() {} }
/*    */   
/* 38 */   public static enum HandshakeStatus { FINISHED, 
/* 39 */     NEED_TASK, 
/* 40 */     NEED_UNWRAP, 
/* 41 */     NEED_WRAP, 
/* 42 */     NOT_HANDSHAKING;
/*    */     private HandshakeStatus() {} }
/* 44 */   public SSLEngineResult(Status status, HandshakeStatus handshakeStatus, int bytesConsumed, int bytesProduced) { throw new RuntimeException("Stub!"); }
/* 45 */   public final Status getStatus() { throw new RuntimeException("Stub!"); }
/* 46 */   public final HandshakeStatus getHandshakeStatus() { throw new RuntimeException("Stub!"); }
/* 47 */   public final int bytesConsumed() { throw new RuntimeException("Stub!"); }
/* 48 */   public final int bytesProduced() { throw new RuntimeException("Stub!"); }
/* 49 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\SSLEngineResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */