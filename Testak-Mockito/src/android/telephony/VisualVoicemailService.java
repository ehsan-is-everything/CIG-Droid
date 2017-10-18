/*    */ package android.telephony;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.IBinder;
/*    */ import android.telecom.PhoneAccountHandle;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class VisualVoicemailService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.telephony.VisualVoicemailService";
/*    */   
/*    */   public static class VisualVoicemailTask
/*    */   {
/* 23 */     VisualVoicemailTask() { throw new RuntimeException("Stub!"); }
/* 24 */     public final void finish() { throw new RuntimeException("Stub!"); }
/* 25 */     public boolean equals(Object obj) { throw new RuntimeException("Stub!"); }
/* 26 */     public int hashCode() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 28 */   public VisualVoicemailService() { throw new RuntimeException("Stub!"); }
/* 29 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public abstract void onCellServiceConnected(VisualVoicemailTask paramVisualVoicemailTask, PhoneAccountHandle paramPhoneAccountHandle);
/*    */   
/*    */   public abstract void onSmsReceived(VisualVoicemailTask paramVisualVoicemailTask, VisualVoicemailSms paramVisualVoicemailSms);
/*    */   
/*    */   public abstract void onSimRemoved(VisualVoicemailTask paramVisualVoicemailTask, PhoneAccountHandle paramPhoneAccountHandle);
/*    */   
/*    */   public abstract void onStopped(VisualVoicemailTask paramVisualVoicemailTask);
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telephony\VisualVoicemailService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */