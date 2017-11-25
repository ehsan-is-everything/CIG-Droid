/*    */ package android.service.carrier;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.os.PersistableBundle;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class CarrierService
/*    */   extends Service
/*    */ {
/*    */   public static final String CARRIER_SERVICE_INTERFACE = "android.service.carrier.CarrierService";
/*    */   
/* 19 */   public CarrierService() { throw new RuntimeException("Stub!"); }
/*    */   public abstract PersistableBundle onLoadConfig(CarrierIdentifier paramCarrierIdentifier);
/* 21 */   public final void notifyCarrierNetworkChange(boolean active) { throw new RuntimeException("Stub!"); }
/* 22 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\service\carrier\CarrierService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */