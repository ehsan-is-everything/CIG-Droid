/*    */ package javax.xml.transform;
/*    */ 
/*    */ import java.io.PrintStream;
/*    */ import java.io.PrintWriter;
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
/*    */ public class TransformerException
/*    */   extends Exception
/*    */ {
/* 24 */   public TransformerException(String message) { throw new RuntimeException("Stub!"); }
/* 25 */   public TransformerException(Throwable e) { throw new RuntimeException("Stub!"); }
/* 26 */   public TransformerException(String message, Throwable e) { throw new RuntimeException("Stub!"); }
/* 27 */   public TransformerException(String message, SourceLocator locator) { throw new RuntimeException("Stub!"); }
/* 28 */   public TransformerException(String message, SourceLocator locator, Throwable e) { throw new RuntimeException("Stub!"); }
/* 29 */   public SourceLocator getLocator() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setLocator(SourceLocator location) { throw new RuntimeException("Stub!"); }
/* 31 */   public Throwable getException() { throw new RuntimeException("Stub!"); }
/* 32 */   public Throwable getCause() { throw new RuntimeException("Stub!"); }
/* 33 */   public synchronized Throwable initCause(Throwable cause) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getMessageAndLocation() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getLocationAsString() { throw new RuntimeException("Stub!"); }
/* 36 */   public void printStackTrace() { throw new RuntimeException("Stub!"); }
/* 37 */   public void printStackTrace(PrintStream s) { throw new RuntimeException("Stub!"); }
/* 38 */   public void printStackTrace(PrintWriter s) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\xml\transform\TransformerException.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */