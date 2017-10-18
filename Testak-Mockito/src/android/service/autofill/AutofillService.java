/*    */ package android.service.autofill;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.CancellationSignal;
/*    */ import android.os.IBinder;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class AutofillService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.service.autofill.AutofillService";
/*    */   public static final String SERVICE_META_DATA = "android.autofill";
/*    */   
/* 20 */   public AutofillService() { throw new RuntimeException("Stub!"); }
/* 21 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/* 22 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 23 */   public void onConnected() { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onFillRequest(FillRequest paramFillRequest, CancellationSignal paramCancellationSignal, FillCallback paramFillCallback);
/*    */   public abstract void onSaveRequest(SaveRequest paramSaveRequest, SaveCallback paramSaveCallback);
/* 26 */   public void onDisconnected() { throw new RuntimeException("Stub!"); }
/* 27 */   public final FillEventHistory getFillEventHistory() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\service\autofill\AutofillService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */