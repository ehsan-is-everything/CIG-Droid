/*    */ package android.location;
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
/*    */ public final class GnssMeasurement
/*    */   implements Parcelable
/*    */ {
/*    */   public static final int ADR_STATE_CYCLE_SLIP = 4;
/*    */   public static final int ADR_STATE_RESET = 2;
/*    */   public static final int ADR_STATE_UNKNOWN = 0;
/*    */   public static final int ADR_STATE_VALID = 1;
/*    */   
/* 21 */   GnssMeasurement() { throw new RuntimeException("Stub!"); }
/* 22 */   public int getSvid() { throw new RuntimeException("Stub!"); }
/* 23 */   public int getConstellationType() { throw new RuntimeException("Stub!"); }
/* 24 */   public double getTimeOffsetNanos() { throw new RuntimeException("Stub!"); }
/* 25 */   public int getState() { throw new RuntimeException("Stub!"); }
/* 26 */   public long getReceivedSvTimeNanos() { throw new RuntimeException("Stub!"); }
/* 27 */   public long getReceivedSvTimeUncertaintyNanos() { throw new RuntimeException("Stub!"); }
/* 28 */   public double getCn0DbHz() { throw new RuntimeException("Stub!"); }
/* 29 */   public double getPseudorangeRateMetersPerSecond() { throw new RuntimeException("Stub!"); }
/* 30 */   public double getPseudorangeRateUncertaintyMetersPerSecond() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getAccumulatedDeltaRangeState() { throw new RuntimeException("Stub!"); }
/* 32 */   public double getAccumulatedDeltaRangeMeters() { throw new RuntimeException("Stub!"); }
/* 33 */   public double getAccumulatedDeltaRangeUncertaintyMeters() { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean hasCarrierFrequencyHz() { throw new RuntimeException("Stub!"); }
/* 35 */   public float getCarrierFrequencyHz() { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean hasCarrierCycles() { throw new RuntimeException("Stub!"); }
/* 37 */   public long getCarrierCycles() { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean hasCarrierPhase() { throw new RuntimeException("Stub!"); }
/* 39 */   public double getCarrierPhase() { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean hasCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
/* 41 */   public double getCarrierPhaseUncertainty() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getMultipathIndicator() { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean hasSnrInDb() { throw new RuntimeException("Stub!"); }
/* 44 */   public double getSnrInDb() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean hasAutomaticGainControlLevelDb() { throw new RuntimeException("Stub!"); }
/* 46 */   public double getAutomaticGainControlLevelDb() { throw new RuntimeException("Stub!"); }
/* 47 */   public void writeToParcel(Parcel parcel, int flags) { throw new RuntimeException("Stub!"); }
/* 48 */   public int describeContents() { throw new RuntimeException("Stub!"); }
/* 49 */   public String toString() { throw new RuntimeException("Stub!"); }
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
/* 75 */   public static final Parcelable.Creator<GnssMeasurement> CREATOR = null;
/*    */   public static final int MULTIPATH_INDICATOR_DETECTED = 1;
/*    */   public static final int MULTIPATH_INDICATOR_NOT_DETECTED = 2;
/*    */   public static final int MULTIPATH_INDICATOR_UNKNOWN = 0;
/*    */   public static final int STATE_BDS_D2_BIT_SYNC = 256;
/*    */   public static final int STATE_BDS_D2_SUBFRAME_SYNC = 512;
/*    */   public static final int STATE_BIT_SYNC = 2;
/*    */   public static final int STATE_CODE_LOCK = 1;
/*    */   public static final int STATE_GAL_E1BC_CODE_LOCK = 1024;
/*    */   public static final int STATE_GAL_E1B_PAGE_SYNC = 4096;
/*    */   public static final int STATE_GAL_E1C_2ND_CODE_LOCK = 2048;
/*    */   public static final int STATE_GLO_STRING_SYNC = 64;
/*    */   public static final int STATE_GLO_TOD_DECODED = 128;
/*    */   public static final int STATE_GLO_TOD_KNOWN = 32768;
/*    */   public static final int STATE_MSEC_AMBIGUOUS = 16;
/*    */   public static final int STATE_SBAS_SYNC = 8192;
/*    */   public static final int STATE_SUBFRAME_SYNC = 4;
/*    */   public static final int STATE_SYMBOL_SYNC = 32;
/*    */   public static final int STATE_TOW_DECODED = 8;
/*    */   public static final int STATE_TOW_KNOWN = 16384;
/*    */   public static final int STATE_UNKNOWN = 0;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\GnssMeasurement.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */