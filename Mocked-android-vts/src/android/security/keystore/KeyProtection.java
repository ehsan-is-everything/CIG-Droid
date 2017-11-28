/*    */ package android.security.keystore;
/*    */ 
/*    */ import java.security.KeyStore.ProtectionParameter;
/*    */ import java.util.Date;
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
/*    */ public final class KeyProtection
/*    */   implements KeyStore.ProtectionParameter
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(int purposes) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setKeyValidityStart(Date startDate) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setKeyValidityEnd(Date endDate) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setKeyValidityForOriginationEnd(Date endDate) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setKeyValidityForConsumptionEnd(Date endDate) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setEncryptionPaddings(String... paddings) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setSignaturePaddings(String... paddings) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setDigests(String... digests) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setBlockModes(String... blockModes) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setRandomizedEncryptionRequired(boolean required) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setUserAuthenticationRequired(boolean required) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setUserAuthenticationValidityDurationSeconds(int seconds) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder setUserAuthenticationValidWhileOnBody(boolean remainsValid) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder setInvalidatedByBiometricEnrollment(boolean invalidateKey) { throw new RuntimeException("Stub!"); }
/* 37 */     public KeyProtection build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 39 */   KeyProtection() { throw new RuntimeException("Stub!"); }
/* 40 */   public Date getKeyValidityStart() { throw new RuntimeException("Stub!"); }
/* 41 */   public Date getKeyValidityForConsumptionEnd() { throw new RuntimeException("Stub!"); }
/* 42 */   public Date getKeyValidityForOriginationEnd() { throw new RuntimeException("Stub!"); }
/* 43 */   public int getPurposes() { throw new RuntimeException("Stub!"); }
/* 44 */   public String[] getEncryptionPaddings() { throw new RuntimeException("Stub!"); }
/* 45 */   public String[] getSignaturePaddings() { throw new RuntimeException("Stub!"); }
/* 46 */   public String[] getDigests() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isDigestsSpecified() { throw new RuntimeException("Stub!"); }
/* 48 */   public String[] getBlockModes() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean isRandomizedEncryptionRequired() { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isUserAuthenticationRequired() { throw new RuntimeException("Stub!"); }
/* 51 */   public int getUserAuthenticationValidityDurationSeconds() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isUserAuthenticationValidWhileOnBody() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isInvalidatedByBiometricEnrollment() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\security\keystore\KeyProtection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */