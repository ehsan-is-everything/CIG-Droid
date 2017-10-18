/*    */ package android.icu.text;
/*    */ 
/*    */ import android.icu.util.ULocale;
/*    */ import java.text.CharacterIterator;
/*    */ import java.util.Locale;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class StringSearch
/*    */   extends SearchIterator
/*    */ {
/*    */   public StringSearch(String pattern, CharacterIterator target, RuleBasedCollator collator, BreakIterator breakiter)
/*    */   {
/* 14 */     super((CharacterIterator)null, (BreakIterator)null);throw new RuntimeException("Stub!"); }
/* 15 */   public StringSearch(String pattern, CharacterIterator target, RuleBasedCollator collator) { super((CharacterIterator)null, (BreakIterator)null);throw new RuntimeException("Stub!"); }
/* 16 */   public StringSearch(String pattern, CharacterIterator target, Locale locale) { super((CharacterIterator)null, (BreakIterator)null);throw new RuntimeException("Stub!"); }
/* 17 */   public StringSearch(String pattern, CharacterIterator target, ULocale locale) { super((CharacterIterator)null, (BreakIterator)null);throw new RuntimeException("Stub!"); }
/* 18 */   public StringSearch(String pattern, String target) { super((CharacterIterator)null, (BreakIterator)null);throw new RuntimeException("Stub!"); }
/* 19 */   public RuleBasedCollator getCollator() { throw new RuntimeException("Stub!"); }
/* 20 */   public void setCollator(RuleBasedCollator collator) { throw new RuntimeException("Stub!"); }
/* 21 */   public String getPattern() { throw new RuntimeException("Stub!"); }
/* 22 */   public void setPattern(String pattern) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean isCanonical() { throw new RuntimeException("Stub!"); }
/* 24 */   public void setCanonical(boolean allowCanonical) { throw new RuntimeException("Stub!"); }
/* 25 */   public void setTarget(CharacterIterator text) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getIndex() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setIndex(int position) { throw new RuntimeException("Stub!"); }
/* 28 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 29 */   protected int handleNext(int position) { throw new RuntimeException("Stub!"); }
/* 30 */   protected int handlePrevious(int position) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\icu\text\StringSearch.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */