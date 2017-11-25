/*    */ package java.net;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
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
/*    */ public abstract class SocketImpl
/*    */   implements SocketOptions
/*    */ {
/*    */   protected InetAddress address;
/*    */   protected FileDescriptor fd;
/*    */   protected int localport;
/*    */   protected int port;
/*    */   
/* 31 */   public SocketImpl() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void create(boolean paramBoolean) throws IOException;
/*    */   protected abstract void connect(String paramString, int paramInt) throws IOException;
/*    */   protected abstract void connect(InetAddress paramInetAddress, int paramInt) throws IOException;
/*    */   protected abstract void connect(SocketAddress paramSocketAddress, int paramInt) throws IOException;
/*    */   protected abstract void bind(InetAddress paramInetAddress, int paramInt) throws IOException;
/*    */   protected abstract void listen(int paramInt) throws IOException;
/*    */   protected abstract void accept(SocketImpl paramSocketImpl) throws IOException;
/*    */   protected abstract InputStream getInputStream() throws IOException;
/*    */   protected abstract OutputStream getOutputStream() throws IOException;
/*    */   protected abstract int available() throws IOException;
/*    */   protected abstract void close() throws IOException;
/* 43 */   protected void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   protected void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   protected FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
/* 46 */   protected InetAddress getInetAddress() { throw new RuntimeException("Stub!"); }
/* 47 */   protected int getPort() { throw new RuntimeException("Stub!"); }
/* 48 */   protected boolean supportsUrgentData() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void sendUrgentData(int paramInt) throws IOException;
/* 50 */   protected int getLocalPort() { throw new RuntimeException("Stub!"); }
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 52 */   protected void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\SocketImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */