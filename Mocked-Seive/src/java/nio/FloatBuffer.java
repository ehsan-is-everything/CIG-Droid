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
/*    */ public abstract class FloatBuffer
/*    */   extends Buffer
/*    */   implements Comparable<FloatBuffer>
/*    */ {
/* 33 */   FloatBuffer() { throw new RuntimeException("Stub!"); }
/* 34 */   public static FloatBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 35 */   public static FloatBuffer wrap(float[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 36 */   public static FloatBuffer wrap(float[] array) { throw new RuntimeException("Stub!"); }
/*    */   public abstract FloatBuffer slice();
/*    */   public abstract FloatBuffer duplicate();
/*    */   public abstract FloatBuffer asReadOnlyBuffer();
/*    */   public abstract float get();
/*    */   public abstract FloatBuffer put(float paramFloat);
/*    */   public abstract float get(int paramInt);
/*    */   public abstract FloatBuffer put(int paramInt, float paramFloat);
/* 44 */   public FloatBuffer get(float[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 45 */   public FloatBuffer get(float[] dst) { throw new RuntimeException("Stub!"); }
/* 46 */   public FloatBuffer put(FloatBuffer src) { throw new RuntimeException("Stub!"); }
/* 47 */   public FloatBuffer put(float[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 48 */   public final FloatBuffer put(float[] src) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 50 */   public final float[] array() { throw new RuntimeException("Stub!"); }
/* 51 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract FloatBuffer compact();
/*    */   public abstract boolean isDirect();
/* 54 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 55 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 56 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 57 */   public int compareTo(FloatBuffer that) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ByteOrder order();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\FloatBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */