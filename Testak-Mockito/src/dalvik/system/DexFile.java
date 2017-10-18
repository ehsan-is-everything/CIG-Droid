/*    */ package dalvik.system;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.FileNotFoundException;
/*    */ import java.io.IOException;
/*    */ import java.util.Enumeration;
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
/*    */ @Deprecated
/*    */ public final class DexFile
/*    */ {
/*    */   @Deprecated
/* 22 */   public DexFile(File file)
/* 22 */     throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 24 */   public DexFile(String fileName) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 26 */   public static DexFile loadDex(String sourcePathName, String outputPathName, int flags) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 28 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 29 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public Class loadClass(String name, ClassLoader loader) { throw new RuntimeException("Stub!"); }
/* 31 */   public Enumeration<String> entries() { throw new RuntimeException("Stub!"); }
/* 32 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static native boolean isDexOptNeeded(String paramString)
/*    */     throws FileNotFoundException, IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\dalvik\system\DexFile.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */