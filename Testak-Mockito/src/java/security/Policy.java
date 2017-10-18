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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Policy
/*    */ {
/* 34 */   public Policy() { throw new RuntimeException("Stub!"); }
/* 35 */   public static Policy getPolicy() { throw new RuntimeException("Stub!"); }
/* 36 */   public static void setPolicy(Policy p) { throw new RuntimeException("Stub!"); }
/* 37 */   public static Policy getInstance(String type, Parameters params) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 38 */   public static Policy getInstance(String type, Parameters params, String provider) throws NoSuchProviderException, NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 39 */   public static Policy getInstance(String type, Parameters params, Provider provider) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 40 */   public Provider getProvider() { throw new RuntimeException("Stub!"); }
/* 41 */   public String getType() { throw new RuntimeException("Stub!"); }
/* 42 */   public Parameters getParameters() { throw new RuntimeException("Stub!"); }
/* 43 */   public PermissionCollection getPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); }
/* 44 */   public PermissionCollection getPermissions(ProtectionDomain domain) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean implies(ProtectionDomain domain, Permission permission) { throw new RuntimeException("Stub!"); }
/* 46 */   public void refresh() { throw new RuntimeException("Stub!"); }
/*    */   
/* 48 */   public static final PermissionCollection UNSUPPORTED_EMPTY_COLLECTION = null;
/*    */   
/*    */   public static abstract interface Parameters {}
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\Policy.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */