/*    */ package java.lang;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.net.URL;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.ProtectionDomain;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ClassLoader
/*    */ {
/* 29 */   protected ClassLoader(ClassLoader parent) { throw new RuntimeException("Stub!"); }
/* 30 */   protected ClassLoader() { throw new RuntimeException("Stub!"); }
/* 31 */   public Class<?> loadClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 32 */   protected Class<?> loadClass(String name, boolean resolve) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 33 */   protected Class<?> findClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   protected final Class<?> defineClass(byte[] b, int off, int len) throws ClassFormatError { throw new RuntimeException("Stub!"); }
/* 36 */   protected final Class<?> defineClass(String name, byte[] b, int off, int len) throws ClassFormatError { throw new RuntimeException("Stub!"); }
/* 37 */   protected final Class<?> defineClass(String name, byte[] b, int off, int len, ProtectionDomain protectionDomain) throws ClassFormatError { throw new RuntimeException("Stub!"); }
/* 38 */   protected final Class<?> defineClass(String name, ByteBuffer b, ProtectionDomain protectionDomain) throws ClassFormatError { throw new RuntimeException("Stub!"); }
/* 39 */   protected final void resolveClass(Class<?> c) { throw new RuntimeException("Stub!"); }
/* 40 */   protected final Class<?> findSystemClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 41 */   protected final Class<?> findLoadedClass(String name) { throw new RuntimeException("Stub!"); }
/* 42 */   protected final void setSigners(Class<?> c, Object[] signers) { throw new RuntimeException("Stub!"); }
/* 43 */   public URL getResource(String name) { throw new RuntimeException("Stub!"); }
/* 44 */   public Enumeration<URL> getResources(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   protected URL findResource(String name) { throw new RuntimeException("Stub!"); }
/* 46 */   protected Enumeration<URL> findResources(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   protected static boolean registerAsParallelCapable() { throw new RuntimeException("Stub!"); }
/* 48 */   public static URL getSystemResource(String name) { throw new RuntimeException("Stub!"); }
/* 49 */   public static Enumeration<URL> getSystemResources(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 50 */   public InputStream getResourceAsStream(String name) { throw new RuntimeException("Stub!"); }
/* 51 */   public static InputStream getSystemResourceAsStream(String name) { throw new RuntimeException("Stub!"); }
/* 52 */   public final ClassLoader getParent() { throw new RuntimeException("Stub!"); }
/* 53 */   public static ClassLoader getSystemClassLoader() { throw new RuntimeException("Stub!"); }
/* 54 */   protected Package definePackage(String name, String specTitle, String specVersion, String specVendor, String implTitle, String implVersion, String implVendor, URL sealBase) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 55 */   protected Package getPackage(String name) { throw new RuntimeException("Stub!"); }
/* 56 */   protected Package[] getPackages() { throw new RuntimeException("Stub!"); }
/* 57 */   protected String findLibrary(String libname) { throw new RuntimeException("Stub!"); }
/* 58 */   public void setDefaultAssertionStatus(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 59 */   public void setPackageAssertionStatus(String packageName, boolean enabled) { throw new RuntimeException("Stub!"); }
/* 60 */   public void setClassAssertionStatus(String className, boolean enabled) { throw new RuntimeException("Stub!"); }
/* 61 */   public void clearAssertionStatus() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\ClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */