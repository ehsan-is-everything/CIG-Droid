/*    */ package java.net;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
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
/*    */ public abstract class DatagramSocketImpl
/*    */   implements SocketOptions
/*    */ {
/*    */   protected FileDescriptor fd;
/*    */   protected int localPort;
/*    */   
/* 30 */   public DatagramSocketImpl() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void create() throws SocketException;
/*    */   protected abstract void bind(int paramInt, InetAddress paramInetAddress) throws SocketException;
/*    */   protected abstract void send(DatagramPacket paramDatagramPacket) throws IOException;
/* 34 */   protected void connect(InetAddress address, int port) throws SocketException { throw new RuntimeException("Stub!"); }
/* 35 */   protected void disconnect() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract int peek(InetAddress paramInetAddress) throws IOException;
/*    */   protected abstract int peekData(DatagramPacket paramDatagramPacket) throws IOException;
/*    */   protected abstract void receive(DatagramPacket paramDatagramPacket) throws IOException;
/*    */   @Deprecated
/*    */   protected abstract void setTTL(byte paramByte) throws IOException;
/*    */   @Deprecated
/*    */   protected abstract byte getTTL() throws IOException;
/*    */   protected abstract void setTimeToLive(int paramInt) throws IOException;
/*    */   protected abstract int getTimeToLive() throws IOException;
/*    */   protected abstract void join(InetAddress paramInetAddress) throws IOException;
/*    */   protected abstract void leave(InetAddress paramInetAddress) throws IOException;
/*    */   protected abstract void joinGroup(SocketAddress paramSocketAddress, NetworkInterface paramNetworkInterface) throws IOException;
/*    */   protected abstract void leaveGroup(SocketAddress paramSocketAddress, NetworkInterface paramNetworkInterface) throws IOException;
/*    */   protected abstract void close();
/* 50 */   protected int getLocalPort() { throw new RuntimeException("Stub!"); }
/* 51 */   protected FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\DatagramSocketImpl.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */