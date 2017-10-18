/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.ServerSocket;
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
/*    */ public abstract class SSLServerSocket
/*    */   extends ServerSocket
/*    */ {
/* 31 */   protected SSLServerSocket()
/* 31 */     throws IOException { throw new RuntimeException("Stub!"); }
/* 32 */   protected SSLServerSocket(int port) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   protected SSLServerSocket(int port, int backlog) throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   protected SSLServerSocket(int port, int backlog, InetAddress address) throws IOException { throw new RuntimeException("Stub!"); }
/*    */   public abstract String[] getEnabledCipherSuites();
/*    */   public abstract void setEnabledCipherSuites(String[] paramArrayOfString);
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */   public abstract String[] getSupportedProtocols();
/*    */   public abstract String[] getEnabledProtocols();
/*    */   public abstract void setEnabledProtocols(String[] paramArrayOfString);
/*    */   public abstract void setNeedClientAuth(boolean paramBoolean);
/*    */   public abstract boolean getNeedClientAuth();
/*    */   public abstract void setWantClientAuth(boolean paramBoolean);
/*    */   public abstract boolean getWantClientAuth();
/*    */   public abstract void setUseClientMode(boolean paramBoolean);
/*    */   public abstract boolean getUseClientMode();
/*    */   public abstract void setEnableSessionCreation(boolean paramBoolean);
/*    */   public abstract boolean getEnableSessionCreation();
/* 49 */   public SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setSSLParameters(SSLParameters params) { throw new RuntimeException("Stub!"); }
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\SSLServerSocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */