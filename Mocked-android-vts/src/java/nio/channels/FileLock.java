/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ public abstract class FileLock
/*    */   implements AutoCloseable
/*    */ {
/* 30 */   protected FileLock(FileChannel channel, long position, long size, boolean shared) { throw new RuntimeException("Stub!"); }
/* 31 */   protected FileLock(AsynchronousFileChannel channel, long position, long size, boolean shared) { throw new RuntimeException("Stub!"); }
/* 32 */   public final FileChannel channel() { throw new RuntimeException("Stub!"); }
/* 33 */   public Channel acquiredBy() { throw new RuntimeException("Stub!"); }
/* 34 */   public final long position() { throw new RuntimeException("Stub!"); }
/* 35 */   public final long size() { throw new RuntimeException("Stub!"); }
/* 36 */   public final boolean isShared() { throw new RuntimeException("Stub!"); }
/* 37 */   public final boolean overlaps(long position, long size) { throw new RuntimeException("Stub!"); }
/*    */   public abstract boolean isValid();
/*    */   public abstract void release() throws IOException;
/* 40 */   public final void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public final String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\FileLock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */