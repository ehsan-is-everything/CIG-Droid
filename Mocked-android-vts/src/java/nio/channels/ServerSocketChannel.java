/*    */ package java.nio.channels;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.ServerSocket;
/*    */ import java.net.SocketAddress;
/*    */ import java.net.SocketOption;
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
/*    */ 
/*    */ public abstract class ServerSocketChannel
/*    */   extends AbstractSelectableChannel
/*    */   implements NetworkChannel
/*    */ {
/*    */   protected ServerSocketChannel(SelectorProvider provider)
/*    */   {
/* 31 */     super((SelectorProvider)null);throw new RuntimeException("Stub!"); }
/* 32 */   public static ServerSocketChannel open() throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public final int validOps() { throw new RuntimeException("Stub!"); }
/* 34 */   public final ServerSocketChannel bind(SocketAddress local) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ServerSocketChannel bind(SocketAddress paramSocketAddress, int paramInt)
/*    */     throws IOException;
/*    */   
/*    */   public abstract <T> ServerSocketChannel setOption(SocketOption<T> paramSocketOption, T paramT)
/*    */     throws IOException;
/*    */   
/*    */   public abstract ServerSocket socket();
/*    */   
/*    */   public abstract SocketChannel accept()
/*    */     throws IOException;
/*    */   
/*    */   public abstract SocketAddress getLocalAddress()
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\nio\channels\ServerSocketChannel.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */