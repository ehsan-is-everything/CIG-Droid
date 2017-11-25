/*    */ package java.lang;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
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
/*    */ public class Runtime
/*    */ {
/* 30 */   Runtime() { throw new RuntimeException("Stub!"); }
/* 31 */   public static Runtime getRuntime() { throw new RuntimeException("Stub!"); }
/* 32 */   public void exit(int status) { throw new RuntimeException("Stub!"); }
/* 33 */   public void addShutdownHook(Thread hook) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean removeShutdownHook(Thread hook) { throw new RuntimeException("Stub!"); }
/* 35 */   public void halt(int status) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public static void runFinalizersOnExit(boolean value) { throw new RuntimeException("Stub!"); }
/* 38 */   public Process exec(String command) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public Process exec(String command, String[] envp) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public Process exec(String command, String[] envp, File dir) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public Process exec(String[] cmdarray) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public Process exec(String[] cmdarray, String[] envp) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public Process exec(String[] cmdarray, String[] envp, File dir) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public int availableProcessors() { throw new RuntimeException("Stub!"); }
/*    */   public native long freeMemory();
/*    */   public native long totalMemory();
/*    */   public native long maxMemory();
/*    */   public native void gc();
/* 49 */   public void runFinalization() { throw new RuntimeException("Stub!"); }
/* 50 */   public void traceInstructions(boolean on) { throw new RuntimeException("Stub!"); }
/* 51 */   public void traceMethodCalls(boolean on) { throw new RuntimeException("Stub!"); }
/* 52 */   public void load(String filename) { throw new RuntimeException("Stub!"); }
/* 53 */   public void loadLibrary(String libname) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 55 */   public InputStream getLocalizedInputStream(InputStream in) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 57 */   public OutputStream getLocalizedOutputStream(OutputStream out) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\Runtime.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */