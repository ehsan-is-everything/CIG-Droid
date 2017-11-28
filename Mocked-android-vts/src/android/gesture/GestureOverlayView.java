/*    */ package android.gesture;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Path;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.MotionEvent;
/*    */ import android.widget.FrameLayout;
/*    */ import java.util.ArrayList;
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
/*    */ public class GestureOverlayView
/*    */   extends FrameLayout
/*    */ {
/*    */   public static final int GESTURE_STROKE_TYPE_MULTIPLE = 1;
/*    */   public static final int GESTURE_STROKE_TYPE_SINGLE = 0;
/*    */   public static final int ORIENTATION_HORIZONTAL = 0;
/*    */   public static final int ORIENTATION_VERTICAL = 1;
/*    */   
/*    */   public GestureOverlayView(Context context)
/*    */   {
/* 37 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 38 */   public GestureOverlayView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 39 */   public GestureOverlayView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 40 */   public GestureOverlayView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 41 */   public ArrayList<GesturePoint> getCurrentStroke() { throw new RuntimeException("Stub!"); }
/* 42 */   public int getOrientation() { throw new RuntimeException("Stub!"); }
/* 43 */   public void setOrientation(int orientation) { throw new RuntimeException("Stub!"); }
/* 44 */   public void setGestureColor(int color) { throw new RuntimeException("Stub!"); }
/* 45 */   public void setUncertainGestureColor(int color) { throw new RuntimeException("Stub!"); }
/* 46 */   public int getUncertainGestureColor() { throw new RuntimeException("Stub!"); }
/* 47 */   public int getGestureColor() { throw new RuntimeException("Stub!"); }
/* 48 */   public float getGestureStrokeWidth() { throw new RuntimeException("Stub!"); }
/* 49 */   public void setGestureStrokeWidth(float gestureStrokeWidth) { throw new RuntimeException("Stub!"); }
/* 50 */   public int getGestureStrokeType() { throw new RuntimeException("Stub!"); }
/* 51 */   public void setGestureStrokeType(int gestureStrokeType) { throw new RuntimeException("Stub!"); }
/* 52 */   public float getGestureStrokeLengthThreshold() { throw new RuntimeException("Stub!"); }
/* 53 */   public void setGestureStrokeLengthThreshold(float gestureStrokeLengthThreshold) { throw new RuntimeException("Stub!"); }
/* 54 */   public float getGestureStrokeSquarenessTreshold() { throw new RuntimeException("Stub!"); }
/* 55 */   public void setGestureStrokeSquarenessTreshold(float gestureStrokeSquarenessTreshold) { throw new RuntimeException("Stub!"); }
/* 56 */   public float getGestureStrokeAngleThreshold() { throw new RuntimeException("Stub!"); }
/* 57 */   public void setGestureStrokeAngleThreshold(float gestureStrokeAngleThreshold) { throw new RuntimeException("Stub!"); }
/* 58 */   public boolean isEventsInterceptionEnabled() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setEventsInterceptionEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 60 */   public boolean isFadeEnabled() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setFadeEnabled(boolean fadeEnabled) { throw new RuntimeException("Stub!"); }
/* 62 */   public Gesture getGesture() { throw new RuntimeException("Stub!"); }
/* 63 */   public void setGesture(Gesture gesture) { throw new RuntimeException("Stub!"); }
/* 64 */   public Path getGesturePath() { throw new RuntimeException("Stub!"); }
/* 65 */   public Path getGesturePath(Path path) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean isGestureVisible() { throw new RuntimeException("Stub!"); }
/* 67 */   public void setGestureVisible(boolean visible) { throw new RuntimeException("Stub!"); }
/* 68 */   public long getFadeOffset() { throw new RuntimeException("Stub!"); }
/* 69 */   public void setFadeOffset(long fadeOffset) { throw new RuntimeException("Stub!"); }
/* 70 */   public void addOnGestureListener(OnGestureListener listener) { throw new RuntimeException("Stub!"); }
/* 71 */   public void removeOnGestureListener(OnGestureListener listener) { throw new RuntimeException("Stub!"); }
/* 72 */   public void removeAllOnGestureListeners() { throw new RuntimeException("Stub!"); }
/* 73 */   public void addOnGesturePerformedListener(OnGesturePerformedListener listener) { throw new RuntimeException("Stub!"); }
/* 74 */   public void removeOnGesturePerformedListener(OnGesturePerformedListener listener) { throw new RuntimeException("Stub!"); }
/* 75 */   public void removeAllOnGesturePerformedListeners() { throw new RuntimeException("Stub!"); }
/* 76 */   public void addOnGesturingListener(OnGesturingListener listener) { throw new RuntimeException("Stub!"); }
/* 77 */   public void removeOnGesturingListener(OnGesturingListener listener) { throw new RuntimeException("Stub!"); }
/* 78 */   public void removeAllOnGesturingListeners() { throw new RuntimeException("Stub!"); }
/* 79 */   public boolean isGesturing() { throw new RuntimeException("Stub!"); }
/* 80 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 81 */   public void clear(boolean animated) { throw new RuntimeException("Stub!"); }
/* 82 */   public void cancelClearAnimation() { throw new RuntimeException("Stub!"); }
/* 83 */   public void cancelGesture() { throw new RuntimeException("Stub!"); }
/* 84 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 85 */   public boolean dispatchTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnGesturePerformedListener
/*    */   {
/*    */     public abstract void onGesturePerformed(GestureOverlayView paramGestureOverlayView, Gesture paramGesture);
/*    */   }
/*    */   
/*    */   public static abstract interface OnGestureListener
/*    */   {
/*    */     public abstract void onGestureStarted(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract void onGesture(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract void onGestureEnded(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract void onGestureCancelled(GestureOverlayView paramGestureOverlayView, MotionEvent paramMotionEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnGesturingListener
/*    */   {
/*    */     public abstract void onGesturingStarted(GestureOverlayView paramGestureOverlayView);
/*    */     
/*    */     public abstract void onGesturingEnded(GestureOverlayView paramGestureOverlayView);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\gesture\GestureOverlayView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */