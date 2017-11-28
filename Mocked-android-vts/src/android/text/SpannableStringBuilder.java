/*    */ package android.text;
/*    */ 
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
/*    */ 
/*    */ 
/*    */ public class SpannableStringBuilder
/*    */   implements CharSequence, GetChars, Spannable, Editable, Appendable
/*    */ {
/* 21 */   public SpannableStringBuilder() { throw new RuntimeException("Stub!"); }
/* 22 */   public SpannableStringBuilder(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 23 */   public SpannableStringBuilder(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
/* 24 */   public static SpannableStringBuilder valueOf(CharSequence source) { throw new RuntimeException("Stub!"); }
/* 25 */   public char charAt(int where) { throw new RuntimeException("Stub!"); }
/* 26 */   public int length() { throw new RuntimeException("Stub!"); }
/* 27 */   public SpannableStringBuilder insert(int where, CharSequence tb, int start, int end) { throw new RuntimeException("Stub!"); }
/* 28 */   public SpannableStringBuilder insert(int where, CharSequence tb) { throw new RuntimeException("Stub!"); }
/* 29 */   public SpannableStringBuilder delete(int start, int end) { throw new RuntimeException("Stub!"); }
/* 30 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 31 */   public void clearSpans() { throw new RuntimeException("Stub!"); }
/* 32 */   public SpannableStringBuilder append(CharSequence text) { throw new RuntimeException("Stub!"); }
/* 33 */   public SpannableStringBuilder append(CharSequence text, Object what, int flags) { throw new RuntimeException("Stub!"); }
/* 34 */   public SpannableStringBuilder append(CharSequence text, int start, int end) { throw new RuntimeException("Stub!"); }
/* 35 */   public SpannableStringBuilder append(char text) { throw new RuntimeException("Stub!"); }
/* 36 */   public SpannableStringBuilder replace(int start, int end, CharSequence tb) { throw new RuntimeException("Stub!"); }
/* 37 */   public SpannableStringBuilder replace(int start, int end, CharSequence tb, int tbstart, int tbend) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setSpan(Object what, int start, int end, int flags) { throw new RuntimeException("Stub!"); }
/* 39 */   public void removeSpan(Object what) { throw new RuntimeException("Stub!"); }
/* 40 */   public int getSpanStart(Object what) { throw new RuntimeException("Stub!"); }
/* 41 */   public int getSpanEnd(Object what) { throw new RuntimeException("Stub!"); }
/* 42 */   public int getSpanFlags(Object what) { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public <T> T[] getSpans(int queryStart, int queryEnd, Class<T> kind) { throw new RuntimeException("Stub!"); }
/* 45 */   public int nextSpanTransition(int start, int limit, Class kind) { throw new RuntimeException("Stub!"); }
/* 46 */   public CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
/* 47 */   public void getChars(int start, int end, char[] dest, int destoff) { throw new RuntimeException("Stub!"); }
/* 48 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getTextWatcherDepth() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 51 */   public int getTextRunCursor(int contextStart, int contextEnd, int dir, int offset, int cursorOpt, Paint p) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setFilters(InputFilter[] filters) { throw new RuntimeException("Stub!"); }
/* 53 */   public InputFilter[] getFilters() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); }
/* 55 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\text\SpannableStringBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */