/*    */ package android.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import javax.net.SocketFactory;
/*    */ import javax.net.ssl.KeyManager;
/*    */ import javax.net.ssl.SSLSocketFactory;
/*    */ import javax.net.ssl.TrustManager;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SSLCertificateSocketFactory
/*    */   extends SSLSocketFactory
/*    */ {
/*    */   @Deprecated
/* 22 */   public SSLCertificateSocketFactory(int handshakeTimeoutMillis) { throw new RuntimeException("Stub!"); }
/* 23 */   public static SocketFactory getDefault(int handshakeTimeoutMillis) { throw new RuntimeException("Stub!"); }
/* 24 */   public static SSLSocketFactory getDefault(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); }
/* 25 */   public static SSLSocketFactory getInsecure(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); }
/* 26 */   public void setTrustManagers(TrustManager[] trustManager) { throw new RuntimeException("Stub!"); }
/* 27 */   public void setNpnProtocols(byte[][] npnProtocols) { throw new RuntimeException("Stub!"); }
/* 28 */   public byte[] getNpnSelectedProtocol(Socket socket) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setKeyManagers(KeyManager[] keyManagers) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setUseSessionTickets(Socket socket, boolean useSessionTickets) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setHostname(Socket socket, String hostName) { throw new RuntimeException("Stub!"); }
/* 32 */   public Socket createSocket(Socket k, String host, int port, boolean close) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public Socket createSocket(InetAddress addr, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); }
/* 35 */   public Socket createSocket(InetAddress addr, int port) throws IOException { throw new RuntimeException("Stub!"); }
/* 36 */   public Socket createSocket(String host, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); }
/* 37 */   public Socket createSocket(String host, int port) throws IOException { throw new RuntimeException("Stub!"); }
/* 38 */   public String[] getDefaultCipherSuites() { throw new RuntimeException("Stub!"); }
/* 39 */   public String[] getSupportedCipherSuites() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\SSLCertificateSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */