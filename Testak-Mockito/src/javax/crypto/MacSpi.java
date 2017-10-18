/*    */ package javax.crypto;
/*    */ 
/*    */ import java.nio.ByteBuffer;
/*    */ import java.security.InvalidAlgorithmParameterException;
/*    */ import java.security.InvalidKeyException;
/*    */ import java.security.Key;
/*    */ import java.security.spec.AlgorithmParameterSpec;
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
/*    */ public abstract class MacSpi
/*    */ {
/* 29 */   public MacSpi() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract int engineGetMacLength();
/*    */   protected abstract void engineInit(Key paramKey, AlgorithmParameterSpec paramAlgorithmParameterSpec) throws InvalidKeyException, InvalidAlgorithmParameterException;
/*    */   protected abstract void engineUpdate(byte paramByte);
/*    */   protected abstract void engineUpdate(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/* 34 */   protected void engineUpdate(ByteBuffer input) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract byte[] engineDoFinal();
/*    */   protected abstract void engineReset();
/* 37 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\crypto\MacSpi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */