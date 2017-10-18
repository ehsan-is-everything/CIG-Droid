/*     */ package android.graphics;
/*     */ 
/*     */ 
/*     */ public class Canvas
/*     */ {
/*     */   public static final int ALL_SAVE_FLAG = 31;
/*     */   
/*     */   @Deprecated
/*     */   public static final int CLIP_SAVE_FLAG = 2;
/*     */   
/*     */   @Deprecated
/*     */   public static final int CLIP_TO_LAYER_SAVE_FLAG = 16;
/*     */   @Deprecated
/*     */   public static final int FULL_COLOR_LAYER_SAVE_FLAG = 8;
/*     */   @Deprecated
/*     */   public static final int HAS_ALPHA_LAYER_SAVE_FLAG = 4;
/*     */   @Deprecated
/*     */   public static final int MATRIX_SAVE_FLAG = 1;
/*     */   
/*     */   public static enum EdgeType
/*     */   {
/*  22 */     AA, 
/*  23 */     BW;
/*     */     
/*     */     private EdgeType() {} }
/*     */   
/*  27 */   public static enum VertexMode { TRIANGLES, 
/*  28 */     TRIANGLE_FAN, 
/*  29 */     TRIANGLE_STRIP;
/*     */     private VertexMode() {} }
/*  31 */   public Canvas() { throw new RuntimeException("Stub!"); }
/*  32 */   public Canvas(Bitmap bitmap) { throw new RuntimeException("Stub!"); }
/*  33 */   public boolean isHardwareAccelerated() { throw new RuntimeException("Stub!"); }
/*  34 */   public void setBitmap(Bitmap bitmap) { throw new RuntimeException("Stub!"); }
/*  35 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/*  36 */   public int getWidth() { throw new RuntimeException("Stub!"); }
/*  37 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/*  38 */   public int getDensity() { throw new RuntimeException("Stub!"); }
/*  39 */   public void setDensity(int density) { throw new RuntimeException("Stub!"); }
/*  40 */   public int getMaximumBitmapWidth() { throw new RuntimeException("Stub!"); }
/*  41 */   public int getMaximumBitmapHeight() { throw new RuntimeException("Stub!"); }
/*  42 */   public int save() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  44 */   public int save(int saveFlags) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  46 */   public int saveLayer(RectF bounds, Paint paint, int saveFlags) { throw new RuntimeException("Stub!"); }
/*  47 */   public int saveLayer(RectF bounds, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  49 */   public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) { throw new RuntimeException("Stub!"); }
/*  50 */   public int saveLayer(float left, float top, float right, float bottom, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  52 */   public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) { throw new RuntimeException("Stub!"); }
/*  53 */   public int saveLayerAlpha(RectF bounds, int alpha) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  55 */   public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) { throw new RuntimeException("Stub!"); }
/*  56 */   public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) { throw new RuntimeException("Stub!"); }
/*  57 */   public void restore() { throw new RuntimeException("Stub!"); }
/*  58 */   public int getSaveCount() { throw new RuntimeException("Stub!"); }
/*  59 */   public void restoreToCount(int saveCount) { throw new RuntimeException("Stub!"); }
/*  60 */   public void translate(float dx, float dy) { throw new RuntimeException("Stub!"); }
/*  61 */   public void scale(float sx, float sy) { throw new RuntimeException("Stub!"); }
/*  62 */   public final void scale(float sx, float sy, float px, float py) { throw new RuntimeException("Stub!"); }
/*  63 */   public void rotate(float degrees) { throw new RuntimeException("Stub!"); }
/*  64 */   public final void rotate(float degrees, float px, float py) { throw new RuntimeException("Stub!"); }
/*  65 */   public void skew(float sx, float sy) { throw new RuntimeException("Stub!"); }
/*  66 */   public void concat(Matrix matrix) { throw new RuntimeException("Stub!"); }
/*  67 */   public void setMatrix(Matrix matrix) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  69 */   public void getMatrix(Matrix ctm) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  71 */   public final Matrix getMatrix() { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  73 */   public boolean clipRect(RectF rect, Region.Op op) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  75 */   public boolean clipRect(Rect rect, Region.Op op) { throw new RuntimeException("Stub!"); }
/*  76 */   public boolean clipRect(RectF rect) { throw new RuntimeException("Stub!"); }
/*  77 */   public boolean clipOutRect(RectF rect) { throw new RuntimeException("Stub!"); }
/*  78 */   public boolean clipRect(Rect rect) { throw new RuntimeException("Stub!"); }
/*  79 */   public boolean clipOutRect(Rect rect) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  81 */   public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) { throw new RuntimeException("Stub!"); }
/*  82 */   public boolean clipRect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/*  83 */   public boolean clipOutRect(float left, float top, float right, float bottom) { throw new RuntimeException("Stub!"); }
/*  84 */   public boolean clipRect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*  85 */   public boolean clipOutRect(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/*  87 */   public boolean clipPath(Path path, Region.Op op) { throw new RuntimeException("Stub!"); }
/*  88 */   public boolean clipPath(Path path) { throw new RuntimeException("Stub!"); }
/*  89 */   public boolean clipOutPath(Path path) { throw new RuntimeException("Stub!"); }
/*  90 */   public DrawFilter getDrawFilter() { throw new RuntimeException("Stub!"); }
/*  91 */   public void setDrawFilter(DrawFilter filter) { throw new RuntimeException("Stub!"); }
/*  92 */   public boolean quickReject(RectF rect, EdgeType type) { throw new RuntimeException("Stub!"); }
/*  93 */   public boolean quickReject(Path path, EdgeType type) { throw new RuntimeException("Stub!"); }
/*  94 */   public boolean quickReject(float left, float top, float right, float bottom, EdgeType type) { throw new RuntimeException("Stub!"); }
/*  95 */   public boolean getClipBounds(Rect bounds) { throw new RuntimeException("Stub!"); }
/*  96 */   public final Rect getClipBounds() { throw new RuntimeException("Stub!"); }
/*  97 */   public void drawPicture(Picture picture) { throw new RuntimeException("Stub!"); }
/*  98 */   public void drawPicture(Picture picture, RectF dst) { throw new RuntimeException("Stub!"); }
/*  99 */   public void drawPicture(Picture picture, Rect dst) { throw new RuntimeException("Stub!"); }
/* 100 */   public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) { throw new RuntimeException("Stub!"); }
/* 101 */   public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) { throw new RuntimeException("Stub!"); }
/* 102 */   public void drawARGB(int a, int r, int g, int b) { throw new RuntimeException("Stub!"); }
/* 103 */   public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) { throw new RuntimeException("Stub!"); }
/* 104 */   public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) { throw new RuntimeException("Stub!"); }
/* 105 */   public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 107 */   public void drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 109 */   public void drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, Paint paint) { throw new RuntimeException("Stub!"); }
/* 110 */   public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) { throw new RuntimeException("Stub!"); }
/* 111 */   public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) { throw new RuntimeException("Stub!"); }
/* 112 */   public void drawCircle(float cx, float cy, float radius, Paint paint) { throw new RuntimeException("Stub!"); }
/* 113 */   public void drawColor(int color) { throw new RuntimeException("Stub!"); }
/* 114 */   public void drawColor(int color, PorterDuff.Mode mode) { throw new RuntimeException("Stub!"); }
/* 115 */   public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) { throw new RuntimeException("Stub!"); }
/* 116 */   public void drawLines(float[] pts, int offset, int count, Paint paint) { throw new RuntimeException("Stub!"); }
/* 117 */   public void drawLines(float[] pts, Paint paint) { throw new RuntimeException("Stub!"); }
/* 118 */   public void drawOval(RectF oval, Paint paint) { throw new RuntimeException("Stub!"); }
/* 119 */   public void drawOval(float left, float top, float right, float bottom, Paint paint) { throw new RuntimeException("Stub!"); }
/* 120 */   public void drawPaint(Paint paint) { throw new RuntimeException("Stub!"); }
/* 121 */   public void drawPath(Path path, Paint paint) { throw new RuntimeException("Stub!"); }
/* 122 */   public void drawPoint(float x, float y, Paint paint) { throw new RuntimeException("Stub!"); }
/* 123 */   public void drawPoints(float[] pts, int offset, int count, Paint paint) { throw new RuntimeException("Stub!"); }
/* 124 */   public void drawPoints(float[] pts, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 126 */   public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */   @Deprecated
/* 128 */   public void drawPosText(String text, float[] pos, Paint paint) { throw new RuntimeException("Stub!"); }
/* 129 */   public void drawRect(RectF rect, Paint paint) { throw new RuntimeException("Stub!"); }
/* 130 */   public void drawRect(Rect r, Paint paint) { throw new RuntimeException("Stub!"); }
/* 131 */   public void drawRect(float left, float top, float right, float bottom, Paint paint) { throw new RuntimeException("Stub!"); }
/* 132 */   public void drawRGB(int r, int g, int b) { throw new RuntimeException("Stub!"); }
/* 133 */   public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) { throw new RuntimeException("Stub!"); }
/* 134 */   public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint) { throw new RuntimeException("Stub!"); }
/* 135 */   public void drawText(char[] text, int index, int count, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); }
/* 136 */   public void drawText(String text, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); }
/* 137 */   public void drawText(String text, int start, int end, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); }
/* 138 */   public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint) { throw new RuntimeException("Stub!"); }
/* 139 */   public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) { throw new RuntimeException("Stub!"); }
/* 140 */   public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) { throw new RuntimeException("Stub!"); }
/* 141 */   public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, Paint paint) { throw new RuntimeException("Stub!"); }
/* 142 */   public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) { throw new RuntimeException("Stub!"); }
/* 143 */   public void drawVertices(VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) { throw new RuntimeException("Stub!"); }
/*     */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\Canvas.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */