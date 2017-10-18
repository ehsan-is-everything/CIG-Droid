/*    */ package android.nfc.cardemulation;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.content.ComponentName;
/*    */ import android.nfc.NfcAdapter;
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
/*    */ public final class NfcFCardEmulation
/*    */ {
/* 20 */   NfcFCardEmulation() { throw new RuntimeException("Stub!"); }
/* 21 */   public static synchronized NfcFCardEmulation getInstance(NfcAdapter adapter) { throw new RuntimeException("Stub!"); }
/* 22 */   public String getSystemCodeForService(ComponentName service) throws RuntimeException { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean registerSystemCodeForService(ComponentName service, String systemCode) throws RuntimeException { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean unregisterSystemCodeForService(ComponentName service) throws RuntimeException { throw new RuntimeException("Stub!"); }
/* 25 */   public String getNfcid2ForService(ComponentName service) throws RuntimeException { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean setNfcid2ForService(ComponentName service, String nfcid2) throws RuntimeException { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean enableService(Activity activity, ComponentName service) throws RuntimeException { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean disableService(Activity activity) throws RuntimeException { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\nfc\cardemulation\NfcFCardEmulation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */