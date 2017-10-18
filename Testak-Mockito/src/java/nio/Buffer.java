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
/*    */ public abstract class Buffer
/*    */ {
/* 30 */   Buffer() { throw new RuntimeException("Stub!"); }
/* 31 */   public final int capacity() { throw new RuntimeException("Stub!"); }
/* 32 */   public final int position() { throw new RuntimeException("Stub!"); }
/* 33 */   public final Buffer position(int newPosition) { throw new RuntimeException("Stub!"); }
/* 34 */   public final int limit() { throw new RuntimeException("Stub!"); }
/* 35 */   public final Buffer limit(int newLimit) { throw new RuntimeException("Stub!"); }
/* 36 */   public final Buffer mark() { throw new RuntimeException("Stub!"); }
/* 37 */   public final Buffer reset() { throw new RuntimeException("Stub!"); }
/* 38 */   public final Buffer clear() { throw new RuntimeException("Stub!"); }
/* 39 */   public final Buffer flip() { throw new RuntimeException("Stub!"); }
/* 40 */   public final Buffer rewind() { throw new RuntimeException("Stub!"); }
/* 41 */   public final int remaining() { throw new RuntimeException("Stub!"); }
/* 42 */   public final boolean hasRemaining() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean isReadOnly();
/*    */   
/*    */   public abstract boolean hasArray();
/*    */   
/*    */   public abstract Object array();
/*    */   
/*    */   public abstract int arrayOffset();
/*    */   
/*    */   public abstract boolean isDirect();
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\Buffer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */