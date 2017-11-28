/*    */ package android.view.animation;
/*    */ 
/*    */ import android.view.View;
/*    */ 
/*    */ public class GridLayoutAnimationController extends LayoutAnimationController
/*    */ {
/*    */   public static final int DIRECTION_BOTTOM_TO_TOP = 2;
/*    */   public static final int DIRECTION_HORIZONTAL_MASK = 1;
/*    */   public static final int DIRECTION_LEFT_TO_RIGHT = 0;
/*    */   public static final int DIRECTION_RIGHT_TO_LEFT = 1;
/*    */   public static final int DIRECTION_TOP_TO_BOTTOM = 0;
/*    */   public static final int DIRECTION_VERTICAL_MASK = 2;
/*    */   public static final int PRIORITY_COLUMN = 1;
/*    */   public static final int PRIORITY_NONE = 0;
/*    */   public static final int PRIORITY_ROW = 2;
/*    */   
/*    */   public static class AnimationParameters extends LayoutAnimationController.AnimationParameters {
/*    */     public int column;
/*    */     public int columnsCount;
/*    */     public int row;
/*    */     public int rowsCount;
/*    */     
/*    */     public AnimationParameters() {
/* 24 */       throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */   
/*    */   public GridLayoutAnimationController(android.content.Context context, android.util.AttributeSet attrs)
/*    */   {
/* 30 */     super((Animation)null, 0.0F);throw new RuntimeException("Stub!"); }
/* 31 */   public GridLayoutAnimationController(Animation animation) { super((Animation)null, 0.0F);throw new RuntimeException("Stub!"); }
/* 32 */   public GridLayoutAnimationController(Animation animation, float columnDelay, float rowDelay) { super((Animation)null, 0.0F);throw new RuntimeException("Stub!"); }
/* 33 */   public float getColumnDelay() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setColumnDelay(float columnDelay) { throw new RuntimeException("Stub!"); }
/* 35 */   public float getRowDelay() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setRowDelay(float rowDelay) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getDirection() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setDirection(int direction) { throw new RuntimeException("Stub!"); }
/* 39 */   public int getDirectionPriority() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setDirectionPriority(int directionPriority) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean willOverlap() { throw new RuntimeException("Stub!"); }
/* 42 */   protected long getDelayForView(View view) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\animation\GridLayoutAnimationController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */