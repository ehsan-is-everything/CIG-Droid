/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.AsynchronousChannelGroup;
/*    */ import java.nio.channels.AsynchronousServerSocketChannel;
/*    */ import java.nio.channels.AsynchronousSocketChannel;
/*    */ import java.util.concurrent.ExecutorService;
/*    */ import java.util.concurrent.ThreadFactory;
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
/*    */ public abstract class AsynchronousChannelProvider
/*    */ {
/* 29 */   protected AsynchronousChannelProvider() { throw new RuntimeException("Stub!"); }
/* 30 */   public static AsynchronousChannelProvider provider() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract AsynchronousChannelGroup openAsynchronousChannelGroup(int paramInt, ThreadFactory paramThreadFactory)
/*    */     throws IOException;
/*    */   
/*    */   public abstract AsynchronousChannelGroup openAsynchronousChannelGroup(ExecutorService paramExecutorService, int paramInt)
/*    */     throws IOException;
/*    */   
/*    */   public abstract AsynchronousServerSocketChannel openAsynchronousServerSocketChannel(AsynchronousChannelGroup paramAsynchronousChannelGroup)
/*    */     throws IOException;
/*    */   
/*    */   public abstract AsynchronousSocketChannel openAsynchronousSocketChannel(AsynchronousChannelGroup paramAsynchronousChannelGroup)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\spi\AsynchronousChannelProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */