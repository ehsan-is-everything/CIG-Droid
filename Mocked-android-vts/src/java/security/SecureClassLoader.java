/*    */ package java.security;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public class SecureClassLoader
/*    */   extends ClassLoader
/*    */ {
/* 30 */   protected SecureClassLoader(ClassLoader parent) { throw new RuntimeException("Stub!"); }
/* 31 */   protected SecureClassLoader() { throw new RuntimeException("Stub!"); }
/* 32 */   protected final Class<?> defineClass(String name, byte[] b, int off, int len, CodeSource cs) { throw new RuntimeException("Stub!"); }
/* 33 */   protected final Class<?> defineClass(String name, ByteBuffer b, CodeSource cs) { throw new RuntimeException("Stub!"); }
/* 34 */   protected PermissionCollection getPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\SecureClassLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */