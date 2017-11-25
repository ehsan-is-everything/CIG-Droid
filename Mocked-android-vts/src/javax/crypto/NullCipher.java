/*    */ package javax.crypto;
/*    */ 
/*    */ import java.security.Provider;
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
/*    */ public class NullCipher
/*    */   extends Cipher
/*    */ {
/*    */   public NullCipher()
/*    */   {
/* 30 */     super((CipherSpi)null, (Provider)null, (String)null);throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\crypto\NullCipher.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */