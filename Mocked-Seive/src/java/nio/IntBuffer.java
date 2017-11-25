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
/*    */ 
/*    */ public abstract class IntBuffer
/*    */   extends Buffer
/*    */   implements Comparable<IntBuffer>
/*    */ {
/* 34 */   IntBuffer() { throw new RuntimeException("Stub!"); }
/* 35 */   public static IntBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 36 */   public static IntBuffer wrap(int[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 37 */   public static IntBuffer wrap(int[] array) { throw new RuntimeException("Stub!"); }
/*    */   public abstract IntBuffer slice();
/*    */   public abstract IntBuffer duplicate();
/*    */   public abstract IntBuffer asReadOnlyBuffer();
/*    */   public abstract int get();
/*    */   public abstract IntBuffer put(int paramInt);
/*    */   public abstract int get(int paramInt);
/*    */   public abstract IntBuffer put(int paramInt1, int paramInt2);
/* 45 */   public IntBuffer get(int[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 46 */   public IntBuffer get(int[] dst) { throw new RuntimeException("Stub!"); }
/* 47 */   public IntBuffer put(IntBuffer src) { throw new RuntimeException("Stub!"); }
/* 48 */   public IntBuffer put(int[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 49 */   public final IntBuffer put(int[] src) { throw new RuntimeException("Stub!"); }
/* 50 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 51 */   public final int[] array() { throw new RuntimeException("Stub!"); }
/* 52 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract IntBuffer compact();
/*    */   public abstract boolean isDirect();
/* 55 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 56 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 58 */   public int compareTo(IntBuffer that) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ByteOrder order();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\IntBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */