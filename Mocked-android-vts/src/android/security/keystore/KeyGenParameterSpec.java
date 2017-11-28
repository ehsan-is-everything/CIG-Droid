/*    */ package android.security.keystore;
/*    */ 
/*    */ import java.math.BigInteger;
/*    */ import java.security.spec.AlgorithmParameterSpec;
/*    */ import java.util.Date;
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
/*    */ public final class KeyGenParameterSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder(String keystoreAlias, int purposes) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setKeySize(int keySize) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setAlgorithmParameterSpec(AlgorithmParameterSpec spec) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setCertificateSubject(X500Principal subject) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setCertificateSerialNumber(BigInteger serialNumber) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setCertificateNotBefore(Date date) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setCertificateNotAfter(Date date) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setKeyValidityStart(Date startDate) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setKeyValidityEnd(Date endDate) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setKeyValidityForOriginationEnd(Date endDate) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setKeyValidityForConsumptionEnd(Date endDate) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setDigests(String... digests) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder setEncryptionPaddings(String... paddings) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder setSignaturePaddings(String... paddings) { throw new RuntimeException("Stub!"); }
/* 37 */     public Builder setBlockModes(String... blockModes) { throw new RuntimeException("Stub!"); }
/* 38 */     public Builder setRandomizedEncryptionRequired(boolean required) { throw new RuntimeException("Stub!"); }
/* 39 */     public Builder setUserAuthenticationRequired(boolean required) { throw new RuntimeException("Stub!"); }
/* 40 */     public Builder setUserAuthenticationValidityDurationSeconds(int seconds) { throw new RuntimeException("Stub!"); }
/* 41 */     public Builder setAttestationChallenge(byte[] attestationChallenge) { throw new RuntimeException("Stub!"); }
/* 42 */     public Builder setUserAuthenticationValidWhileOnBody(boolean remainsValid) { throw new RuntimeException("Stub!"); }
/* 43 */     public Builder setInvalidatedByBiometricEnrollment(boolean invalidateKey) { throw new RuntimeException("Stub!"); }
/* 44 */     public KeyGenParameterSpec build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 46 */   KeyGenParameterSpec() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getKeystoreAlias() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getKeySize() { throw new RuntimeException("Stub!"); }
/* 49 */   public AlgorithmParameterSpec getAlgorithmParameterSpec() { throw new RuntimeException("Stub!"); }
/* 50 */   public X500Principal getCertificateSubject() { throw new RuntimeException("Stub!"); }
/* 51 */   public BigInteger getCertificateSerialNumber() { throw new RuntimeException("Stub!"); }
/* 52 */   public Date getCertificateNotBefore() { throw new RuntimeException("Stub!"); }
/* 53 */   public Date getCertificateNotAfter() { throw new RuntimeException("Stub!"); }
/* 54 */   public Date getKeyValidityStart() { throw new RuntimeException("Stub!"); }
/* 55 */   public Date getKeyValidityForConsumptionEnd() { throw new RuntimeException("Stub!"); }
/* 56 */   public Date getKeyValidityForOriginationEnd() { throw new RuntimeException("Stub!"); }
/* 57 */   public int getPurposes() { throw new RuntimeException("Stub!"); }
/* 58 */   public String[] getDigests() { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean isDigestsSpecified() { throw new RuntimeException("Stub!"); }
/* 60 */   public String[] getEncryptionPaddings() { throw new RuntimeException("Stub!"); }
/* 61 */   public String[] getSignaturePaddings() { throw new RuntimeException("Stub!"); }
/* 62 */   public String[] getBlockModes() { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean isRandomizedEncryptionRequired() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isUserAuthenticationRequired() { throw new RuntimeException("Stub!"); }
/* 65 */   public int getUserAuthenticationValidityDurationSeconds() { throw new RuntimeException("Stub!"); }
/* 66 */   public byte[] getAttestationChallenge() { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean isUserAuthenticationValidWhileOnBody() { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean isInvalidatedByBiometricEnrollment() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\security\keystore\KeyGenParameterSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */