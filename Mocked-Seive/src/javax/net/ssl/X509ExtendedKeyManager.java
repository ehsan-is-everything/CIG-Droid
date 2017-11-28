/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.Principal;
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
/*    */ public abstract class X509ExtendedKeyManager
/*    */   implements X509KeyManager
/*    */ {
/* 30 */   protected X509ExtendedKeyManager() { throw new RuntimeException("Stub!"); }
/* 31 */   public String chooseEngineClientAlias(String[] keyType, Principal[] issuers, SSLEngine engine) { throw new RuntimeException("Stub!"); }
/* 32 */   public String chooseEngineServerAlias(String keyType, Principal[] issuers, SSLEngine engine) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\X509ExtendedKeyManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */