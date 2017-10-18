/*    */ package android.bluetooth.le;
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AdvertisingSetCallback
/*    */ {
/*    */   public static final int ADVERTISE_FAILED_ALREADY_STARTED = 3;
/*    */   
/*    */ 
/*    */   public static final int ADVERTISE_FAILED_DATA_TOO_LARGE = 1;
/*    */   
/*    */   public static final int ADVERTISE_FAILED_FEATURE_UNSUPPORTED = 5;
/*    */   
/*    */   public static final int ADVERTISE_FAILED_INTERNAL_ERROR = 4;
/*    */   
/*    */   public static final int ADVERTISE_FAILED_TOO_MANY_ADVERTISERS = 2;
/*    */   
/*    */   public static final int ADVERTISE_SUCCESS = 0;
/*    */   
/* 20 */   public AdvertisingSetCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onAdvertisingSetStarted(AdvertisingSet advertisingSet, int txPower, int status) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onAdvertisingSetStopped(AdvertisingSet advertisingSet) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onAdvertisingEnabled(AdvertisingSet advertisingSet, boolean enable, int status) { throw new RuntimeException("Stub!"); }
/* 24 */   public void onAdvertisingDataSet(AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
/* 25 */   public void onScanResponseDataSet(AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
/* 26 */   public void onAdvertisingParametersUpdated(AdvertisingSet advertisingSet, int txPower, int status) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onPeriodicAdvertisingParametersUpdated(AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
/* 28 */   public void onPeriodicAdvertisingDataSet(AdvertisingSet advertisingSet, int status) { throw new RuntimeException("Stub!"); }
/* 29 */   public void onPeriodicAdvertisingEnabled(AdvertisingSet advertisingSet, boolean enable, int status) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\AdvertisingSetCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */