/*    */ package java.lang;
/*    */ 
/*    */ import java.io.Serializable;
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
/*    */ public final class StringBuffer
/*    */   extends AbstractStringBuilder
/*    */   implements Serializable, CharSequence
/*    */ {
/* 31 */   public StringBuffer() { throw new RuntimeException("Stub!"); }
/* 32 */   public StringBuffer(int capacity) { throw new RuntimeException("Stub!"); }
/* 33 */   public StringBuffer(String str) { throw new RuntimeException("Stub!"); }
/* 34 */   public StringBuffer(CharSequence seq) { throw new RuntimeException("Stub!"); }
/* 35 */   public synchronized int length() { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized int capacity() { throw new RuntimeException("Stub!"); }
/* 37 */   public synchronized void ensureCapacity(int minimumCapacity) { throw new RuntimeException("Stub!"); }
/* 38 */   public synchronized void trimToSize() { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized void setLength(int newLength) { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized char charAt(int index) { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized int codePointAt(int index) { throw new RuntimeException("Stub!"); }
/* 42 */   public synchronized int codePointBefore(int index) { throw new RuntimeException("Stub!"); }
/* 43 */   public synchronized int codePointCount(int beginIndex, int endIndex) { throw new RuntimeException("Stub!"); }
/* 44 */   public synchronized int offsetByCodePoints(int index, int codePointOffset) { throw new RuntimeException("Stub!"); }
/* 45 */   public synchronized void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin) { throw new RuntimeException("Stub!"); }
/* 46 */   public synchronized void setCharAt(int index, char ch) { throw new RuntimeException("Stub!"); }
/* 47 */   public synchronized StringBuffer append(Object obj) { throw new RuntimeException("Stub!"); }
/* 48 */   public synchronized StringBuffer append(String str) { throw new RuntimeException("Stub!"); }
/* 49 */   public synchronized StringBuffer append(StringBuffer sb) { throw new RuntimeException("Stub!"); }
/* 50 */   public synchronized StringBuffer append(CharSequence s) { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized StringBuffer append(CharSequence s, int start, int end) { throw new RuntimeException("Stub!"); }
/* 52 */   public synchronized StringBuffer append(char[] str) { throw new RuntimeException("Stub!"); }
/* 53 */   public synchronized StringBuffer append(char[] str, int offset, int len) { throw new RuntimeException("Stub!"); }
/* 54 */   public synchronized StringBuffer append(boolean b) { throw new RuntimeException("Stub!"); }
/* 55 */   public synchronized StringBuffer append(char c) { throw new RuntimeException("Stub!"); }
/* 56 */   public synchronized StringBuffer append(int i) { throw new RuntimeException("Stub!"); }
/* 57 */   public synchronized StringBuffer appendCodePoint(int codePoint) { throw new RuntimeException("Stub!"); }
/* 58 */   public synchronized StringBuffer append(long lng) { throw new RuntimeException("Stub!"); }
/* 59 */   public synchronized StringBuffer append(float f) { throw new RuntimeException("Stub!"); }
/* 60 */   public synchronized StringBuffer append(double d) { throw new RuntimeException("Stub!"); }
/* 61 */   public synchronized StringBuffer delete(int start, int end) { throw new RuntimeException("Stub!"); }
/* 62 */   public synchronized StringBuffer deleteCharAt(int index) { throw new RuntimeException("Stub!"); }
/* 63 */   public synchronized StringBuffer replace(int start, int end, String str) { throw new RuntimeException("Stub!"); }
/* 64 */   public synchronized String substring(int start) { throw new RuntimeException("Stub!"); }
/* 65 */   public synchronized CharSequence subSequence(int start, int end) { throw new RuntimeException("Stub!"); }
/* 66 */   public synchronized String substring(int start, int end) { throw new RuntimeException("Stub!"); }
/* 67 */   public synchronized StringBuffer insert(int index, char[] str, int offset, int len) { throw new RuntimeException("Stub!"); }
/* 68 */   public synchronized StringBuffer insert(int offset, Object obj) { throw new RuntimeException("Stub!"); }
/* 69 */   public synchronized StringBuffer insert(int offset, String str) { throw new RuntimeException("Stub!"); }
/* 70 */   public synchronized StringBuffer insert(int offset, char[] str) { throw new RuntimeException("Stub!"); }
/* 71 */   public StringBuffer insert(int dstOffset, CharSequence s) { throw new RuntimeException("Stub!"); }
/* 72 */   public synchronized StringBuffer insert(int dstOffset, CharSequence s, int start, int end) { throw new RuntimeException("Stub!"); }
/* 73 */   public StringBuffer insert(int offset, boolean b) { throw new RuntimeException("Stub!"); }
/* 74 */   public synchronized StringBuffer insert(int offset, char c) { throw new RuntimeException("Stub!"); }
/* 75 */   public StringBuffer insert(int offset, int i) { throw new RuntimeException("Stub!"); }
/* 76 */   public StringBuffer insert(int offset, long l) { throw new RuntimeException("Stub!"); }
/* 77 */   public StringBuffer insert(int offset, float f) { throw new RuntimeException("Stub!"); }
/* 78 */   public StringBuffer insert(int offset, double d) { throw new RuntimeException("Stub!"); }
/* 79 */   public int indexOf(String str) { throw new RuntimeException("Stub!"); }
/* 80 */   public synchronized int indexOf(String str, int fromIndex) { throw new RuntimeException("Stub!"); }
/* 81 */   public int lastIndexOf(String str) { throw new RuntimeException("Stub!"); }
/* 82 */   public synchronized int lastIndexOf(String str, int fromIndex) { throw new RuntimeException("Stub!"); }
/* 83 */   public synchronized StringBuffer reverse() { throw new RuntimeException("Stub!"); }
/* 84 */   public synchronized String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\lang\StringBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */