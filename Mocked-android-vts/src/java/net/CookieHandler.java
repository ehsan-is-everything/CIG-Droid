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
/*    */ public abstract class CookieHandler
/*    */ {
/* 29 */   public CookieHandler() { throw new RuntimeException("Stub!"); }
/* 30 */   public static synchronized CookieHandler getDefault() { throw new RuntimeException("Stub!"); }
/* 31 */   public static synchronized void setDefault(CookieHandler cHandler) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Map<String, List<String>> get(URI paramURI, Map<String, List<String>> paramMap)
/*    */     throws IOException;
/*    */   
/*    */   public abstract void put(URI paramURI, Map<String, List<String>> paramMap)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\java\net\CookieHandler.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */