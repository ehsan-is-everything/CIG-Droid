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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NdefFormatable
/*    */   extends BasicTagTechnology
/*    */ {
/* 21 */   NdefFormatable() { throw new RuntimeException("Stub!"); }
/* 22 */   public static NdefFormatable get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public void format(NdefMessage firstMessage) throws IOException, FormatException { throw new RuntimeException("Stub!"); }
/* 24 */   public void formatReadOnly(NdefMessage firstMessage) throws IOException, FormatException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\tech\NdefFormatable.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */