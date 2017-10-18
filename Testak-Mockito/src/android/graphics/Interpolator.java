/*    */ package android.graphics;
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
/*    */ public class Interpolator
/*    */ {
/*    */   public static enum Result
/*    */   {
/* 22 */     FREEZE_END, 
/* 23 */     FREEZE_START, 
/* 24 */     NORMAL;
/*    */     private Result() {} }
/* 26 */   public Interpolator(int valueCount) { throw new RuntimeException("Stub!"); }
/* 27 */   public Interpolator(int valueCount, int frameCount) { throw new RuntimeException("Stub!"); }
/* 28 */   public void reset(int valueCount) { throw new RuntimeException("Stub!"); }
/* 29 */   public void reset(int valueCount, int frameCount) { throw new RuntimeException("Stub!"); }
/* 30 */   public final int getKeyFrameCount() { throw new RuntimeException("Stub!"); }
/* 31 */   public final int getValueCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setKeyFrame(int index, int msec, float[] values) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setKeyFrame(int index, int msec, float[] values, float[] blend) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setRepeatMirror(float repeatCount, boolean mirror) { throw new RuntimeException("Stub!"); }
/* 35 */   public Result timeToValues(float[] values) { throw new RuntimeException("Stub!"); }
/* 36 */   public Result timeToValues(int msec, float[] values) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Interpolator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */