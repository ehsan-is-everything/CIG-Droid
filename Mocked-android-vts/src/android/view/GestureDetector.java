/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.os.Handler;
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
/*    */ public class GestureDetector
/*    */ {
/*    */   public static class SimpleOnGestureListener
/*    */     implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, GestureDetector.OnContextClickListener
/*    */   {
/* 42 */     public SimpleOnGestureListener() { throw new RuntimeException("Stub!"); }
/* 43 */     public boolean onSingleTapUp(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 44 */     public void onLongPress(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 45 */     public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) { throw new RuntimeException("Stub!"); }
/* 46 */     public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) { throw new RuntimeException("Stub!"); }
/* 47 */     public void onShowPress(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 48 */     public boolean onDown(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 49 */     public boolean onDoubleTap(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 50 */     public boolean onDoubleTapEvent(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 51 */     public boolean onSingleTapConfirmed(MotionEvent e) { throw new RuntimeException("Stub!"); }
/* 52 */     public boolean onContextClick(MotionEvent e) { throw new RuntimeException("Stub!"); } }
/*    */   
/*    */   @Deprecated
/* 55 */   public GestureDetector(OnGestureListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 57 */   public GestureDetector(OnGestureListener listener) { throw new RuntimeException("Stub!"); }
/* 58 */   public GestureDetector(Context context, OnGestureListener listener) { throw new RuntimeException("Stub!"); }
/* 59 */   public GestureDetector(Context context, OnGestureListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 60 */   public GestureDetector(Context context, OnGestureListener listener, Handler handler, boolean unused) { throw new RuntimeException("Stub!"); }
/* 61 */   public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) { throw new RuntimeException("Stub!"); }
/* 62 */   public void setContextClickListener(OnContextClickListener onContextClickListener) { throw new RuntimeException("Stub!"); }
/* 63 */   public void setIsLongpressEnabled(boolean isLongpressEnabled) { throw new RuntimeException("Stub!"); }
/* 64 */   public boolean isLongpressEnabled() { throw new RuntimeException("Stub!"); }
/* 65 */   public boolean onTouchEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/* 66 */   public boolean onGenericMotionEvent(MotionEvent ev) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnContextClickListener
/*    */   {
/*    */     public abstract boolean onContextClick(MotionEvent paramMotionEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnDoubleTapListener
/*    */   {
/*    */     public abstract boolean onSingleTapConfirmed(MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract boolean onDoubleTap(MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract boolean onDoubleTapEvent(MotionEvent paramMotionEvent);
/*    */   }
/*    */   
/*    */   public static abstract interface OnGestureListener
/*    */   {
/*    */     public abstract boolean onDown(MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract void onShowPress(MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract boolean onSingleTapUp(MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2);
/*    */     
/*    */     public abstract void onLongPress(MotionEvent paramMotionEvent);
/*    */     
/*    */     public abstract boolean onFling(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\GestureDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */