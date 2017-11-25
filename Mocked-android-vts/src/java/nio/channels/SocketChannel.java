/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.Socket;
/*    */ import java.net.SocketAddress;
/*    */ import java.net.SocketOption;
/*    */ import java.nio.ByteBuffer;
/*    */ import java.nio.channels.spi.AbstractSelectableChannel;
/*    */ import java.nio.channels.spi.SelectorProvider;
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
/*    */ public abstract class SocketChannel
/*    */   extends AbstractSelectableChannel
/*    */   implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, NetworkChannel
/*    */ {
/*    */   protected SocketChannel(SelectorProvider provider)
/*    */   {
/* 31 */     super((SelectorProvider)null);throw new RuntimeException("Stub!"); }
/* 32 */   public static SocketChannel open() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public static SocketChannel open(SocketAddress remote) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public final int validOps() { throw new RuntimeException("Stub!"); }
/*    */   public abstract SocketChannel bind(SocketAddress paramSocketAddress) throws IOException;
/*    */   public abstract <T> SocketChannel setOption(SocketOption<T> paramSocketOption, T paramT) throws IOException;
/*    */   public abstract SocketChannel shutdownInput() throws IOException;
/*    */   public abstract SocketChannel shutdownOutput() throws IOException;
/*    */   public abstract Socket socket();
/*    */   public abstract boolean isConnected();
/*    */   public abstract boolean isConnectionPending();
/*    */   public abstract boolean connect(SocketAddress paramSocketAddress) throws IOException;
/*    */   public abstract boolean finishConnect() throws IOException;
/*    */   public abstract SocketAddress getRemoteAddress() throws IOException;
/*    */   public abstract int read(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/* 47 */   public final long read(ByteBuffer[] dsts) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int write(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/* 50 */   public final long write(ByteBuffer[] srcs) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract SocketAddress getLocalAddress()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\SocketChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */