/*    */ package java.net;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.ServerSocketChannel;
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
/*    */ public class ServerSocket
/*    */   implements Closeable
/*    */ {
/* 30 */   public ServerSocket()
/* 30 */     throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public ServerSocket(int port) throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public ServerSocket(int port, int backlog) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public ServerSocket(int port, int backlog, InetAddress bindAddr) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void bind(SocketAddress endpoint) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void bind(SocketAddress endpoint, int backlog) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getLocalPort() { throw new RuntimeException("Stub!"); }
/* 38 */   public SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
/* 39 */   public Socket accept() throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   protected final void implAccept(Socket s) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public ServerSocketChannel getChannel() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isBound() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 45 */   public synchronized void setSoTimeout(int timeout) throws SocketException { throw new RuntimeException("Stub!"); }
/* 46 */   public synchronized int getSoTimeout() throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public void setReuseAddress(boolean on) throws SocketException { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean getReuseAddress() throws SocketException { throw new RuntimeException("Stub!"); }
/* 49 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 50 */   public static synchronized void setSocketFactory(SocketImplFactory fac) throws IOException { throw new RuntimeException("Stub!"); }
/* 51 */   public synchronized void setReceiveBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); }
/* 52 */   public synchronized int getReceiveBufferSize() throws SocketException { throw new RuntimeException("Stub!"); }
/* 53 */   public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\ServerSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */