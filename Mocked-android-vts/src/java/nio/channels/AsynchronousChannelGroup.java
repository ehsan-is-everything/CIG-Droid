/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.spi.AsynchronousChannelProvider;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.ThreadFactory;
/*    */ import java.util.concurrent.TimeUnit;
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
/*    */ public abstract class AsynchronousChannelGroup
/*    */ {
/* 29 */   protected AsynchronousChannelGroup(AsynchronousChannelProvider provider) { throw new RuntimeException("Stub!"); }
/* 30 */   public final AsynchronousChannelProvider provider() { throw new RuntimeException("Stub!"); }
/* 31 */   public static AsynchronousChannelGroup withFixedThreadPool(int nThreads, ThreadFactory threadFactory) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public static AsynchronousChannelGroup withCachedThreadPool(ExecutorService executor, int initialSize) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public static AsynchronousChannelGroup withThreadPool(ExecutorService executor) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract boolean isShutdown();
/*    */   
/*    */   public abstract boolean isTerminated();
/*    */   
/*    */   public abstract void shutdown();
/*    */   
/*    */   public abstract void shutdownNow()
/*    */     throws IOException;
/*    */   
/*    */   public abstract boolean awaitTermination(long paramLong, TimeUnit paramTimeUnit)
/*    */     throws InterruptedException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\AsynchronousChannelGroup.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */