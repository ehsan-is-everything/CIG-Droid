/*    */ package java.util.logging;
/*    */ 
/*    */ import java.io.OutputStream;
/*    */ import java.io.UnsupportedEncodingException;
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
/*    */ public class StreamHandler
/*    */   extends Handler
/*    */ {
/* 31 */   public StreamHandler() { throw new RuntimeException("Stub!"); }
/* 32 */   public StreamHandler(OutputStream out, Formatter formatter) { throw new RuntimeException("Stub!"); }
/* 33 */   protected synchronized void setOutputStream(OutputStream out) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 34 */   public synchronized void setEncoding(String encoding) throws SecurityException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized void publish(LogRecord record) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isLoggable(LogRecord record) { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized void flush() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void close() throws SecurityException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\logging\StreamHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */