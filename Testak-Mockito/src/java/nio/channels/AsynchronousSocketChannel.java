/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.SocketAddress;
/*    */ import java.net.SocketOption;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.spi.AsynchronousChannelProvider;
/*    */ import java.util.concurrent.Future;
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
/*    */ public abstract class AsynchronousSocketChannel
/*    */   implements AsynchronousByteChannel, NetworkChannel
/*    */ {
/* 30 */   protected AsynchronousSocketChannel(AsynchronousChannelProvider provider) { throw new RuntimeException("Stub!"); }
/* 31 */   public final AsynchronousChannelProvider provider() { throw new RuntimeException("Stub!"); }
/* 32 */   public static AsynchronousSocketChannel open(AsynchronousChannelGroup group) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public static AsynchronousSocketChannel open() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract AsynchronousSocketChannel bind(SocketAddress paramSocketAddress) throws IOException;
/*    */   public abstract <T> AsynchronousSocketChannel setOption(SocketOption<T> paramSocketOption, T paramT) throws IOException;
/*    */   public abstract AsynchronousSocketChannel shutdownInput() throws IOException;
/*    */   public abstract AsynchronousSocketChannel shutdownOutput() throws IOException;
/*    */   public abstract SocketAddress getRemoteAddress() throws IOException;
/*    */   public abstract <A> void connect(SocketAddress paramSocketAddress, A paramA, CompletionHandler<Void, ? super A> paramCompletionHandler);
/*    */   public abstract Future<Void> connect(SocketAddress paramSocketAddress);
/*    */   public abstract <A> void read(ByteBuffer paramByteBuffer, long paramLong, TimeUnit paramTimeUnit, A paramA, CompletionHandler<Integer, ? super A> paramCompletionHandler);
/* 42 */   public final <A> void read(ByteBuffer dst, A attachment, CompletionHandler<Integer, ? super A> handler) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Future<Integer> read(ByteBuffer paramByteBuffer);
/*    */   public abstract <A> void read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, A paramA, CompletionHandler<Long, ? super A> paramCompletionHandler);
/*    */   public abstract <A> void write(ByteBuffer paramByteBuffer, long paramLong, TimeUnit paramTimeUnit, A paramA, CompletionHandler<Integer, ? super A> paramCompletionHandler);
/* 46 */   public final <A> void write(ByteBuffer src, A attachment, CompletionHandler<Integer, ? super A> handler) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Future<Integer> write(ByteBuffer paramByteBuffer);
/*    */   
/*    */   public abstract <A> void write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, A paramA, CompletionHandler<Long, ? super A> paramCompletionHandler);
/*    */   
/*    */   public abstract SocketAddress getLocalAddress()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\AsynchronousSocketChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */