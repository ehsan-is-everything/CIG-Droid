/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.KeyEvent;
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.View.OnClickListener;
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
/*    */ 
/*    */ public class MediaController
/*    */   extends FrameLayout
/*    */ {
/*    */   public MediaController(Context context, AttributeSet attrs)
/*    */   {
/* 35 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 36 */   public MediaController(Context context, boolean useFastForward) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 37 */   public MediaController(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public void onFinishInflate() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setMediaPlayer(MediaPlayerControl player) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setAnchorView(View view) { throw new RuntimeException("Stub!"); }
/* 41 */   public void show() { throw new RuntimeException("Stub!"); }
/* 42 */   public void show(int timeout) { throw new RuntimeException("Stub!"); }
/* 43 */   public boolean isShowing() { throw new RuntimeException("Stub!"); }
/* 44 */   public void hide() { throw new RuntimeException("Stub!"); }
/* 45 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 46 */   public boolean onTrackballEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 47 */   public boolean dispatchKeyEvent(KeyEvent event) { throw new RuntimeException("Stub!"); }
/* 48 */   public void setEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 49 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/* 50 */   public void setPrevNextListeners(View.OnClickListener next, View.OnClickListener prev) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface MediaPlayerControl
/*    */   {
/*    */     public abstract void start();
/*    */     
/*    */     public abstract void pause();
/*    */     
/*    */     public abstract int getDuration();
/*    */     
/*    */     public abstract int getCurrentPosition();
/*    */     
/*    */     public abstract void seekTo(int paramInt);
/*    */     
/*    */     public abstract boolean isPlaying();
/*    */     
/*    */     public abstract int getBufferPercentage();
/*    */     
/*    */     public abstract boolean canPause();
/*    */     
/*    */     public abstract boolean canSeekBackward();
/*    */     
/*    */     public abstract boolean canSeekForward();
/*    */     
/*    */     public abstract int getAudioSessionId();
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\MediaController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */