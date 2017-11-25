/*    */ package javax.security.auth;
/*    */ 
/*    */ import java.security.Permission;
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
/*    */ public final class PrivateCredentialPermission
/*    */   extends Permission
/*    */ {
/*    */   public PrivateCredentialPermission(String name, String actions)
/*    */   {
/* 30 */     super((String)null);throw new RuntimeException("Stub!"); }
/* 31 */   public String getCredentialClass() { throw new RuntimeException("Stub!"); }
/* 32 */   public String[][] getPrincipals() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean implies(Permission p) { throw new RuntimeException("Stub!"); }
/* 34 */   public String getActions() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\security\auth\PrivateCredentialPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */