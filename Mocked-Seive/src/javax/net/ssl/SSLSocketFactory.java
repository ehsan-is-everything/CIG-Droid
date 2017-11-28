/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.Socket;
/*    */ import javax.net.SocketFactory;
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
/*    */ public abstract class SSLSocketFactory
/*    */   extends SocketFactory
/*    */ {
/* 32 */   public SSLSocketFactory() { throw new RuntimeException("Stub!"); }
/* 33 */   public static synchronized SocketFactory getDefault() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract String[] getDefaultCipherSuites();
/*    */   
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */   
/*    */   public abstract Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\ssl\SSLSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */