/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Paint.FontMetricsInt;
/*    */ import android.text.TextPaint;
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
/*    */ public abstract class ReplacementSpan
/*    */   extends MetricAffectingSpan
/*    */ {
/* 21 */   public ReplacementSpan() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt);
/*    */   public abstract void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint);
/* 24 */   public void updateMeasureState(TextPaint p) { throw new RuntimeException("Stub!"); }
/* 25 */   public void updateDrawState(TextPaint ds) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\ReplacementSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */