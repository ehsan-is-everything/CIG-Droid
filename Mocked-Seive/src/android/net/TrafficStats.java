/*    */ package android.net;
/*    */ 
/*    */ import java.net.DatagramSocket;
/*    */ import java.net.Socket;
/*    */ import java.net.SocketException;
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
/*    */ public class TrafficStats
/*    */ {
/*    */   public static final int UNSUPPORTED = -1;
/*    */   
/* 20 */   public TrafficStats() { throw new RuntimeException("Stub!"); }
/* 21 */   public static void setThreadStatsTag(int tag) { throw new RuntimeException("Stub!"); }
/* 22 */   public static int getAndSetThreadStatsTag(int tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public static int getThreadStatsTag() { throw new RuntimeException("Stub!"); }
/* 24 */   public static void clearThreadStatsTag() { throw new RuntimeException("Stub!"); }
/* 25 */   public static void tagSocket(Socket socket) throws SocketException { throw new RuntimeException("Stub!"); }
/* 26 */   public static void untagSocket(Socket socket) throws SocketException { throw new RuntimeException("Stub!"); }
/* 27 */   public static void tagDatagramSocket(DatagramSocket socket) throws SocketException { throw new RuntimeException("Stub!"); }
/* 28 */   public static void untagDatagramSocket(DatagramSocket socket) throws SocketException { throw new RuntimeException("Stub!"); }
/* 29 */   public static void incrementOperationCount(int operationCount) { throw new RuntimeException("Stub!"); }
/* 30 */   public static void incrementOperationCount(int tag, int operationCount) { throw new RuntimeException("Stub!"); }
/* 31 */   public static long getMobileTxPackets() { throw new RuntimeException("Stub!"); }
/* 32 */   public static long getMobileRxPackets() { throw new RuntimeException("Stub!"); }
/* 33 */   public static long getMobileTxBytes() { throw new RuntimeException("Stub!"); }
/* 34 */   public static long getMobileRxBytes() { throw new RuntimeException("Stub!"); }
/* 35 */   public static long getTotalTxPackets() { throw new RuntimeException("Stub!"); }
/* 36 */   public static long getTotalRxPackets() { throw new RuntimeException("Stub!"); }
/* 37 */   public static long getTotalTxBytes() { throw new RuntimeException("Stub!"); }
/* 38 */   public static long getTotalRxBytes() { throw new RuntimeException("Stub!"); }
/* 39 */   public static long getUidTxBytes(int uid) { throw new RuntimeException("Stub!"); }
/* 40 */   public static long getUidRxBytes(int uid) { throw new RuntimeException("Stub!"); }
/* 41 */   public static long getUidTxPackets(int uid) { throw new RuntimeException("Stub!"); }
/* 42 */   public static long getUidRxPackets(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public static long getUidTcpTxBytes(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 46 */   public static long getUidTcpRxBytes(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 48 */   public static long getUidUdpTxBytes(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 50 */   public static long getUidUdpRxBytes(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 52 */   public static long getUidTcpTxSegments(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 54 */   public static long getUidTcpRxSegments(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 56 */   public static long getUidUdpTxPackets(int uid) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 58 */   public static long getUidUdpRxPackets(int uid) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\TrafficStats.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */