/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.util.List;
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
/*    */ public abstract class ExtendedSSLSession
/*    */   implements SSLSession
/*    */ {
/* 30 */   public ExtendedSSLSession() { throw new RuntimeException("Stub!"); }
/*    */   public abstract String[] getLocalSupportedSignatureAlgorithms();
/*    */   public abstract String[] getPeerSupportedSignatureAlgorithms();
/* 33 */   public List<SNIServerName> getRequestedServerNames() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\ExtendedSSLSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */