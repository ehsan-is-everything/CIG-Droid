/*    */ package java.text;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Bidi
/*    */ {
/*    */   public static final int DIRECTION_DEFAULT_LEFT_TO_RIGHT = -2;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int DIRECTION_DEFAULT_RIGHT_TO_LEFT = -1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int DIRECTION_LEFT_TO_RIGHT = 0;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int DIRECTION_RIGHT_TO_LEFT = 1;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 40 */   public Bidi(String paragraph, int flags) { throw new RuntimeException("Stub!"); }
/* 41 */   public Bidi(AttributedCharacterIterator paragraph) { throw new RuntimeException("Stub!"); }
/* 42 */   public Bidi(char[] text, int textStart, byte[] embeddings, int embStart, int paragraphLength, int flags) { throw new RuntimeException("Stub!"); }
/* 43 */   public Bidi createLineBidi(int lineStart, int lineLimit) { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isMixed() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isLeftToRight() { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean isRightToLeft() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getLength() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean baseIsLeftToRight() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getBaseLevel() { throw new RuntimeException("Stub!"); }
/* 50 */   public int getLevelAt(int offset) { throw new RuntimeException("Stub!"); }
/* 51 */   public int getRunCount() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getRunLevel(int run) { throw new RuntimeException("Stub!"); }
/* 53 */   public int getRunStart(int run) { throw new RuntimeException("Stub!"); }
/* 54 */   public int getRunLimit(int run) { throw new RuntimeException("Stub!"); }
/* 55 */   public static boolean requiresBidi(char[] text, int start, int limit) { throw new RuntimeException("Stub!"); }
/* 56 */   public static void reorderVisually(byte[] levels, int levelStart, Object[] objects, int objectStart, int count) { throw new RuntimeException("Stub!"); }
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\text\Bidi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */