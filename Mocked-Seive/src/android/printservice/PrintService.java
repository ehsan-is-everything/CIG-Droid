/*    */ package android.printservice;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.print.PrinterId;
/*    */ 
/*    */ 
/*    */ public abstract class PrintService
/*    */   extends Service
/*    */ {
/*    */   public static final String EXTRA_CAN_SELECT_PRINTER = "android.printservice.extra.CAN_SELECT_PRINTER";
/*    */   public static final String EXTRA_PRINTER_INFO = "android.intent.extra.print.EXTRA_PRINTER_INFO";
/*    */   public static final String EXTRA_PRINT_DOCUMENT_INFO = "android.printservice.extra.PRINT_DOCUMENT_INFO";
/*    */   public static final String EXTRA_PRINT_JOB_INFO = "android.intent.extra.print.PRINT_JOB_INFO";
/*    */   public static final String EXTRA_SELECT_PRINTER = "android.printservice.extra.SELECT_PRINTER";
/*    */   public static final String SERVICE_INTERFACE = "android.printservice.PrintService";
/*    */   public static final String SERVICE_META_DATA = "android.printservice";
/*    */   
/* 21 */   public PrintService() { throw new RuntimeException("Stub!"); }
/* 22 */   protected final void attachBaseContext(Context base) { throw new RuntimeException("Stub!"); }
/* 23 */   protected void onConnected() { throw new RuntimeException("Stub!"); }
/* 24 */   protected void onDisconnected() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract PrinterDiscoverySession onCreatePrinterDiscoverySession();
/*    */   protected abstract void onRequestCancelPrintJob(PrintJob paramPrintJob);
/*    */   protected abstract void onPrintJobQueued(PrintJob paramPrintJob);
/* 28 */   public final java.util.List<PrintJob> getActivePrintJobs() { throw new RuntimeException("Stub!"); }
/* 29 */   public final PrinterId generatePrinterId(String localId) { throw new RuntimeException("Stub!"); }
/* 30 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\printservice\PrintService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */