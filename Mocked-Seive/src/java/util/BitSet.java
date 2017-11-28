/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.LongBuffer;
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
/*    */ public class BitSet
/*    */   implements Cloneable, Serializable
/*    */ {
/* 30 */   public BitSet() { throw new RuntimeException("Stub!"); }
/* 31 */   public BitSet(int nbits) { throw new RuntimeException("Stub!"); }
/* 32 */   public static BitSet valueOf(long[] longs) { throw new RuntimeException("Stub!"); }
/* 33 */   public static BitSet valueOf(LongBuffer lb) { throw new RuntimeException("Stub!"); }
/* 34 */   public static BitSet valueOf(byte[] bytes) { throw new RuntimeException("Stub!"); }
/* 35 */   public static BitSet valueOf(ByteBuffer bb) { throw new RuntimeException("Stub!"); }
/* 36 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); }
/* 37 */   public long[] toLongArray() { throw new RuntimeException("Stub!"); }
/* 38 */   public void flip(int bitIndex) { throw new RuntimeException("Stub!"); }
/* 39 */   public void flip(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 40 */   public void set(int bitIndex) { throw new RuntimeException("Stub!"); }
/* 41 */   public void set(int bitIndex, boolean value) { throw new RuntimeException("Stub!"); }
/* 42 */   public void set(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 43 */   public void set(int fromIndex, int toIndex, boolean value) { throw new RuntimeException("Stub!"); }
/* 44 */   public void clear(int bitIndex) { throw new RuntimeException("Stub!"); }
/* 45 */   public void clear(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 46 */   public void clear() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean get(int bitIndex) { throw new RuntimeException("Stub!"); }
/* 48 */   public BitSet get(int fromIndex, int toIndex) { throw new RuntimeException("Stub!"); }
/* 49 */   public int nextSetBit(int fromIndex) { throw new RuntimeException("Stub!"); }
/* 50 */   public int nextClearBit(int fromIndex) { throw new RuntimeException("Stub!"); }
/* 51 */   public int previousSetBit(int fromIndex) { throw new RuntimeException("Stub!"); }
/* 52 */   public int previousClearBit(int fromIndex) { throw new RuntimeException("Stub!"); }
/* 53 */   public int length() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean intersects(BitSet set) { throw new RuntimeException("Stub!"); }
/* 56 */   public int cardinality() { throw new RuntimeException("Stub!"); }
/* 57 */   public void and(BitSet set) { throw new RuntimeException("Stub!"); }
/* 58 */   public void or(BitSet set) { throw new RuntimeException("Stub!"); }
/* 59 */   public void xor(BitSet set) { throw new RuntimeException("Stub!"); }
/* 60 */   public void andNot(BitSet set) { throw new RuntimeException("Stub!"); }
/* 61 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 62 */   public int size() { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 64 */   public Object clone() { throw new RuntimeException("Stub!"); }
/* 65 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 66 */   public IntStream stream() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\util\BitSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */