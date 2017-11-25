/*    */ package android.security;
/*    */ 
/*    */ import android.content.Context;
/*    */ import java.math.BigInteger;
/*    */ import java.security.NoSuchAlgorithmException;
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
/*    */ @Deprecated
/*    */ public final class KeyPairGeneratorSpec
/*    */   implements AlgorithmParameterSpec
/*    */ {
/*    */   @Deprecated
/*    */   public static final class Builder
/*    */   {
/* 25 */     public Builder(Context context) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setAlias(String alias) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setKeyType(String keyType) throws NoSuchAlgorithmException { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setKeySize(int keySize) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setAlgorithmParameterSpec(AlgorithmParameterSpec spec) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setSubject(X500Principal subject) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setSerialNumber(BigInteger serialNumber) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setStartDate(Date startDate) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setEndDate(Date endDate) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setEncryptionRequired() { throw new RuntimeException("Stub!"); }
/* 35 */     public KeyPairGeneratorSpec build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 37 */   KeyPairGeneratorSpec() { throw new RuntimeException("Stub!"); }
/* 38 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/* 39 */   public String getKeystoreAlias() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getKeyType() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getKeySize() { throw new RuntimeException("Stub!"); }
/* 42 */   public AlgorithmParameterSpec getAlgorithmParameterSpec() { throw new RuntimeException("Stub!"); }
/* 43 */   public X500Principal getSubjectDN() { throw new RuntimeException("Stub!"); }
/* 44 */   public BigInteger getSerialNumber() { throw new RuntimeException("Stub!"); }
/* 45 */   public Date getStartDate() { throw new RuntimeException("Stub!"); }
/* 46 */   public Date getEndDate() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isEncryptionRequired() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\security\KeyPairGeneratorSpec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */