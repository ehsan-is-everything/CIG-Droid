/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.Serializable;
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
/*    */ 
/*    */ public class InetAddress
/*    */   implements Serializable
/*    */ {
/* 31 */   InetAddress() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isMulticastAddress() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isAnyLocalAddress() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean isLoopbackAddress() { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isLinkLocalAddress() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isSiteLocalAddress() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isMCGlobal() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isMCNodeLocal() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isMCLinkLocal() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isMCSiteLocal() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isMCOrgLocal() { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isReachable(int timeout) throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isReachable(NetworkInterface netif, int ttl, int timeout) throws IOException { throw new RuntimeException("Stub!"); }
/* 44 */   public String getHostName() { throw new RuntimeException("Stub!"); }
/* 45 */   public String getCanonicalHostName() { throw new RuntimeException("Stub!"); }
/* 46 */   public byte[] getAddress() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getHostAddress() { throw new RuntimeException("Stub!"); }
/* 48 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 50 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 51 */   public static InetAddress getByAddress(String host, byte[] addr) throws UnknownHostException { throw new RuntimeException("Stub!"); }
/* 52 */   public static InetAddress getByName(String host) throws UnknownHostException { throw new RuntimeException("Stub!"); }
/* 53 */   public static InetAddress[] getAllByName(String host) throws UnknownHostException { throw new RuntimeException("Stub!"); }
/* 54 */   public static InetAddress getLoopbackAddress() { throw new RuntimeException("Stub!"); }
/* 55 */   public static InetAddress getByAddress(byte[] addr) throws UnknownHostException { throw new RuntimeException("Stub!"); }
/* 56 */   public static InetAddress getLocalHost() throws UnknownHostException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\InetAddress.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */