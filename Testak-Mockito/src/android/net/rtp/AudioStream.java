/*    */ package android.net.rtp;
/*    */ 
/*    */ import java.net.InetAddress;
/*    */ import java.net.SocketException;
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
/*    */ public class AudioStream
/*    */   extends RtpStream
/*    */ {
/* 21 */   public AudioStream(InetAddress address)
/* 21 */     throws SocketException { throw new RuntimeException("Stub!"); }
/* 22 */   public final boolean isBusy() { throw new RuntimeException("Stub!"); }
/* 23 */   public AudioGroup getGroup() { throw new RuntimeException("Stub!"); }
/* 24 */   public void join(AudioGroup group) { throw new RuntimeException("Stub!"); }
/* 25 */   public AudioCodec getCodec() { throw new RuntimeException("Stub!"); }
/* 26 */   public void setCodec(AudioCodec codec) { throw new RuntimeException("Stub!"); }
/* 27 */   public int getDtmfType() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setDtmfType(int type) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\rtp\AudioStream.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */