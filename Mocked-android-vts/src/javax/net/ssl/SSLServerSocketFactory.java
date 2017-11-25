/*    */ package javax.net.ssl;
/*    */ 
/*    */ import javax.net.ServerSocketFactory;
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
/*    */ public abstract class SSLServerSocketFactory
/*    */   extends ServerSocketFactory
/*    */ {
/* 32 */   protected SSLServerSocketFactory() { throw new RuntimeException("Stub!"); }
/* 33 */   public static synchronized ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract String[] getDefaultCipherSuites();
/*    */   
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\SSLServerSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */