/*    */ package android.graphics.drawable.shapes;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Outline;
/*    */ import android.graphics.Paint;
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
/*    */ public abstract class Shape
/*    */   implements Cloneable
/*    */ {
/* 21 */   public Shape() { throw new RuntimeException("Stub!"); }
/* 22 */   public final float getWidth() { throw new RuntimeException("Stub!"); }
/* 23 */   public final float getHeight() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void draw(Canvas paramCanvas, Paint paramPaint);
/* 25 */   public final void resize(float width, float height) { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean hasAlpha() { throw new RuntimeException("Stub!"); }
/* 27 */   protected void onResize(float width, float height) { throw new RuntimeException("Stub!"); }
/* 28 */   public void getOutline(Outline outline) { throw new RuntimeException("Stub!"); }
/* 29 */   public Shape clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\graphics\drawable\shapes\Shape.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */