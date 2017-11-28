/*    */ package java.net;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ import java.util.List;
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
/*    */ 
/*    */ public final class NetworkInterface
/*    */ {
/* 29 */   NetworkInterface() { throw new RuntimeException("Stub!"); }
/* 30 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 31 */   public Enumeration<InetAddress> getInetAddresses() { throw new RuntimeException("Stub!"); }
/* 32 */   public List<InterfaceAddress> getInterfaceAddresses() { throw new RuntimeException("Stub!"); }
/* 33 */   public Enumeration<NetworkInterface> getSubInterfaces() { throw new RuntimeException("Stub!"); }
/* 34 */   public NetworkInterface getParent() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getIndex() { throw new RuntimeException("Stub!"); }
/* 36 */   public String getDisplayName() { throw new RuntimeException("Stub!"); }
/* 37 */   public static NetworkInterface getByName(String name) throws SocketException { throw new RuntimeException("Stub!"); }
/* 38 */   public static NetworkInterface getByIndex(int index) throws SocketException { throw new RuntimeException("Stub!"); }
/* 39 */   public static NetworkInterface getByInetAddress(InetAddress addr) throws SocketException { throw new RuntimeException("Stub!"); }
/* 40 */   public static Enumeration<NetworkInterface> getNetworkInterfaces() throws SocketException { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isUp() throws SocketException { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isLoopback() throws SocketException { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isPointToPoint() throws SocketException { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean supportsMulticast() throws SocketException { throw new RuntimeException("Stub!"); }
/* 45 */   public byte[] getHardwareAddress() throws SocketException { throw new RuntimeException("Stub!"); }
/* 46 */   public int getMTU() throws SocketException { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean isVirtual() { throw new RuntimeException("Stub!"); }
/* 48 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 49 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 50 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\NetworkInterface.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */