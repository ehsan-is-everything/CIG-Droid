/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Console;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.PrintStream;
/*    */ import java.nio.channels.Channel;
/*    */ import java.util.Map;
/*    */ import java.util.Properties;
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
/*    */ public final class System
/*    */ {
/* 29 */   System() { throw new RuntimeException("Stub!"); }
/* 30 */   public static void setIn(InputStream in) { throw new RuntimeException("Stub!"); }
/* 31 */   public static void setOut(PrintStream out) { throw new RuntimeException("Stub!"); }
/* 32 */   public static void setErr(PrintStream err) { throw new RuntimeException("Stub!"); }
/* 33 */   public static Console console() { throw new RuntimeException("Stub!"); }
/* 34 */   public static Channel inheritedChannel() throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public static void setSecurityManager(SecurityManager s) { throw new RuntimeException("Stub!"); }
/* 36 */   public static SecurityManager getSecurityManager() { throw new RuntimeException("Stub!"); }
/*    */   public static native long currentTimeMillis();
/*    */   public static native long nanoTime();
/*    */   public static native void arraycopy(Object paramObject1, int paramInt1, Object paramObject2, int paramInt2, int paramInt3);
/* 40 */   public static int identityHashCode(Object x) { throw new RuntimeException("Stub!"); }
/* 41 */   public static Properties getProperties() { throw new RuntimeException("Stub!"); }
/* 42 */   public static String lineSeparator() { throw new RuntimeException("Stub!"); }
/* 43 */   public static void setProperties(Properties props) { throw new RuntimeException("Stub!"); }
/* 44 */   public static String getProperty(String key) { throw new RuntimeException("Stub!"); }
/* 45 */   public static String getProperty(String key, String def) { throw new RuntimeException("Stub!"); }
/* 46 */   public static String setProperty(String key, String value) { throw new RuntimeException("Stub!"); }
/* 47 */   public static String clearProperty(String key) { throw new RuntimeException("Stub!"); }
/* 48 */   public static String getenv(String name) { throw new RuntimeException("Stub!"); }
/* 49 */   public static Map<String, String> getenv() { throw new RuntimeException("Stub!"); }
/* 50 */   public static void exit(int status) { throw new RuntimeException("Stub!"); }
/* 51 */   public static void gc() { throw new RuntimeException("Stub!"); }
/* 52 */   public static void runFinalization() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 54 */   public static void runFinalizersOnExit(boolean value) { throw new RuntimeException("Stub!"); }
/* 55 */   public static void load(String filename) { throw new RuntimeException("Stub!"); }
/* 56 */   public static void loadLibrary(String libname) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 61 */   public static final PrintStream out = null; public static final InputStream in = null; public static final PrintStream err = null;
/*    */   
/*    */   public static native String mapLibraryName(String paramString);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\System.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */