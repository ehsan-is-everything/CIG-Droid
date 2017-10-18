/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import android.os.Parcel;
/*    */ import android.os.Parcelable;
/*    */ import android.os.Parcelable.Creator;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class AdvertiseSettings
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ADVERTISE_MODE_BALANCED = 1;
/*    */   public static final int ADVERTISE_MODE_LOW_LATENCY = 2;
/*    */   public static final int ADVERTISE_MODE_LOW_POWER = 0;
/*    */   public static final int ADVERTISE_TX_POWER_HIGH = 3;
/*    */   public static final int ADVERTISE_TX_POWER_LOW = 1;
/*    */   public static final int ADVERTISE_TX_POWER_MEDIUM = 2;
/*    */   public static final int ADVERTISE_TX_POWER_ULTRA_LOW = 0;
/*    */   
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setAdvertiseMode(int advertiseMode) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setTxPowerLevel(int txPowerLevel) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setConnectable(boolean connectable) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setTimeout(int timeoutMillis) { throw new RuntimeException("Stub!"); }
/* 28 */     public AdvertiseSettings build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 30 */   AdvertiseSettings() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getMode() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getTxPowerLevel() { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isConnectable() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getTimeout() { throw new RuntimeException("Stub!"); }
/* 35 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 36 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 37 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 46 */   public static final Parcelable.Creator<AdvertiseSettings> CREATOR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\AdvertiseSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */