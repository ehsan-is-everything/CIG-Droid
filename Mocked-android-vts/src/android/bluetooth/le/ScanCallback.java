/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class ScanCallback
/*    */ {
/*    */   public static final int SCAN_FAILED_ALREADY_STARTED = 1;
/*    */   public static final int SCAN_FAILED_APPLICATION_REGISTRATION_FAILED = 2;
/*    */   public static final int SCAN_FAILED_FEATURE_UNSUPPORTED = 4;
/*    */   public static final int SCAN_FAILED_INTERNAL_ERROR = 3;
/*    */   
/* 20 */   public ScanCallback() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onScanResult(int callbackType, ScanResult result) { throw new RuntimeException("Stub!"); }
/* 22 */   public void onBatchScanResults(List<ScanResult> results) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onScanFailed(int errorCode) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\le\ScanCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */