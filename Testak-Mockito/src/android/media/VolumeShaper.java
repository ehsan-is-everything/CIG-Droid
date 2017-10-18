/*    */ package android.media;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public final class VolumeShaper
/*    */   implements AutoCloseable
/*    */ {
/*    */   public static final class Configuration
/*    */     implements Parcelable
/*    */   {
/*    */     public static final class Builder
/*    */     {
/* 25 */       public Builder() { throw new RuntimeException("Stub!"); }
/* 26 */       public Builder(VolumeShaper.Configuration configuration) { throw new RuntimeException("Stub!"); }
/* 27 */       public Builder setInterpolatorType(int interpolatorType) { throw new RuntimeException("Stub!"); }
/* 28 */       public Builder setDuration(long durationMillis) { throw new RuntimeException("Stub!"); }
/* 29 */       public Builder setCurve(float[] times, float[] volumes) { throw new RuntimeException("Stub!"); }
/* 30 */       public Builder reflectTimes() { throw new RuntimeException("Stub!"); }
/* 31 */       public Builder invertVolumes() { throw new RuntimeException("Stub!"); }
/* 32 */       public Builder scaleToEndVolume(float volume) { throw new RuntimeException("Stub!"); }
/* 33 */       public Builder scaleToStartVolume(float volume) { throw new RuntimeException("Stub!"); }
/* 34 */       public VolumeShaper.Configuration build() { throw new RuntimeException("Stub!"); } }
/*    */     
/* 36 */     Configuration() { throw new RuntimeException("Stub!"); }
/* 37 */     public static int getMaximumCurvePoints() { throw new RuntimeException("Stub!"); }
/* 38 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 39 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 40 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 41 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 42 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 43 */     public int getInterpolatorType() { throw new RuntimeException("Stub!"); }
/* 44 */     public long getDuration() { throw new RuntimeException("Stub!"); }
/* 45 */     public float[] getTimes() { throw new RuntimeException("Stub!"); }
/* 46 */     public float[] getVolumes() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 56 */     public static final Configuration SINE_RAMP = null; public static final Configuration SCURVE_RAMP = null; public static final Configuration LINEAR_RAMP = null; public static final int INTERPOLATOR_TYPE_STEP = 0; public static final int INTERPOLATOR_TYPE_LINEAR = 1; public static final int INTERPOLATOR_TYPE_CUBIC_MONOTONIC = 3; public static final int INTERPOLATOR_TYPE_CUBIC = 2; public static final Configuration CUBIC_RAMP = null; public static final Parcelable.Creator<Configuration> CREATOR = null;
/*    */   }
/*    */   
/*    */   public static final class Operation
/*    */     implements Parcelable {
/* 61 */     Operation() { throw new RuntimeException("Stub!"); }
/* 62 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 63 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 64 */     public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 65 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 66 */     public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/* 70 */     public static final Operation REVERSE = null; public static final Operation PLAY = null; public static final Parcelable.Creator<Operation> CREATOR = null; }
/*    */   
/* 72 */   VolumeShaper() { throw new RuntimeException("Stub!"); }
/* 73 */   public void apply(Operation operation) { throw new RuntimeException("Stub!"); }
/* 74 */   public void replace(Configuration configuration, Operation operation, boolean join) { throw new RuntimeException("Stub!"); }
/* 75 */   public float getVolume() { throw new RuntimeException("Stub!"); }
/* 76 */   public void close() { throw new RuntimeException("Stub!"); }
/* 77 */   protected void finalize() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\media\VolumeShaper.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */