/*    */ package android.media.tv;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
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
/*    */ public class TvRecordingClient
/*    */ {
/*    */   public static abstract class RecordingCallback
/*    */   {
/* 22 */     public RecordingCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onConnectionFailed(String inputId) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onDisconnected(String inputId) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onTuned(Uri channelUri) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onRecordingStopped(Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
/* 27 */     public void onError(int error) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 29 */   public TvRecordingClient(Context context, String tag, RecordingCallback callback, Handler handler) { throw new RuntimeException("Stub!"); }
/* 30 */   public void tune(String inputId, Uri channelUri) { throw new RuntimeException("Stub!"); }
/* 31 */   public void tune(String inputId, Uri channelUri, Bundle params) { throw new RuntimeException("Stub!"); }
/* 32 */   public void release() { throw new RuntimeException("Stub!"); }
/* 33 */   public void startRecording(Uri programUri) { throw new RuntimeException("Stub!"); }
/* 34 */   public void stopRecording() { throw new RuntimeException("Stub!"); }
/* 35 */   public void sendAppPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\tv\TvRecordingClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */