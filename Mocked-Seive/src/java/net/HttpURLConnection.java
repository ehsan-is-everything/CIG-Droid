/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class HttpURLConnection extends URLConnection
/*    */ {
/*    */   public static final int HTTP_ACCEPTED = 202;
/*    */   public static final int HTTP_BAD_GATEWAY = 502;
/*    */   public static final int HTTP_BAD_METHOD = 405;
/*    */   public static final int HTTP_BAD_REQUEST = 400;
/*    */   public static final int HTTP_CLIENT_TIMEOUT = 408;
/*    */   public static final int HTTP_CONFLICT = 409;
/*    */   public static final int HTTP_CREATED = 201;
/*    */   public static final int HTTP_ENTITY_TOO_LARGE = 413;
/*    */   public static final int HTTP_FORBIDDEN = 403;
/*    */   public static final int HTTP_GATEWAY_TIMEOUT = 504;
/*    */   public static final int HTTP_GONE = 410;
/*    */   public static final int HTTP_INTERNAL_ERROR = 500;
/*    */   public static final int HTTP_LENGTH_REQUIRED = 411;
/*    */   public static final int HTTP_MOVED_PERM = 301;
/*    */   public static final int HTTP_MOVED_TEMP = 302;
/*    */   public static final int HTTP_MULT_CHOICE = 300;
/*    */   public static final int HTTP_NOT_ACCEPTABLE = 406;
/*    */   public static final int HTTP_NOT_AUTHORITATIVE = 203;
/*    */   public static final int HTTP_NOT_FOUND = 404;
/*    */   public static final int HTTP_NOT_IMPLEMENTED = 501;
/*    */   public static final int HTTP_NOT_MODIFIED = 304;
/*    */   
/*    */   protected HttpURLConnection(URL u) {
/* 30 */     super((URL)null);throw new RuntimeException("Stub!"); }
/* 31 */   public String getHeaderFieldKey(int n) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setFixedLengthStreamingMode(int contentLength) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setFixedLengthStreamingMode(long contentLength) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setChunkedStreamingMode(int chunklen) { throw new RuntimeException("Stub!"); }
/* 35 */   public String getHeaderField(int n) { throw new RuntimeException("Stub!"); }
/* 36 */   public static void setFollowRedirects(boolean set) { throw new RuntimeException("Stub!"); }
/* 37 */   public static boolean getFollowRedirects() { throw new RuntimeException("Stub!"); }
/* 38 */   public void setInstanceFollowRedirects(boolean followRedirects) { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean getInstanceFollowRedirects() { throw new RuntimeException("Stub!"); }
/* 40 */   public void setRequestMethod(String method) throws ProtocolException { throw new RuntimeException("Stub!"); }
/* 41 */   public String getRequestMethod() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getResponseCode() throws IOException { throw new RuntimeException("Stub!"); }
/* 43 */   public String getResponseMessage() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/* 45 */   public long getHeaderFieldDate(String name, long Default) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void disconnect();
/*    */   public abstract boolean usingProxy();
/* 48 */   public java.security.Permission getPermission() throws IOException { throw new RuntimeException("Stub!"); }
/* 49 */   public java.io.InputStream getErrorStream() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static final int HTTP_NO_CONTENT = 204;
/*    */   public static final int HTTP_OK = 200;
/*    */   public static final int HTTP_PARTIAL = 206;
/*    */   public static final int HTTP_PAYMENT_REQUIRED = 402;
/*    */   public static final int HTTP_PRECON_FAILED = 412;
/*    */   public static final int HTTP_PROXY_AUTH = 407;
/*    */   public static final int HTTP_REQ_TOO_LONG = 414;
/*    */   public static final int HTTP_RESET = 205;
/*    */   public static final int HTTP_SEE_OTHER = 303;
/*    */   @Deprecated
/*    */   public static final int HTTP_SERVER_ERROR = 500;
/*    */   public static final int HTTP_UNAUTHORIZED = 401;
/*    */   public static final int HTTP_UNAVAILABLE = 503;
/*    */   public static final int HTTP_UNSUPPORTED_TYPE = 415;
/*    */   public static final int HTTP_USE_PROXY = 305;
/*    */   public static final int HTTP_VERSION = 505;
/*    */   protected int chunkLength;
/*    */   protected int fixedContentLength;
/*    */   protected long fixedContentLengthLong;
/*    */   protected boolean instanceFollowRedirects;
/*    */   protected String method;
/*    */   protected int responseCode;
/*    */   protected String responseMessage;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\HttpURLConnection.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */