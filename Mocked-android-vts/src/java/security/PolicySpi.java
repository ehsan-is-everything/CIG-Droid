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
/*    */ public abstract class PolicySpi
/*    */ {
/* 30 */   public PolicySpi() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract boolean engineImplies(ProtectionDomain paramProtectionDomain, Permission paramPermission);
/* 32 */   protected void engineRefresh() { throw new RuntimeException("Stub!"); }
/* 33 */   protected PermissionCollection engineGetPermissions(CodeSource codesource) { throw new RuntimeException("Stub!"); }
/* 34 */   protected PermissionCollection engineGetPermissions(ProtectionDomain domain) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\PolicySpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */