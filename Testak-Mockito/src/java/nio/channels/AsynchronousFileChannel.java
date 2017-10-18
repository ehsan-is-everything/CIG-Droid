/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.file.OpenOption;
/*    */ import java.nio.file.Path;
/*    */ import java.nio.file.attribute.FileAttribute;
/*    */ import java.util.Set;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.Future;
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
/*    */ public abstract class AsynchronousFileChannel
/*    */   implements AsynchronousChannel
/*    */ {
/* 30 */   protected AsynchronousFileChannel() { throw new RuntimeException("Stub!"); }
/* 31 */   public static AsynchronousFileChannel open(Path file, Set<? extends OpenOption> options, ExecutorService executor, FileAttribute<?>... attrs) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public static AsynchronousFileChannel open(Path file, OpenOption... options) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract long size() throws IOException;
/*    */   public abstract AsynchronousFileChannel truncate(long paramLong) throws IOException;
/*    */   public abstract void force(boolean paramBoolean) throws IOException;
/*    */   public abstract <A> void lock(long paramLong1, long paramLong2, boolean paramBoolean, A paramA, CompletionHandler<FileLock, ? super A> paramCompletionHandler);
/* 37 */   public final <A> void lock(A attachment, CompletionHandler<FileLock, ? super A> handler) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Future<FileLock> lock(long paramLong1, long paramLong2, boolean paramBoolean);
/* 39 */   public final Future<FileLock> lock() { throw new RuntimeException("Stub!"); }
/*    */   public abstract FileLock tryLock(long paramLong1, long paramLong2, boolean paramBoolean) throws IOException;
/* 41 */   public final FileLock tryLock() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract <A> void read(ByteBuffer paramByteBuffer, long paramLong, A paramA, CompletionHandler<Integer, ? super A> paramCompletionHandler);
/*    */   
/*    */   public abstract Future<Integer> read(ByteBuffer paramByteBuffer, long paramLong);
/*    */   
/*    */   public abstract <A> void write(ByteBuffer paramByteBuffer, long paramLong, A paramA, CompletionHandler<Integer, ? super A> paramCompletionHandler);
/*    */   
/*    */   public abstract Future<Integer> write(ByteBuffer paramByteBuffer, long paramLong);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\AsynchronousFileChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */