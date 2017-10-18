/*    */ package android.app;
/*    */ 
/*    */ import android.content.Intent;
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
/*    */ public class KeyguardManager
/*    */ {
/*    */   @Deprecated
/*    */   public class KeyguardLock
/*    */   {
/* 23 */     KeyguardLock() { throw new RuntimeException("Stub!"); }
/* 24 */     public void disableKeyguard() { throw new RuntimeException("Stub!"); }
/* 25 */     public void reenableKeyguard() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static abstract interface OnKeyguardExitResult {
/*    */     public abstract void onKeyguardExitResult(boolean paramBoolean);
/*    */   }
/*    */   
/*    */   public static abstract class KeyguardDismissCallback {
/* 34 */     public KeyguardDismissCallback() { throw new RuntimeException("Stub!"); }
/* 35 */     public void onDismissError() { throw new RuntimeException("Stub!"); }
/* 36 */     public void onDismissSucceeded() { throw new RuntimeException("Stub!"); }
/* 37 */     public void onDismissCancelled() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 39 */   KeyguardManager() { throw new RuntimeException("Stub!"); }
/* 40 */   public Intent createConfirmDeviceCredentialIntent(CharSequence title, CharSequence description) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 42 */   public KeyguardLock newKeyguardLock(String tag) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isKeyguardLocked() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isKeyguardSecure() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean inKeyguardRestrictedInputMode() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isDeviceLocked() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isDeviceSecure() { throw new RuntimeException("Stub!"); }
/* 48 */   public void requestDismissKeyguard(Activity activity, KeyguardDismissCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 50 */   public void exitKeyguardSecurely(OnKeyguardExitResult callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\KeyguardManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */