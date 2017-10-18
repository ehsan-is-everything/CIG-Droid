/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.SocketAddress;
/*    */ import java.net.SocketOption;
/*    */ import java.nio.channels.spi.AsynchronousChannelProvider;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AsynchronousServerSocketChannel
/*    */   implements AsynchronousChannel, NetworkChannel
/*    */ {
/* 30 */   protected AsynchronousServerSocketChannel(AsynchronousChannelProvider provider) { throw new RuntimeException("Stub!"); }
/* 31 */   public final AsynchronousChannelProvider provider() { throw new RuntimeException("Stub!"); }
/* 32 */   public static AsynchronousServerSocketChannel open(AsynchronousChannelGroup group) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public static AsynchronousServerSocketChannel open() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public final AsynchronousServerSocketChannel bind(SocketAddress local) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract AsynchronousServerSocketChannel bind(SocketAddress paramSocketAddress, int paramInt)
/*    */     throws IOException;
/*    */   
/*    */   public abstract <T> AsynchronousServerSocketChannel setOption(SocketOption<T> paramSocketOption, T paramT)
/*    */     throws IOException;
/*    */   
/*    */   public abstract <A> void accept(A paramA, CompletionHandler<AsynchronousSocketChannel, ? super A> paramCompletionHandler);
/*    */   
/*    */   public abstract Future<AsynchronousSocketChannel> accept();
/*    */   
/*    */   public abstract SocketAddress getLocalAddress()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\AsynchronousServerSocketChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */