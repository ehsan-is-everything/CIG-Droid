/*    */ package android.transition;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Path;
/*    */ import android.util.AttributeSet;
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
/*    */ public abstract class PathMotion
/*    */ {
/* 19 */   public PathMotion() { throw new RuntimeException("Stub!"); }
/* 20 */   public PathMotion(Context context, AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Path getPath(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\transition\PathMotion.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */