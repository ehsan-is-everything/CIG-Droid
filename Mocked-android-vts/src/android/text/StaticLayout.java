/*    */ package android.text;
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
/*    */ 
/*    */ 
/*    */ public class StaticLayout
/*    */   extends Layout
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public static Builder obtain(CharSequence source, int start, int end, TextPaint paint, int width) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setText(CharSequence source) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setAlignment(Layout.Alignment alignment) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setTextDirection(TextDirectionHeuristic textDir) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setLineSpacing(float spacingAdd, float spacingMult) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setIncludePad(boolean includePad) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setEllipsizedWidth(int ellipsizedWidth) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setEllipsize(TextUtils.TruncateAt ellipsize) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setMaxLines(int maxLines) { throw new RuntimeException("Stub!"); }
/* 33 */     public Builder setBreakStrategy(int breakStrategy) { throw new RuntimeException("Stub!"); }
/* 34 */     public Builder setHyphenationFrequency(int hyphenationFrequency) { throw new RuntimeException("Stub!"); }
/* 35 */     public Builder setIndents(int[] leftIndents, int[] rightIndents) { throw new RuntimeException("Stub!"); }
/* 36 */     public Builder setJustificationMode(int justificationMode) { throw new RuntimeException("Stub!"); }
/* 37 */     public StaticLayout build() { throw new RuntimeException("Stub!"); }
/* 38 */     protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); } }
/*    */   
/* 40 */   public StaticLayout(CharSequence source, TextPaint paint, int width, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) { super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);throw new RuntimeException("Stub!"); }
/* 41 */   public StaticLayout(CharSequence source, int bufstart, int bufend, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad) { super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);throw new RuntimeException("Stub!"); }
/* 42 */   public StaticLayout(CharSequence source, int bufstart, int bufend, TextPaint paint, int outerwidth, Layout.Alignment align, float spacingmult, float spacingadd, boolean includepad, TextUtils.TruncateAt ellipsize, int ellipsizedWidth) { super((CharSequence)null, (TextPaint)null, 0, (Layout.Alignment)null, 0.0F, 0.0F);throw new RuntimeException("Stub!"); }
/* 43 */   public int getLineForVertical(int vertical) { throw new RuntimeException("Stub!"); }
/* 44 */   public int getLineCount() { throw new RuntimeException("Stub!"); }
/* 45 */   public int getLineTop(int line) { throw new RuntimeException("Stub!"); }
/* 46 */   public int getLineDescent(int line) { throw new RuntimeException("Stub!"); }
/* 47 */   public int getLineStart(int line) { throw new RuntimeException("Stub!"); }
/* 48 */   public int getParagraphDirection(int line) { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean getLineContainsTab(int line) { throw new RuntimeException("Stub!"); }
/* 50 */   public final Layout.Directions getLineDirections(int line) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getTopPadding() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getBottomPadding() { throw new RuntimeException("Stub!"); }
/* 53 */   public int getEllipsisCount(int line) { throw new RuntimeException("Stub!"); }
/* 54 */   public int getEllipsisStart(int line) { throw new RuntimeException("Stub!"); }
/* 55 */   public int getEllipsizedWidth() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\StaticLayout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */