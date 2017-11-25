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
/*    */ public abstract class DoubleBuffer
/*    */   extends Buffer
/*    */   implements Comparable<DoubleBuffer>
/*    */ {
/* 33 */   DoubleBuffer() { throw new RuntimeException("Stub!"); }
/* 34 */   public static DoubleBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 35 */   public static DoubleBuffer wrap(double[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 36 */   public static DoubleBuffer wrap(double[] array) { throw new RuntimeException("Stub!"); }
/*    */   public abstract DoubleBuffer slice();
/*    */   public abstract DoubleBuffer duplicate();
/*    */   public abstract DoubleBuffer asReadOnlyBuffer();
/*    */   public abstract double get();
/*    */   public abstract DoubleBuffer put(double paramDouble);
/*    */   public abstract double get(int paramInt);
/*    */   public abstract DoubleBuffer put(int paramInt, double paramDouble);
/* 44 */   public DoubleBuffer get(double[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 45 */   public DoubleBuffer get(double[] dst) { throw new RuntimeException("Stub!"); }
/* 46 */   public DoubleBuffer put(DoubleBuffer src) { throw new RuntimeException("Stub!"); }
/* 47 */   public DoubleBuffer put(double[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 48 */   public final DoubleBuffer put(double[] src) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 50 */   public final double[] array() { throw new RuntimeException("Stub!"); }
/* 51 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract DoubleBuffer compact();
/*    */   public abstract boolean isDirect();
/* 54 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 55 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 57 */   public int compareTo(DoubleBuffer that) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ByteOrder order();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\DoubleBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */