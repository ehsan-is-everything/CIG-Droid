/*    */ package android.media;
/*    */ 
/*    */ import android.os.Handler;
/*    */ import android.view.Surface;
/*    */ import java.nio.ByteBuffer;
/*    */ 
/*    */ 
/*    */ public final class MediaSync
/*    */ {
/*    */   public static final int MEDIASYNC_ERROR_AUDIOTRACK_FAIL = 1;
/*    */   public static final int MEDIASYNC_ERROR_SURFACE_FAIL = 2;
/*    */   
/*    */   public static abstract interface OnErrorListener
/*    */   {
/*    */     public abstract void onError(MediaSync paramMediaSync, int paramInt1, int paramInt2);
/*    */   }
/*    */   
/*    */   public static abstract class Callback
/*    */   {
/*    */     public Callback()
/*    */     {
/* 22 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */     
/*    */ 
/*    */     public abstract void onAudioBufferConsumed(MediaSync paramMediaSync, ByteBuffer paramByteBuffer, int paramInt);
/*    */   }
/*    */   
/* 29 */   public MediaSync() { throw new RuntimeException("Stub!"); }
/* 30 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 31 */   public final void release() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setCallback(Callback cb, Handler handler) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setOnErrorListener(OnErrorListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setAudioTrack(AudioTrack audioTrack) { throw new RuntimeException("Stub!"); }
/*    */   public final native Surface createInputSurface();
/* 37 */   public void setPlaybackParams(PlaybackParams params) { throw new RuntimeException("Stub!"); }
/*    */   public native PlaybackParams getPlaybackParams();
/* 39 */   public void setSyncParams(SyncParams params) { throw new RuntimeException("Stub!"); }
/*    */   public native SyncParams getSyncParams();
/* 41 */   public void flush() { throw new RuntimeException("Stub!"); }
/* 42 */   public MediaTimestamp getTimestamp() { throw new RuntimeException("Stub!"); }
/* 43 */   public void queueAudio(ByteBuffer audioData, int bufferId, long presentationTimeUs) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\MediaSync.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */