/*     */ package android.renderscript;
/*     */ 
/*     */ import android.graphics.Bitmap;
/*     */ 
/*     */ public class Allocation extends BaseObj
/*     */ {
/*     */   public static final int USAGE_GRAPHICS_CONSTANTS = 8;
/*     */   public static final int USAGE_GRAPHICS_RENDER_TARGET = 16;
/*     */   public static final int USAGE_GRAPHICS_TEXTURE = 2;
/*     */   public static final int USAGE_GRAPHICS_VERTEX = 4;
/*     */   public static final int USAGE_IO_INPUT = 32;
/*     */   public static final int USAGE_IO_OUTPUT = 64;
/*     */   public static final int USAGE_SCRIPT = 1;
/*     */   public static final int USAGE_SHARED = 128;
/*     */   
/*     */   public static abstract interface OnBufferAvailableListener
/*     */   {
/*     */     public abstract void onBufferAvailable(Allocation paramAllocation);
/*     */   }
/*     */   
/*     */   public static enum MipmapControl
/*     */   {
/*  23 */     MIPMAP_FULL, 
/*  24 */     MIPMAP_NONE, 
/*  25 */     MIPMAP_ON_SYNC_TO_TEXTURE;
/*     */     
/*     */ 
/*     */     private MipmapControl() {}
/*     */   }
/*     */   
/*  31 */   Allocation() { throw new RuntimeException("Stub!"); }
/*  32 */   public Element getElement() { throw new RuntimeException("Stub!"); }
/*  33 */   public int getUsage() { throw new RuntimeException("Stub!"); }
/*  34 */   public void setAutoPadding(boolean useAutoPadding) { throw new RuntimeException("Stub!"); }
/*  35 */   public int getBytesSize() { throw new RuntimeException("Stub!"); }
/*  36 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*  37 */   public Type getType() { throw new RuntimeException("Stub!"); }
/*  38 */   public void syncAll(int srcLocation) { throw new RuntimeException("Stub!"); }
/*  39 */   public void ioSend() { throw new RuntimeException("Stub!"); }
/*  40 */   public void ioReceive() { throw new RuntimeException("Stub!"); }
/*  41 */   public void copyFrom(BaseObj[] d) { throw new RuntimeException("Stub!"); }
/*  42 */   public void copyFromUnchecked(Object array) { throw new RuntimeException("Stub!"); }
/*  43 */   public void copyFromUnchecked(int[] d) { throw new RuntimeException("Stub!"); }
/*  44 */   public void copyFromUnchecked(short[] d) { throw new RuntimeException("Stub!"); }
/*  45 */   public void copyFromUnchecked(byte[] d) { throw new RuntimeException("Stub!"); }
/*  46 */   public void copyFromUnchecked(float[] d) { throw new RuntimeException("Stub!"); }
/*  47 */   public void copyFrom(Object array) { throw new RuntimeException("Stub!"); }
/*  48 */   public void copyFrom(int[] d) { throw new RuntimeException("Stub!"); }
/*  49 */   public void copyFrom(short[] d) { throw new RuntimeException("Stub!"); }
/*  50 */   public void copyFrom(byte[] d) { throw new RuntimeException("Stub!"); }
/*  51 */   public void copyFrom(float[] d) { throw new RuntimeException("Stub!"); }
/*  52 */   public void copyFrom(Bitmap b) { throw new RuntimeException("Stub!"); }
/*  53 */   public void copyFrom(Allocation a) { throw new RuntimeException("Stub!"); }
/*  54 */   public void setFromFieldPacker(int xoff, FieldPacker fp) { throw new RuntimeException("Stub!"); }
/*  55 */   public void setFromFieldPacker(int xoff, int component_number, FieldPacker fp) { throw new RuntimeException("Stub!"); }
/*  56 */   public void setFromFieldPacker(int xoff, int yoff, int zoff, int component_number, FieldPacker fp) { throw new RuntimeException("Stub!"); }
/*  57 */   public void generateMipmaps() { throw new RuntimeException("Stub!"); }
/*  58 */   public void copy1DRangeFromUnchecked(int off, int count, Object array) { throw new RuntimeException("Stub!"); }
/*  59 */   public void copy1DRangeFromUnchecked(int off, int count, int[] d) { throw new RuntimeException("Stub!"); }
/*  60 */   public void copy1DRangeFromUnchecked(int off, int count, short[] d) { throw new RuntimeException("Stub!"); }
/*  61 */   public void copy1DRangeFromUnchecked(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); }
/*  62 */   public void copy1DRangeFromUnchecked(int off, int count, float[] d) { throw new RuntimeException("Stub!"); }
/*  63 */   public void copy1DRangeFrom(int off, int count, Object array) { throw new RuntimeException("Stub!"); }
/*  64 */   public void copy1DRangeFrom(int off, int count, int[] d) { throw new RuntimeException("Stub!"); }
/*  65 */   public void copy1DRangeFrom(int off, int count, short[] d) { throw new RuntimeException("Stub!"); }
/*  66 */   public void copy1DRangeFrom(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); }
/*  67 */   public void copy1DRangeFrom(int off, int count, float[] d) { throw new RuntimeException("Stub!"); }
/*  68 */   public void copy1DRangeFrom(int off, int count, Allocation data, int dataOff) { throw new RuntimeException("Stub!"); }
/*  69 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, Object array) { throw new RuntimeException("Stub!"); }
/*  70 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, byte[] data) { throw new RuntimeException("Stub!"); }
/*  71 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, short[] data) { throw new RuntimeException("Stub!"); }
/*  72 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, int[] data) { throw new RuntimeException("Stub!"); }
/*  73 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, float[] data) { throw new RuntimeException("Stub!"); }
/*  74 */   public void copy2DRangeFrom(int xoff, int yoff, int w, int h, Allocation data, int dataXoff, int dataYoff) { throw new RuntimeException("Stub!"); }
/*  75 */   public void copy2DRangeFrom(int xoff, int yoff, Bitmap data) { throw new RuntimeException("Stub!"); }
/*  76 */   public void copy3DRangeFrom(int xoff, int yoff, int zoff, int w, int h, int d, Object array) { throw new RuntimeException("Stub!"); }
/*  77 */   public void copy3DRangeFrom(int xoff, int yoff, int zoff, int w, int h, int d, Allocation data, int dataXoff, int dataYoff, int dataZoff) { throw new RuntimeException("Stub!"); }
/*  78 */   public void copyTo(Bitmap b) { throw new RuntimeException("Stub!"); }
/*  79 */   public void copyTo(Object array) { throw new RuntimeException("Stub!"); }
/*  80 */   public void copyTo(byte[] d) { throw new RuntimeException("Stub!"); }
/*  81 */   public void copyTo(short[] d) { throw new RuntimeException("Stub!"); }
/*  82 */   public void copyTo(int[] d) { throw new RuntimeException("Stub!"); }
/*  83 */   public void copyTo(float[] d) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  85 */   public synchronized void resize(int dimX) { throw new RuntimeException("Stub!"); }
/*  86 */   public void copy1DRangeToUnchecked(int off, int count, Object array) { throw new RuntimeException("Stub!"); }
/*  87 */   public void copy1DRangeToUnchecked(int off, int count, int[] d) { throw new RuntimeException("Stub!"); }
/*  88 */   public void copy1DRangeToUnchecked(int off, int count, short[] d) { throw new RuntimeException("Stub!"); }
/*  89 */   public void copy1DRangeToUnchecked(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); }
/*  90 */   public void copy1DRangeToUnchecked(int off, int count, float[] d) { throw new RuntimeException("Stub!"); }
/*  91 */   public void copy1DRangeTo(int off, int count, Object array) { throw new RuntimeException("Stub!"); }
/*  92 */   public void copy1DRangeTo(int off, int count, int[] d) { throw new RuntimeException("Stub!"); }
/*  93 */   public void copy1DRangeTo(int off, int count, short[] d) { throw new RuntimeException("Stub!"); }
/*  94 */   public void copy1DRangeTo(int off, int count, byte[] d) { throw new RuntimeException("Stub!"); }
/*  95 */   public void copy1DRangeTo(int off, int count, float[] d) { throw new RuntimeException("Stub!"); }
/*  96 */   public void copy2DRangeTo(int xoff, int yoff, int w, int h, Object array) { throw new RuntimeException("Stub!"); }
/*  97 */   public void copy2DRangeTo(int xoff, int yoff, int w, int h, byte[] data) { throw new RuntimeException("Stub!"); }
/*  98 */   public void copy2DRangeTo(int xoff, int yoff, int w, int h, short[] data) { throw new RuntimeException("Stub!"); }
/*  99 */   public void copy2DRangeTo(int xoff, int yoff, int w, int h, int[] data) { throw new RuntimeException("Stub!"); }
/* 100 */   public void copy2DRangeTo(int xoff, int yoff, int w, int h, float[] data) { throw new RuntimeException("Stub!"); }
/* 101 */   public void copy3DRangeTo(int xoff, int yoff, int zoff, int w, int h, int d, Object array) { throw new RuntimeException("Stub!"); }
/* 102 */   public static Allocation createTyped(RenderScript rs, Type type, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); }
/* 103 */   public static Allocation createTyped(RenderScript rs, Type type, int usage) { throw new RuntimeException("Stub!"); }
/* 104 */   public static Allocation createTyped(RenderScript rs, Type type) { throw new RuntimeException("Stub!"); }
/* 105 */   public static Allocation createSized(RenderScript rs, Element e, int count, int usage) { throw new RuntimeException("Stub!"); }
/* 106 */   public static Allocation createSized(RenderScript rs, Element e, int count) { throw new RuntimeException("Stub!"); }
/* 107 */   public static Allocation createFromBitmap(RenderScript rs, Bitmap b, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); }
/* 108 */   public java.nio.ByteBuffer getByteBuffer() { throw new RuntimeException("Stub!"); }
/* 109 */   public static Allocation[] createAllocations(RenderScript rs, Type t, int usage, int numAlloc) { throw new RuntimeException("Stub!"); }
/* 110 */   public long getStride() { throw new RuntimeException("Stub!"); }
/* 111 */   public long getTimeStamp() { throw new RuntimeException("Stub!"); }
/* 112 */   public android.view.Surface getSurface() { throw new RuntimeException("Stub!"); }
/* 113 */   public void setSurface(android.view.Surface sur) { throw new RuntimeException("Stub!"); }
/* 114 */   public static Allocation createFromBitmap(RenderScript rs, Bitmap b) { throw new RuntimeException("Stub!"); }
/* 115 */   public static Allocation createCubemapFromBitmap(RenderScript rs, Bitmap b, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); }
/* 116 */   public static Allocation createCubemapFromBitmap(RenderScript rs, Bitmap b) { throw new RuntimeException("Stub!"); }
/* 117 */   public static Allocation createCubemapFromCubeFaces(RenderScript rs, Bitmap xpos, Bitmap xneg, Bitmap ypos, Bitmap yneg, Bitmap zpos, Bitmap zneg, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); }
/* 118 */   public static Allocation createCubemapFromCubeFaces(RenderScript rs, Bitmap xpos, Bitmap xneg, Bitmap ypos, Bitmap yneg, Bitmap zpos, Bitmap zneg) { throw new RuntimeException("Stub!"); }
/* 119 */   public static Allocation createFromBitmapResource(RenderScript rs, android.content.res.Resources res, int id, MipmapControl mips, int usage) { throw new RuntimeException("Stub!"); }
/* 120 */   public static Allocation createFromBitmapResource(RenderScript rs, android.content.res.Resources res, int id) { throw new RuntimeException("Stub!"); }
/* 121 */   public static Allocation createFromString(RenderScript rs, String str, int usage) { throw new RuntimeException("Stub!"); }
/* 122 */   public void setOnBufferAvailableListener(OnBufferAvailableListener callback) { throw new RuntimeException("Stub!"); }
/* 123 */   public void destroy() { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\renderscript\Allocation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */