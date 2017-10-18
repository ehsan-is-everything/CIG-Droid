/*    */ package javax.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.ServerSocket;
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
/*    */ public abstract class ServerSocketFactory
/*    */ {
/* 29 */   protected ServerSocketFactory() { throw new RuntimeException("Stub!"); }
/* 30 */   public static ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); }
/* 31 */   public ServerSocket createServerSocket() throws IOException { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract ServerSocket createServerSocket(int paramInt)
/*    */     throws IOException;
/*    */   
/*    */   public abstract ServerSocket createServerSocket(int paramInt1, int paramInt2)
/*    */     throws IOException;
/*    */   
/*    */   public abstract ServerSocket createServerSocket(int paramInt1, int paramInt2, InetAddress paramInetAddress)
/*    */     throws IOException;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\javax\net\ServerSocketFactory.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */