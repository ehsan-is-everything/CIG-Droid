/*    */ package android.printservice;
/*    */ 
/*    */ import android.os.CancellationSignal;
/*    */ import android.print.PrinterId;
/*    */ import android.print.PrinterInfo;
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
/*    */ 
/*    */ 
/*    */ public abstract class PrinterDiscoverySession
/*    */ {
/* 20 */   public PrinterDiscoverySession() { throw new RuntimeException("Stub!"); }
/* 21 */   public final List<PrinterInfo> getPrinters() { throw new RuntimeException("Stub!"); }
/* 22 */   public final void addPrinters(List<PrinterInfo> printers) { throw new RuntimeException("Stub!"); }
/* 23 */   public final void removePrinters(List<PrinterId> printerIds) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onStartPrinterDiscovery(List<PrinterId> paramList);
/*    */   public abstract void onStopPrinterDiscovery();
/*    */   public abstract void onValidatePrinters(List<PrinterId> paramList);
/*    */   public abstract void onStartPrinterStateTracking(PrinterId paramPrinterId);
/* 28 */   public void onRequestCustomPrinterIcon(PrinterId printerId, CancellationSignal cancellationSignal, CustomPrinterIconCallback callback) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onStopPrinterStateTracking(PrinterId paramPrinterId);
/* 30 */   public final List<PrinterId> getTrackedPrinters() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onDestroy();
/* 32 */   public final boolean isDestroyed() { throw new RuntimeException("Stub!"); }
/* 33 */   public final boolean isPrinterDiscoveryStarted() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\printservice\PrinterDiscoverySession.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */