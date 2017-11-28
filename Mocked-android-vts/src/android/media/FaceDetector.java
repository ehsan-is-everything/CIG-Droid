/*    */ package android.media;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ import android.graphics.PointF;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class FaceDetector
/*    */ {
/*    */   public class Face
/*    */   {
/*    */     public static final float CONFIDENCE_THRESHOLD = 0.4F;
/*    */     public static final int EULER_X = 0;
/*    */     public static final int EULER_Y = 1;
/*    */     public static final int EULER_Z = 2;
/*    */     
/* 22 */     Face() { throw new RuntimeException("Stub!"); }
/* 23 */     public float confidence() { throw new RuntimeException("Stub!"); }
/* 24 */     public void getMidPoint(PointF point) { throw new RuntimeException("Stub!"); }
/* 25 */     public float eyesDistance() { throw new RuntimeException("Stub!"); }
/* 26 */     public float pose(int euler) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 32 */   public FaceDetector(int width, int height, int maxFaces) { throw new RuntimeException("Stub!"); }
/* 33 */   public int findFaces(Bitmap bitmap, Face[] faces) { throw new RuntimeException("Stub!"); }
/* 34 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\FaceDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */