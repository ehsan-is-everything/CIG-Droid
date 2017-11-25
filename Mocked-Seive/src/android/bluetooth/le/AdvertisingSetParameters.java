/*    */ package android.bluetooth.le;
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
/*    */ public final class AdvertisingSetParameters
/*    */   implements Parcelable
/*    */ {
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setConnectable(boolean connectable) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setScannable(boolean scannable) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setLegacyMode(boolean isLegacy) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setAnonymous(boolean isAnonymous) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setIncludeTxPower(boolean includeTxPower) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setPrimaryPhy(int primaryPhy) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setSecondaryPhy(int secondaryPhy) { throw new RuntimeException("Stub!"); }
/* 31 */     public Builder setInterval(int interval) { throw new RuntimeException("Stub!"); }
/* 32 */     public Builder setTxPowerLevel(int txPowerLevel) { throw new RuntimeException("Stub!"); }
/* 33 */     public AdvertisingSetParameters build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 35 */   AdvertisingSetParameters() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean isConnectable() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean isScannable() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isLegacy() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean isAnonymous() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean includeTxPower() { throw new RuntimeException("Stub!"); }
/* 41 */   public int getPrimaryPhy() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getSecondaryPhy() { throw new RuntimeException("Stub!"); }
/* 43 */   public int getInterval() { throw new RuntimeException("Stub!"); }
/* 44 */   public int getTxPowerLevel() { throw new RuntimeException("Stub!"); }
/* 45 */   public String toString() { throw new RuntimeException("Stub!"); }
/* 46 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 47 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
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
/* 60 */   public static final Parcelable.Creator<AdvertisingSetParameters> CREATOR = null;
/*    */   public static final int INTERVAL_HIGH = 1600;
/*    */   public static final int INTERVAL_LOW = 160;
/*    */   public static final int INTERVAL_MAX = 16777215;
/*    */   public static final int INTERVAL_MEDIUM = 400;
/*    */   public static final int INTERVAL_MIN = 160;
/*    */   public static final int TX_POWER_HIGH = 1;
/*    */   public static final int TX_POWER_LOW = -15;
/*    */   public static final int TX_POWER_MAX = 1;
/*    */   public static final int TX_POWER_MEDIUM = -7;
/*    */   public static final int TX_POWER_MIN = -127;
/*    */   public static final int TX_POWER_ULTRA_LOW = -21;
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\le\AdvertisingSetParameters.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */