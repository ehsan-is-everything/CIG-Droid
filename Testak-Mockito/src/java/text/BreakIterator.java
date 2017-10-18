/*    */ package java.text;
/*    */ 
/*    */ import java.util.Locale;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class BreakIterator
/*    */   implements Cloneable
/*    */ {
/*    */   public static final int DONE = -1;
/*    */   
/* 46 */   protected BreakIterator() { throw new RuntimeException("Stub!"); }
/* 47 */   public Object clone() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int first();
/*    */   public abstract int last();
/*    */   public abstract int next(int paramInt);
/*    */   public abstract int next();
/*    */   public abstract int previous();
/*    */   public abstract int following(int paramInt);
/* 54 */   public int preceding(int offset) { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean isBoundary(int offset) { throw new RuntimeException("Stub!"); }
/*    */   public abstract int current();
/*    */   public abstract CharacterIterator getText();
/* 58 */   public void setText(String newText) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setText(CharacterIterator paramCharacterIterator);
/* 60 */   public static BreakIterator getWordInstance() { throw new RuntimeException("Stub!"); }
/* 61 */   public static BreakIterator getWordInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 62 */   public static BreakIterator getLineInstance() { throw new RuntimeException("Stub!"); }
/* 63 */   public static BreakIterator getLineInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 64 */   public static BreakIterator getCharacterInstance() { throw new RuntimeException("Stub!"); }
/* 65 */   public static BreakIterator getCharacterInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 66 */   public static BreakIterator getSentenceInstance() { throw new RuntimeException("Stub!"); }
/* 67 */   public static BreakIterator getSentenceInstance(Locale locale) { throw new RuntimeException("Stub!"); }
/* 68 */   public static synchronized Locale[] getAvailableLocales() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\text\BreakIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */