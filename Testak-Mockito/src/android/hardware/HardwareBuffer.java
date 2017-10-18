/*    */ package android.hardware;
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
/*    */ public final class HardwareBuffer
/*    */   implements Parcelable, AutoCloseable
/*    */ {
/*    */   public static final int BLOB = 33;
/*    */   
/* 21 */   HardwareBuffer() { throw new RuntimeException("Stub!"); }
/* 22 */   public static HardwareBuffer create(int width, int height, int format, int layers, long usage) { throw new RuntimeException("Stub!"); }
/* 23 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 24 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getFormat() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getLayers() { throw new RuntimeException("Stub!"); }
/* 28 */   public long getUsage() { throw new RuntimeException("Stub!"); }
/* 29 */   public void close() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 31 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 32 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
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
/* 51 */   public static final Parcelable.Creator<HardwareBuffer> CREATOR = null;
/*    */   public static final int RGBA_1010102 = 43;
/*    */   public static final int RGBA_8888 = 1;
/*    */   public static final int RGBA_FP16 = 22;
/*    */   public static final int RGBX_8888 = 2;
/*    */   public static final int RGB_565 = 4;
/*    */   public static final int RGB_888 = 3;
/*    */   public static final long USAGE_CPU_READ_OFTEN = 3L;
/*    */   public static final long USAGE_CPU_READ_RARELY = 2L;
/*    */   public static final long USAGE_CPU_WRITE_OFTEN = 48L;
/*    */   public static final long USAGE_CPU_WRITE_RARELY = 32L;
/*    */   public static final long USAGE_GPU_COLOR_OUTPUT = 512L;
/*    */   public static final long USAGE_GPU_DATA_BUFFER = 16777216L;
/*    */   public static final long USAGE_GPU_SAMPLED_IMAGE = 256L;
/*    */   public static final long USAGE_PROTECTED_CONTENT = 16384L;
/*    */   public static final long USAGE_SENSOR_DIRECT_DATA = 8388608L;
/*    */   public static final long USAGE_VIDEO_ENCODE = 65536L;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\hardware\HardwareBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */