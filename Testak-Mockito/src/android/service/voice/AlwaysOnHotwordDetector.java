/*    */ package android.service.voice;
/*    */ 
/*    */ import android.content.Intent;
/*    */ import android.media.AudioFormat;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AlwaysOnHotwordDetector
/*    */ {
/*    */   public static final int RECOGNITION_FLAG_ALLOW_MULTIPLE_TRIGGERS = 2;
/*    */   public static final int RECOGNITION_FLAG_CAPTURE_TRIGGER_AUDIO = 1;
/*    */   public static final int RECOGNITION_MODE_USER_IDENTIFICATION = 2;
/*    */   public static final int RECOGNITION_MODE_VOICE_TRIGGER = 1;
/*    */   public static final int STATE_HARDWARE_UNAVAILABLE = -2;
/*    */   public static final int STATE_KEYPHRASE_ENROLLED = 2;
/*    */   public static final int STATE_KEYPHRASE_UNENROLLED = 1;
/*    */   public static final int STATE_KEYPHRASE_UNSUPPORTED = -1;
/*    */   
/*    */   public static class EventPayload
/*    */   {
/* 22 */     EventPayload() { throw new RuntimeException("Stub!"); }
/* 23 */     public AudioFormat getCaptureAudioFormat() { throw new RuntimeException("Stub!"); }
/* 24 */     public byte[] getTriggerAudio() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class Callback {
/* 28 */     public Callback() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void onAvailabilityChanged(int paramInt);
/*    */     public abstract void onDetected(AlwaysOnHotwordDetector.EventPayload paramEventPayload);
/*    */     public abstract void onError();
/*    */     public abstract void onRecognitionPaused();
/*    */     public abstract void onRecognitionResumed(); }
/* 35 */   AlwaysOnHotwordDetector() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getSupportedRecognitionModes() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean startRecognition(int recognitionFlags) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean stopRecognition() { throw new RuntimeException("Stub!"); }
/* 39 */   public Intent createEnrollIntent() { throw new RuntimeException("Stub!"); }
/* 40 */   public Intent createUnEnrollIntent() { throw new RuntimeException("Stub!"); }
/* 41 */   public Intent createReEnrollIntent() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\voice\AlwaysOnHotwordDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */