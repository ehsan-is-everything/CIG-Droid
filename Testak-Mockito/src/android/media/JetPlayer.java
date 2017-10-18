/*    */ package android.media;
/*    */ 
/*    */ import android.content.res.AssetFileDescriptor;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class JetPlayer
/*    */ {
/* 27 */   JetPlayer() { throw new RuntimeException("Stub!"); }
/* 28 */   public static JetPlayer getJetPlayer() { throw new RuntimeException("Stub!"); }
/* 29 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/* 30 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/* 31 */   public void release() { throw new RuntimeException("Stub!"); }
/* 32 */   public static int getMaxTracks() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean loadJetFile(String path) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean loadJetFile(AssetFileDescriptor afd) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean closeJetFile() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean play() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean pause() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean queueJetSegment(int segmentNum, int libNum, int repeatCount, int transpose, int muteFlags, byte userID) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean queueJetSegmentMuteArray(int segmentNum, int libNum, int repeatCount, int transpose, boolean[] muteArray, byte userID) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean setMuteFlags(int muteFlags, boolean sync) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean setMuteArray(boolean[] muteArray, boolean sync) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean setMuteFlag(int trackId, boolean muteFlag, boolean sync) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean triggerClip(int clipId) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean clearQueue() { throw new RuntimeException("Stub!"); }
/* 45 */   public void setEventListener(OnJetEventListener listener) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setEventListener(OnJetEventListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnJetEventListener
/*    */   {
/*    */     public abstract void onJetEvent(JetPlayer paramJetPlayer, short paramShort, byte paramByte1, byte paramByte2, byte paramByte3, byte paramByte4);
/*    */     
/*    */     public abstract void onJetUserIdUpdate(JetPlayer paramJetPlayer, int paramInt1, int paramInt2);
/*    */     
/*    */     public abstract void onJetNumQueuedSegmentUpdate(JetPlayer paramJetPlayer, int paramInt);
/*    */     
/*    */     public abstract void onJetPauseUpdate(JetPlayer paramJetPlayer, int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\JetPlayer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */