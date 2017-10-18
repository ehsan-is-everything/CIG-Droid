/*    */ package java.security.cert;
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
/*    */ public abstract class CRL
/*    */ {
/* 29 */   protected CRL(String type) { throw new RuntimeException("Stub!"); }
/* 30 */   public final String getType() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract String toString();
/*    */   
/*    */   public abstract boolean isRevoked(Certificate paramCertificate);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\CRL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */