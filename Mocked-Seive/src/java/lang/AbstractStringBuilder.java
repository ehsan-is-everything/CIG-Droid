/*    */ package java.lang;
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
/*    */ abstract class AbstractStringBuilder
/*    */   implements Appendable, CharSequence
/*    */ {
/* 31 */   AbstractStringBuilder() { throw new RuntimeException("Stub!"); }
/* 32 */   public int length() { throw new RuntimeException("Stub!"); }
/* 33 */   public int capacity() { throw new RuntimeException("Stub!"); }
/* 34 */   public void ensureCapacity(int minimumCapacity) { throw new RuntimeException("Stub!"); }
/* 35 */   public void trimToSize() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setLength(int newLength) { throw new RuntimeException("Stub!"); }
/* 37 */   public char charAt(int index) { throw new RuntimeException("Stub!"); }
/* 38 */   public int codePointAt(int index) { throw new RuntimeException("Stub!"); }
/* 39 */   public int codePointBefore(int index) { throw new RuntimeException("Stub!"); }
/* 40 */   public int codePointCount(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
/* 41 */   public int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/* 42 */   public void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }
/* 43 */   public void setCharAt(int index, char ch) { throw new RuntimeException("Stub!"); }
/* 44 */   public String substring(int start) { throw new RuntimeException("Stub!"); }
/* 45 */   public CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
/* 46 */   public String substring(int start, int end) { throw new RuntimeException("Stub!"); }
/* 47 */   public int indexOf(String str) { throw new RuntimeException("Stub!"); }
/* 48 */   public int indexOf(String str, int fromIndex) { throw new RuntimeException("Stub!"); }
/* 49 */   public int lastIndexOf(String str) { throw new RuntimeException("Stub!"); }
/* 50 */   public int lastIndexOf(String str, int fromIndex) { throw new RuntimeException("Stub!"); }
/*    */   public abstract String toString();
/* 52 */   public AbstractStringBuilder append(CharSequence s) { throw new RuntimeException("Stub!"); }
/* 53 */   public AbstractStringBuilder append(CharSequence s, int start, int end) { throw new RuntimeException("Stub!"); }
/* 54 */   public AbstractStringBuilder append(char c) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\lang\AbstractStringBuilder.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */