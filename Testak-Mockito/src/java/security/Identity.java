/*    */ package java.security;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public abstract class Identity
/*    */   implements Principal, Serializable
/*    */ {
/* 32 */   protected Identity() { throw new RuntimeException("Stub!"); }
/* 33 */   public Identity(String name, IdentityScope scope) throws KeyManagementException { throw new RuntimeException("Stub!"); }
/* 34 */   public Identity(String name) { throw new RuntimeException("Stub!"); }
/* 35 */   public final String getName() { throw new RuntimeException("Stub!"); }
/* 36 */   public final IdentityScope getScope() { throw new RuntimeException("Stub!"); }
/* 37 */   public PublicKey getPublicKey() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setPublicKey(PublicKey key) throws KeyManagementException { throw new RuntimeException("Stub!"); }
/* 39 */   public void setInfo(String info) { throw new RuntimeException("Stub!"); }
/* 40 */   public String getInfo() { throw new RuntimeException("Stub!"); }
/* 41 */   public void addCertificate(Certificate certificate) throws KeyManagementException { throw new RuntimeException("Stub!"); }
/* 42 */   public void removeCertificate(Certificate certificate) throws KeyManagementException { throw new RuntimeException("Stub!"); }
/* 43 */   public Certificate[] certificates() { throw new RuntimeException("Stub!"); }
/* 44 */   public final boolean equals(Object identity) { throw new RuntimeException("Stub!"); }
/* 45 */   protected boolean identityEquals(Identity identity) { throw new RuntimeException("Stub!"); }
/* 46 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 47 */   public String toString(boolean detailed) { throw new RuntimeException("Stub!"); }
/* 48 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\Identity.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */