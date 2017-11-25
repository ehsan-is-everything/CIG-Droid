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
/*    */ public abstract class CellInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   CellInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean isRegistered() { throw new RuntimeException("Stub!"); }
/* 23 */   public long getTimeStamp() { throw new RuntimeException("Stub!"); }
/* 24 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); }
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 27 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/* 30 */   public static final Parcelable.Creator<CellInfo> CREATOR = null;
/*    */   
/*    */   public abstract void writeToParcel(Parcel paramParcel, int paramInt);
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\CellInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */