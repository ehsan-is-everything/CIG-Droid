/*    */ package android.bluetooth.le;
/*    */ 
/*    */ import android.app.PendingIntent;
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
/*    */ public final class BluetoothLeScanner
/*    */ {
/*    */   public static final String EXTRA_CALLBACK_TYPE = "android.bluetooth.le.extra.CALLBACK_TYPE";
/*    */   public static final String EXTRA_ERROR_CODE = "android.bluetooth.le.extra.ERROR_CODE";
/*    */   public static final String EXTRA_LIST_SCAN_RESULT = "android.bluetooth.le.extra.LIST_SCAN_RESULT";
/*    */   
/* 20 */   BluetoothLeScanner() { throw new RuntimeException("Stub!"); }
/* 21 */   public void startScan(ScanCallback callback) { throw new RuntimeException("Stub!"); }
/* 22 */   public void startScan(List<ScanFilter> filters, ScanSettings settings, ScanCallback callback) { throw new RuntimeException("Stub!"); }
/* 23 */   public int startScan(List<ScanFilter> filters, ScanSettings settings, PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
/* 24 */   public void stopScan(ScanCallback callback) { throw new RuntimeException("Stub!"); }
/* 25 */   public void stopScan(PendingIntent callbackIntent) { throw new RuntimeException("Stub!"); }
/* 26 */   public void flushPendingScanResults(ScanCallback callback) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\bluetooth\le\BluetoothLeScanner.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */