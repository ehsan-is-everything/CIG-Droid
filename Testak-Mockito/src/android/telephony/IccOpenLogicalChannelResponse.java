/*    */ package android.telephony;
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
/*    */ 
/*    */ public class IccOpenLogicalChannelResponse
/*    */   implements Parcelable
/*    */ {
/* 21 */   IccOpenLogicalChannelResponse() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getChannel() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getStatus() { throw new RuntimeException("Stub!"); }
/* 24 */   public byte[] getSelectResponse() { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public void writeToParcel(Parcel out, int flags) { throw new RuntimeException("Stub!"); }
/* 27 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 34 */   public static final Parcelable.Creator<IccOpenLogicalChannelResponse> CREATOR = null;
/*    */   public static final int INVALID_CHANNEL = -1;
/*    */   public static final int STATUS_MISSING_RESOURCE = 2;
/*    */   public static final int STATUS_NO_ERROR = 1;
/*    */   public static final int STATUS_NO_SUCH_ELEMENT = 3;
/*    */   public static final int STATUS_UNKNOWN_ERROR = 4;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\IccOpenLogicalChannelResponse.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */