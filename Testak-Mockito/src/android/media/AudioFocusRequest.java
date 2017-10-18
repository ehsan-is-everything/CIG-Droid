/*    */ package android.media;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AudioFocusRequest
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 22 */     public Builder(int focusGain) { throw new RuntimeException("Stub!"); }
/* 23 */     public Builder(AudioFocusRequest requestToCopy) { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setFocusGain(int focusGain) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setOnAudioFocusChangeListener(AudioManager.OnAudioFocusChangeListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setAudioAttributes(AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setWillPauseWhenDucked(boolean pauseOnDuck) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setAcceptsDelayedFocusGain(boolean acceptsDelayedFocusGain) { throw new RuntimeException("Stub!"); }
/* 30 */     public AudioFocusRequest build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 32 */   AudioFocusRequest() { throw new RuntimeException("Stub!"); }
/* 33 */   public AudioAttributes getAudioAttributes() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getFocusGain() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean willPauseWhenDucked() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean acceptsDelayedFocusGain() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\AudioFocusRequest.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */