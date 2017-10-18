/*    */ package dalvik.system;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.net.URL;
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
/*    */ 
/*    */ 
/*    */ public class BaseDexClassLoader
/*    */   extends ClassLoader
/*    */ {
/* 21 */   public BaseDexClassLoader(String dexPath, File optimizedDirectory, String librarySearchPath, ClassLoader parent) { throw new RuntimeException("Stub!"); }
/* 22 */   protected Class<?> findClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 23 */   protected URL findResource(String name) { throw new RuntimeException("Stub!"); }
/* 24 */   protected Enumeration<URL> findResources(String name) { throw new RuntimeException("Stub!"); }
/* 25 */   public String findLibrary(String name) { throw new RuntimeException("Stub!"); }
/* 26 */   protected synchronized Package getPackage(String name) { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\dalvik\system\BaseDexClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */