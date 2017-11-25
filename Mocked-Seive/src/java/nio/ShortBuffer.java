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
/*    */ public abstract class ShortBuffer
/*    */   extends Buffer
/*    */   implements Comparable<ShortBuffer>
/*    */ {
/* 33 */   ShortBuffer() { throw new RuntimeException("Stub!"); }
/* 34 */   public static ShortBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 35 */   public static ShortBuffer wrap(short[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 36 */   public static ShortBuffer wrap(short[] array) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ShortBuffer slice();
/*    */   public abstract ShortBuffer duplicate();
/*    */   public abstract ShortBuffer asReadOnlyBuffer();
/*    */   public abstract short get();
/*    */   public abstract ShortBuffer put(short paramShort);
/*    */   public abstract short get(int paramInt);
/*    */   public abstract ShortBuffer put(int paramInt, short paramShort);
/* 44 */   public ShortBuffer get(short[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 45 */   public ShortBuffer get(short[] dst) { throw new RuntimeException("Stub!"); }
/* 46 */   public ShortBuffer put(ShortBuffer src) { throw new RuntimeException("Stub!"); }
/* 47 */   public ShortBuffer put(short[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 48 */   public final ShortBuffer put(short[] src) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 50 */   public final short[] array() { throw new RuntimeException("Stub!"); }
/* 51 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract ShortBuffer compact();
/*    */   public abstract boolean isDirect();
/* 54 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 55 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 57 */   public int compareTo(ShortBuffer that) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ByteOrder order();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\ShortBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */