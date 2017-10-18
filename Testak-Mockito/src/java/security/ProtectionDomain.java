/*    */ package java.security;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class ProtectionDomain
/*    */ {
/* 30 */   public ProtectionDomain(CodeSource codesource, PermissionCollection permissions) { throw new RuntimeException("Stub!"); }
/* 31 */   public ProtectionDomain(CodeSource codesource, PermissionCollection permissions, ClassLoader classloader, Principal[] principals) { throw new RuntimeException("Stub!"); }
/* 32 */   public final CodeSource getCodeSource() { throw new RuntimeException("Stub!"); }
/* 33 */   public final ClassLoader getClassLoader() { throw new RuntimeException("Stub!"); }
/* 34 */   public final Principal[] getPrincipals() { throw new RuntimeException("Stub!"); }
/* 35 */   public final PermissionCollection getPermissions() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean implies(Permission permission) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\ProtectionDomain.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */