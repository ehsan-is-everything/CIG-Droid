/*    */ package android.icu.text;
/*    */ 
/*    */ import java.util.Locale;
/*    */ 
/*    */ public abstract class BreakIterator implements Cloneable {
/*    */   public static final int DONE = -1;
/*    */   public static final int KIND_CHARACTER = 0;
/*    */   public static final int KIND_LINE = 2;
/*    */   public static final int KIND_SENTENCE = 3;
/*    */   public static final int KIND_TITLE = 4;
/*    */   public static final int KIND_WORD = 1;
/*    */   public static final int WORD_IDEO = 400;
/*    */   public static final int WORD_IDEO_LIMIT = 500;
/*    */   
/* 15 */   protected BreakIterator() { throw new RuntimeException("Stub!"); }
/* 16 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int first();
/*    */   public abstract int last();
/*    */   public abstract int next(int paramInt);
/*    */   public abstract int next();
/*    */   public abstract int previous();
/*    */   public abstract int following(int paramInt);
/* 23 */   public int preceding(int offset) { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean isBoundary(int offset) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int current();
/* 26 */   public int getRuleStatus() { throw new RuntimeException("Stub!"); }
/* 27 */   public int getRuleStatusVec(int[] fillInArray) { throw new RuntimeException("Stub!"); }
/*    */   public abstract java.text.CharacterIterator getText();
/* 29 */   public void setText(String newText) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setText(java.text.CharacterIterator paramCharacterIterator);
/* 31 */   public static BreakIterator getWordInstance() { throw new RuntimeException("Stub!"); }
/* 32 */   public static BreakIterator getWordInstance(Locale where) { throw new RuntimeException("Stub!"); }
/* 33 */   public static BreakIterator getWordInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
/* 34 */   public static BreakIterator getLineInstance() { throw new RuntimeException("Stub!"); }
/* 35 */   public static BreakIterator getLineInstance(Locale where) { throw new RuntimeException("Stub!"); }
/* 36 */   public static BreakIterator getLineInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
/* 37 */   public static BreakIterator getCharacterInstance() { throw new RuntimeException("Stub!"); }
/* 38 */   public static BreakIterator getCharacterInstance(Locale where) { throw new RuntimeException("Stub!"); }
/* 39 */   public static BreakIterator getCharacterInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
/* 40 */   public static BreakIterator getSentenceInstance() { throw new RuntimeException("Stub!"); }
/* 41 */   public static BreakIterator getSentenceInstance(Locale where) { throw new RuntimeException("Stub!"); }
/* 42 */   public static BreakIterator getSentenceInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
/* 43 */   public static BreakIterator getTitleInstance() { throw new RuntimeException("Stub!"); }
/* 44 */   public static BreakIterator getTitleInstance(Locale where) { throw new RuntimeException("Stub!"); }
/* 45 */   public static BreakIterator getTitleInstance(android.icu.util.ULocale where) { throw new RuntimeException("Stub!"); }
/* 46 */   public static synchronized Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int WORD_KANA = 300;
/*    */   public static final int WORD_KANA_LIMIT = 400;
/*    */   public static final int WORD_LETTER = 200;
/*    */   public static final int WORD_LETTER_LIMIT = 300;
/*    */   public static final int WORD_NONE = 0;
/*    */   public static final int WORD_NONE_LIMIT = 100;
/*    */   public static final int WORD_NUMBER = 100;
/*    */   public static final int WORD_NUMBER_LIMIT = 200;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\BreakIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */