/*    */ package java.util.logging;
/*    */ 
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
/*    */ 
/*    */ public abstract class Handler
/*    */ {
/* 30 */   protected Handler() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void publish(LogRecord paramLogRecord);
/*    */   public abstract void flush();
/*    */   public abstract void close() throws SecurityException;
/* 34 */   public synchronized void setFormatter(Formatter newFormatter) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 35 */   public Formatter getFormatter() { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized void setEncoding(String encoding) throws SecurityException, UnsupportedEncodingException { throw new RuntimeException("Stub!"); }
/* 37 */   public String getEncoding() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void setFilter(Filter newFilter) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 39 */   public Filter getFilter() { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized void setErrorManager(ErrorManager em) { throw new RuntimeException("Stub!"); }
/* 41 */   public ErrorManager getErrorManager() { throw new RuntimeException("Stub!"); }
/* 42 */   protected void reportError(String msg, Exception ex, int code) { throw new RuntimeException("Stub!"); }
/* 43 */   public synchronized void setLevel(Level newLevel) throws SecurityException { throw new RuntimeException("Stub!"); }
/* 44 */   public Level getLevel() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isLoggable(LogRecord record) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\util\logging\Handler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */