/*    */ package java.security.cert;
/*    */ 
/*    */ import java.security.PublicKey;
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
/*    */ 
/*    */ public class TrustAnchor
/*    */ {
/* 29 */   public TrustAnchor(X509Certificate trustedCert, byte[] nameConstraints) { throw new RuntimeException("Stub!"); }
/* 30 */   public TrustAnchor(X500Principal caPrincipal, PublicKey pubKey, byte[] nameConstraints) { throw new RuntimeException("Stub!"); }
/* 31 */   public TrustAnchor(String caName, PublicKey pubKey, byte[] nameConstraints) { throw new RuntimeException("Stub!"); }
/* 32 */   public final X509Certificate getTrustedCert() { throw new RuntimeException("Stub!"); }
/* 33 */   public final X500Principal getCA() { throw new RuntimeException("Stub!"); }
/* 34 */   public final String getCAName() { throw new RuntimeException("Stub!"); }
/* 35 */   public final PublicKey getCAPublicKey() { throw new RuntimeException("Stub!"); }
/* 36 */   public final byte[] getNameConstraints() { throw new RuntimeException("Stub!"); }
/* 37 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\cert\TrustAnchor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */