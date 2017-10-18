/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import android.bluetooth.BluetoothDevice;
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
/*    */ public final class ScanResult
/*    */   implements Parcelable
/*    */ {
/*    */   @Deprecated
/* 22 */   public ScanResult(BluetoothDevice device, ScanRecord scanRecord, int rssi, long timestampNanos) { throw new RuntimeException("Stub!"); }
/* 23 */   public ScanResult(BluetoothDevice device, int eventType, int primaryPhy, int secondaryPhy, int advertisingSid, int txPower, int rssi, int periodicAdvertisingInterval, ScanRecord scanRecord, long timestampNanos) { throw new RuntimeException("Stub!"); }
/* 24 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 25 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 26 */   public BluetoothDevice getDevice() { throw new RuntimeException("Stub!"); }
/* 27 */   public ScanRecord getScanRecord() { throw new RuntimeException("Stub!"); }
/* 28 */   public int getRssi() { throw new RuntimeException("Stub!"); }
/* 29 */   public long getTimestampNanos() { throw new RuntimeException("Stub!"); }
/* 30 */   public boolean isLegacy() { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isConnectable() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getDataStatus() { throw new RuntimeException("Stub!"); }
/* 33 */   public int getPrimaryPhy() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getSecondaryPhy() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getAdvertisingSid() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getTxPower() { throw new RuntimeException("Stub!"); }
/* 37 */   public int getPeriodicAdvertisingInterval() { throw new RuntimeException("Stub!"); }
/* 38 */   public int hashCode() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 40 */   public String toString() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/* 48 */   public static final Parcelable.Creator<ScanResult> CREATOR = null;
/*    */   public static final int DATA_COMPLETE = 0;
/*    */   public static final int DATA_TRUNCATED = 2;
/*    */   public static final int PERIODIC_INTERVAL_NOT_PRESENT = 0;
/*    */   public static final int PHY_UNUSED = 0;
/*    */   public static final int SID_NOT_PRESENT = 255;
/*    */   public static final int TX_POWER_NOT_PRESENT = 127;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\ScanResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */