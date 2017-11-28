/*    */ package java.net;
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
/*    */ 
/*    */ 
/*    */ public abstract class Authenticator
/*    */ {
/*    */   public static enum RequestorType
/*    */   {
/* 31 */     PROXY, 
/* 32 */     SERVER;
/*    */     private RequestorType() {} }
/* 34 */   public Authenticator() { throw new RuntimeException("Stub!"); }
/* 35 */   public static synchronized void setDefault(Authenticator a) { throw new RuntimeException("Stub!"); }
/* 36 */   public static PasswordAuthentication requestPasswordAuthentication(InetAddress addr, int port, String protocol, String prompt, String scheme) { throw new RuntimeException("Stub!"); }
/* 37 */   public static PasswordAuthentication requestPasswordAuthentication(String host, InetAddress addr, int port, String protocol, String prompt, String scheme) { throw new RuntimeException("Stub!"); }
/* 38 */   public static PasswordAuthentication requestPasswordAuthentication(String host, InetAddress addr, int port, String protocol, String prompt, String scheme, URL url, RequestorType reqType) { throw new RuntimeException("Stub!"); }
/* 39 */   protected final String getRequestingHost() { throw new RuntimeException("Stub!"); }
/* 40 */   protected final InetAddress getRequestingSite() { throw new RuntimeException("Stub!"); }
/* 41 */   protected final int getRequestingPort() { throw new RuntimeException("Stub!"); }
/* 42 */   protected final String getRequestingProtocol() { throw new RuntimeException("Stub!"); }
/* 43 */   protected final String getRequestingPrompt() { throw new RuntimeException("Stub!"); }
/* 44 */   protected final String getRequestingScheme() { throw new RuntimeException("Stub!"); }
/* 45 */   protected PasswordAuthentication getPasswordAuthentication() { throw new RuntimeException("Stub!"); }
/* 46 */   protected URL getRequestingURL() { throw new RuntimeException("Stub!"); }
/* 47 */   protected RequestorType getRequestorType() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\Authenticator.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */