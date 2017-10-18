/*    */ package android.speech.tts;
/*    */ 
/*    */ 
/*    */ public abstract class UtteranceProgressListener
/*    */ {
/*  6 */   public UtteranceProgressListener() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onStart(String paramString);
/*    */   public abstract void onDone(String paramString);
/*    */   @Deprecated
/*    */   public abstract void onError(String paramString);
/* 11 */   public void onError(String utteranceId, int errorCode) { throw new RuntimeException("Stub!"); }
/* 12 */   public void onStop(String utteranceId, boolean interrupted) { throw new RuntimeException("Stub!"); }
/* 13 */   public void onBeginSynthesis(String utteranceId, int sampleRateInHz, int audioFormat, int channelCount) { throw new RuntimeException("Stub!"); }
/* 14 */   public void onAudioAvailable(String utteranceId, byte[] audio) { throw new RuntimeException("Stub!"); }
/* 15 */   public void onRangeStart(String utteranceId, int start, int end, int frame) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\speech\tts\UtteranceProgressListener.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */