/*    */ package android.text.style;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Paint.FontMetricsInt;
/*    */ import android.graphics.drawable.Drawable;
/*    */ import android.text.Layout;
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
/*    */ public class DrawableMarginSpan
/*    */   implements LeadingMarginSpan, LineHeightSpan
/*    */ {
/* 21 */   public DrawableMarginSpan(Drawable b) { throw new RuntimeException("Stub!"); }
/* 22 */   public DrawableMarginSpan(Drawable b, int pad) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getLeadingMargin(boolean first) { throw new RuntimeException("Stub!"); }
/* 24 */   public void drawLeadingMargin(Canvas c, Paint p, int x, int dir, int top, int baseline, int bottom, CharSequence text, int start, int end, boolean first, Layout layout) { throw new RuntimeException("Stub!"); }
/* 25 */   public void chooseHeight(CharSequence text, int start, int end, int istartv, int v, Paint.FontMetricsInt fm) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\style\DrawableMarginSpan.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */