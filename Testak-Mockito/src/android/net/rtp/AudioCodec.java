/*    */ package android.net.rtp;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class AudioCodec
/*    */ {
/*    */   public final int type;
/*    */   
/*    */ 
/*    */ 
/*    */   public final String rtpmap;
/*    */   
/*    */ 
/*    */   public final String fmtp;
/*    */   
/*    */ 
/*    */ 
/* 20 */   AudioCodec() { throw new RuntimeException("Stub!"); }
/* 21 */   public static AudioCodec[] getCodecs() { throw new RuntimeException("Stub!"); }
/* 22 */   public static AudioCodec getCodec(int type, String rtpmap, String fmtp) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 31 */   public static final AudioCodec PCMU = null; public static final AudioCodec PCMA = null; public static final AudioCodec GSM_EFR = null; public static final AudioCodec GSM = null; public static final AudioCodec AMR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\net\rtp\AudioCodec.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */