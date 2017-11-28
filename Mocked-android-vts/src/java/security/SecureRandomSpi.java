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
/*    */ public abstract class SecureRandomSpi
/*    */   implements Serializable
/*    */ {
/*    */   public SecureRandomSpi()
/*    */   {
/* 30 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */   
/*    */   protected abstract void engineSetSeed(byte[] paramArrayOfByte);
/*    */   
/*    */   protected abstract void engineNextBytes(byte[] paramArrayOfByte);
/*    */   
/*    */   protected abstract byte[] engineGenerateSeed(int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\security\SecureRandomSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */