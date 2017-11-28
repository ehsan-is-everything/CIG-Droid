/*    */ package android.text.style;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class MetricAffectingSpan
/*    */   extends CharacterStyle
/*    */   implements UpdateLayout
/*    */ {
/* 22 */   public MetricAffectingSpan() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void updateMeasureState(TextPaint paramTextPaint);
/* 24 */   public MetricAffectingSpan getUnderlying() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\MetricAffectingSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */