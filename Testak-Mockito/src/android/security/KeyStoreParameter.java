/*    */ package android.security;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.security.KeyStore.ProtectionParameter;
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
/*    */ @Deprecated
/*    */ public final class KeyStoreParameter
/*    */   implements KeyStore.ProtectionParameter
/*    */ {
/*    */   @Deprecated
/*    */   public static final class Builder
/*    */   {
/* 25 */     public Builder(Context context) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setEncryptionRequired(boolean required) { throw new RuntimeException("Stub!"); }
/* 27 */     public KeyStoreParameter build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   KeyStoreParameter() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isEncryptionRequired() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\security\KeyStoreParameter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */