/*    */ package java.lang;
/*    */ 
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.concurrent.TimeUnit;
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
/*    */ public abstract class Process
/*    */ {
/* 29 */   public Process() { throw new RuntimeException("Stub!"); }
/*    */   public abstract OutputStream getOutputStream();
/*    */   public abstract InputStream getInputStream();
/*    */   public abstract InputStream getErrorStream();
/*    */   public abstract int waitFor() throws InterruptedException;
/* 34 */   public boolean waitFor(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int exitValue();
/*    */   public abstract void destroy();
/* 37 */   public Process destroyForcibly() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isAlive() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\Process.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */