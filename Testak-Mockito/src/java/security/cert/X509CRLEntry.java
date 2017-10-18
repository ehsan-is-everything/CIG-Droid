/*    */ package java.security.cert;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.util.Date;
/*    */ import javax.security.auth.x500.X500Principal;
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
/*    */ public abstract class X509CRLEntry
/*    */   implements X509Extension
/*    */ {
/* 30 */   public X509CRLEntry() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 32 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */   public abstract byte[] getEncoded() throws CRLException;
/*    */   public abstract BigInteger getSerialNumber();
/* 35 */   public X500Principal getCertificateIssuer() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Date getRevocationDate();
/*    */   public abstract boolean hasExtensions();
/*    */   public abstract String toString();
/* 39 */   public CRLReason getRevocationReason() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\cert\X509CRLEntry.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */