/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.util.List;
/*    */ import java.util.Map;
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
/*    */ public abstract class ResponseCache
/*    */ {
/* 29 */   public ResponseCache() { throw new RuntimeException("Stub!"); }
/* 30 */   public static synchronized ResponseCache getDefault() { throw new RuntimeException("Stub!"); }
/* 31 */   public static synchronized void setDefault(ResponseCache responseCache) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap)
/*    */     throws IOException;
/*    */   
/*    */   public abstract CacheRequest put(URI paramURI, URLConnection paramURLConnection)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\ResponseCache.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */