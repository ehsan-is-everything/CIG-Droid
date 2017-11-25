/*    */ package android.net.rtp;
/*    */ 
/*    */ import java.net.InetAddress;
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
/*    */ public class RtpStream
/*    */ {
/*    */   public static final int MODE_NORMAL = 0;
/*    */   public static final int MODE_RECEIVE_ONLY = 2;
/*    */   public static final int MODE_SEND_ONLY = 1;
/*    */   
/* 20 */   RtpStream() { throw new RuntimeException("Stub!"); }
/* 21 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getLocalPort() { throw new RuntimeException("Stub!"); }
/* 23 */   public InetAddress getRemoteAddress() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getRemotePort() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean isBusy() { throw new RuntimeException("Stub!"); }
/* 26 */   public int getMode() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setMode(int mode) { throw new RuntimeException("Stub!"); }
/* 28 */   public void associate(InetAddress address, int port) { throw new RuntimeException("Stub!"); }
/* 29 */   public void release() { throw new RuntimeException("Stub!"); }
/* 30 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\net\rtp\RtpStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */