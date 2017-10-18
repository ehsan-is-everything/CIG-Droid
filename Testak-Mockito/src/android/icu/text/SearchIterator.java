/*    */ package android.icu.text;
/*    */ 
/*    */ import java.text.CharacterIterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SearchIterator
/*    */ {
/*    */   public static final int DONE = -1;
/*    */   protected BreakIterator breakIterator;
/*    */   protected int matchLength;
/*    */   protected CharacterIterator targetText;
/*    */   
/*    */   public static enum ElementComparisonType
/*    */   {
/* 16 */     ANY_BASE_WEIGHT_IS_WILDCARD, 
/* 17 */     PATTERN_BASE_WEIGHT_IS_WILDCARD, 
/* 18 */     STANDARD_ELEMENT_COMPARISON;
/*    */     private ElementComparisonType() {} }
/* 20 */   protected SearchIterator(CharacterIterator target, BreakIterator breaker) { throw new RuntimeException("Stub!"); }
/* 21 */   public void setIndex(int position) { throw new RuntimeException("Stub!"); }
/* 22 */   public void setOverlapping(boolean allowOverlap) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setBreakIterator(BreakIterator breakiter) { throw new RuntimeException("Stub!"); }
/* 24 */   public void setTarget(CharacterIterator text) { throw new RuntimeException("Stub!"); }
/* 25 */   public int getMatchStart() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getIndex();
/* 27 */   public int getMatchLength() { throw new RuntimeException("Stub!"); }
/* 28 */   public BreakIterator getBreakIterator() { throw new RuntimeException("Stub!"); }
/* 29 */   public CharacterIterator getTarget() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getMatchedText() { throw new RuntimeException("Stub!"); }
/* 31 */   public int next() { throw new RuntimeException("Stub!"); }
/* 32 */   public int previous() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isOverlapping() { throw new RuntimeException("Stub!"); }
/* 34 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 35 */   public final int first() { throw new RuntimeException("Stub!"); }
/* 36 */   public final int following(int position) { throw new RuntimeException("Stub!"); }
/* 37 */   public final int last() { throw new RuntimeException("Stub!"); }
/* 38 */   public final int preceding(int position) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void setMatchLength(int length) { throw new RuntimeException("Stub!"); }
/*    */   protected abstract int handleNext(int paramInt);
/*    */   protected abstract int handlePrevious(int paramInt);
/* 42 */   public void setElementComparisonType(ElementComparisonType type) { throw new RuntimeException("Stub!"); }
/* 43 */   public ElementComparisonType getElementComparisonType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\SearchIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */