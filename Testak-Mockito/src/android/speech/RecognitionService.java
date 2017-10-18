/*    */ package android.speech;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.os.RemoteException;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class RecognitionService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.speech.RecognitionService";
/*    */   public static final String SERVICE_META_DATA = "android.speech";
/*    */   
/*    */   public class Callback
/*    */   {
/* 23 */     Callback() { throw new RuntimeException("Stub!"); }
/* 24 */     public void beginningOfSpeech() throws RemoteException { throw new RuntimeException("Stub!"); }
/* 25 */     public void bufferReceived(byte[] buffer) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 26 */     public void endOfSpeech() throws RemoteException { throw new RuntimeException("Stub!"); }
/* 27 */     public void error(int error) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 28 */     public void partialResults(Bundle partialResults) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 29 */     public void readyForSpeech(Bundle params) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 30 */     public void results(Bundle results) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 31 */     public void rmsChanged(float rmsdB) throws RemoteException { throw new RuntimeException("Stub!"); }
/* 32 */     public int getCallingUid() { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   public RecognitionService() { throw new RuntimeException("Stub!"); }
/*    */   protected abstract void onStartListening(Intent paramIntent, Callback paramCallback);
/*    */   protected abstract void onCancel(Callback paramCallback);
/*    */   protected abstract void onStopListening(Callback paramCallback);
/* 38 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 39 */   public void onDestroy() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\speech\RecognitionService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */