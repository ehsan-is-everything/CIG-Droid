/*    */ package android.telecom;
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
/*    */ public abstract class CallScreeningService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.telecom.CallScreeningService";
/*    */   
/*    */   public static class CallResponse
/*    */   {
/*    */     public static class Builder
/*    */     {
/* 25 */       public Builder() { throw new RuntimeException("Stub!"); }
/* 26 */       public Builder setDisallowCall(boolean shouldDisallowCall) { throw new RuntimeException("Stub!"); }
/* 27 */       public Builder setRejectCall(boolean shouldRejectCall) { throw new RuntimeException("Stub!"); }
/* 28 */       public Builder setSkipCallLog(boolean shouldSkipCallLog) { throw new RuntimeException("Stub!"); }
/* 29 */       public Builder setSkipNotification(boolean shouldSkipNotification) { throw new RuntimeException("Stub!"); }
/* 30 */       public CallScreeningService.CallResponse build() { throw new RuntimeException("Stub!"); } }
/*    */     
/* 32 */     CallResponse() { throw new RuntimeException("Stub!"); }
/* 33 */     public boolean getDisallowCall() { throw new RuntimeException("Stub!"); }
/* 34 */     public boolean getRejectCall() { throw new RuntimeException("Stub!"); }
/* 35 */     public boolean getSkipCallLog() { throw new RuntimeException("Stub!"); }
/* 36 */     public boolean getSkipNotification() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 38 */   public CallScreeningService() { throw new RuntimeException("Stub!"); }
/* 39 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean onUnbind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   public abstract void onScreenCall(Call.Details paramDetails);
/* 42 */   public final void respondToCall(Call.Details callDetails, CallResponse response) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\telecom\CallScreeningService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */