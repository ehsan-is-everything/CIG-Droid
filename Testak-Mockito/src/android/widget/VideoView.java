/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.media.AudioAttributes;
/*    */ import android.media.MediaFormat;
/*    */ import android.media.MediaPlayer.OnCompletionListener;
/*    */ import android.media.MediaPlayer.OnErrorListener;
/*    */ import android.media.MediaPlayer.OnInfoListener;
/*    */ import android.net.Uri;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.SurfaceView;
/*    */ import java.io.InputStream;
/*    */ import java.util.Map;
/*    */ 
/*    */ public class VideoView extends SurfaceView implements MediaController.MediaPlayerControl
/*    */ {
/*    */   public VideoView(Context context)
/*    */   {
/* 22 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 23 */   public VideoView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public VideoView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 25 */   public VideoView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 27 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 28 */   public int resolveAdjustedSize(int desiredSize, int measureSpec) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setVideoPath(String path) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setVideoURI(Uri uri) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setVideoURI(Uri uri, Map<String, String> headers) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setAudioFocusRequest(int focusGain) { throw new RuntimeException("Stub!"); }
/* 33 */   public void setAudioAttributes(AudioAttributes attributes) { throw new RuntimeException("Stub!"); }
/* 34 */   public void addSubtitleSource(InputStream is, MediaFormat format) { throw new RuntimeException("Stub!"); }
/* 35 */   public void stopPlayback() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setMediaController(MediaController controller) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener l) { throw new RuntimeException("Stub!"); }
/* 38 */   public void setOnCompletionListener(MediaPlayer.OnCompletionListener l) { throw new RuntimeException("Stub!"); }
/* 39 */   public void setOnErrorListener(MediaPlayer.OnErrorListener l) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setOnInfoListener(MediaPlayer.OnInfoListener l) { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 42 */   public boolean onTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean onKeyDown(int keyCode, KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 44 */   public void start() { throw new RuntimeException("Stub!"); }
/* 45 */   public void pause() { throw new RuntimeException("Stub!"); }
/* 46 */   public void suspend() { throw new RuntimeException("Stub!"); }
/* 47 */   public void resume() { throw new RuntimeException("Stub!"); }
/* 48 */   public int getDuration() { throw new RuntimeException("Stub!"); }
/* 49 */   public int getCurrentPosition() { throw new RuntimeException("Stub!"); }
/* 50 */   public void seekTo(int msec) { throw new RuntimeException("Stub!"); }
/* 51 */   public boolean isPlaying() { throw new RuntimeException("Stub!"); }
/* 52 */   public int getBufferPercentage() { throw new RuntimeException("Stub!"); }
/* 53 */   public boolean canPause() { throw new RuntimeException("Stub!"); }
/* 54 */   public boolean canSeekBackward() { throw new RuntimeException("Stub!"); }
/* 55 */   public boolean canSeekForward() { throw new RuntimeException("Stub!"); }
/* 56 */   public int getAudioSessionId() { throw new RuntimeException("Stub!"); }
/* 57 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 58 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 59 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 60 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\VideoView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */