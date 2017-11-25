/*    */ package java.net;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.security.CodeSource;
/*    */ import java.security.PermissionCollection;
/*    */ import java.security.SecureClassLoader;
/*    */ import java.util.Enumeration;
/*    */ import java.util.jar.Manifest;
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
/*    */ public class URLClassLoader
/*    */   extends SecureClassLoader
/*    */   implements Closeable
/*    */ {
/* 31 */   public URLClassLoader(URL[] urls, ClassLoader parent) { throw new RuntimeException("Stub!"); }
/* 32 */   public URLClassLoader(URL[] urls) { throw new RuntimeException("Stub!"); }
/* 33 */   public URLClassLoader(URL[] urls, ClassLoader parent, URLStreamHandlerFactory factory) { throw new RuntimeException("Stub!"); }
/* 34 */   public InputStream getResourceAsStream(String name) { throw new RuntimeException("Stub!"); }
/* 35 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   protected void addURL(URL url) { throw new RuntimeException("Stub!"); }
/* 37 */   public URL[] getURLs() { throw new RuntimeException("Stub!"); }
/* 38 */   protected Class<?> findClass(String name) throws ClassNotFoundException { throw new RuntimeException("Stub!"); }
/* 39 */   protected Package definePackage(String name, Manifest man, URL url) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 40 */   public URL findResource(String name) { throw new RuntimeException("Stub!"); }
/* 41 */   public Enumeration<URL> findResources(String name) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   protected PermissionCollection getPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); }
/* 43 */   public static URLClassLoader newInstance(URL[] urls, ClassLoader parent) { throw new RuntimeException("Stub!"); }
/* 44 */   public static URLClassLoader newInstance(URL[] urls) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\URLClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */