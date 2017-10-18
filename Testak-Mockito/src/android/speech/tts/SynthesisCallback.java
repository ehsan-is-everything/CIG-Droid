/*    */ package android.speech.tts;
/*    */ 
/*    */ 
/*    */ public abstract interface SynthesisCallback
/*    */ {
/*    */   public abstract int getMaxBufferSize();
/*    */   
/*    */ 
/*    */   public abstract int start(int paramInt1, int paramInt2, int paramInt3);
/*    */   
/*    */ 
/*    */   public abstract int audioAvailable(byte[] paramArrayOfByte, int paramInt1, int paramInt2);
/*    */   
/*    */ 
/*    */   public abstract int done();
/*    */   
/*    */   public abstract void error();
/*    */   
/*    */   public abstract void error(int paramInt);
/*    */   
/*    */   public abstract boolean hasStarted();
/*    */   
/*    */   public abstract boolean hasFinished();
/*    */   
/*    */   public void rangeStart(int markerInFrames, int start, int end)
/*    */   {
/* 27 */     throw new RuntimeException("Stub!");
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\speech\tts\SynthesisCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */