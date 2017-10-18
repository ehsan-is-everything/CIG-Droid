/*     */ package android.service.voice;
/*     */ 
/*     */ import android.app.VoiceInteractor.PickOptionRequest.Option;
/*     */ import android.app.assist.AssistContent;
/*     */ import android.app.assist.AssistStructure;
/*     */ import android.content.Context;
/*     */ import android.content.Intent;
/*     */ import android.os.Bundle;
/*     */ import android.view.KeyEvent;
/*     */ 
/*     */ 
/*     */ public class VoiceInteractionSession
/*     */   implements android.view.KeyEvent.Callback, android.content.ComponentCallbacks2
/*     */ {
/*     */   public static final int SHOW_SOURCE_ACTIVITY = 16;
/*     */   public static final int SHOW_SOURCE_APPLICATION = 8;
/*     */   public static final int SHOW_SOURCE_ASSIST_GESTURE = 4;
/*     */   public static final int SHOW_WITH_ASSIST = 1;
/*     */   public static final int SHOW_WITH_SCREENSHOT = 2;
/*     */   
/*     */   public static class Request
/*     */   {
/*  23 */     Request() { throw new RuntimeException("Stub!"); }
/*  24 */     public int getCallingUid() { throw new RuntimeException("Stub!"); }
/*  25 */     public String getCallingPackage() { throw new RuntimeException("Stub!"); }
/*  26 */     public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/*  27 */     public boolean isActive() { throw new RuntimeException("Stub!"); }
/*  28 */     public void cancel() { throw new RuntimeException("Stub!"); }
/*  29 */     public String toString() { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class ConfirmationRequest
/*     */     extends VoiceInteractionSession.Request {
/*  34 */     ConfirmationRequest() { throw new RuntimeException("Stub!"); }
/*  35 */     public android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/*  37 */     public CharSequence getPrompt() { throw new RuntimeException("Stub!"); }
/*  38 */     public void sendConfirmationResult(boolean confirmed, Bundle result) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class PickOptionRequest
/*     */     extends VoiceInteractionSession.Request {
/*  43 */     PickOptionRequest() { throw new RuntimeException("Stub!"); }
/*  44 */     public android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/*  46 */     public CharSequence getPrompt() { throw new RuntimeException("Stub!"); }
/*  47 */     public VoiceInteractor.PickOptionRequest.Option[] getOptions() { throw new RuntimeException("Stub!"); }
/*  48 */     public void sendIntermediatePickOptionResult(VoiceInteractor.PickOptionRequest.Option[] selections, Bundle result) { throw new RuntimeException("Stub!"); }
/*  49 */     public void sendPickOptionResult(VoiceInteractor.PickOptionRequest.Option[] selections, Bundle result) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class CompleteVoiceRequest
/*     */     extends VoiceInteractionSession.Request {
/*  54 */     CompleteVoiceRequest() { throw new RuntimeException("Stub!"); }
/*  55 */     public android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/*  57 */     public CharSequence getMessage() { throw new RuntimeException("Stub!"); }
/*  58 */     public void sendCompleteResult(Bundle result) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class AbortVoiceRequest
/*     */     extends VoiceInteractionSession.Request {
/*  63 */     AbortVoiceRequest() { throw new RuntimeException("Stub!"); }
/*  64 */     public android.app.VoiceInteractor.Prompt getVoicePrompt() { throw new RuntimeException("Stub!"); }
/*     */     @Deprecated
/*  66 */     public CharSequence getMessage() { throw new RuntimeException("Stub!"); }
/*  67 */     public void sendAbortResult(Bundle result) { throw new RuntimeException("Stub!"); }
/*     */   }
/*     */   
/*     */   public static final class CommandRequest
/*     */     extends VoiceInteractionSession.Request {
/*  72 */     CommandRequest() { throw new RuntimeException("Stub!"); }
/*  73 */     public String getCommand() { throw new RuntimeException("Stub!"); }
/*  74 */     public void sendIntermediateResult(Bundle result) { throw new RuntimeException("Stub!"); }
/*  75 */     public void sendResult(Bundle result) { throw new RuntimeException("Stub!"); } }
/*     */   
/*     */   public static final class Insets { public static final int TOUCHABLE_INSETS_CONTENT = 1;
/*     */     
/*  79 */     public Insets() { throw new RuntimeException("Stub!"); }
/*     */     
/*     */     public static final int TOUCHABLE_INSETS_FRAME = 0;
/*     */     public static final int TOUCHABLE_INSETS_REGION = 3;
/*     */     public final android.graphics.Rect contentInsets;
/*     */     public int touchableInsets;
/*     */     public final android.graphics.Region touchableRegion; }
/*     */   
/*  87 */   public VoiceInteractionSession(Context context) { throw new RuntimeException("Stub!"); }
/*  88 */   public VoiceInteractionSession(Context context, android.os.Handler handler) { throw new RuntimeException("Stub!"); }
/*  89 */   public Context getContext() { throw new RuntimeException("Stub!"); }
/*  90 */   public void setDisabledShowContext(int flags) { throw new RuntimeException("Stub!"); }
/*  91 */   public int getDisabledShowContext() { throw new RuntimeException("Stub!"); }
/*  92 */   public int getUserDisabledShowContext() { throw new RuntimeException("Stub!"); }
/*  93 */   public void show(Bundle args, int flags) { throw new RuntimeException("Stub!"); }
/*  94 */   public void hide() { throw new RuntimeException("Stub!"); }
/*  95 */   public void setUiEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/*  96 */   public void setTheme(int theme) { throw new RuntimeException("Stub!"); }
/*  97 */   public void startVoiceActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/*  98 */   public void startAssistantActivity(Intent intent) { throw new RuntimeException("Stub!"); }
/*  99 */   public void setKeepAwake(boolean keepAwake) { throw new RuntimeException("Stub!"); }
/* 100 */   public void closeSystemDialogs() { throw new RuntimeException("Stub!"); }
/* 101 */   public android.view.LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
/* 102 */   public android.app.Dialog getWindow() { throw new RuntimeException("Stub!"); }
/* 103 */   public void finish() { throw new RuntimeException("Stub!"); }
/* 104 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 105 */   public void onPrepareShow(Bundle args, int showFlags) { throw new RuntimeException("Stub!"); }
/* 106 */   public void onShow(Bundle args, int showFlags) { throw new RuntimeException("Stub!"); }
/* 107 */   public void onHide() { throw new RuntimeException("Stub!"); }
/* 108 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/* 109 */   public android.view.View onCreateContentView() { throw new RuntimeException("Stub!"); }
/* 110 */   public void setContentView(android.view.View view) { throw new RuntimeException("Stub!"); }
/* 111 */   public void onAssistStructureFailure(Throwable failure) { throw new RuntimeException("Stub!"); }
/* 112 */   public void onHandleAssist(Bundle data, AssistStructure structure, AssistContent content) { throw new RuntimeException("Stub!"); }
/* 113 */   public void onHandleAssistSecondary(Bundle data, AssistStructure structure, AssistContent content, int index, int count) { throw new RuntimeException("Stub!"); }
/* 114 */   public void onHandleScreenshot(android.graphics.Bitmap screenshot) { throw new RuntimeException("Stub!"); }
/* 115 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 116 */   public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 117 */   public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 118 */   public boolean onKeyMultiple(int keyCode, int count, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 119 */   public void onBackPressed() { throw new RuntimeException("Stub!"); }
/* 120 */   public void onCloseSystemDialogs() { throw new RuntimeException("Stub!"); }
/* 121 */   public void onLockscreenShown() { throw new RuntimeException("Stub!"); }
/* 122 */   public void onConfigurationChanged(android.content.res.Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 123 */   public void onLowMemory() { throw new RuntimeException("Stub!"); }
/* 124 */   public void onTrimMemory(int level) { throw new RuntimeException("Stub!"); }
/* 125 */   public void onComputeInsets(Insets outInsets) { throw new RuntimeException("Stub!"); }
/* 126 */   public void onTaskStarted(Intent intent, int taskId) { throw new RuntimeException("Stub!"); }
/* 127 */   public void onTaskFinished(Intent intent, int taskId) { throw new RuntimeException("Stub!"); }
/* 128 */   public boolean[] onGetSupportedCommands(String[] commands) { throw new RuntimeException("Stub!"); }
/* 129 */   public void onRequestConfirmation(ConfirmationRequest request) { throw new RuntimeException("Stub!"); }
/* 130 */   public void onRequestPickOption(PickOptionRequest request) { throw new RuntimeException("Stub!"); }
/* 131 */   public void onRequestCompleteVoice(CompleteVoiceRequest request) { throw new RuntimeException("Stub!"); }
/* 132 */   public void onRequestAbortVoice(AbortVoiceRequest request) { throw new RuntimeException("Stub!"); }
/* 133 */   public void onRequestCommand(CommandRequest request) { throw new RuntimeException("Stub!"); }
/* 134 */   public void onCancelRequest(Request request) { throw new RuntimeException("Stub!"); }
/* 135 */   public void dump(String prefix, java.io.FileDescriptor fd, java.io.PrintWriter writer, String[] args) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\voice\VoiceInteractionSession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */