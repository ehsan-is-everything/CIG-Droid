/*    */ package android.media.tv;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.Intent;
/*    */ import android.media.PlaybackParams;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.os.IBinder;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.Surface;
/*    */ import android.view.View;
/*    */ import java.util.List;
/*    */ 
/*    */ public abstract class TvInputService
/*    */   extends android.app.Service
/*    */ {
/*    */   public static final String SERVICE_INTERFACE = "android.media.tv.TvInputService";
/*    */   public static final String SERVICE_META_DATA = "android.media.tv.input";
/*    */   
/*    */   public static abstract class Session
/*    */     implements android.view.KeyEvent.Callback
/*    */   {
/* 24 */     public Session(Context context) { throw new RuntimeException("Stub!"); }
/* 25 */     public void setOverlayViewEnabled(boolean enable) { throw new RuntimeException("Stub!"); }
/* 26 */     public void notifyChannelRetuned(Uri channelUri) { throw new RuntimeException("Stub!"); }
/* 27 */     public void notifyTracksChanged(List<TvTrackInfo> tracks) { throw new RuntimeException("Stub!"); }
/* 28 */     public void notifyTrackSelected(int type, String trackId) { throw new RuntimeException("Stub!"); }
/* 29 */     public void notifyVideoAvailable() { throw new RuntimeException("Stub!"); }
/* 30 */     public void notifyVideoUnavailable(int reason) { throw new RuntimeException("Stub!"); }
/* 31 */     public void notifyContentAllowed() { throw new RuntimeException("Stub!"); }
/* 32 */     public void notifyContentBlocked(TvContentRating rating) { throw new RuntimeException("Stub!"); }
/* 33 */     public void notifyTimeShiftStatusChanged(int status) { throw new RuntimeException("Stub!"); }
/* 34 */     public void layoutSurface(int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onRelease();
/*    */     public abstract boolean onSetSurface(Surface paramSurface);
/* 37 */     public void onSurfaceChanged(int format, int width, int height) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onOverlayViewSizeChanged(int width, int height) { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onSetStreamVolume(float paramFloat);
/*    */     public abstract boolean onTune(Uri paramUri);
/* 41 */     public boolean onTune(Uri channelUri, Bundle params) { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onSetCaptionEnabled(boolean paramBoolean);
/* 43 */     public void onUnblockContent(TvContentRating unblockedRating) { throw new RuntimeException("Stub!"); }
/* 44 */     public boolean onSelectTrack(int type, String trackId) { throw new RuntimeException("Stub!"); }
/* 45 */     public void onAppPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/* 46 */     public View onCreateOverlayView() { throw new RuntimeException("Stub!"); }
/* 47 */     public void onTimeShiftPlay(Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
/* 48 */     public void onTimeShiftPause() { throw new RuntimeException("Stub!"); }
/* 49 */     public void onTimeShiftResume() { throw new RuntimeException("Stub!"); }
/* 50 */     public void onTimeShiftSeekTo(long timeMs) { throw new RuntimeException("Stub!"); }
/* 51 */     public void onTimeShiftSetPlaybackParams(PlaybackParams params) { throw new RuntimeException("Stub!"); }
/* 52 */     public long onTimeShiftGetStartPosition() { throw new RuntimeException("Stub!"); }
/* 53 */     public long onTimeShiftGetCurrentPosition() { throw new RuntimeException("Stub!"); }
/* 54 */     public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 55 */     public boolean onKeyLongPress(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 56 */     public boolean onKeyMultiple(int keyCode, int count, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 57 */     public boolean onKeyUp(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 58 */     public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 59 */     public boolean onTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 60 */     public boolean onGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class RecordingSession {
/* 64 */     public RecordingSession(Context context) { throw new RuntimeException("Stub!"); }
/* 65 */     public void notifyTuned(Uri channelUri) { throw new RuntimeException("Stub!"); }
/* 66 */     public void notifyRecordingStopped(Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
/* 67 */     public void notifyError(int error) { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onTune(Uri paramUri);
/* 69 */     public void onTune(Uri channelUri, Bundle params) { throw new RuntimeException("Stub!"); }
/*    */     public abstract void onStartRecording(Uri paramUri);
/*    */     public abstract void onStopRecording();
/*    */     public abstract void onRelease();
/* 73 */     public void onAppPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class HardwareSession extends TvInputService.Session {
/*    */     public HardwareSession(Context context) {
/* 78 */       super();throw new RuntimeException("Stub!"); }
/*    */     public abstract String getHardwareInputId();
/* 80 */     public final boolean onSetSurface(Surface surface) { throw new RuntimeException("Stub!"); }
/* 81 */     public void onHardwareVideoAvailable() { throw new RuntimeException("Stub!"); }
/* 82 */     public void onHardwareVideoUnavailable(int reason) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 84 */   public TvInputService() { throw new RuntimeException("Stub!"); }
/* 85 */   public final IBinder onBind(Intent intent) { throw new RuntimeException("Stub!"); }
/*    */   public abstract Session onCreateSession(String paramString);
/* 87 */   public RecordingSession onCreateRecordingSession(String inputId) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\tv\TvInputService.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */