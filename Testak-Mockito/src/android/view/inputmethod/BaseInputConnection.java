/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.text.Editable;
/*    */ import android.text.Spannable;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.View;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BaseInputConnection
/*    */   implements InputConnection
/*    */ {
/* 21 */   public BaseInputConnection(View targetView, boolean fullEditor) { throw new RuntimeException("Stub!"); }
/* 22 */   public static final void removeComposingSpans(Spannable text) { throw new RuntimeException("Stub!"); }
/* 23 */   public static void setComposingSpans(Spannable text) { throw new RuntimeException("Stub!"); }
/* 24 */   public static int getComposingSpanStart(Spannable text) { throw new RuntimeException("Stub!"); }
/* 25 */   public static int getComposingSpanEnd(Spannable text) { throw new RuntimeException("Stub!"); }
/* 26 */   public Editable getEditable() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean beginBatchEdit() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean endBatchEdit() { throw new RuntimeException("Stub!"); }
/* 29 */   public void closeConnection() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean clearMetaKeyStates(int states) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean commitCompletion(CompletionInfo text) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean commitCorrection(CorrectionInfo correctionInfo) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean commitText(CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean deleteSurroundingText(int beforeLength, int afterLength) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean finishComposingText() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getCursorCapsMode(int reqModes) { throw new RuntimeException("Stub!"); }
/* 38 */   public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) { throw new RuntimeException("Stub!"); }
/* 39 */   public CharSequence getTextBeforeCursor(int length, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public CharSequence getSelectedText(int flags) { throw new RuntimeException("Stub!"); }
/* 41 */   public CharSequence getTextAfterCursor(int length, int flags) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean performEditorAction(int actionCode) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean performContextMenuAction(int id) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean performPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean requestCursorUpdates(int cursorUpdateMode) { throw new RuntimeException("Stub!"); }
/* 46 */   public Handler getHandler() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean setComposingText(CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean setComposingRegion(int start, int end) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean setSelection(int start, int end) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean sendKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean reportFullscreenMode(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\inputmethod\BaseInputConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */