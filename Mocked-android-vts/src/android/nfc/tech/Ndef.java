/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.FormatException;
/*    */ import android.nfc.NdefMessage;
/*    */ import android.nfc.Tag;
/*    */ import java.io.IOException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class Ndef
/*    */   extends BasicTagTechnology
/*    */ {
/*    */   public static final String MIFARE_CLASSIC = "com.nxp.ndef.mifareclassic";
/*    */   public static final String NFC_FORUM_TYPE_1 = "org.nfcforum.ndef.type1";
/*    */   public static final String NFC_FORUM_TYPE_2 = "org.nfcforum.ndef.type2";
/*    */   public static final String NFC_FORUM_TYPE_3 = "org.nfcforum.ndef.type3";
/*    */   public static final String NFC_FORUM_TYPE_4 = "org.nfcforum.ndef.type4";
/*    */   
/* 21 */   Ndef() { throw new RuntimeException("Stub!"); }
/* 22 */   public static Ndef get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public NdefMessage getCachedNdefMessage() { throw new RuntimeException("Stub!"); }
/* 24 */   public String getType() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getMaxSize() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean isWritable() { throw new RuntimeException("Stub!"); }
/* 27 */   public NdefMessage getNdefMessage() throws IOException, FormatException { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeNdefMessage(NdefMessage msg) throws IOException, FormatException { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean canMakeReadOnly() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean makeReadOnly() throws IOException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\tech\Ndef.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */