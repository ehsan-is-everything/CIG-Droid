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
/*    */ public final class MifareUltralight
/*    */   extends BasicTagTechnology
/*    */ {
/*    */   public static final int PAGE_SIZE = 4;
/*    */   public static final int TYPE_ULTRALIGHT = 1;
/*    */   public static final int TYPE_ULTRALIGHT_C = 2;
/*    */   public static final int TYPE_UNKNOWN = -1;
/*    */   
/* 21 */   MifareUltralight() { throw new RuntimeException("Stub!"); }
/* 22 */   public static MifareUltralight get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 24 */   public byte[] readPages(int pageOffset) throws IOException { throw new RuntimeException("Stub!"); }
/* 25 */   public void writePage(int pageOffset, byte[] data) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public byte[] transceive(byte[] data) throws IOException { throw new RuntimeException("Stub!"); }
/* 27 */   public int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); }
/* 28 */   public void setTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 29 */   public int getTimeout() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\tech\MifareUltralight.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */