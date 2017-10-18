/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import java.net.UnknownHostException;
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
/*    */ public abstract class SSLSocket
/*    */   extends Socket
/*    */ {
/* 31 */   protected SSLSocket() { throw new RuntimeException("Stub!"); }
/* 32 */   protected SSLSocket(String host, int port) throws IOException, UnknownHostException { throw new RuntimeException("Stub!"); }
/* 33 */   protected SSLSocket(InetAddress address, int port) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   protected SSLSocket(String host, int port, InetAddress clientAddress, int clientPort) throws IOException, UnknownHostException { throw new RuntimeException("Stub!"); }
/* 35 */   protected SSLSocket(InetAddress address, int port, InetAddress clientAddress, int clientPort) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */   public abstract String[] getEnabledCipherSuites();
/*    */   public abstract void setEnabledCipherSuites(String[] paramArrayOfString);
/*    */   public abstract String[] getSupportedProtocols();
/*    */   public abstract String[] getEnabledProtocols();
/*    */   public abstract void setEnabledProtocols(String[] paramArrayOfString);
/*    */   public abstract SSLSession getSession();
/* 43 */   public SSLSession getHandshakeSession() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void addHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener);
/*    */   public abstract void removeHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener);
/*    */   public abstract void startHandshake() throws IOException;
/*    */   public abstract void setUseClientMode(boolean paramBoolean);
/*    */   public abstract boolean getUseClientMode();
/*    */   public abstract void setNeedClientAuth(boolean paramBoolean);
/*    */   public abstract boolean getNeedClientAuth();
/*    */   public abstract void setWantClientAuth(boolean paramBoolean);
/*    */   public abstract boolean getWantClientAuth();
/*    */   public abstract void setEnableSessionCreation(boolean paramBoolean);
/*    */   public abstract boolean getEnableSessionCreation();
/* 55 */   public SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setSSLParameters(SSLParameters params) { throw new RuntimeException("Stub!"); }
/* 57 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\SSLSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */