/*    */ package java.lang;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
/*    */ import java.io.Serializable;
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
/*    */ public class Throwable
/*    */   implements Serializable
/*    */ {
/* 31 */   public Throwable() { throw new RuntimeException("Stub!"); }
/* 32 */   public Throwable(String message) { throw new RuntimeException("Stub!"); }
/* 33 */   public Throwable(String message, Throwable cause) { throw new RuntimeException("Stub!"); }
/* 34 */   public Throwable(Throwable cause) { throw new RuntimeException("Stub!"); }
/* 35 */   protected Throwable(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getMessage() { throw new RuntimeException("Stub!"); }
/* 37 */   public String getLocalizedMessage() { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized Throwable getCause() { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized Throwable initCause(Throwable cause) { throw new RuntimeException("Stub!"); }
/* 40 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 41 */   public void printStackTrace() { throw new RuntimeException("Stub!"); }
/* 42 */   public void printStackTrace(PrintStream s) { throw new RuntimeException("Stub!"); }
/* 43 */   public void printStackTrace(PrintWriter s) { throw new RuntimeException("Stub!"); }
/* 44 */   public synchronized Throwable fillInStackTrace() { throw new RuntimeException("Stub!"); }
/* 45 */   public StackTraceElement[] getStackTrace() { throw new RuntimeException("Stub!"); }
/* 46 */   public void setStackTrace(StackTraceElement[] stackTrace) { throw new RuntimeException("Stub!"); }
/* 47 */   public final synchronized void addSuppressed(Throwable exception) { throw new RuntimeException("Stub!"); }
/* 48 */   public final synchronized Throwable[] getSuppressed() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Throwable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */