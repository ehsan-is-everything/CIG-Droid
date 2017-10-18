/*    */ package java.nio;
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
/*    */ public abstract class LongBuffer
/*    */   extends Buffer
/*    */   implements Comparable<LongBuffer>
/*    */ {
/* 33 */   LongBuffer() { throw new RuntimeException("Stub!"); }
/* 34 */   public static LongBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 35 */   public static LongBuffer wrap(long[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 36 */   public static LongBuffer wrap(long[] array) { throw new RuntimeException("Stub!"); }
/*    */   public abstract LongBuffer slice();
/*    */   public abstract LongBuffer duplicate();
/*    */   public abstract LongBuffer asReadOnlyBuffer();
/*    */   public abstract long get();
/*    */   public abstract LongBuffer put(long paramLong);
/*    */   public abstract long get(int paramInt);
/*    */   public abstract LongBuffer put(int paramInt, long paramLong);
/* 44 */   public LongBuffer get(long[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 45 */   public LongBuffer get(long[] dst) { throw new RuntimeException("Stub!"); }
/* 46 */   public LongBuffer put(LongBuffer src) { throw new RuntimeException("Stub!"); }
/* 47 */   public LongBuffer put(long[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 48 */   public final LongBuffer put(long[] src) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 50 */   public final long[] array() { throw new RuntimeException("Stub!"); }
/* 51 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract LongBuffer compact();
/*    */   public abstract boolean isDirect();
/* 54 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 55 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 57 */   public int compareTo(LongBuffer that) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ByteOrder order();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\LongBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */