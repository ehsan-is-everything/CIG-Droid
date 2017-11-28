/*    */ package android.nfc.tech;
/*    */ 
/*    */ import android.nfc.Tag;
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
/*    */ public final class NfcBarcode
/*    */   extends BasicTagTechnology
/*    */ {
/*    */   public static final int TYPE_KOVIO = 1;
/*    */   public static final int TYPE_UNKNOWN = -1;
/*    */   
/* 21 */   NfcBarcode() { throw new RuntimeException("Stub!"); }
/* 22 */   public static NfcBarcode get(Tag tag) { throw new RuntimeException("Stub!"); }
/* 23 */   public int getType() { throw new RuntimeException("Stub!"); }
/* 24 */   public byte[] getBarcode() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\tech\NfcBarcode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */