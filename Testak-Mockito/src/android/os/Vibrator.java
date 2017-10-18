/*    */ package android.os;
/*    */ 
/*    */ import android.media.AudioAttributes;
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
/*    */ public abstract class Vibrator
/*    */ {
/* 20 */   Vibrator() { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean hasVibrator();
/*    */   public abstract boolean hasAmplitudeControl();
/*    */   @Deprecated
/* 24 */   public void vibrate(long milliseconds) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 26 */   public void vibrate(long milliseconds, AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 28 */   public void vibrate(long[] pattern, int repeat) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public void vibrate(long[] pattern, int repeat, AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
/* 31 */   public void vibrate(VibrationEffect vibe) { throw new RuntimeException("Stub!"); }
/* 32 */   public void vibrate(VibrationEffect vibe, AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void cancel();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\Vibrator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */