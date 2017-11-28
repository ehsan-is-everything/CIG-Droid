/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.nio.ByteBuffer;
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
/*    */ public abstract class SSLEngine
/*    */ {
/* 29 */   protected SSLEngine() { throw new RuntimeException("Stub!"); }
/* 30 */   protected SSLEngine(String peerHost, int peerPort) { throw new RuntimeException("Stub!"); }
/* 31 */   public String getPeerHost() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getPeerPort() { throw new RuntimeException("Stub!"); }
/* 33 */   public SSLEngineResult wrap(ByteBuffer src, ByteBuffer dst) throws SSLException { throw new RuntimeException("Stub!"); }
/* 34 */   public SSLEngineResult wrap(ByteBuffer[] srcs, ByteBuffer dst) throws SSLException { throw new RuntimeException("Stub!"); }
/*    */   public abstract SSLEngineResult wrap(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) throws SSLException;
/* 36 */   public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer dst) throws SSLException { throw new RuntimeException("Stub!"); }
/* 37 */   public SSLEngineResult unwrap(ByteBuffer src, ByteBuffer[] dsts) throws SSLException { throw new RuntimeException("Stub!"); }
/*    */   public abstract SSLEngineResult unwrap(ByteBuffer paramByteBuffer, ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2) throws SSLException;
/*    */   public abstract Runnable getDelegatedTask();
/*    */   public abstract void closeInbound() throws SSLException;
/*    */   public abstract boolean isInboundDone();
/*    */   public abstract void closeOutbound();
/*    */   public abstract boolean isOutboundDone();
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */   public abstract String[] getEnabledCipherSuites();
/*    */   public abstract void setEnabledCipherSuites(String[] paramArrayOfString);
/*    */   public abstract String[] getSupportedProtocols();
/*    */   public abstract String[] getEnabledProtocols();
/*    */   public abstract void setEnabledProtocols(String[] paramArrayOfString);
/*    */   public abstract SSLSession getSession();
/* 51 */   public SSLSession getHandshakeSession() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void beginHandshake() throws SSLException;
/*    */   public abstract SSLEngineResult.HandshakeStatus getHandshakeStatus();
/*    */   public abstract void setUseClientMode(boolean paramBoolean);
/*    */   public abstract boolean getUseClientMode();
/*    */   public abstract void setNeedClientAuth(boolean paramBoolean);
/*    */   public abstract boolean getNeedClientAuth();
/*    */   public abstract void setWantClientAuth(boolean paramBoolean);
/*    */   public abstract boolean getWantClientAuth();
/*    */   public abstract void setEnableSessionCreation(boolean paramBoolean);
/*    */   public abstract boolean getEnableSessionCreation();
/* 62 */   public SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setSSLParameters(SSLParameters params) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\SSLEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */