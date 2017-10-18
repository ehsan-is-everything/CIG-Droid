/*    */ package java.security.spec;
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
/*    */ public abstract class EncodedKeySpec
/*    */   implements KeySpec
/*    */ {
/* 30 */   public EncodedKeySpec(byte[] encodedKey) { throw new RuntimeException("Stub!"); }
/* 31 */   public byte[] getEncoded() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract String getFormat();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\security\spec\EncodedKeySpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */