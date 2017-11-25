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
/*    */ public final class NfcA
/*    */   extends BasicTagTechnology
/*    */ {
/* 21 */   NfcA() { throw new RuntimeException("Stub!"); }
/* 22 */   public static NfcA get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public byte[] getAtqa() { throw new RuntimeException("Stub!"); }
/* 24 */   public short getSak() { throw new RuntimeException("Stub!"); }
/* 25 */   public byte[] transceive(byte[] data) throws IOException { throw new RuntimeException("Stub!"); }
/* 26 */   public int getMaxTransceiveLength() { throw new RuntimeException("Stub!"); }
/* 27 */   public void setTimeout(int timeout) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getTimeout() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\tech\NfcA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */