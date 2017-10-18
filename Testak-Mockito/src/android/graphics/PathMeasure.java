/*    */ package android.graphics;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class PathMeasure
/*    */ {
/*    */   public static final int POSITION_MATRIX_FLAG = 1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int TANGENT_MATRIX_FLAG = 2;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 20 */   public PathMeasure() { throw new RuntimeException("Stub!"); }
/* 21 */   public PathMeasure(Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setPath(Path path, boolean forceClosed) { throw new RuntimeException("Stub!"); }
/* 23 */   public float getLength() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean getPosTan(float distance, float[] pos, float[] tan) { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean getMatrix(float distance, Matrix matrix, int flags) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean getSegment(float startD, float stopD, Path dst, boolean startWithMoveTo) { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean nextContour() { throw new RuntimeException("Stub!"); }
/* 29 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\graphics\PathMeasure.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */