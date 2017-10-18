/*    */ package java.nio.channels.spi;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.ProtocolFamily;
/*    */ import java.nio.channels.Channel;
/*    */ import java.nio.channels.DatagramChannel;
/*    */ import java.nio.channels.Pipe;
/*    */ import java.nio.channels.ServerSocketChannel;
/*    */ import java.nio.channels.SocketChannel;
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
/*    */ public abstract class SelectorProvider
/*    */ {
/* 29 */   protected SelectorProvider() { throw new RuntimeException("Stub!"); }
/* 30 */   public static SelectorProvider provider() { throw new RuntimeException("Stub!"); }
/*    */   public abstract DatagramChannel openDatagramChannel() throws IOException;
/*    */   public abstract DatagramChannel openDatagramChannel(ProtocolFamily paramProtocolFamily) throws IOException;
/*    */   public abstract Pipe openPipe() throws IOException;
/*    */   public abstract AbstractSelector openSelector() throws IOException;
/*    */   public abstract ServerSocketChannel openServerSocketChannel() throws IOException;
/*    */   public abstract SocketChannel openSocketChannel() throws IOException;
/* 37 */   public Channel inheritedChannel() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\nio\channels\spi\SelectorProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */