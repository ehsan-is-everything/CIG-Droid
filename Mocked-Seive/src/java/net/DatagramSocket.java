/*    */ package java.net;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.DatagramChannel;
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
/*    */ public class DatagramSocket
/*    */   implements Closeable
/*    */ {
/* 31 */   public DatagramSocket()
/* 31 */     throws SocketException { throw new RuntimeException("Stub!"); }
/* 32 */   protected DatagramSocket(DatagramSocketImpl impl) { throw new RuntimeException("Stub!"); }
/* 33 */   public DatagramSocket(SocketAddress bindaddr) throws SocketException { throw new RuntimeException("Stub!"); }
/* 34 */   public DatagramSocket(int port) throws SocketException { throw new RuntimeException("Stub!"); }
/* 35 */   public DatagramSocket(int port, InetAddress laddr) throws SocketException { throw new RuntimeException("Stub!"); }
/* 36 */   public synchronized void bind(SocketAddress addr) throws SocketException { throw new RuntimeException("Stub!"); }
/* 37 */   public void connect(InetAddress address, int port) { throw new RuntimeException("Stub!"); }
/* 38 */   public void connect(SocketAddress addr) throws SocketException { throw new RuntimeException("Stub!"); }
/* 39 */   public void disconnect() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isBound() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 42 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
/* 43 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 44 */   public SocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
/* 45 */   public SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
/* 46 */   public void send(DatagramPacket p) throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public synchronized void receive(DatagramPacket p) throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getLocalPort() { throw new RuntimeException("Stub!"); }
/* 50 */   public synchronized void setSoTimeout(int timeout) throws SocketException { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized int getSoTimeout() throws SocketException { throw new RuntimeException("Stub!"); }
/* 52 */   public synchronized void setSendBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); }
/* 53 */   public synchronized int getSendBufferSize() throws SocketException { throw new RuntimeException("Stub!"); }
/* 54 */   public synchronized void setReceiveBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); }
/* 55 */   public synchronized int getReceiveBufferSize() throws SocketException { throw new RuntimeException("Stub!"); }
/* 56 */   public synchronized void setReuseAddress(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 57 */   public synchronized boolean getReuseAddress() throws SocketException { throw new RuntimeException("Stub!"); }
/* 58 */   public synchronized void setBroadcast(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 59 */   public synchronized boolean getBroadcast() throws SocketException { throw new RuntimeException("Stub!"); }
/* 60 */   public synchronized void setTrafficClass(int tc) throws SocketException { throw new RuntimeException("Stub!"); }
/* 61 */   public synchronized int getTrafficClass() throws SocketException { throw new RuntimeException("Stub!"); }
/* 62 */   public void close() { throw new RuntimeException("Stub!"); }
/* 63 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 64 */   public DatagramChannel getChannel() { throw new RuntimeException("Stub!"); }
/* 65 */   public static synchronized void setDatagramSocketImplFactory(DatagramSocketImplFactory fac) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\DatagramSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */