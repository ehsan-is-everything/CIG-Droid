/*    */ package android.media.tv;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Region;
/*    */ import android.media.PlaybackParams;
/*    */ import android.net.Uri;
/*    */ import android.os.Bundle;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.InputEvent;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.ViewGroup;
/*    */ import java.util.List;
/*    */ 
/*    */ 
/*    */ public class TvView
/*    */   extends ViewGroup
/*    */ {
/*    */   public static abstract class TimeShiftPositionCallback
/*    */   {
/* 23 */     public TimeShiftPositionCallback() { throw new RuntimeException("Stub!"); }
/* 24 */     public void onTimeShiftStartPositionChanged(String inputId, long timeMs) { throw new RuntimeException("Stub!"); }
/* 25 */     public void onTimeShiftCurrentPositionChanged(String inputId, long timeMs) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */   public static abstract class TvInputCallback {
/* 29 */     public TvInputCallback() { throw new RuntimeException("Stub!"); }
/* 30 */     public void onConnectionFailed(String inputId) { throw new RuntimeException("Stub!"); }
/* 31 */     public void onDisconnected(String inputId) { throw new RuntimeException("Stub!"); }
/* 32 */     public void onChannelRetuned(String inputId, Uri channelUri) { throw new RuntimeException("Stub!"); }
/* 33 */     public void onTracksChanged(String inputId, List<TvTrackInfo> tracks) { throw new RuntimeException("Stub!"); }
/* 34 */     public void onTrackSelected(String inputId, int type, String trackId) { throw new RuntimeException("Stub!"); }
/* 35 */     public void onVideoSizeChanged(String inputId, int width, int height) { throw new RuntimeException("Stub!"); }
/* 36 */     public void onVideoAvailable(String inputId) { throw new RuntimeException("Stub!"); }
/* 37 */     public void onVideoUnavailable(String inputId, int reason) { throw new RuntimeException("Stub!"); }
/* 38 */     public void onContentAllowed(String inputId) { throw new RuntimeException("Stub!"); }
/* 39 */     public void onContentBlocked(String inputId, TvContentRating rating) { throw new RuntimeException("Stub!"); }
/* 40 */     public void onTimeShiftStatusChanged(String inputId, int status) { throw new RuntimeException("Stub!"); }
/*    */   }
/*    */   
/*    */ 
/*    */   public TvView(Context context)
/*    */   {
/* 46 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 47 */   public TvView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 48 */   public TvView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 49 */   public void setCallback(TvInputCallback callback) { throw new RuntimeException("Stub!"); }
/* 50 */   public void setZOrderMediaOverlay(boolean isMediaOverlay) { throw new RuntimeException("Stub!"); }
/* 51 */   public void setZOrderOnTop(boolean onTop) { throw new RuntimeException("Stub!"); }
/* 52 */   public void setStreamVolume(float volume) { throw new RuntimeException("Stub!"); }
/* 53 */   public void tune(String inputId, Uri channelUri) { throw new RuntimeException("Stub!"); }
/* 54 */   public void tune(String inputId, Uri channelUri, Bundle params) { throw new RuntimeException("Stub!"); }
/* 55 */   public void reset() { throw new RuntimeException("Stub!"); }
/* 56 */   public void setCaptionEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 57 */   public void selectTrack(int type, String trackId) { throw new RuntimeException("Stub!"); }
/* 58 */   public List<TvTrackInfo> getTracks(int type) { throw new RuntimeException("Stub!"); }
/* 59 */   public String getSelectedTrack(int type) { throw new RuntimeException("Stub!"); }
/* 60 */   public void timeShiftPlay(String inputId, Uri recordedProgramUri) { throw new RuntimeException("Stub!"); }
/* 61 */   public void timeShiftPause() { throw new RuntimeException("Stub!"); }
/* 62 */   public void timeShiftResume() { throw new RuntimeException("Stub!"); }
/* 63 */   public void timeShiftSeekTo(long timeMs) { throw new RuntimeException("Stub!"); }
/* 64 */   public void timeShiftSetPlaybackParams(PlaybackParams params) { throw new RuntimeException("Stub!"); }
/* 65 */   public void setTimeShiftPositionCallback(TimeShiftPositionCallback callback) { throw new RuntimeException("Stub!"); }
/* 66 */   public void sendAppPrivateCommand(String action, Bundle data) { throw new RuntimeException("Stub!"); }
/* 67 */   public boolean dispatchUnhandledInputEvent(InputEvent event) { throw new RuntimeException("Stub!"); }
/* 68 */   public boolean onUnhandledInputEvent(InputEvent event) { throw new RuntimeException("Stub!"); }
/* 69 */   public void setOnUnhandledInputEventListener(OnUnhandledInputEventListener listener) { throw new RuntimeException("Stub!"); }
/* 70 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 71 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 72 */   public boolean dispatchTrackballEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 73 */   public boolean dispatchGenericMotionEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 74 */   public void dispatchWindowFocusChanged(boolean hasFocus) { throw new RuntimeException("Stub!"); }
/* 75 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 76 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 77 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 78 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean gatherTransparentRegion(Region region) { throw new RuntimeException("Stub!"); }
/* 80 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 81 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 82 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnUnhandledInputEventListener
/*    */   {
/*    */     public abstract boolean onUnhandledInputEvent(InputEvent paramInputEvent);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\media\tv\TvView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */