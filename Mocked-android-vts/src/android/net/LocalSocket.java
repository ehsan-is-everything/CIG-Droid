/*    */ package android.net;
/*    */ 
/*    */ import java.io.Closeable;
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
/*    */ public class LocalSocket
/*    */   implements Closeable
/*    */ {
/*    */   public static final int SOCKET_DGRAM = 1;
/*    */   public static final int SOCKET_SEQPACKET = 3;
/*    */   public static final int SOCKET_STREAM = 2;
/*    */   
/* 21 */   public LocalSocket() { throw new RuntimeException("Stub!"); }
/* 22 */   public LocalSocket(int sockType) { throw new RuntimeException("Stub!"); }
/* 23 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 24 */   public void connect(LocalSocketAddress endpoint) throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public void bind(LocalSocketAddress bindpoint) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public LocalSocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); }
/* 27 */   public InputStream getInputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public OutputStream getOutputStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 29 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 30 */   public void shutdownInput() throws IOException { throw new RuntimeException("Stub!"); }
/* 31 */   public void shutdownOutput() throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   public void setReceiveBufferSize(int size) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public int getReceiveBufferSize() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void setSoTimeout(int n) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public int getSoTimeout() throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public void setSendBufferSize(int n) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public int getSendBufferSize() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public LocalSocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); }
/* 39 */   public synchronized boolean isConnected() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isClosed() { throw new RuntimeException("Stub!"); }
/* 41 */   public synchronized boolean isBound() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isOutputShutdown() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isInputShutdown() { throw new RuntimeException("Stub!"); }
/* 44 */   public void connect(LocalSocketAddress endpoint, int timeout) throws IOException { throw new RuntimeException("Stub!"); }
/* 45 */   public void setFileDescriptorsForSend(FileDescriptor[] fds) { throw new RuntimeException("Stub!"); }
/* 46 */   public FileDescriptor[] getAncillaryFileDescriptors() throws IOException { throw new RuntimeException("Stub!"); }
/* 47 */   public Credentials getPeerCredentials() throws IOException { throw new RuntimeException("Stub!"); }
/* 48 */   public FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\LocalSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */