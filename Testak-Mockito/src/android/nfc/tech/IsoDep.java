/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.Tag;
/*    */ import java.io.IOException;
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
/*    */ public final class IsoDep
/*    */   extends BasicTagTechnology
/*    */ {
/* 21 */   IsoDep() { throw new RuntimeException("Stub!"); }
/* 22 */   public static IsoDep get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public void setTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 24 */   public int getTimeout() { throw new RuntimeException("Stub!"); }
/* 25 */   public byte[] getHistoricalBytes() { throw new RuntimeException("Stub!"); }
/* 26 */   public byte[] getHiLayerResponse() { throw new RuntimeException("Stub!"); }
/* 27 */   public byte[] transceive(byte[] data) throws IOException { throw new RuntimeException("Stub!"); }
/* 28 */   public int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean isExtendedLengthApduSupported() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\tech\IsoDep.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */