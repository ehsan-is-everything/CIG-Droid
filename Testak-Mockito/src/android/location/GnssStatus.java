/*    */ package android.location;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class GnssStatus
/*    */ {
/*    */   public static final int CONSTELLATION_BEIDOU = 5;
/*    */   
/*    */ 
/*    */   public static final int CONSTELLATION_GALILEO = 6;
/*    */   
/*    */   public static final int CONSTELLATION_GLONASS = 3;
/*    */   
/*    */   public static final int CONSTELLATION_GPS = 1;
/*    */   
/*    */   public static final int CONSTELLATION_QZSS = 4;
/*    */   public static final int CONSTELLATION_SBAS = 2;
/*    */   public static final int CONSTELLATION_UNKNOWN = 0;
/*    */   
/*    */   public static abstract class Callback
/*    */   {
/* 22 */     public Callback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onStarted() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onStopped() { throw new RuntimeException("Stub!"); }
/* 25 */     public void onFirstFix(int ttffMillis) { throw new RuntimeException("Stub!"); }
/* 26 */     public void onSatelliteStatusChanged(GnssStatus status) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   GnssStatus() { throw new RuntimeException("Stub!"); }
/* 29 */   public int getSatelliteCount() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getConstellationType(int satIndex) { throw new RuntimeException("Stub!"); }
/* 31 */   public int getSvid(int satIndex) { throw new RuntimeException("Stub!"); }
/* 32 */   public float getCn0DbHz(int satIndex) { throw new RuntimeException("Stub!"); }
/* 33 */   public float getElevationDegrees(int satIndex) { throw new RuntimeException("Stub!"); }
/* 34 */   public float getAzimuthDegrees(int satIndex) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean hasEphemerisData(int satIndex) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean hasAlmanacData(int satIndex) { throw new RuntimeException("Stub!"); }
/* 37 */   public boolean usedInFix(int satIndex) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean hasCarrierFrequencyHz(int satIndex) { throw new RuntimeException("Stub!"); }
/* 39 */   public float getCarrierFrequencyHz(int satIndex) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\GnssStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */