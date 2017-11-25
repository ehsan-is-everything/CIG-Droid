/*    */ package javax.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import java.net.UnknownHostException;
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
/*    */ public abstract class SocketFactory
/*    */ {
/* 30 */   protected SocketFactory() { throw new RuntimeException("Stub!"); }
/* 31 */   public static SocketFactory getDefault() { throw new RuntimeException("Stub!"); }
/* 32 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract Socket createSocket(String paramString, int paramInt)
/*    */     throws IOException, UnknownHostException;
/*    */   
/*    */   public abstract Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
/*    */     throws IOException, UnknownHostException;
/*    */   
/*    */   public abstract Socket createSocket(InetAddress paramInetAddress, int paramInt)
/*    */     throws IOException;
/*    */   
/*    */   public abstract Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\javax\net\SocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */