/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public final class VoiceInteractor
/*    */ {
/*    */   public static abstract class Request
/*    */   {
/* 22 */     Request() { throw new RuntimeException("Stub!"); }
/* 23 */     public String getName() { throw new RuntimeException("Stub!"); }
/* 24 */     public void cancel() { throw new RuntimeException("Stub!"); }
/* 25 */     public Context getContext() { throw new RuntimeException("Stub!"); }
/* 26 */     public Activity getActivity() { throw new RuntimeException("Stub!"); }
/* 27 */     public void onCancel() { throw new RuntimeException("Stub!"); }
/* 28 */     public void onAttached(Activity activity) { throw new RuntimeException("Stub!"); }
/* 29 */     public void onDetached() { throw new RuntimeException("Stub!"); }
/* 30 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class ConfirmationRequest
/*    */     extends VoiceInteractor.Request {
/* 35 */     public ConfirmationRequest(VoiceInteractor.Prompt prompt, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 36 */     public void onConfirmationResult(boolean confirmed, Bundle result) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class PickOptionRequest extends VoiceInteractor.Request
/*    */   {
/*    */     public static final class Option
/*    */       implements Parcelable
/*    */     {
/* 44 */       public Option(CharSequence label, int index) { throw new RuntimeException("Stub!"); }
/* 45 */       public Option addSynonym(CharSequence synonym) { throw new RuntimeException("Stub!"); }
/* 46 */       public CharSequence getLabel() { throw new RuntimeException("Stub!"); }
/* 47 */       public int getIndex() { throw new RuntimeException("Stub!"); }
/* 48 */       public int countSynonyms() { throw new RuntimeException("Stub!"); }
/* 49 */       public CharSequence getSynonymAt(int index) { throw new RuntimeException("Stub!"); }
/* 50 */       public void setExtras(Bundle extras) { throw new RuntimeException("Stub!"); }
/* 51 */       public Bundle getExtras() { throw new RuntimeException("Stub!"); }
/* 52 */       public int describeContents() { throw new RuntimeException("Stub!"); }
/* 53 */       public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */       
/* 55 */       public static final Parcelable.Creator<Option> CREATOR = null; }
/*    */     
/* 57 */     public PickOptionRequest(VoiceInteractor.Prompt prompt, Option[] options, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 58 */     public void onPickOptionResult(boolean finished, Option[] selections, Bundle result) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class CompleteVoiceRequest
/*    */     extends VoiceInteractor.Request {
/* 63 */     public CompleteVoiceRequest(VoiceInteractor.Prompt prompt, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 64 */     public void onCompleteResult(Bundle result) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class AbortVoiceRequest
/*    */     extends VoiceInteractor.Request {
/* 69 */     public AbortVoiceRequest(VoiceInteractor.Prompt prompt, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 70 */     public void onAbortResult(Bundle result) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class CommandRequest
/*    */     extends VoiceInteractor.Request {
/* 75 */     public CommandRequest(String command, Bundle args) { throw new RuntimeException("Stub!"); }
/* 76 */     public void onCommandResult(boolean isCompleted, Bundle result) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static class Prompt
/*    */     implements Parcelable {
/* 81 */     public Prompt(CharSequence[] voicePrompts, CharSequence visualPrompt) { throw new RuntimeException("Stub!"); }
/* 82 */     public Prompt(CharSequence prompt) { throw new RuntimeException("Stub!"); }
/* 83 */     public CharSequence getVoicePromptAt(int index) { throw new RuntimeException("Stub!"); }
/* 84 */     public int countVoicePrompts() { throw new RuntimeException("Stub!"); }
/* 85 */     public CharSequence getVisualPrompt() { throw new RuntimeException("Stub!"); }
/* 86 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 87 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 88 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/* 90 */     public static final Parcelable.Creator<Prompt> CREATOR = null; }
/*    */   
/* 92 */   VoiceInteractor() { throw new RuntimeException("Stub!"); }
/* 93 */   public boolean submitRequest(Request request) { throw new RuntimeException("Stub!"); }
/* 94 */   public boolean submitRequest(Request request, String name) { throw new RuntimeException("Stub!"); }
/* 95 */   public Request[] getActiveRequests() { throw new RuntimeException("Stub!"); }
/* 96 */   public Request getActiveRequest(String name) { throw new RuntimeException("Stub!"); }
/* 97 */   public boolean[] supportsCommands(String[] commands) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\VoiceInteractor.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */