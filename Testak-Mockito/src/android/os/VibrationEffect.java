/*    */ package android.os;
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
/*    */ public abstract class VibrationEffect
/*    */   implements Parcelable
/*    */ {
/* 21 */   VibrationEffect() { throw new RuntimeException("Stub!"); }
/* 22 */   public static VibrationEffect createOneShot(long milliseconds, int amplitude) { throw new RuntimeException("Stub!"); }
/* 23 */   public static VibrationEffect createWaveform(long[] timings, int repeat) { throw new RuntimeException("Stub!"); }
/* 24 */   public static VibrationEffect createWaveform(long[] timings, int[] amplitudes, int repeat) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 28 */   public static final Parcelable.Creator<VibrationEffect> CREATOR = null;
/*    */   public static final int DEFAULT_AMPLITUDE = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\os\VibrationEffect.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */