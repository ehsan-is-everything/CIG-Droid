/*    */ package android.telephony;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Bitmap;
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
/*    */ public class SubscriptionInfo
/*    */   implements Parcelable
/*    */ {
/* 21 */   SubscriptionInfo() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getSubscriptionId() { throw new RuntimeException("Stub!"); }
/* 23 */   public String getIccId() { throw new RuntimeException("Stub!"); }
/* 24 */   public int getSimSlotIndex() { throw new RuntimeException("Stub!"); }
/* 25 */   public CharSequence getDisplayName() { throw new RuntimeException("Stub!"); }
/* 26 */   public CharSequence getCarrierName() { throw new RuntimeException("Stub!"); }
/* 27 */   public Bitmap createIconBitmap(Context context) { throw new RuntimeException("Stub!"); }
/* 28 */   public int getIconTint() { throw new RuntimeException("Stub!"); }
/* 29 */   public String getNumber() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getDataRoaming() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getMcc() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getMnc() { throw new RuntimeException("Stub!"); }
/* 33 */   public String getCountryIso() { throw new RuntimeException("Stub!"); }
/* 34 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 35 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 36 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/* 38 */   public static final Parcelable.Creator<SubscriptionInfo> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telephony\SubscriptionInfo.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */