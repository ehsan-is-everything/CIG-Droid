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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class URLStreamHandler
/*    */ {
/* 30 */   public URLStreamHandler() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract URLConnection openConnection(URL paramURL) throws IOException;
/* 32 */   protected URLConnection openConnection(URL u, Proxy p) throws IOException { throw new RuntimeException("Stub!"); }
/* 33 */   protected void parseURL(URL u, String spec, int start, int limit) { throw new RuntimeException("Stub!"); }
/* 34 */   protected int getDefaultPort() { throw new RuntimeException("Stub!"); }
/* 35 */   protected boolean equals(URL u1, URL u2) { throw new RuntimeException("Stub!"); }
/* 36 */   protected int hashCode(URL u) { throw new RuntimeException("Stub!"); }
/* 37 */   protected boolean sameFile(URL u1, URL u2) { throw new RuntimeException("Stub!"); }
/* 38 */   protected synchronized InetAddress getHostAddress(URL u) { throw new RuntimeException("Stub!"); }
/* 39 */   protected boolean hostsEqual(URL u1, URL u2) { throw new RuntimeException("Stub!"); }
/* 40 */   protected String toExternalForm(URL u) { throw new RuntimeException("Stub!"); }
/* 41 */   protected void setURL(URL u, String protocol, String host, int port, String authority, String userInfo, String path, String query, String ref) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 43 */   protected void setURL(URL u, String protocol, String host, int port, String file, String ref) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\URLStreamHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */