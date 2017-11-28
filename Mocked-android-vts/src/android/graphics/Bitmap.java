/*    */ package android.graphics;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import android.util.DisplayMetrics;
/*    */ import java.io.OutputStream;
/*    */ import java.nio.Buffer;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Bitmap
/*    */   implements Parcelable
/*    */ {
/*    */   public static enum Config
/*    */   {
/* 23 */     ALPHA_8, 
/* 24 */     ARGB_4444, 
/* 25 */     ARGB_8888, 
/* 26 */     HARDWARE, 
/* 27 */     RGBA_F16, 
/* 28 */     RGB_565;
/*    */     
/*    */     private Config() {} }
/*    */   
/* 32 */   public static enum CompressFormat { JPEG, 
/* 33 */     PNG, 
/* 34 */     WEBP;
/*    */     private CompressFormat() {} }
/* 36 */   Bitmap() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getDensity() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setDensity(int density) { throw new RuntimeException("Stub!"); }
/* 39 */   public void reconfigure(int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setWidth(int width) { throw new RuntimeException("Stub!"); }
/* 41 */   public void setHeight(int height) { throw new RuntimeException("Stub!"); }
/* 42 */   public void setConfig(Config config) { throw new RuntimeException("Stub!"); }
/* 43 */   public void recycle() { throw new RuntimeException("Stub!"); }
/* 44 */   public final boolean isRecycled() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getGenerationId() { throw new RuntimeException("Stub!"); }
/* 46 */   public void copyPixelsToBuffer(Buffer dst) { throw new RuntimeException("Stub!"); }
/* 47 */   public void copyPixelsFromBuffer(Buffer src) { throw new RuntimeException("Stub!"); }
/* 48 */   public Bitmap copy(Config config, boolean isMutable) { throw new RuntimeException("Stub!"); }
/* 49 */   public static Bitmap createScaledBitmap(Bitmap src, int dstWidth, int dstHeight, boolean filter) { throw new RuntimeException("Stub!"); }
/* 50 */   public static Bitmap createBitmap(Bitmap src) { throw new RuntimeException("Stub!"); }
/* 51 */   public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height) { throw new RuntimeException("Stub!"); }
/* 52 */   public static Bitmap createBitmap(Bitmap source, int x, int y, int width, int height, Matrix m, boolean filter) { throw new RuntimeException("Stub!"); }
/* 53 */   public static Bitmap createBitmap(int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 54 */   public static Bitmap createBitmap(DisplayMetrics display, int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 55 */   public static Bitmap createBitmap(int width, int height, Config config, boolean hasAlpha) { throw new RuntimeException("Stub!"); }
/* 56 */   public static Bitmap createBitmap(int width, int height, Config config, boolean hasAlpha, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 57 */   public static Bitmap createBitmap(DisplayMetrics display, int width, int height, Config config, boolean hasAlpha) { throw new RuntimeException("Stub!"); }
/* 58 */   public static Bitmap createBitmap(DisplayMetrics display, int width, int height, Config config, boolean hasAlpha, ColorSpace colorSpace) { throw new RuntimeException("Stub!"); }
/* 59 */   public static Bitmap createBitmap(int[] colors, int offset, int stride, int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 60 */   public static Bitmap createBitmap(DisplayMetrics display, int[] colors, int offset, int stride, int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 61 */   public static Bitmap createBitmap(int[] colors, int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 62 */   public static Bitmap createBitmap(DisplayMetrics display, int[] colors, int width, int height, Config config) { throw new RuntimeException("Stub!"); }
/* 63 */   public byte[] getNinePatchChunk() { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean compress(CompressFormat format, int quality, OutputStream stream) { throw new RuntimeException("Stub!"); }
/* 65 */   public final boolean isMutable() { throw new RuntimeException("Stub!"); }
/* 66 */   public final boolean isPremultiplied() { throw new RuntimeException("Stub!"); }
/* 67 */   public final void setPremultiplied(boolean premultiplied) { throw new RuntimeException("Stub!"); }
/* 68 */   public final int getWidth() { throw new RuntimeException("Stub!"); }
/* 69 */   public final int getHeight() { throw new RuntimeException("Stub!"); }
/* 70 */   public int getScaledWidth(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 71 */   public int getScaledHeight(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 72 */   public int getScaledWidth(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 73 */   public int getScaledHeight(DisplayMetrics metrics) { throw new RuntimeException("Stub!"); }
/* 74 */   public int getScaledWidth(int targetDensity) { throw new RuntimeException("Stub!"); }
/* 75 */   public int getScaledHeight(int targetDensity) { throw new RuntimeException("Stub!"); }
/* 76 */   public final int getRowBytes() { throw new RuntimeException("Stub!"); }
/* 77 */   public final int getByteCount() { throw new RuntimeException("Stub!"); }
/* 78 */   public final int getAllocationByteCount() { throw new RuntimeException("Stub!"); }
/* 79 */   public final Config getConfig() { throw new RuntimeException("Stub!"); }
/* 80 */   public final boolean hasAlpha() { throw new RuntimeException("Stub!"); }
/* 81 */   public void setHasAlpha(boolean hasAlpha) { throw new RuntimeException("Stub!"); }
/* 82 */   public final boolean hasMipMap() { throw new RuntimeException("Stub!"); }
/* 83 */   public final void setHasMipMap(boolean hasMipMap) { throw new RuntimeException("Stub!"); }
/* 84 */   public final ColorSpace getColorSpace() { throw new RuntimeException("Stub!"); }
/* 85 */   public void eraseColor(int c) { throw new RuntimeException("Stub!"); }
/* 86 */   public int getPixel(int x, int y) { throw new RuntimeException("Stub!"); }
/* 87 */   public void getPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) { throw new RuntimeException("Stub!"); }
/* 88 */   public void setPixel(int x, int y, int color) { throw new RuntimeException("Stub!"); }
/* 89 */   public void setPixels(int[] pixels, int offset, int stride, int x, int y, int width, int height) { throw new RuntimeException("Stub!"); }
/* 90 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 91 */   public void writeToParcel(Parcel p, int flags) { throw new RuntimeException("Stub!"); }
/* 92 */   public Bitmap extractAlpha() { throw new RuntimeException("Stub!"); }
/* 93 */   public Bitmap extractAlpha(Paint paint, int[] offsetXY) { throw new RuntimeException("Stub!"); }
/* 94 */   public boolean sameAs(Bitmap other) { throw new RuntimeException("Stub!"); }
/* 95 */   public void prepareToDraw() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 98 */   public static final Parcelable.Creator<Bitmap> CREATOR = null;
/*    */   public static final int DENSITY_NONE = 0;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\Bitmap.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */