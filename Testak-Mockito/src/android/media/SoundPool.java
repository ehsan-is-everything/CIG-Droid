/*    */ package android.media;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.AssetFileDescriptor;
/*    */ import java.io.FileDescriptor;
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
/*    */ 
/*    */ 
/*    */ public class SoundPool
/*    */ {
/*    */   public static class Builder
/*    */   {
/* 26 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setMaxStreams(int maxStreams) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setAudioAttributes(AudioAttributes attributes) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 29 */     public SoundPool build() { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   @Deprecated
/* 32 */   public SoundPool(int maxStreams, int streamType, int srcQuality) { throw new RuntimeException("Stub!"); }
/* 33 */   public final void release() { throw new RuntimeException("Stub!"); }
/* 34 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 35 */   public int load(String path, int priority) { throw new RuntimeException("Stub!"); }
/* 36 */   public int load(Context context, int resId, int priority) { throw new RuntimeException("Stub!"); }
/* 37 */   public int load(AssetFileDescriptor afd, int priority) { throw new RuntimeException("Stub!"); }
/* 38 */   public int load(FileDescriptor fd, long offset, long length, int priority) { throw new RuntimeException("Stub!"); }
/*    */   public final native boolean unload(int paramInt);
/* 40 */   public final int play(int soundID, float leftVolume, float rightVolume, int priority, int loop, float rate) { throw new RuntimeException("Stub!"); }
/*    */   public final native void pause(int paramInt);
/*    */   public final native void resume(int paramInt);
/*    */   public final native void autoPause();
/*    */   public final native void autoResume();
/*    */   public final native void stop(int paramInt);
/* 46 */   public final void setVolume(int streamID, float leftVolume, float rightVolume) { throw new RuntimeException("Stub!"); }
/*    */   public final native void setPriority(int paramInt1, int paramInt2);
/*    */   public final native void setLoop(int paramInt1, int paramInt2);
/*    */   public final native void setRate(int paramInt, float paramFloat);
/* 50 */   public void setOnLoadCompleteListener(OnLoadCompleteListener listener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnLoadCompleteListener
/*    */   {
/*    */     public abstract void onLoadComplete(SoundPool paramSoundPool, int paramInt1, int paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\SoundPool.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */