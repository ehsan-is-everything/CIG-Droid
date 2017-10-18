/*    */ package java.nio;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.stream.IntStream;
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
/*    */ public abstract class CharBuffer
/*    */   extends Buffer
/*    */   implements Comparable<CharBuffer>, Appendable, CharSequence, Readable
/*    */ {
/* 34 */   CharBuffer() { throw new RuntimeException("Stub!"); }
/* 35 */   public static CharBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 36 */   public static CharBuffer wrap(char[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 37 */   public static CharBuffer wrap(char[] array) { throw new RuntimeException("Stub!"); }
/* 38 */   public int read(CharBuffer target) throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public static CharBuffer wrap(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
/* 40 */   public static CharBuffer wrap(CharSequence csq) { throw new RuntimeException("Stub!"); }
/*    */   public abstract CharBuffer slice();
/*    */   public abstract CharBuffer duplicate();
/*    */   public abstract CharBuffer asReadOnlyBuffer();
/*    */   public abstract char get();
/*    */   public abstract CharBuffer put(char paramChar);
/*    */   public abstract char get(int paramInt);
/*    */   public abstract CharBuffer put(int paramInt, char paramChar);
/* 48 */   public CharBuffer get(char[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 49 */   public CharBuffer get(char[] dst) { throw new RuntimeException("Stub!"); }
/* 50 */   public CharBuffer put(CharBuffer src) { throw new RuntimeException("Stub!"); }
/* 51 */   public CharBuffer put(char[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 52 */   public final CharBuffer put(char[] src) { throw new RuntimeException("Stub!"); }
/* 53 */   public CharBuffer put(String src, int start, int end) { throw new RuntimeException("Stub!"); }
/* 54 */   public final CharBuffer put(String src) { throw new RuntimeException("Stub!"); }
/* 55 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 56 */   public final char[] array() { throw new RuntimeException("Stub!"); }
/* 57 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract CharBuffer compact();
/*    */   public abstract boolean isDirect();
/* 60 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 61 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 62 */   public int compareTo(CharBuffer that) { throw new RuntimeException("Stub!"); }
/* 63 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 64 */   public final int length() { throw new RuntimeException("Stub!"); }
/* 65 */   public final char charAt(int index) { throw new RuntimeException("Stub!"); }
/*    */   public abstract CharBuffer subSequence(int paramInt1, int paramInt2);
/* 67 */   public CharBuffer append(CharSequence csq) { throw new RuntimeException("Stub!"); }
/* 68 */   public CharBuffer append(CharSequence csq, int start, int end) { throw new RuntimeException("Stub!"); }
/* 69 */   public CharBuffer append(char c) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ByteOrder order();
/* 71 */   public IntStream chars() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\CharBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */