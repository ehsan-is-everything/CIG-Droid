/*    */ package java.nio.channels;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class SelectionKey
/*    */ {
/*    */   public static final int OP_ACCEPT = 16;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int OP_CONNECT = 8;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int OP_READ = 1;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int OP_WRITE = 4;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 29 */   protected SelectionKey() { throw new RuntimeException("Stub!"); }
/*    */   public abstract SelectableChannel channel();
/*    */   public abstract Selector selector();
/*    */   public abstract boolean isValid();
/*    */   public abstract void cancel();
/*    */   public abstract int interestOps();
/*    */   public abstract SelectionKey interestOps(int paramInt);
/*    */   public abstract int readyOps();
/* 37 */   public final boolean isReadable() { throw new RuntimeException("Stub!"); }
/* 38 */   public final boolean isWritable() { throw new RuntimeException("Stub!"); }
/* 39 */   public final boolean isConnectable() { throw new RuntimeException("Stub!"); }
/* 40 */   public final boolean isAcceptable() { throw new RuntimeException("Stub!"); }
/* 41 */   public final Object attach(Object ob) { throw new RuntimeException("Stub!"); }
/* 42 */   public final Object attachment() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\SelectionKey.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */