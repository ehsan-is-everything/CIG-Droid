/*    */ package android.nfc;
/*    */ 
/*    */ import android.net.Uri;
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
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
/*    */ public final class NdefRecord
/*    */   implements Parcelable
/*    */ {
/* 21 */   public NdefRecord(short tnf, byte[] type, byte[] id, byte[] payload) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 23 */   public NdefRecord(byte[] data) throws FormatException { throw new RuntimeException("Stub!"); }
/* 24 */   public static NdefRecord createApplicationRecord(String packageName) { throw new RuntimeException("Stub!"); }
/* 25 */   public static NdefRecord createUri(Uri uri) { throw new RuntimeException("Stub!"); }
/* 26 */   public static NdefRecord createUri(String uriString) { throw new RuntimeException("Stub!"); }
/* 27 */   public static NdefRecord createMime(String mimeType, byte[] mimeData) { throw new RuntimeException("Stub!"); }
/* 28 */   public static NdefRecord createExternal(String domain, String type, byte[] data) { throw new RuntimeException("Stub!"); }
/* 29 */   public static NdefRecord createTextRecord(String languageCode, String text) { throw new RuntimeException("Stub!"); }
/* 30 */   public short getTnf() { throw new RuntimeException("Stub!"); }
/* 31 */   public byte[] getType() { throw new RuntimeException("Stub!"); }
/* 32 */   public byte[] getId() { throw new RuntimeException("Stub!"); }
/* 33 */   public byte[] getPayload() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 35 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); }
/* 36 */   public String toMimeType() { throw new RuntimeException("Stub!"); }
/* 37 */   public Uri toUri() { throw new RuntimeException("Stub!"); }
/* 38 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 39 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 40 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 42 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 44 */   public static final byte[] RTD_ALTERNATIVE_CARRIER = null;
/* 45 */   public static final byte[] RTD_HANDOVER_CARRIER = null;
/* 46 */   public static final byte[] RTD_HANDOVER_REQUEST = null;
/* 47 */   public static final byte[] RTD_HANDOVER_SELECT = null;
/* 48 */   public static final byte[] RTD_SMART_POSTER = null;
/* 49 */   public static final byte[] RTD_TEXT = null;
/* 50 */   public static final byte[] RTD_URI = null;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 58 */   public static final Parcelable.Creator<NdefRecord> CREATOR = null;
/*    */   public static final short TNF_ABSOLUTE_URI = 3;
/*    */   public static final short TNF_EMPTY = 0;
/*    */   public static final short TNF_EXTERNAL_TYPE = 4;
/*    */   public static final short TNF_MIME_MEDIA = 2;
/*    */   public static final short TNF_UNCHANGED = 6;
/*    */   public static final short TNF_UNKNOWN = 5;
/*    */   public static final short TNF_WELL_KNOWN = 1;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\NdefRecord.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */