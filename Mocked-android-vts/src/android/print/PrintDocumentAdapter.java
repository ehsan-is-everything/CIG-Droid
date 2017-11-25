/*    */ package android.print;
/*    */ 
/*    */ import android.os.Bundle;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.ParcelFileDescriptor;
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
/*    */ public abstract class PrintDocumentAdapter
/*    */ {
/*    */   public static final String EXTRA_PRINT_PREVIEW = "EXTRA_PRINT_PREVIEW";
/*    */   
/*    */   public static abstract class WriteResultCallback
/*    */   {
/* 22 */     WriteResultCallback() { throw new RuntimeException("Stub!"); }
/* 23 */     public void onWriteFinished(PageRange[] pages) { throw new RuntimeException("Stub!"); }
/* 24 */     public void onWriteFailed(CharSequence error) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onWriteCancelled() { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class LayoutResultCallback {
/* 29 */     LayoutResultCallback() { throw new RuntimeException("Stub!"); }
/* 30 */     public void onLayoutFinished(PrintDocumentInfo info, boolean changed) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onLayoutFailed(CharSequence error) { throw new RuntimeException("Stub!"); }
/* 32 */     public void onLayoutCancelled() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   public PrintDocumentAdapter() { throw new RuntimeException("Stub!"); }
/* 35 */   public void onStart() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onLayout(PrintAttributes paramPrintAttributes1, PrintAttributes paramPrintAttributes2, CancellationSignal paramCancellationSignal, LayoutResultCallback paramLayoutResultCallback, Bundle paramBundle);
/*    */   public abstract void onWrite(PageRange[] paramArrayOfPageRange, ParcelFileDescriptor paramParcelFileDescriptor, CancellationSignal paramCancellationSignal, WriteResultCallback paramWriteResultCallback);
/* 38 */   public void onFinish() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\print\PrintDocumentAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */