/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.security.cert.Certificate;
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
/*    */ public final class UnresolvedPermission
/*    */   extends Permission
/*    */   implements Serializable
/*    */ {
/*    */   public UnresolvedPermission(String type, String name, String actions, Certificate[] certs)
/*    */   {
/* 31 */     super((String)null);throw new RuntimeException("Stub!"); }
/* 32 */   public boolean implies(Permission p) { throw new RuntimeException("Stub!"); }
/* 33 */   public String getActions() { throw new RuntimeException("Stub!"); }
/* 34 */   public String getUnresolvedType() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getUnresolvedName() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getUnresolvedActions() { throw new RuntimeException("Stub!"); }
/* 37 */   public Certificate[] getUnresolvedCerts() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\UnresolvedPermission.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */