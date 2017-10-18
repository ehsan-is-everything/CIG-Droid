/*    */ package android.net.http;
/*    */ 
/*    */ import java.io.Closeable;
/*    */ import java.io.File;
/*    */ import java.io.IOException;
/*    */ import java.net.CacheRequest;
/*    */ import java.net.CacheResponse;
/*    */ import java.net.ResponseCache;
/*    */ import java.net.URI;
/*    */ import java.net.URLConnection;
/*    */ import java.util.List;
/*    */ import java.util.Map;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class HttpResponseCache
/*    */   extends ResponseCache
/*    */   implements Closeable
/*    */ {
/* 22 */   HttpResponseCache() { throw new RuntimeException("Stub!"); }
/* 23 */   public static HttpResponseCache getInstalled() { throw new RuntimeException("Stub!"); }
/* 24 */   public static synchronized HttpResponseCache install(File directory, long maxSize) throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public CacheResponse get(URI uri, String requestMethod, Map<String, List<String>> requestHeaders) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public CacheRequest put(URI uri, URLConnection urlConnection) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public long size() { throw new RuntimeException("Stub!"); }
/* 28 */   public long maxSize() { throw new RuntimeException("Stub!"); }
/* 29 */   public void flush() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getNetworkCount() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getHitCount() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getRequestCount() { throw new RuntimeException("Stub!"); }
/* 33 */   public void close() throws IOException { throw new RuntimeException("Stub!"); }
/* 34 */   public void delete() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\http\HttpResponseCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */