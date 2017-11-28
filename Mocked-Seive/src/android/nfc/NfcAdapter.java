/*    */ package android.nfc;
/*    */ 
/*    */ import android.app.Activity;
/*    */ import android.app.PendingIntent;
/*    */ import android.content.Context;
/*    */ import android.content.IntentFilter;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class NfcAdapter
/*    */ {
/*    */   public static final String ACTION_ADAPTER_STATE_CHANGED = "android.nfc.action.ADAPTER_STATE_CHANGED";
/*    */   public static final String ACTION_NDEF_DISCOVERED = "android.nfc.action.NDEF_DISCOVERED";
/*    */   public static final String ACTION_TAG_DISCOVERED = "android.nfc.action.TAG_DISCOVERED";
/*    */   public static final String ACTION_TECH_DISCOVERED = "android.nfc.action.TECH_DISCOVERED";
/*    */   public static final String EXTRA_ADAPTER_STATE = "android.nfc.extra.ADAPTER_STATE";
/*    */   public static final String EXTRA_ID = "android.nfc.extra.ID";
/*    */   public static final String EXTRA_NDEF_MESSAGES = "android.nfc.extra.NDEF_MESSAGES";
/*    */   public static final String EXTRA_READER_PRESENCE_CHECK_DELAY = "presence";
/*    */   public static final String EXTRA_TAG = "android.nfc.extra.TAG";
/*    */   public static final int FLAG_READER_NFC_A = 1;
/*    */   public static final int FLAG_READER_NFC_B = 2;
/*    */   public static final int FLAG_READER_NFC_BARCODE = 16;
/*    */   public static final int FLAG_READER_NFC_F = 4;
/*    */   public static final int FLAG_READER_NFC_V = 8;
/*    */   public static final int FLAG_READER_NO_PLATFORM_SOUNDS = 256;
/*    */   public static final int FLAG_READER_SKIP_NDEF_CHECK = 128;
/*    */   public static final int STATE_OFF = 1;
/*    */   public static final int STATE_ON = 3;
/*    */   public static final int STATE_TURNING_OFF = 4;
/*    */   public static final int STATE_TURNING_ON = 2;
/*    */   
/* 40 */   NfcAdapter() { throw new RuntimeException("Stub!"); }
/* 41 */   public static NfcAdapter getDefaultAdapter(Context context) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean isEnabled() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setBeamPushUris(Uri[] uris, Activity activity) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setBeamPushUrisCallback(CreateBeamUrisCallback callback, Activity activity) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setNdefPushMessage(NdefMessage message, Activity activity, Activity... activities) { throw new RuntimeException("Stub!"); }
/* 46 */   public void setNdefPushMessageCallback(CreateNdefMessageCallback callback, Activity activity, Activity... activities) { throw new RuntimeException("Stub!"); }
/* 47 */   public void setOnNdefPushCompleteCallback(OnNdefPushCompleteCallback callback, Activity activity, Activity... activities) { throw new RuntimeException("Stub!"); }
/* 48 */   public void enableForegroundDispatch(Activity activity, PendingIntent intent, IntentFilter[] filters, String[][] techLists) { throw new RuntimeException("Stub!"); }
/* 49 */   public void disableForegroundDispatch(Activity activity) { throw new RuntimeException("Stub!"); }
/* 50 */   public void enableReaderMode(Activity activity, ReaderCallback callback, int flags, Bundle extras) { throw new RuntimeException("Stub!"); }
/* 51 */   public void disableReaderMode(Activity activity) { throw new RuntimeException("Stub!"); }
/* 52 */   public boolean invokeBeam(Activity activity) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 54 */   public void enableForegroundNdefPush(Activity activity, NdefMessage message) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 56 */   public void disableForegroundNdefPush(Activity activity) { throw new RuntimeException("Stub!"); }
/* 57 */   public boolean isNdefPushEnabled() { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean ignore(Tag tag, int debounceMs, OnTagRemovedListener tagRemovedListener, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnTagRemovedListener
/*    */   {
/*    */     public abstract void onTagRemoved();
/*    */   }
/*    */   
/*    */   public static abstract interface CreateBeamUrisCallback
/*    */   {
/*    */     public abstract Uri[] createBeamUris(NfcEvent paramNfcEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface CreateNdefMessageCallback
/*    */   {
/*    */     public abstract NdefMessage createNdefMessage(NfcEvent paramNfcEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnNdefPushCompleteCallback
/*    */   {
/*    */     public abstract void onNdefPushComplete(NfcEvent paramNfcEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface ReaderCallback
/*    */   {
/*    */     public abstract void onTagDiscovered(Tag paramTag);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\NfcAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */