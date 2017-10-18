/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.security.AlgorithmConstraints;
/*    */ import java.util.Collection;
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
/*    */ public class SSLParameters
/*    */ {
/* 29 */   public SSLParameters() { throw new RuntimeException("Stub!"); }
/* 30 */   public SSLParameters(String[] cipherSuites) { throw new RuntimeException("Stub!"); }
/* 31 */   public SSLParameters(String[] cipherSuites, String[] protocols) { throw new RuntimeException("Stub!"); }
/* 32 */   public String[] getCipherSuites() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setCipherSuites(String[] cipherSuites) { throw new RuntimeException("Stub!"); }
/* 34 */   public String[] getProtocols() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setProtocols(String[] protocols) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean getWantClientAuth() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setWantClientAuth(boolean wantClientAuth) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean getNeedClientAuth() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setNeedClientAuth(boolean needClientAuth) { throw new RuntimeException("Stub!"); }
/* 40 */   public AlgorithmConstraints getAlgorithmConstraints() { throw new RuntimeException("Stub!"); }
/* 41 */   public void setAlgorithmConstraints(AlgorithmConstraints constraints) { throw new RuntimeException("Stub!"); }
/* 42 */   public String getEndpointIdentificationAlgorithm() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setEndpointIdentificationAlgorithm(String algorithm) { throw new RuntimeException("Stub!"); }
/* 44 */   public final void setServerNames(List<SNIServerName> serverNames) { throw new RuntimeException("Stub!"); }
/* 45 */   public final List<SNIServerName> getServerNames() { throw new RuntimeException("Stub!"); }
/* 46 */   public final void setSNIMatchers(Collection<SNIMatcher> matchers) { throw new RuntimeException("Stub!"); }
/* 47 */   public final Collection<SNIMatcher> getSNIMatchers() { throw new RuntimeException("Stub!"); }
/* 48 */   public final void setUseCipherSuitesOrder(boolean honorOrder) { throw new RuntimeException("Stub!"); }
/* 49 */   public final boolean getUseCipherSuitesOrder() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ssl\SSLParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */