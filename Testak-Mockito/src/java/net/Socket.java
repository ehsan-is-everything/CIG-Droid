/*    */ package java.net;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ public class Socket
/*    */   implements Closeable
/*    */ {
/* 31 */   public Socket() { throw new RuntimeException("Stub!"); }
/* 32 */   public Socket(Proxy proxy) { throw new RuntimeException("Stub!"); }
/* 33 */   protected Socket(SocketImpl impl) throws SocketException { throw new RuntimeException("Stub!"); }
/* 34 */   public Socket(String host, int port) throws UnknownHostException, IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public Socket(InetAddress address, int port) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public Socket(String host, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public Socket(InetAddress address, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 39 */   public Socket(String host, int port, boolean stream) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 41 */   public Socket(InetAddress host, int port, boolean stream) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public void connect(SocketAddress endpoint) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public void connect(SocketAddress endpoint, int timeout) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public void bind(SocketAddress bindpoint) throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
/* 46 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getLocalPort() { throw new RuntimeException("Stub!"); }
/* 49 */   public SocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
/* 50 */   public SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
/* 51 */   public SocketChannel getChannel() { throw new RuntimeException("Stub!"); }
/* 52 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 53 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public void setTcpNoDelay(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean getTcpNoDelay() throws SocketException { throw new RuntimeException("Stub!"); }
/* 56 */   public void setSoLinger(boolean on, int linger) throws SocketException { throw new RuntimeException("Stub!"); }
/* 57 */   public int getSoLinger() throws SocketException { throw new RuntimeException("Stub!"); }
/* 58 */   public void sendUrgentData(int data) throws IOException { throw new RuntimeException("Stub!"); }
/* 59 */   public void setOOBInline(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean getOOBInline() throws SocketException { throw new RuntimeException("Stub!"); }
/* 61 */   public synchronized void setSoTimeout(int timeout) throws SocketException { throw new RuntimeException("Stub!"); }
/* 62 */   public synchronized int getSoTimeout() throws SocketException { throw new RuntimeException("Stub!"); }
/* 63 */   public synchronized void setSendBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); }
/* 64 */   public synchronized int getSendBufferSize() throws SocketException { throw new RuntimeException("Stub!"); }
/* 65 */   public synchronized void setReceiveBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); }
/* 66 */   public synchronized int getReceiveBufferSize() throws SocketException { throw new RuntimeException("Stub!"); }
/* 67 */   public void setKeepAlive(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean getKeepAlive() throws SocketException { throw new RuntimeException("Stub!"); }
/* 69 */   public void setTrafficClass(int tc) throws SocketException { throw new RuntimeException("Stub!"); }
/* 70 */   public int getTrafficClass() throws SocketException { throw new RuntimeException("Stub!"); }
/* 71 */   public void setReuseAddress(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean getReuseAddress() throws SocketException { throw new RuntimeException("Stub!"); }
/* 73 */   public synchronized void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 74 */   public void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); }
/* 75 */   public void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); }
/* 76 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 77 */   public boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 78 */   public boolean isBound() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 80 */   public boolean isInputShutdown() { throw new RuntimeException("Stub!"); }
/* 81 */   public boolean isOutputShutdown() { throw new RuntimeException("Stub!"); }
/* 82 */   public static synchronized void setSocketImplFactory(SocketImplFactory fac) throws IOException { throw new RuntimeException("Stub!"); }
/* 83 */   public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\Socket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */