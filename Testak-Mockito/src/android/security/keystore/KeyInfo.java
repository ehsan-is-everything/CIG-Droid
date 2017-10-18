/*    */ package android.security.keystore;
/*    */ 
/*    */ import java.security.spec.KeySpec;
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
/*    */ public class KeyInfo
/*    */   implements KeySpec
/*    */ {
/* 21 */   KeyInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getKeystoreAlias() { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isInsideSecureHardware() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getOrigin() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getKeySize() { throw new RuntimeException("Stub!"); }
/* 26 */   public Date getKeyValidityStart() { throw new RuntimeException("Stub!"); }
/* 27 */   public Date getKeyValidityForConsumptionEnd() { throw new RuntimeException("Stub!"); }
/* 28 */   public Date getKeyValidityForOriginationEnd() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getPurposes() { throw new RuntimeException("Stub!"); }
/* 30 */   public String[] getBlockModes() { throw new RuntimeException("Stub!"); }
/* 31 */   public String[] getEncryptionPaddings() { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] getSignaturePaddings() { throw new RuntimeException("Stub!"); }
/* 33 */   public String[] getDigests() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isUserAuthenticationRequired() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getUserAuthenticationValidityDurationSeconds() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isUserAuthenticationRequirementEnforcedBySecureHardware() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isUserAuthenticationValidWhileOnBody() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isInvalidatedByBiometricEnrollment() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\security\keystore\KeyInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */