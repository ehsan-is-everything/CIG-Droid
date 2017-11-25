/*    */ package android.hardware.fingerprint;
/*    */ 
/*    */ import javax.crypto.Cipher;
/*    */ 
/*    */ 
/*    */ public class FingerprintManager
/*    */ {
/*    */   public static final int FINGERPRINT_ACQUIRED_GOOD = 0;
/*    */   public static final int FINGERPRINT_ACQUIRED_IMAGER_DIRTY = 3;
/*    */   public static final int FINGERPRINT_ACQUIRED_INSUFFICIENT = 2;
/*    */   public static final int FINGERPRINT_ACQUIRED_PARTIAL = 1;
/*    */   public static final int FINGERPRINT_ACQUIRED_TOO_FAST = 5;
/*    */   public static final int FINGERPRINT_ACQUIRED_TOO_SLOW = 4;
/*    */   public static final int FINGERPRINT_ERROR_CANCELED = 5;
/*    */   public static final int FINGERPRINT_ERROR_HW_UNAVAILABLE = 1;
/*    */   public static final int FINGERPRINT_ERROR_LOCKOUT = 7;
/*    */   public static final int FINGERPRINT_ERROR_NO_SPACE = 4;
/*    */   public static final int FINGERPRINT_ERROR_TIMEOUT = 3;
/*    */   public static final int FINGERPRINT_ERROR_UNABLE_TO_PROCESS = 2;
/*    */   
/*    */   public static final class CryptoObject {
/* 22 */     public CryptoObject(java.security.Signature signature) { throw new RuntimeException("Stub!"); }
/* 23 */     public CryptoObject(Cipher cipher) { throw new RuntimeException("Stub!"); }
/* 24 */     public CryptoObject(javax.crypto.Mac mac) { throw new RuntimeException("Stub!"); }
/* 25 */     public java.security.Signature getSignature() { throw new RuntimeException("Stub!"); }
/* 26 */     public Cipher getCipher() { throw new RuntimeException("Stub!"); }
/* 27 */     public javax.crypto.Mac getMac() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class AuthenticationResult {
/* 31 */     AuthenticationResult() { throw new RuntimeException("Stub!"); }
/* 32 */     public FingerprintManager.CryptoObject getCryptoObject() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class AuthenticationCallback {
/* 36 */     public AuthenticationCallback() { throw new RuntimeException("Stub!"); }
/* 37 */     public void onAuthenticationError(int errorCode, CharSequence errString) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onAuthenticationHelp(int helpCode, CharSequence helpString) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onAuthenticationSucceeded(FingerprintManager.AuthenticationResult result) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onAuthenticationFailed() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 42 */   FingerprintManager() { throw new RuntimeException("Stub!"); }
/* 43 */   public void authenticate(CryptoObject crypto, android.os.CancellationSignal cancel, int flags, AuthenticationCallback callback, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean hasEnrolledFingerprints() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isHardwareDetected() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\fingerprint\FingerprintManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */