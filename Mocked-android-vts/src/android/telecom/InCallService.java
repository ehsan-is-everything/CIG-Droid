/*    */ package android.telecom;
/*    */ 
/*    */ import android.app.Service;
/*    */ import android.content.Intent;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.Handler;
/*    */ import android.os.IBinder;
/*    */ import android.view.Surface;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class InCallService
/*    */   extends Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.telecom.InCallService";
/*    */   
/*    */   public static abstract class VideoCall
/*    */   {
/*    */     public static abstract class Callback
/*    */     {
/* 25 */       public Callback() { throw new RuntimeException("Stub!"); }
/*    */       
/*    */       public abstract void onSessionModifyRequestReceived(VideoProfile paramVideoProfile);
/*    */       public abstract void onSessionModifyResponseReceived(int paramInt, VideoProfile paramVideoProfile1, VideoProfile paramVideoProfile2);
/*    */       public abstract void onCallSessionEvent(int paramInt);
/*    */       public abstract void onPeerDimensionsChanged(int paramInt1, int paramInt2);
/*    */       public abstract void onVideoQualityChanged(int paramInt);
/*    */       public abstract void onCallDataUsageChanged(long paramLong);
/*    */       public abstract void onCameraCapabilitiesChanged(VideoProfile.CameraCapabilities paramCameraCapabilities); }
/* 34 */     public VideoCall() { throw new RuntimeException("Stub!"); }
/*    */     
/*    */     public abstract void registerCallback(Callback paramCallback);
/*    */     public abstract void registerCallback(Callback paramCallback, Handler paramHandler);
/*    */     public abstract void unregisterCallback(Callback paramCallback);
/*    */     public abstract void setCamera(String paramString);
/*    */     public abstract void setPreviewSurface(Surface paramSurface);
/*    */     public abstract void setDisplaySurface(Surface paramSurface);
/*    */     public abstract void setDeviceOrientation(int paramInt);
/*    */     public abstract void setZoom(float paramFloat);
/*    */     public abstract void sendSessionModifyRequest(VideoProfile paramVideoProfile);
/*    */     public abstract void sendSessionModifyResponse(VideoProfile paramVideoProfile);
/*    */     public abstract void requestCameraCapabilities();
/*    */     public abstract void requestCallDataUsage();
/*    */     public abstract void setPauseImage(Uri paramUri); }
/* 49 */   public InCallService() { throw new RuntimeException("Stub!"); }
/* 50 */   public IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean onUnbind(Intent intent) { throw new RuntimeException("Stub!"); }
/* 52 */   public final List<Call> getCalls() { throw new RuntimeException("Stub!"); }
/* 53 */   public final boolean canAddCall() { throw new RuntimeException("Stub!"); }
/* 54 */   public final CallAudioState getCallAudioState() { throw new RuntimeException("Stub!"); }
/* 55 */   public final void setMuted(boolean state) { throw new RuntimeException("Stub!"); }
/* 56 */   public final void setAudioRoute(int route) { throw new RuntimeException("Stub!"); }
/* 57 */   public void onCallAudioStateChanged(CallAudioState audioState) { throw new RuntimeException("Stub!"); }
/* 58 */   public void onBringToForeground(boolean showDialpad) { throw new RuntimeException("Stub!"); }
/* 59 */   public void onCallAdded(Call call) { throw new RuntimeException("Stub!"); }
/* 60 */   public void onCallRemoved(Call call) { throw new RuntimeException("Stub!"); }
/* 61 */   public void onCanAddCallChanged(boolean canAddCall) { throw new RuntimeException("Stub!"); }
/* 62 */   public void onSilenceRinger() { throw new RuntimeException("Stub!"); }
/* 63 */   public void onConnectionEvent(Call call, String event, Bundle extras) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\telecom\InCallService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */