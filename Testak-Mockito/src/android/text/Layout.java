/*    */ package android.text;
/*    */ 
/*    */ import android.graphics.Path;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class Layout
/*    */ {
/*    */   public static final int BREAK_STRATEGY_BALANCED = 2;
/*    */   public static final int BREAK_STRATEGY_HIGH_QUALITY = 1;
/*    */   public static final int BREAK_STRATEGY_SIMPLE = 0;
/*    */   public static final int DIR_LEFT_TO_RIGHT = 1;
/*    */   public static final int DIR_RIGHT_TO_LEFT = -1;
/*    */   public static final int HYPHENATION_FREQUENCY_FULL = 2;
/*    */   public static final int HYPHENATION_FREQUENCY_NONE = 0;
/*    */   public static final int HYPHENATION_FREQUENCY_NORMAL = 1;
/*    */   public static final int JUSTIFICATION_MODE_INTER_WORD = 1;
/*    */   public static final int JUSTIFICATION_MODE_NONE = 0;
/*    */   
/*    */   public static class Directions
/*    */   {
/* 22 */     Directions() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static enum Alignment {
/* 26 */     ALIGN_CENTER, 
/* 27 */     ALIGN_NORMAL, 
/* 28 */     ALIGN_OPPOSITE;
/*    */     private Alignment() {} }
/* 30 */   protected Layout(CharSequence text, TextPaint paint, int width, Alignment align, float spacingMult, float spacingAdd) { throw new RuntimeException("Stub!"); }
/* 31 */   public static float getDesiredWidth(CharSequence source, TextPaint paint) { throw new RuntimeException("Stub!"); }
/* 32 */   public static float getDesiredWidth(CharSequence source, int start, int end, TextPaint paint) { throw new RuntimeException("Stub!"); }
/* 33 */   public void draw(android.graphics.Canvas c) { throw new RuntimeException("Stub!"); }
/* 34 */   public void draw(android.graphics.Canvas canvas, Path highlight, android.graphics.Paint highlightPaint, int cursorOffsetVertical) { throw new RuntimeException("Stub!"); }
/* 35 */   public final CharSequence getText() { throw new RuntimeException("Stub!"); }
/* 36 */   public final TextPaint getPaint() { throw new RuntimeException("Stub!"); }
/* 37 */   public final int getWidth() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getEllipsizedWidth() { throw new RuntimeException("Stub!"); }
/* 39 */   public final void increaseWidthTo(int wid) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getHeight() { throw new RuntimeException("Stub!"); }
/* 41 */   public final Alignment getAlignment() { throw new RuntimeException("Stub!"); }
/* 42 */   public final float getSpacingMultiplier() { throw new RuntimeException("Stub!"); }
/* 43 */   public final float getSpacingAdd() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getLineCount();
/* 45 */   public int getLineBounds(int line, android.graphics.Rect bounds) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getLineTop(int paramInt);
/*    */   public abstract int getLineDescent(int paramInt);
/*    */   public abstract int getLineStart(int paramInt);
/*    */   public abstract int getParagraphDirection(int paramInt);
/*    */   public abstract boolean getLineContainsTab(int paramInt);
/*    */   public abstract Directions getLineDirections(int paramInt);
/*    */   public abstract int getTopPadding();
/*    */   public abstract int getBottomPadding();
/* 54 */   public boolean isRtlCharAt(int offset) { throw new RuntimeException("Stub!"); }
/* 55 */   public float getPrimaryHorizontal(int offset) { throw new RuntimeException("Stub!"); }
/* 56 */   public float getSecondaryHorizontal(int offset) { throw new RuntimeException("Stub!"); }
/* 57 */   public float getLineLeft(int line) { throw new RuntimeException("Stub!"); }
/* 58 */   public float getLineRight(int line) { throw new RuntimeException("Stub!"); }
/* 59 */   public float getLineMax(int line) { throw new RuntimeException("Stub!"); }
/* 60 */   public float getLineWidth(int line) { throw new RuntimeException("Stub!"); }
/* 61 */   public int getLineForVertical(int vertical) { throw new RuntimeException("Stub!"); }
/* 62 */   public int getLineForOffset(int offset) { throw new RuntimeException("Stub!"); }
/* 63 */   public int getOffsetForHorizontal(int line, float horiz) { throw new RuntimeException("Stub!"); }
/* 64 */   public final int getLineEnd(int line) { throw new RuntimeException("Stub!"); }
/* 65 */   public int getLineVisibleEnd(int line) { throw new RuntimeException("Stub!"); }
/* 66 */   public final int getLineBottom(int line) { throw new RuntimeException("Stub!"); }
/* 67 */   public final int getLineBaseline(int line) { throw new RuntimeException("Stub!"); }
/* 68 */   public final int getLineAscent(int line) { throw new RuntimeException("Stub!"); }
/* 69 */   public int getOffsetToLeftOf(int offset) { throw new RuntimeException("Stub!"); }
/* 70 */   public int getOffsetToRightOf(int offset) { throw new RuntimeException("Stub!"); }
/* 71 */   public void getCursorPath(int point, Path dest, CharSequence editingBuffer) { throw new RuntimeException("Stub!"); }
/* 72 */   public void getSelectionPath(int start, int end, Path dest) { throw new RuntimeException("Stub!"); }
/* 73 */   public final Alignment getParagraphAlignment(int line) { throw new RuntimeException("Stub!"); }
/* 74 */   public final int getParagraphLeft(int line) { throw new RuntimeException("Stub!"); }
/* 75 */   public final int getParagraphRight(int line) { throw new RuntimeException("Stub!"); }
/* 76 */   protected final boolean isSpanned() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract int getEllipsisStart(int paramInt);
/*    */   
/*    */   public abstract int getEllipsisCount(int paramInt);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\text\Layout.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */