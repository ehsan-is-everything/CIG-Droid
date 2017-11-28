/*    */ package android.icu.text;
/*    */ 
/*    */ import java.text.CharacterIterator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class UCharacterIterator
/*    */   implements Cloneable
/*    */ {
/*    */   public static final int DONE = -1;
/*    */   
/* 14 */   protected UCharacterIterator() { throw new RuntimeException("Stub!"); }
/* 15 */   public static final UCharacterIterator getInstance(Replaceable source) { throw new RuntimeException("Stub!"); }
/* 16 */   public static final UCharacterIterator getInstance(String source) { throw new RuntimeException("Stub!"); }
/* 17 */   public static final UCharacterIterator getInstance(char[] source) { throw new RuntimeException("Stub!"); }
/* 18 */   public static final UCharacterIterator getInstance(char[] source, int start, int limit) { throw new RuntimeException("Stub!"); }
/* 19 */   public static final UCharacterIterator getInstance(StringBuffer source) { throw new RuntimeException("Stub!"); }
/* 20 */   public static final UCharacterIterator getInstance(CharacterIterator source) { throw new RuntimeException("Stub!"); }
/* 21 */   public CharacterIterator getCharacterIterator() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int current();
/* 23 */   public int currentCodePoint() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getLength();
/*    */   public abstract int getIndex();
/*    */   public abstract int next();
/* 27 */   public int nextCodePoint() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int previous();
/* 29 */   public int previousCodePoint() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void setIndex(int paramInt);
/* 31 */   public void setToLimit() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setToStart() { throw new RuntimeException("Stub!"); }
/*    */   public abstract int getText(char[] paramArrayOfChar, int paramInt);
/* 34 */   public final int getText(char[] fillIn) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getText() { throw new RuntimeException("Stub!"); }
/* 36 */   public int moveIndex(int delta) { throw new RuntimeException("Stub!"); }
/* 37 */   public int moveCodePointIndex(int delta) { throw new RuntimeException("Stub!"); }
/* 38 */   public Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\icu\text\UCharacterIterator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */