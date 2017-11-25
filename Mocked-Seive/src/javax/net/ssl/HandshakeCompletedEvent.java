/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.Principal;
/*    */ import java.security.cert.Certificate;
/*    */ import java.util.EventObject;
/*    */ import javax.security.cert.X509Certificate;
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
/*    */ public class HandshakeCompletedEvent
/*    */   extends EventObject
/*    */ {
/*    */   public HandshakeCompletedEvent(SSLSocket sock, SSLSession s)
/*    */   {
/* 30 */     super(null);throw new RuntimeException("Stub!"); }
/* 31 */   public SSLSession getSession() { throw new RuntimeException("Stub!"); }
/* 32 */   public String getCipherSuite() { throw new RuntimeException("Stub!"); }
/* 33 */   public Certificate[] getLocalCertificates() { throw new RuntimeException("Stub!"); }
/* 34 */   public Certificate[] getPeerCertificates() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
/* 35 */   public X509Certificate[] getPeerCertificateChain() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
/* 36 */   public Principal getPeerPrincipal() throws SSLPeerUnverifiedException { throw new RuntimeException("Stub!"); }
/* 37 */   public Principal getLocalPrincipal() { throw new RuntimeException("Stub!"); }
/* 38 */   public SSLSocket getSocket() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\HandshakeCompletedEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */