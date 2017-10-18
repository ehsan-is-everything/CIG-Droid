/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Paint.FontMetricsInt;
/*    */ import android.graphics.drawable.Drawable;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class DynamicDrawableSpan
/*    */   extends ReplacementSpan
/*    */ {
/*    */   public static final int ALIGN_BASELINE = 1;
/*    */   public static final int ALIGN_BOTTOM = 0;
/*    */   protected final int mVerticalAlignment;
/*    */   
/* 21 */   public DynamicDrawableSpan() { throw new RuntimeException("Stub!"); }
/* 22 */   protected DynamicDrawableSpan(int verticalAlignment) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getVerticalAlignment() { throw new RuntimeException("Stub!"); }
/*    */   public abstract Drawable getDrawable();
/* 25 */   public int getSize(Paint paint, CharSequence text, int start, int end, Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!"); }
/* 26 */   public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\style\DynamicDrawableSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */