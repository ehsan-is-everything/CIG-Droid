/*    */ package android.media.midi;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
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
/*    */ public abstract class MidiDeviceService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.media.midi.MidiDeviceService";
/*    */   
/* 21 */   public MidiDeviceService() { throw new RuntimeException("Stub!"); }
/* 22 */   public void onCreate() { throw new RuntimeException("Stub!"); }
/*    */   public abstract MidiReceiver[] onGetInputPortReceivers();
/* 24 */   public final MidiReceiver[] getOutputPortReceivers() { throw new RuntimeException("Stub!"); }
/* 25 */   public final MidiDeviceInfo getDeviceInfo() { throw new RuntimeException("Stub!"); }
/* 26 */   public void onDeviceStatusChanged(MidiDeviceStatus status) { throw new RuntimeException("Stub!"); }
/* 27 */   public void onClose() { throw new RuntimeException("Stub!"); }
/* 28 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\midi\MidiDeviceService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */