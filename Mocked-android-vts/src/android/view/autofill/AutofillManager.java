/*    */ package android.view.autofill;
/*    */ 
/*    */ import android.graphics.Rect;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AutofillManager
/*    */ {
/*    */   public static final String EXTRA_ASSIST_STRUCTURE = "android.view.autofill.extra.ASSIST_STRUCTURE";
/*    */   public static final String EXTRA_AUTHENTICATION_RESULT = "android.view.autofill.extra.AUTHENTICATION_RESULT";
/*    */   public static final String EXTRA_CLIENT_STATE = "android.view.autofill.extra.CLIENT_STATE";
/*    */   
/*    */   public static abstract class AutofillCallback
/*    */   {
/*    */     public static final int EVENT_INPUT_HIDDEN = 2;
/*    */     public static final int EVENT_INPUT_SHOWN = 1;
/*    */     public static final int EVENT_INPUT_UNAVAILABLE = 3;
/*    */     
/* 22 */     public AutofillCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onAutofillEvent(View view, int event) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onAutofillEvent(View view, int virtualId, int event) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/* 29 */   AutofillManager() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 31 */   public void requestAutofill(View view) { throw new RuntimeException("Stub!"); }
/* 32 */   public void requestAutofill(View view, int virtualId, Rect absBounds) { throw new RuntimeException("Stub!"); }
/* 33 */   public void notifyViewEntered(View view) { throw new RuntimeException("Stub!"); }
/* 34 */   public void notifyViewExited(View view) { throw new RuntimeException("Stub!"); }
/* 35 */   public void notifyViewEntered(View view, int virtualId, Rect absBounds) { throw new RuntimeException("Stub!"); }
/* 36 */   public void notifyViewExited(View view, int virtualId) { throw new RuntimeException("Stub!"); }
/* 37 */   public void notifyValueChanged(View view) { throw new RuntimeException("Stub!"); }
/* 38 */   public void notifyValueChanged(View view, int virtualId, AutofillValue value) { throw new RuntimeException("Stub!"); }
/* 39 */   public void commit() { throw new RuntimeException("Stub!"); }
/* 40 */   public void cancel() { throw new RuntimeException("Stub!"); }
/* 41 */   public void disableAutofillServices() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean hasEnabledAutofillServices() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isAutofillSupported() { throw new RuntimeException("Stub!"); }
/* 44 */   public void registerCallback(AutofillCallback callback) { throw new RuntimeException("Stub!"); }
/* 45 */   public void unregisterCallback(AutofillCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\autofill\AutofillManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */