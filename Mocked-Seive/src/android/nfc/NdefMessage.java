/*    */ package android.nfc;
/*    */ 
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
/*    */ public final class NdefMessage
/*    */   implements Parcelable
/*    */ {
/* 21 */   public NdefMessage(byte[] data)
/* 21 */     throws FormatException { throw new RuntimeException("Stub!"); }
/* 22 */   public NdefMessage(NdefRecord record, NdefRecord... records) { throw new RuntimeException("Stub!"); }
/* 23 */   public NdefMessage(NdefRecord[] records) { throw new RuntimeException("Stub!"); }
/* 24 */   public NdefRecord[] getRecords() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getByteArrayLength() { throw new RuntimeException("Stub!"); }
/* 26 */   public byte[] toByteArray() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 28 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 29 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 31 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 33 */   public static final Parcelable.Creator<NdefMessage> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\nfc\NdefMessage.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */