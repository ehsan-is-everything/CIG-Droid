/*     */ package android.inputmethodservice;
/*     */ 
/*     */ import android.graphics.Rect;
/*     */ import android.os.Bundle;
/*     */ import android.view.KeyEvent;
/*     */ import android.view.MotionEvent;
/*     */ import android.view.View;
/*     */ import android.view.inputmethod.CompletionInfo;
/*     */ import android.view.inputmethod.CursorAnchorInfo;
/*     */ import android.view.inputmethod.EditorInfo;
/*     */ import android.view.inputmethod.InputConnection;
/*     */ import android.view.inputmethod.InputMethodSubtype;
/*     */ 
/*     */ public class InputMethodService extends AbstractInputMethodService
/*     */ {
/*     */   public static final int BACK_DISPOSITION_DEFAULT = 0;
/*     */   public static final int BACK_DISPOSITION_WILL_DISMISS = 2;
/*     */   public static final int BACK_DISPOSITION_WILL_NOT_DISMISS = 1;
/*     */   
/*     */   public class InputMethodImpl extends AbstractInputMethodService.AbstractInputMethodImpl
/*     */   {
/*     */     public InputMethodImpl()
/*     */     {
/*  24 */       super();throw new RuntimeException("Stub!"); }
/*  25 */     public void attachToken(android.os.IBinder token) { throw new RuntimeException("Stub!"); }
/*  26 */     public void bindInput(android.view.inputmethod.InputBinding binding) { throw new RuntimeException("Stub!"); }
/*  27 */     public void unbindInput() { throw new RuntimeException("Stub!"); }
/*  28 */     public void startInput(InputConnection ic, EditorInfo attribute) { throw new RuntimeException("Stub!"); }
/*  29 */     public void restartInput(InputConnection ic, EditorInfo attribute) { throw new RuntimeException("Stub!"); }
/*  30 */     public void hideSoftInput(int flags, android.os.ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); }
/*  31 */     public void showSoftInput(int flags, android.os.ResultReceiver resultReceiver) { throw new RuntimeException("Stub!"); }
/*  32 */     public void changeInputMethodSubtype(InputMethodSubtype subtype) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public class InputMethodSessionImpl extends AbstractInputMethodService.AbstractInputMethodSessionImpl {
/*     */     public InputMethodSessionImpl() {
/*  37 */       super();throw new RuntimeException("Stub!"); }
/*  38 */     public void finishInput() { throw new RuntimeException("Stub!"); }
/*  39 */     public void displayCompletions(CompletionInfo[] completions) { throw new RuntimeException("Stub!"); }
/*  40 */     public void updateExtractedText(int token, android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
/*  41 */     public void updateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); }
/*  42 */     public void viewClicked(boolean focusChanged) { throw new RuntimeException("Stub!"); }
/*  43 */     public void updateCursor(Rect newCursor) { throw new RuntimeException("Stub!"); }
/*  44 */     public void appPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/*  45 */     public void toggleSoftInput(int showFlags, int hideFlags) { throw new RuntimeException("Stub!"); }
/*  46 */     public void updateCursorAnchorInfo(CursorAnchorInfo info) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final class Insets { public static final int TOUCHABLE_INSETS_CONTENT = 1;
/*     */     
/*  50 */     public Insets() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int TOUCHABLE_INSETS_FRAME = 0;
/*     */     public static final int TOUCHABLE_INSETS_REGION = 3;
/*     */     public static final int TOUCHABLE_INSETS_VISIBLE = 2;
/*     */     public int contentTopInsets;
/*     */     public int touchableInsets;
/*     */     public final android.graphics.Region touchableRegion;
/*     */     public int visibleTopInsets; }
/*     */   
/*  60 */   public InputMethodService() { throw new RuntimeException("Stub!"); }
/*  61 */   public void setTheme(int theme) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  63 */   public boolean enableHardwareAcceleration() { throw new RuntimeException("Stub!"); }
/*  64 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/*  65 */   public void onInitializeInterface() { throw new RuntimeException("Stub!"); }
/*  66 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/*  67 */   public void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/*  68 */   public AbstractInputMethodService.AbstractInputMethodImpl onCreateInputMethodInterface() { throw new RuntimeException("Stub!"); }
/*  69 */   public AbstractInputMethodService.AbstractInputMethodSessionImpl onCreateInputMethodSessionInterface() { throw new RuntimeException("Stub!"); }
/*  70 */   public android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
/*  71 */   public android.app.Dialog getWindow() { throw new RuntimeException("Stub!"); }
/*  72 */   public void setBackDisposition(int disposition) { throw new RuntimeException("Stub!"); }
/*  73 */   public int getBackDisposition() { throw new RuntimeException("Stub!"); }
/*  74 */   public int getMaxWidth() { throw new RuntimeException("Stub!"); }
/*  75 */   public android.view.inputmethod.InputBinding getCurrentInputBinding() { throw new RuntimeException("Stub!"); }
/*  76 */   public InputConnection getCurrentInputConnection() { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean getCurrentInputStarted() { throw new RuntimeException("Stub!"); }
/*  78 */   public EditorInfo getCurrentInputEditorInfo() { throw new RuntimeException("Stub!"); }
/*  79 */   public void updateFullscreenMode() { throw new RuntimeException("Stub!"); }
/*  80 */   public void onConfigureWindow(android.view.Window win, boolean isFullscreen, boolean isCandidatesOnly) { throw new RuntimeException("Stub!"); }
/*  81 */   public boolean isFullscreenMode() { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean onEvaluateFullscreenMode() { throw new RuntimeException("Stub!"); }
/*  83 */   public void setExtractViewShown(boolean shown) { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean isExtractViewShown() { throw new RuntimeException("Stub!"); }
/*  85 */   public void onComputeInsets(Insets outInsets) { throw new RuntimeException("Stub!"); }
/*  86 */   public void updateInputViewShown() { throw new RuntimeException("Stub!"); }
/*  87 */   public boolean isShowInputRequested() { throw new RuntimeException("Stub!"); }
/*  88 */   public boolean isInputViewShown() { throw new RuntimeException("Stub!"); }
/*  89 */   public boolean onEvaluateInputViewShown() { throw new RuntimeException("Stub!"); }
/*  90 */   public void setCandidatesViewShown(boolean shown) { throw new RuntimeException("Stub!"); }
/*  91 */   public int getCandidatesHiddenVisibility() { throw new RuntimeException("Stub!"); }
/*  92 */   public void showStatusIcon(int iconResId) { throw new RuntimeException("Stub!"); }
/*  93 */   public void hideStatusIcon() { throw new RuntimeException("Stub!"); }
/*  94 */   public void switchInputMethod(String id) { throw new RuntimeException("Stub!"); }
/*  95 */   public void setExtractView(View view) { throw new RuntimeException("Stub!"); }
/*  96 */   public void setCandidatesView(View view) { throw new RuntimeException("Stub!"); }
/*  97 */   public void setInputView(View view) { throw new RuntimeException("Stub!"); }
/*  98 */   public View onCreateExtractTextView() { throw new RuntimeException("Stub!"); }
/*  99 */   public View onCreateCandidatesView() { throw new RuntimeException("Stub!"); }
/* 100 */   public View onCreateInputView() { throw new RuntimeException("Stub!"); }
/* 101 */   public void onStartInputView(EditorInfo info, boolean restarting) { throw new RuntimeException("Stub!"); }
/* 102 */   public void onFinishInputView(boolean finishingInput) { throw new RuntimeException("Stub!"); }
/* 103 */   public void onStartCandidatesView(EditorInfo info, boolean restarting) { throw new RuntimeException("Stub!"); }
/* 104 */   public void onFinishCandidatesView(boolean finishingInput) { throw new RuntimeException("Stub!"); }
/* 105 */   public boolean onShowInputRequested(int flags, boolean configChange) { throw new RuntimeException("Stub!"); }
/* 106 */   public void showWindow(boolean showInput) { throw new RuntimeException("Stub!"); }
/* 107 */   public void hideWindow() { throw new RuntimeException("Stub!"); }
/* 108 */   public void onWindowShown() { throw new RuntimeException("Stub!"); }
/* 109 */   public void onWindowHidden() { throw new RuntimeException("Stub!"); }
/* 110 */   public void onBindInput() { throw new RuntimeException("Stub!"); }
/* 111 */   public void onUnbindInput() { throw new RuntimeException("Stub!"); }
/* 112 */   public void onStartInput(EditorInfo attribute, boolean restarting) { throw new RuntimeException("Stub!"); }
/* 113 */   public void onFinishInput() { throw new RuntimeException("Stub!"); }
/* 114 */   public void onDisplayCompletions(CompletionInfo[] completions) { throw new RuntimeException("Stub!"); }
/* 115 */   public void onUpdateExtractedText(int token, android.view.inputmethod.ExtractedText text) { throw new RuntimeException("Stub!"); }
/* 116 */   public void onUpdateSelection(int oldSelStart, int oldSelEnd, int newSelStart, int newSelEnd, int candidatesStart, int candidatesEnd) { throw new RuntimeException("Stub!"); }
/* 117 */   public void onViewClicked(boolean focusChanged) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 119 */   public void onUpdateCursor(Rect newCursor) { throw new RuntimeException("Stub!"); }
/* 120 */   public void onUpdateCursorAnchorInfo(CursorAnchorInfo cursorAnchorInfo) { throw new RuntimeException("Stub!"); }
/* 121 */   public void requestHideSelf(int flags) { throw new RuntimeException("Stub!"); }
/* 122 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 123 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 124 */   public boolean onKeyMultiple(int keyCode, int count, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 125 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 126 */   public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 127 */   public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 128 */   public void onAppPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/* 129 */   public void sendDownUpKeyEvents(int keyEventCode) { throw new RuntimeException("Stub!"); }
/* 130 */   public boolean sendDefaultEditorAction(boolean fromEnterKey) { throw new RuntimeException("Stub!"); }
/* 131 */   public void sendKeyChar(char charCode) { throw new RuntimeException("Stub!"); }
/* 132 */   public void onExtractedSelectionChanged(int start, int end) { throw new RuntimeException("Stub!"); }
/* 133 */   public void onExtractedTextClicked() { throw new RuntimeException("Stub!"); }
/* 134 */   public void onExtractedCursorMovement(int dx, int dy) { throw new RuntimeException("Stub!"); }
/* 135 */   public boolean onExtractTextContextMenuItem(int id) { throw new RuntimeException("Stub!"); }
/* 136 */   public CharSequence getTextForImeAction(int imeOptions) { throw new RuntimeException("Stub!"); }
/* 137 */   public void onUpdateExtractingVisibility(EditorInfo ei) { throw new RuntimeException("Stub!"); }
/* 138 */   public void onUpdateExtractingViews(EditorInfo ei) { throw new RuntimeException("Stub!"); }
/* 139 */   public void onExtractingInputChanged(EditorInfo ei) { throw new RuntimeException("Stub!"); }
/* 140 */   protected void onCurrentInputMethodSubtypeChanged(InputMethodSubtype newSubtype) { throw new RuntimeException("Stub!"); }
/* 141 */   public int getInputMethodWindowRecommendedHeight() { throw new RuntimeException("Stub!"); }
/* 142 */   protected void dump(java.io.FileDescriptor fd, java.io.PrintWriter fout, String[] args) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\inputmethodservice\InputMethodService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */