/*    */ package android.bluetooth.le;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AdvertiseCallback
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
/*    */ 
/* 20 */   public AdvertiseCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onStartSuccess(AdvertiseSettings settingsInEffect) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onStartFailure(int errorCode) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\bluetooth\le\AdvertiseCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */