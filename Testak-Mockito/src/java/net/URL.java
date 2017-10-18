/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.InputStream;
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
/*    */ public final class URL
/*    */   implements Serializable
/*    */ {
/* 31 */   public URL(String protocol, String host, int port, String file)
/* 31 */     throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 32 */   public URL(String protocol, String host, String file) throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 33 */   public URL(String protocol, String host, int port, String file, URLStreamHandler handler) throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 34 */   public URL(String spec) throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 35 */   public URL(URL context, String spec) throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 36 */   public URL(URL context, String spec, URLStreamHandler handler) throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 37 */   public String getQuery() { throw new RuntimeException("Stub!"); }
/* 38 */   public String getPath() { throw new RuntimeException("Stub!"); }
/* 39 */   public String getUserInfo() { throw new RuntimeException("Stub!"); }
/* 40 */   public String getAuthority() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getDefaultPort() { throw new RuntimeException("Stub!"); }
/* 43 */   public String getProtocol() { throw new RuntimeException("Stub!"); }
/* 44 */   public String getHost() { throw new RuntimeException("Stub!"); }
/* 45 */   public String getFile() { throw new RuntimeException("Stub!"); }
/* 46 */   public String getRef() { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 48 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); }
/* 49 */   public boolean sameFile(URL other) { throw new RuntimeException("Stub!"); }
/* 50 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 51 */   public String toExternalForm() { throw new RuntimeException("Stub!"); }
/* 52 */   public URI toURI() throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 53 */   public URLConnection openConnection() throws IOException { throw new RuntimeException("Stub!"); }
/* 54 */   public URLConnection openConnection(Proxy proxy) throws IOException { throw new RuntimeException("Stub!"); }
/* 55 */   public final InputStream openStream() throws IOException { throw new RuntimeException("Stub!"); }
/* 56 */   public final Object getContent() throws IOException { throw new RuntimeException("Stub!"); }
/* 57 */   public final Object getContent(Class[] classes) throws IOException { throw new RuntimeException("Stub!"); }
/* 58 */   public static void setURLStreamHandlerFactory(URLStreamHandlerFactory fac) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\URL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */