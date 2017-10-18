/*    */ package android.app.admin;
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
/*    */ public abstract class NetworkEvent
/*    */   implements Parcelable
/*    */ {
/* 21 */   NetworkEvent() { throw new RuntimeException("Stub!"); }
/* 22 */   public String getPackageName() { throw new RuntimeException("Stub!"); }
/* 23 */   public long getTimestamp() { throw new RuntimeException("Stub!"); }
/* 24 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 27 */   public static final Parcelable.Creator<NetworkEvent> CREATOR = null;
/*    */   
/*    */   public abstract void writeToParcel(Parcel paramParcel, int paramInt);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\app\admin\NetworkEvent.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */