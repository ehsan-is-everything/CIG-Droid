/*    */ package android.hardware.camera2.params;
/*    */ 
/*    */ import android.util.Range;
/*    */ import android.util.Size;
/*    */ import android.view.Surface;
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
/*    */ public final class StreamConfigurationMap
/*    */ {
/* 20 */   StreamConfigurationMap() { throw new RuntimeException("Stub!"); }
/* 21 */   public final int[] getOutputFormats() { throw new RuntimeException("Stub!"); }
/* 22 */   public final int[] getValidOutputFormatsForInput(int inputFormat) { throw new RuntimeException("Stub!"); }
/* 23 */   public final int[] getInputFormats() { throw new RuntimeException("Stub!"); }
/* 24 */   public Size[] getInputSizes(int format) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isOutputSupportedFor(int format) { throw new RuntimeException("Stub!"); }
/* 26 */   public static <T> boolean isOutputSupportedFor(Class<T> klass) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isOutputSupportedFor(Surface surface) { throw new RuntimeException("Stub!"); }
/* 28 */   public <T> Size[] getOutputSizes(Class<T> klass) { throw new RuntimeException("Stub!"); }
/* 29 */   public Size[] getOutputSizes(int format) { throw new RuntimeException("Stub!"); }
/* 30 */   public Size[] getHighSpeedVideoSizes() { throw new RuntimeException("Stub!"); }
/* 31 */   public Range<Integer>[] getHighSpeedVideoFpsRangesFor(Size size) { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public Range<Integer>[] getHighSpeedVideoFpsRanges() { throw new RuntimeException("Stub!"); }
/* 34 */   public Size[] getHighSpeedVideoSizesFor(Range<Integer> fpsRange) { throw new RuntimeException("Stub!"); }
/* 35 */   public Size[] getHighResolutionOutputSizes(int format) { throw new RuntimeException("Stub!"); }
/* 36 */   public long getOutputMinFrameDuration(int format, Size size) { throw new RuntimeException("Stub!"); }
/* 37 */   public <T> long getOutputMinFrameDuration(Class<T> klass, Size size) { throw new RuntimeException("Stub!"); }
/* 38 */   public long getOutputStallDuration(int format, Size size) { throw new RuntimeException("Stub!"); }
/* 39 */   public <T> long getOutputStallDuration(Class<T> klass, Size size) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 41 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\hardware\camera2\params\StreamConfigurationMap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */