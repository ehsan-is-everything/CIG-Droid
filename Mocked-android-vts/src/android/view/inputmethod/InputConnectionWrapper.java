/*    */ package android.view.inputmethod;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.view.KeyEvent;
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
/*    */ public class InputConnectionWrapper
/*    */   implements InputConnection
/*    */ {
/* 21 */   public InputConnectionWrapper(InputConnection target, boolean mutable) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setTarget(InputConnection target) { throw new RuntimeException("Stub!"); }
/* 23 */   public CharSequence getTextBeforeCursor(int n, int flags) { throw new RuntimeException("Stub!"); }
/* 24 */   public CharSequence getTextAfterCursor(int n, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence getSelectedText(int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getCursorCapsMode(int reqModes) { throw new RuntimeException("Stub!"); }
/* 27 */   public ExtractedText getExtractedText(ExtractedTextRequest request, int flags) { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean deleteSurroundingTextInCodePoints(int beforeLength, int afterLength) { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean deleteSurroundingText(int beforeLength, int afterLength) { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean setComposingText(CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean setComposingRegion(int start, int end) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean finishComposingText() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean commitText(CharSequence text, int newCursorPosition) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean commitCompletion(CompletionInfo text) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean commitCorrection(CorrectionInfo correctionInfo) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean setSelection(int start, int end) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean performEditorAction(int editorAction) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean performContextMenuAction(int id) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean beginBatchEdit() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean endBatchEdit() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean sendKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean clearMetaKeyStates(int states) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean reportFullscreenMode(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean performPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean requestCursorUpdates(int cursorUpdateMode) { throw new RuntimeException("Stub!"); }
/* 46 */   public Handler getHandler() { throw new RuntimeException("Stub!"); }
/* 47 */   public void closeConnection() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean commitContent(InputContentInfo inputContentInfo, int flags, Bundle opts) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\inputmethod\InputConnectionWrapper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */