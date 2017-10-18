/*    */ package java.security;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public abstract class IdentityScope
/*    */   extends Identity
/*    */ {
/* 32 */   protected IdentityScope() { throw new RuntimeException("Stub!"); }
/* 33 */   public IdentityScope(String name) { throw new RuntimeException("Stub!"); }
/* 34 */   public IdentityScope(String name, IdentityScope scope) throws KeyManagementException { throw new RuntimeException("Stub!"); }
/* 35 */   public static IdentityScope getSystemScope() { throw new RuntimeException("Stub!"); }
/* 36 */   protected static void setSystemScope(IdentityScope scope) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int size();
/*    */   public abstract Identity getIdentity(String paramString);
/* 39 */   public Identity getIdentity(Principal principal) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Identity getIdentity(PublicKey paramPublicKey);
/*    */   public abstract void addIdentity(Identity paramIdentity) throws KeyManagementException;
/*    */   public abstract void removeIdentity(Identity paramIdentity) throws KeyManagementException;
/*    */   public abstract Enumeration<Identity> identities();
/* 44 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\IdentityScope.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */