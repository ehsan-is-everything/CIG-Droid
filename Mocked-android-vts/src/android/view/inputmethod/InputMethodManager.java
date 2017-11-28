/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.IBinder;
/*    */ import android.os.ResultReceiver;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class InputMethodManager
/*    */ {
/*    */   public static final int HIDE_IMPLICIT_ONLY = 1;
/*    */   public static final int HIDE_NOT_ALWAYS = 2;
/*    */   public static final int RESULT_HIDDEN = 3;
/*    */   public static final int RESULT_SHOWN = 2;
/*    */   public static final int RESULT_UNCHANGED_HIDDEN = 1;
/*    */   public static final int RESULT_UNCHANGED_SHOWN = 0;
/*    */   public static final int SHOW_FORCED = 2;
/*    */   public static final int SHOW_IMPLICIT = 1;
/*    */   
/* 20 */   InputMethodManager() { throw new RuntimeException("Stub!"); }
/* 21 */   public java.util.List<InputMethodInfo> getInputMethodList() { throw new RuntimeException("Stub!"); }
/* 22 */   public java.util.List<InputMethodInfo> getEnabledInputMethodList() { throw new RuntimeException("Stub!"); }
/* 23 */   public java.util.List<InputMethodSubtype> getEnabledInputMethodSubtypeList(InputMethodInfo imi, boolean allowsImplicitlySelectedSubtypes) { throw new RuntimeException("Stub!"); }
/* 24 */   public void showStatusIcon(IBinder imeToken, String packageName, int iconId) { throw new RuntimeException("Stub!"); }
/* 25 */   public void hideStatusIcon(IBinder imeToken) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isFullscreenMode() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isActive(View view) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean isActive() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isAcceptingText() { throw new RuntimeException("Stub!"); }
/* 30 */   public void displayCompletions(View view, CompletionInfo[] completions) { throw new RuntimeException("Stub!"); }
/* 31 */   public void updateExtractedText(View view, int token, ExtractedText text) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean showSoftInput(View view, int flags) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean showSoftInput(View view, int flags, ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean hideSoftInputFromWindow(IBinder windowToken, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean hideSoftInputFromWindow(IBinder windowToken, int flags, ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); }
/* 36 */   public void toggleSoftInputFromWindow(IBinder windowToken, int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); }
/* 37 */   public void toggleSoftInput(int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); }
/* 38 */   public void restartInput(View view) { throw new RuntimeException("Stub!"); }
/* 39 */   public void updateSelection(View view, int selStart, int selEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); }
/* 40 */   public void viewClicked(View view) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 42 */   public boolean isWatchingCursor(View view) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public void updateCursor(View view, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 45 */   public void updateCursorAnchorInfo(View view, CursorAnchorInfo cursorAnchorInfo) { throw new RuntimeException("Stub!"); }
/* 46 */   public void sendAppPrivateCommand(View view, String action, android.os.Bundle data) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setInputMethod(IBinder token, String id) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setInputMethodAndSubtype(IBinder token, String id, InputMethodSubtype subtype) { throw new RuntimeException("Stub!"); }
/* 49 */   public void hideSoftInputFromInputMethod(IBinder token, int flags) { throw new RuntimeException("Stub!"); }
/* 50 */   public void showSoftInputFromInputMethod(IBinder token, int flags) { throw new RuntimeException("Stub!"); }
/* 51 */   public void dispatchKeyEventFromInputMethod(View targetView, android.view.KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 52 */   public void showInputMethodPicker() { throw new RuntimeException("Stub!"); }
/* 53 */   public void showInputMethodAndSubtypeEnabler(String imiId) { throw new RuntimeException("Stub!"); }
/* 54 */   public InputMethodSubtype getCurrentInputMethodSubtype() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean setCurrentInputMethodSubtype(InputMethodSubtype subtype) { throw new RuntimeException("Stub!"); }
/* 56 */   public java.util.Map<InputMethodInfo, java.util.List<InputMethodSubtype>> getShortcutInputMethodsAndSubtypes() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean switchToLastInputMethod(IBinder imeToken) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean switchToNextInputMethod(IBinder imeToken, boolean onlyCurrentIme) { throw new RuntimeException("Stub!"); }
/* 59 */   public boolean shouldOfferSwitchingToNextInputMethod(IBinder imeToken) { throw new RuntimeException("Stub!"); }
/* 60 */   public void setAdditionalInputMethodSubtypes(String imiId, InputMethodSubtype[] subtypes) { throw new RuntimeException("Stub!"); }
/* 61 */   public InputMethodSubtype getLastInputMethodSubtype() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\inputmethod\InputMethodManager.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */