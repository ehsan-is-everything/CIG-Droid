/*    */ package java.net;
/*    */ 
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
/*    */ public final class URI
/*    */   implements Comparable<URI>, Serializable
/*    */ {
/* 31 */   public URI(String str)
/* 31 */     throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 32 */   public URI(String scheme, String userInfo, String host, int port, String path, String query, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 33 */   public URI(String scheme, String authority, String path, String query, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 34 */   public URI(String scheme, String host, String path, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 35 */   public URI(String scheme, String ssp, String fragment) throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 36 */   public static URI create(String str) { throw new RuntimeException("Stub!"); }
/* 37 */   public URI parseServerAuthority() throws URISyntaxException { throw new RuntimeException("Stub!"); }
/* 38 */   public URI normalize() { throw new RuntimeException("Stub!"); }
/* 39 */   public URI resolve(URI uri) { throw new RuntimeException("Stub!"); }
/* 40 */   public URI resolve(String str) { throw new RuntimeException("Stub!"); }
/* 41 */   public URI relativize(URI uri) { throw new RuntimeException("Stub!"); }
/* 42 */   public URL toURL() throws MalformedURLException { throw new RuntimeException("Stub!"); }
/* 43 */   public String getScheme() { throw new RuntimeException("Stub!"); }
/* 44 */   public boolean isAbsolute() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean isOpaque() { throw new RuntimeException("Stub!"); }
/* 46 */   public String getRawSchemeSpecificPart() { throw new RuntimeException("Stub!"); }
/* 47 */   public String getSchemeSpecificPart() { throw new RuntimeException("Stub!"); }
/* 48 */   public String getRawAuthority() { throw new RuntimeException("Stub!"); }
/* 49 */   public String getAuthority() { throw new RuntimeException("Stub!"); }
/* 50 */   public String getRawUserInfo() { throw new RuntimeException("Stub!"); }
/* 51 */   public String getUserInfo() { throw new RuntimeException("Stub!"); }
/* 52 */   public String getHost() { throw new RuntimeException("Stub!"); }
/* 53 */   public int getPort() { throw new RuntimeException("Stub!"); }
/* 54 */   public String getRawPath() { throw new RuntimeException("Stub!"); }
/* 55 */   public String getPath() { throw new RuntimeException("Stub!"); }
/* 56 */   public String getRawQuery() { throw new RuntimeException("Stub!"); }
/* 57 */   public String getQuery() { throw new RuntimeException("Stub!"); }
/* 58 */   public String getRawFragment() { throw new RuntimeException("Stub!"); }
/* 59 */   public String getFragment() { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean equals(Object ob) { throw new RuntimeException("Stub!"); }
/* 61 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 62 */   public int compareTo(URI that) { throw new RuntimeException("Stub!"); }
/* 63 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 64 */   public String toASCIIString() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\URI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */