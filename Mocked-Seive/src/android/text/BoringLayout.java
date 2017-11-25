/*    */ package android.text;
/*    */ 
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Paint;
/*    */ import android.graphics.Paint.FontMetricsInt;
/*    */ import android.graphics.Path;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class BoringLayout
/*    */   extends Layout
/*    */   implements TextUtils.EllipsizeCallback
/*    */ {
/*    */   public static class Metrics
/*    */     extends Paint.FontMetricsInt
/*    */   {
/*    */     public int width;
/*    */     
/* 25 */     public Metrics() { throw new RuntimeException("Stub!"); }
/* 26 */     public String toString() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/* 29 */   public BoringLayout(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad) { super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);throw new RuntimeException("Stub!"); }
/* 30 */   public BoringLayout(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);throw new RuntimeException("Stub!"); }
/* 31 */   public static BoringLayout make(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad) { throw new RuntimeException("Stub!"); }
/* 32 */   public static BoringLayout make(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { throw new RuntimeException("Stub!"); }
/* 33 */   public BoringLayout replaceOrMake(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad) { throw new RuntimeException("Stub!"); }
/* 34 */   public BoringLayout replaceOrMake(CharSequence source, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, Metrics metrics, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { throw new RuntimeException("Stub!"); }
/* 35 */   public static Metrics isBoring(CharSequence text, TextPaint paint) { throw new RuntimeException("Stub!"); }
/* 36 */   public static Metrics isBoring(CharSequence text, TextPaint paint, Metrics metrics) { throw new RuntimeException("Stub!"); }
/* 37 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getLineCount() { throw new RuntimeException("Stub!"); }
/* 39 */   public int getLineTop(int line) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getLineDescent(int line) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getLineStart(int line) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getParagraphDirection(int line) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean getLineContainsTab(int line) { throw new RuntimeException("Stub!"); }
/* 44 */   public float getLineMax(int line) { throw new RuntimeException("Stub!"); }
/* 45 */   public float getLineWidth(int line) { throw new RuntimeException("Stub!"); }
/* 46 */   public final Layout.Directions getLineDirections(int line) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getTopPadding() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getBottomPadding() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getEllipsisCount(int line) { throw new RuntimeException("Stub!"); }
/* 50 */   public int getEllipsisStart(int line) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getEllipsizedWidth() { throw new RuntimeException("Stub!"); }
/* 52 */   public void draw(Canvas c, Path highlight, Paint highlightpaint, int cursorOffset) { throw new RuntimeException("Stub!"); }
/* 53 */   public void ellipsized(int start, int end) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\BoringLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */