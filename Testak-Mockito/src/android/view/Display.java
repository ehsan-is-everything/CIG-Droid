/*    */ package android.view;
/*    */ 
/*    */ import android.graphics.Point;
/*    */ 
/*    */ public final class Display
/*    */ {
/*    */   public static final int DEFAULT_DISPLAY = 0;
/*    */   public static final int FLAG_PRESENTATION = 8;
/*    */   public static final int FLAG_PRIVATE = 4;
/*    */   public static final int FLAG_ROUND = 16;
/*    */   public static final int FLAG_SECURE = 2;
/*    */   public static final int FLAG_SUPPORTS_PROTECTED_BUFFERS = 1;
/*    */   public static final int INVALID_DISPLAY = -1;
/*    */   public static final int STATE_DOZE = 3;
/*    */   public static final int STATE_DOZE_SUSPEND = 4;
/*    */   public static final int STATE_OFF = 1;
/*    */   public static final int STATE_ON = 2;
/*    */   public static final int STATE_UNKNOWN = 0;
/*    */   public static final int STATE_VR = 5;
/*    */   
/*    */   public static final class Mode
/*    */     implements android.os.Parcelable {
/* 23 */     Mode() { throw new RuntimeException("Stub!"); }
/* 24 */     public int getModeId() { throw new RuntimeException("Stub!"); }
/* 25 */     public int getPhysicalWidth() { throw new RuntimeException("Stub!"); }
/* 26 */     public int getPhysicalHeight() { throw new RuntimeException("Stub!"); }
/* 27 */     public float getRefreshRate() { throw new RuntimeException("Stub!"); }
/* 28 */     public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 29 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 30 */     public String toString() { throw new RuntimeException("Stub!"); }
/* 31 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/* 32 */     public void writeToParcel(android.os.Parcel out, int parcelableFlags) { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/* 35 */     public static final android.os.Parcelable.Creator<Mode> CREATOR = null;
/*    */   }
/*    */   
/*    */   public static final class HdrCapabilities
/*    */     implements android.os.Parcelable {
/* 40 */     HdrCapabilities() { throw new RuntimeException("Stub!"); }
/* 41 */     public int[] getSupportedHdrTypes() { throw new RuntimeException("Stub!"); }
/* 42 */     public float getDesiredMaxLuminance() { throw new RuntimeException("Stub!"); }
/* 43 */     public float getDesiredMaxAverageLuminance() { throw new RuntimeException("Stub!"); }
/* 44 */     public float getDesiredMinLuminance() { throw new RuntimeException("Stub!"); }
/* 45 */     public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 46 */     public int hashCode() { throw new RuntimeException("Stub!"); }
/* 47 */     public void writeToParcel(android.os.Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 48 */     public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 54 */     public static final android.os.Parcelable.Creator<HdrCapabilities> CREATOR = null;
/*    */     public static final int HDR_TYPE_DOLBY_VISION = 1; public static final int HDR_TYPE_HDR10 = 2; public static final int HDR_TYPE_HLG = 3; public static final float INVALID_LUMINANCE = -1.0F; }
/* 56 */   Display() { throw new RuntimeException("Stub!"); }
/* 57 */   public int getDisplayId() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean isValid() { throw new RuntimeException("Stub!"); }
/* 59 */   public int getFlags() { throw new RuntimeException("Stub!"); }
/* 60 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 61 */   public void getSize(Point outSize) { throw new RuntimeException("Stub!"); }
/* 62 */   public void getRectSize(android.graphics.Rect outSize) { throw new RuntimeException("Stub!"); }
/* 63 */   public void getCurrentSizeRange(Point outSmallestSize, Point outLargestSize) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 65 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 67 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 68 */   public int getRotation() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 70 */   public int getOrientation() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 72 */   public int getPixelFormat() { throw new RuntimeException("Stub!"); }
/* 73 */   public float getRefreshRate() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 75 */   public float[] getSupportedRefreshRates() { throw new RuntimeException("Stub!"); }
/* 76 */   public Mode getMode() { throw new RuntimeException("Stub!"); }
/* 77 */   public Mode[] getSupportedModes() { throw new RuntimeException("Stub!"); }
/* 78 */   public HdrCapabilities getHdrCapabilities() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean isHdr() { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isWideColorGamut() { throw new RuntimeException("Stub!"); }
/* 81 */   public long getAppVsyncOffsetNanos() { throw new RuntimeException("Stub!"); }
/* 82 */   public long getPresentationDeadlineNanos() { throw new RuntimeException("Stub!"); }
/* 83 */   public void getMetrics(android.util.DisplayMetrics outMetrics) { throw new RuntimeException("Stub!"); }
/* 84 */   public void getRealSize(Point outSize) { throw new RuntimeException("Stub!"); }
/* 85 */   public void getRealMetrics(android.util.DisplayMetrics outMetrics) { throw new RuntimeException("Stub!"); }
/* 86 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 87 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\Display.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */