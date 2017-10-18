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
/*    */ public final class ScanSettings
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int CALLBACK_TYPE_ALL_MATCHES = 1;
/*    */   public static final int CALLBACK_TYPE_FIRST_MATCH = 2;
/*    */   public static final int CALLBACK_TYPE_MATCH_LOST = 4;
/*    */   
/*    */   public static final class Builder
/*    */   {
/* 23 */     public Builder() { throw new RuntimeException("Stub!"); }
/* 24 */     public Builder setScanMode(int scanMode) { throw new RuntimeException("Stub!"); }
/* 25 */     public Builder setCallbackType(int callbackType) { throw new RuntimeException("Stub!"); }
/* 26 */     public Builder setReportDelay(long reportDelayMillis) { throw new RuntimeException("Stub!"); }
/* 27 */     public Builder setNumOfMatches(int numOfMatches) { throw new RuntimeException("Stub!"); }
/* 28 */     public Builder setMatchMode(int matchMode) { throw new RuntimeException("Stub!"); }
/* 29 */     public Builder setLegacy(boolean legacy) { throw new RuntimeException("Stub!"); }
/* 30 */     public Builder setPhy(int phy) { throw new RuntimeException("Stub!"); }
/* 31 */     public ScanSettings build() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 33 */   ScanSettings() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getScanMode() { throw new RuntimeException("Stub!"); }
/* 35 */   public int getCallbackType() { throw new RuntimeException("Stub!"); }
/* 36 */   public int getScanResultType() { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean getLegacy() { throw new RuntimeException("Stub!"); }
/* 38 */   public int getPhy() { throw new RuntimeException("Stub!"); }
/* 39 */   public long getReportDelayMillis() { throw new RuntimeException("Stub!"); }
/* 40 */   public void writeToParcel(Parcel dest, int flags) { throw new RuntimeException("Stub!"); }
/* 41 */   public int describeContents() { throw new RuntimeException("Stub!"); }
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
/*    */ 
/*    */ 
/* 56 */   public static final Parcelable.Creator<ScanSettings> CREATOR = null;
/*    */   public static final int MATCH_MODE_AGGRESSIVE = 1;
/*    */   public static final int MATCH_MODE_STICKY = 2;
/*    */   public static final int MATCH_NUM_FEW_ADVERTISEMENT = 2;
/*    */   public static final int MATCH_NUM_MAX_ADVERTISEMENT = 3;
/*    */   public static final int MATCH_NUM_ONE_ADVERTISEMENT = 1;
/*    */   public static final int PHY_LE_ALL_SUPPORTED = 255;
/*    */   public static final int SCAN_MODE_BALANCED = 1;
/*    */   public static final int SCAN_MODE_LOW_LATENCY = 2;
/*    */   public static final int SCAN_MODE_LOW_POWER = 0;
/*    */   public static final int SCAN_MODE_OPPORTUNISTIC = -1;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\ScanSettings.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */