/*    */ package android.location;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Deprecated
/*    */ public final class GpsStatus
/*    */ {
/*    */   public static final int GPS_EVENT_FIRST_FIX = 3;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int GPS_EVENT_SATELLITE_STATUS = 4;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/*    */   public static final int GPS_EVENT_STARTED = 1;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int GPS_EVENT_STOPPED = 2;
/*    */   
/*    */ 
/*    */ 
/*    */ 
/* 31 */   GpsStatus() { throw new RuntimeException("Stub!"); }
/* 32 */   public int getTimeToFirstFix() { throw new RuntimeException("Stub!"); }
/* 33 */   public Iterable<GpsSatellite> getSatellites() { throw new RuntimeException("Stub!"); }
/* 34 */   public int getMaxSatellites() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   @Deprecated
/*    */   public static abstract interface NmeaListener
/*    */   {
/*    */     public abstract void onNmeaReceived(long paramLong, String paramString);
/*    */   }
/*    */   
/*    */   @Deprecated
/*    */   public static abstract interface Listener
/*    */   {
/*    */     public abstract void onGpsStatusChanged(int paramInt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\GpsStatus.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */