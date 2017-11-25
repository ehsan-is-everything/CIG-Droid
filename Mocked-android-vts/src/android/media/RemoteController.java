/*    */ package android.media;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Looper;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public final class RemoteController
/*    */ {
/*    */   public static final int POSITION_SYNCHRONIZATION_CHECK = 1;
/*    */   public static final int POSITION_SYNCHRONIZATION_NONE = 0;
/*    */   
/*    */   public class MetadataEditor
/*    */     extends MediaMetadataEditor
/*    */   {
/* 32 */     MetadataEditor() { throw new RuntimeException("Stub!"); }
/* 33 */     public synchronized void apply() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 35 */   public RemoteController(Context context, OnClientUpdateListener updateListener) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 36 */   public RemoteController(Context context, OnClientUpdateListener updateListener, Looper looper) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 37 */   public long getEstimatedMediaPosition() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean sendMediaKeyEvent(KeyEvent keyEvent) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean seekTo(long timeMs) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean setArtworkConfiguration(int width, int height) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean clearArtworkConfiguration() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean setSynchronizationMode(int sync) throws IllegalArgumentException { throw new RuntimeException("Stub!"); }
/* 43 */   public MetadataEditor editMetadata() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnClientUpdateListener
/*    */   {
/*    */     public abstract void onClientChange(boolean paramBoolean);
/*    */     
/*    */     public abstract void onClientPlaybackStateUpdate(int paramInt);
/*    */     
/*    */     public abstract void onClientPlaybackStateUpdate(int paramInt, long paramLong1, long paramLong2, float paramFloat);
/*    */     
/*    */     public abstract void onClientTransportControlUpdate(int paramInt);
/*    */     
/*    */     public abstract void onClientMetadataUpdate(RemoteController.MetadataEditor paramMetadataEditor);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\RemoteController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */