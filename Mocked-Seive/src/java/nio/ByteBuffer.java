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
/*    */ public abstract class ByteBuffer
/*    */   extends Buffer
/*    */   implements Comparable<ByteBuffer>
/*    */ {
/* 34 */   ByteBuffer() { throw new RuntimeException("Stub!"); }
/* 35 */   public static ByteBuffer allocateDirect(int capacity) { throw new RuntimeException("Stub!"); }
/* 36 */   public static ByteBuffer allocate(int capacity) { throw new RuntimeException("Stub!"); }
/* 37 */   public static ByteBuffer wrap(byte[] array, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 38 */   public static ByteBuffer wrap(byte[] array) { throw new RuntimeException("Stub!"); }
/*    */   public abstract ByteBuffer slice();
/*    */   public abstract ByteBuffer duplicate();
/*    */   public abstract ByteBuffer asReadOnlyBuffer();
/*    */   public abstract byte get();
/*    */   public abstract ByteBuffer put(byte paramByte);
/*    */   public abstract byte get(int paramInt);
/*    */   public abstract ByteBuffer put(int paramInt, byte paramByte);
/* 46 */   public ByteBuffer get(byte[] dst, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 47 */   public ByteBuffer get(byte[] dst) { throw new RuntimeException("Stub!"); }
/* 48 */   public ByteBuffer put(ByteBuffer src) { throw new RuntimeException("Stub!"); }
/* 49 */   public ByteBuffer put(byte[] src, int offset, int length) { throw new RuntimeException("Stub!"); }
/* 50 */   public final ByteBuffer put(byte[] src) { throw new RuntimeException("Stub!"); }
/* 51 */   public final boolean hasArray() { throw new RuntimeException("Stub!"); }
/* 52 */   public final byte[] array() { throw new RuntimeException("Stub!"); }
/* 53 */   public final int arrayOffset() { throw new RuntimeException("Stub!"); }
/*    */   public abstract ByteBuffer compact();
/*    */   public abstract boolean isDirect();
/* 56 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 57 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 59 */   public int compareTo(ByteBuffer that) { throw new RuntimeException("Stub!"); }
/* 60 */   public final ByteOrder order() { throw new RuntimeException("Stub!"); }
/* 61 */   public final ByteBuffer order(ByteOrder bo) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract char getChar();
/*    */   
/*    */   public abstract ByteBuffer putChar(char paramChar);
/*    */   
/*    */   public abstract char getChar(int paramInt);
/*    */   
/*    */   public abstract ByteBuffer putChar(int paramInt, char paramChar);
/*    */   
/*    */   public abstract CharBuffer asCharBuffer();
/*    */   
/*    */   public abstract short getShort();
/*    */   
/*    */   public abstract ByteBuffer putShort(short paramShort);
/*    */   
/*    */   public abstract short getShort(int paramInt);
/*    */   
/*    */   public abstract ByteBuffer putShort(int paramInt, short paramShort);
/*    */   
/*    */   public abstract ShortBuffer asShortBuffer();
/*    */   
/*    */   public abstract int getInt();
/*    */   
/*    */   public abstract ByteBuffer putInt(int paramInt);
/*    */   
/*    */   public abstract int getInt(int paramInt);
/*    */   
/*    */   public abstract ByteBuffer putInt(int paramInt1, int paramInt2);
/*    */   
/*    */   public abstract IntBuffer asIntBuffer();
/*    */   
/*    */   public abstract long getLong();
/*    */   
/*    */   public abstract ByteBuffer putLong(long paramLong);
/*    */   
/*    */   public abstract long getLong(int paramInt);
/*    */   
/*    */   public abstract ByteBuffer putLong(int paramInt, long paramLong);
/*    */   
/*    */   public abstract LongBuffer asLongBuffer();
/*    */   
/*    */   public abstract float getFloat();
/*    */   
/*    */   public abstract ByteBuffer putFloat(float paramFloat);
/*    */   
/*    */   public abstract float getFloat(int paramInt);
/*    */   
/*    */   public abstract ByteBuffer putFloat(int paramInt, float paramFloat);
/*    */   
/*    */   public abstract FloatBuffer asFloatBuffer();
/*    */   
/*    */   public abstract double getDouble();
/*    */   
/*    */   public abstract ByteBuffer putDouble(double paramDouble);
/*    */   
/*    */   public abstract double getDouble(int paramInt);
/*    */   
/*    */   public abstract ByteBuffer putDouble(int paramInt, double paramDouble);
/*    */   
/*    */   public abstract DoubleBuffer asDoubleBuffer();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\ByteBuffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */