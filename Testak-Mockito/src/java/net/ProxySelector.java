/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
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
/*    */ 
/*    */ public abstract class ProxySelector
/*    */ {
/* 29 */   public ProxySelector() { throw new RuntimeException("Stub!"); }
/* 30 */   public static ProxySelector getDefault() { throw new RuntimeException("Stub!"); }
/* 31 */   public static void setDefault(ProxySelector ps) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract List<Proxy> select(URI paramURI);
/*    */   
/*    */   public abstract void connectFailed(URI paramURI, SocketAddress paramSocketAddress, IOException paramIOException);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\java\net\ProxySelector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */