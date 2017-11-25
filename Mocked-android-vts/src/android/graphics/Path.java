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
/*    */ public class Path
/*    */ {
/*    */   public static enum Op
/*    */   {
/* 22 */     DIFFERENCE, 
/* 23 */     INTERSECT, 
/* 24 */     REVERSE_DIFFERENCE, 
/* 25 */     UNION, 
/* 26 */     XOR;
/*    */     
/*    */     private Op() {} }
/*    */   
/* 30 */   public static enum FillType { EVEN_ODD, 
/* 31 */     INVERSE_EVEN_ODD, 
/* 32 */     INVERSE_WINDING, 
/* 33 */     WINDING;
/*    */     
/*    */     private FillType() {} }
/*    */   
/* 37 */   public static enum Direction { CCW, 
/* 38 */     CW;
/*    */     private Direction() {} }
/* 40 */   public Path() { throw new RuntimeException("Stub!"); }
/* 41 */   public Path(Path src) { throw new RuntimeException("Stub!"); }
/* 42 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 43 */   public void rewind() { throw new RuntimeException("Stub!"); }
/* 44 */   public void set(Path src) { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean op(Path path, Op op) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean op(Path path1, Path path2, Op op) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isConvex() { throw new RuntimeException("Stub!"); }
/* 48 */   public FillType getFillType() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setFillType(FillType ft) { throw new RuntimeException("Stub!"); }
/* 50 */   public boolean isInverseFillType() { throw new RuntimeException("Stub!"); }
/* 51 */   public void toggleInverseFillType() { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean isRect(RectF rect) { throw new RuntimeException("Stub!"); }
/*    */   
/* 55 */   public void computeBounds(RectF bounds, boolean exact) { throw new RuntimeException("Stub!"); }
/* 56 */   public void incReserve(int extraPtCount) { throw new RuntimeException("Stub!"); }
/* 57 */   public void moveTo(float x, float y) { throw new RuntimeException("Stub!"); }
/* 58 */   public void rMoveTo(float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 59 */   public void lineTo(float x, float y) { throw new RuntimeException("Stub!"); }
/* 60 */   public void rLineTo(float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 61 */   public void quadTo(float x1, float y1, float x2, float y2) { throw new RuntimeException("Stub!"); }
/* 62 */   public void rQuadTo(float dx1, float dy1, float dx2, float dy2) { throw new RuntimeException("Stub!"); }
/* 63 */   public void cubicTo(float x1, float y1, float x2, float y2, float x3, float y3) { throw new RuntimeException("Stub!"); }
/* 64 */   public void rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3) { throw new RuntimeException("Stub!"); }
/* 65 */   public void arcTo(RectF oval, float startAngle, float sweepAngle, boolean forceMoveTo) { throw new RuntimeException("Stub!"); }
/* 66 */   public void arcTo(RectF oval, float startAngle, float sweepAngle) { throw new RuntimeException("Stub!"); }
/* 67 */   public void arcTo(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean forceMoveTo) { throw new RuntimeException("Stub!"); }
/* 68 */   public void close() { throw new RuntimeException("Stub!"); }
/* 69 */   public void addRect(RectF rect, Direction dir) { throw new RuntimeException("Stub!"); }
/* 70 */   public void addRect(float left, float top, float right, float bottom, Direction dir) { throw new RuntimeException("Stub!"); }
/* 71 */   public void addOval(RectF oval, Direction dir) { throw new RuntimeException("Stub!"); }
/* 72 */   public void addOval(float left, float top, float right, float bottom, Direction dir) { throw new RuntimeException("Stub!"); }
/* 73 */   public void addCircle(float x, float y, float radius, Direction dir) { throw new RuntimeException("Stub!"); }
/* 74 */   public void addArc(RectF oval, float startAngle, float sweepAngle) { throw new RuntimeException("Stub!"); }
/* 75 */   public void addArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle) { throw new RuntimeException("Stub!"); }
/* 76 */   public void addRoundRect(RectF rect, float rx, float ry, Direction dir) { throw new RuntimeException("Stub!"); }
/* 77 */   public void addRoundRect(float left, float top, float right, float bottom, float rx, float ry, Direction dir) { throw new RuntimeException("Stub!"); }
/* 78 */   public void addRoundRect(RectF rect, float[] radii, Direction dir) { throw new RuntimeException("Stub!"); }
/* 79 */   public void addRoundRect(float left, float top, float right, float bottom, float[] radii, Direction dir) { throw new RuntimeException("Stub!"); }
/* 80 */   public void addPath(Path src, float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 81 */   public void addPath(Path src) { throw new RuntimeException("Stub!"); }
/* 82 */   public void addPath(Path src, Matrix matrix) { throw new RuntimeException("Stub!"); }
/* 83 */   public void offset(float dx, float dy, Path dst) { throw new RuntimeException("Stub!"); }
/* 84 */   public void offset(float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 85 */   public void setLastPoint(float dx, float dy) { throw new RuntimeException("Stub!"); }
/* 86 */   public void transform(Matrix matrix, Path dst) { throw new RuntimeException("Stub!"); }
/* 87 */   public void transform(Matrix matrix) { throw new RuntimeException("Stub!"); }
/* 88 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/* 89 */   public float[] approximate(float acceptableError) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\Path.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */