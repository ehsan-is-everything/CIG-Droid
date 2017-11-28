/*    */ package android.service.carrier;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ import java.util.List;
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
/*    */ public final class MessagePdu
/*    */   implements Parcelable
/*    */ {
/* 21 */   public MessagePdu(List<byte[]> pduList) { throw new RuntimeException("Stub!"); }
/* 22 */   public List<byte[]> getPdus() { throw new RuntimeException("Stub!"); }
/* 23 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/* 26 */   public static final Parcelable.Creator<MessagePdu> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\carrier\MessagePdu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */