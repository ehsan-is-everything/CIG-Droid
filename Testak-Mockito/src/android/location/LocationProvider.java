/*    */ package android.location;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LocationProvider
/*    */ {
/*    */   public static final int AVAILABLE = 2;
/*    */   
/*    */ 
/*    */ 
/*    */   public static final int OUT_OF_SERVICE = 0;
/*    */   
/*    */ 
/*    */   public static final int TEMPORARILY_UNAVAILABLE = 1;
/*    */   
/*    */ 
/*    */ 
/* 20 */   LocationProvider() { throw new RuntimeException("Stub!"); }
/* 21 */   public String getName() { throw new RuntimeException("Stub!"); }
/* 22 */   public boolean meetsCriteria(Criteria criteria) { throw new RuntimeException("Stub!"); }
/* 23 */   public boolean requiresNetwork() { throw new RuntimeException("Stub!"); }
/* 24 */   public boolean requiresSatellite() { throw new RuntimeException("Stub!"); }
/* 25 */   public boolean requiresCell() { throw new RuntimeException("Stub!"); }
/* 26 */   public boolean hasMonetaryCost() { throw new RuntimeException("Stub!"); }
/* 27 */   public boolean supportsAltitude() { throw new RuntimeException("Stub!"); }
/* 28 */   public boolean supportsSpeed() { throw new RuntimeException("Stub!"); }
/* 29 */   public boolean supportsBearing() { throw new RuntimeException("Stub!"); }
/* 30 */   public int getPowerRequirement() { throw new RuntimeException("Stub!"); }
/* 31 */   public int getAccuracy() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\location\LocationProvider.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */