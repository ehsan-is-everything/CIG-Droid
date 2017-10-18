/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.ProtocolFamily;
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
/*    */ public abstract class DatagramChannel
/*    */   extends AbstractSelectableChannel
/*    */   implements ByteChannel, ScatteringByteChannel, GatheringByteChannel, MulticastChannel
/*    */ {
/*    */   protected DatagramChannel(SelectorProvider provider)
/*    */   {
/* 31 */     super((SelectorProvider)null);throw new RuntimeException("Stub!"); }
/* 32 */   public static DatagramChannel open() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public static DatagramChannel open(ProtocolFamily family) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public final int validOps() { throw new RuntimeException("Stub!"); }
/*    */   public abstract DatagramChannel bind(SocketAddress paramSocketAddress) throws IOException;
/*    */   public abstract <T> DatagramChannel setOption(SocketOption<T> paramSocketOption, T paramT) throws IOException;
/*    */   public abstract DatagramSocket socket();
/*    */   public abstract boolean isConnected();
/*    */   public abstract DatagramChannel connect(SocketAddress paramSocketAddress) throws IOException;
/*    */   public abstract DatagramChannel disconnect() throws IOException;
/*    */   public abstract SocketAddress getRemoteAddress() throws IOException;
/*    */   public abstract SocketAddress receive(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract int send(ByteBuffer paramByteBuffer, SocketAddress paramSocketAddress) throws IOException;
/*    */   public abstract int read(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/* 46 */   public final long read(ByteBuffer[] dsts) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract int write(ByteBuffer paramByteBuffer) throws IOException;
/*    */   public abstract long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws IOException;
/* 49 */   public final long write(ByteBuffer[] srcs) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract SocketAddress getLocalAddress()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\DatagramChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */