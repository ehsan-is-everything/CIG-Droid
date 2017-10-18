/*    */ package android.view.animation;
/*    */ 
/*    */ import android.graphics.Matrix;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Transformation
/*    */ {
/*    */   public static final int TYPE_ALPHA = 1;
/*    */   public static final int TYPE_BOTH = 3;
/*    */   public static final int TYPE_IDENTITY = 0;
/*    */   public static final int TYPE_MATRIX = 2;
/*    */   protected float mAlpha;
/*    */   protected Matrix mMatrix;
/*    */   protected int mTransformationType;
/*    */   
/* 20 */   public Transformation() { throw new RuntimeException("Stub!"); }
/* 21 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getTransformationType() { throw new RuntimeException("Stub!"); }
/* 23 */   public void setTransformationType(int transformationType) { throw new RuntimeException("Stub!"); }
/* 24 */   public void set(Transformation t) { throw new RuntimeException("Stub!"); }
/* 25 */   public void compose(Transformation t) { throw new RuntimeException("Stub!"); }
/* 26 */   public Matrix getMatrix() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setAlpha(float alpha) { throw new RuntimeException("Stub!"); }
/* 28 */   public float getAlpha() { throw new RuntimeException("Stub!"); }
/* 29 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 30 */   public String toShortString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\animation\Transformation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */