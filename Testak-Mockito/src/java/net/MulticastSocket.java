/*    */ package java.net;
/*    */ 
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
/*    */ 
/*    */ public class MulticastSocket
/*    */   extends DatagramSocket
/*    */ {
/*    */   public MulticastSocket()
/*    */     throws IOException
/*    */   {
/* 30 */     super((DatagramSocketImpl)null);throw new RuntimeException("Stub!"); }
/* 31 */   public MulticastSocket(int port) throws IOException { super((DatagramSocketImpl)null);throw new RuntimeException("Stub!"); }
/* 32 */   public MulticastSocket(SocketAddress bindaddr) throws IOException { super((DatagramSocketImpl)null);throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void setTTL(byte ttl) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public void setTimeToLive(int ttl) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 37 */   public byte getTTL() throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public int getTimeToLive() throws IOException { throw new RuntimeException("Stub!"); }
/* 39 */   public void joinGroup(InetAddress mcastaddr) throws IOException { throw new RuntimeException("Stub!"); }
/* 40 */   public void leaveGroup(InetAddress mcastaddr) throws IOException { throw new RuntimeException("Stub!"); }
/* 41 */   public void joinGroup(SocketAddress mcastaddr, NetworkInterface netIf) throws IOException { throw new RuntimeException("Stub!"); }
/* 42 */   public void leaveGroup(SocketAddress mcastaddr, NetworkInterface netIf) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public void setInterface(InetAddress inf) throws SocketException { throw new RuntimeException("Stub!"); }
/* 44 */   public InetAddress getInterface() throws SocketException { throw new RuntimeException("Stub!"); }
/* 45 */   public void setNetworkInterface(NetworkInterface netIf) throws SocketException { throw new RuntimeException("Stub!"); }
/* 46 */   public NetworkInterface getNetworkInterface() throws SocketException { throw new RuntimeException("Stub!"); }
/* 47 */   public void setLoopbackMode(boolean disable) throws SocketException { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean getLoopbackMode() throws SocketException { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 50 */   public void send(DatagramPacket p, byte ttl) throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\MulticastSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */