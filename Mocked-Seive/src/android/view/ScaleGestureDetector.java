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
/*    */ public class ScaleGestureDetector
/*    */ {
/*    */   public static class SimpleOnScaleGestureListener
/*    */     implements ScaleGestureDetector.OnScaleGestureListener
/*    */   {
/* 29 */     public SimpleOnScaleGestureListener() { throw new RuntimeException("Stub!"); }
/* 30 */     public boolean onScale(ScaleGestureDetector detector) { throw new RuntimeException("Stub!"); }
/* 31 */     public boolean onScaleBegin(ScaleGestureDetector detector) { throw new RuntimeException("Stub!"); }
/* 32 */     public void onScaleEnd(ScaleGestureDetector detector) { throw new RuntimeException("Stub!"); } }
/*    */   
/* 34 */   public ScaleGestureDetector(Context context, OnScaleGestureListener listener) { throw new RuntimeException("Stub!"); }
/* 35 */   public ScaleGestureDetector(Context context, OnScaleGestureListener listener, Handler handler) { throw new RuntimeException("Stub!"); }
/* 36 */   public boolean onTouchEvent(MotionEvent event) { throw new RuntimeException("Stub!"); }
/* 37 */   public void setQuickScaleEnabled(boolean scales) { throw new RuntimeException("Stub!"); }
/* 38 */   public boolean isQuickScaleEnabled() { throw new RuntimeException("Stub!"); }
/* 39 */   public void setStylusScaleEnabled(boolean scales) { throw new RuntimeException("Stub!"); }
/* 40 */   public boolean isStylusScaleEnabled() { throw new RuntimeException("Stub!"); }
/* 41 */   public boolean isInProgress() { throw new RuntimeException("Stub!"); }
/* 42 */   public float getFocusX() { throw new RuntimeException("Stub!"); }
/* 43 */   public float getFocusY() { throw new RuntimeException("Stub!"); }
/* 44 */   public float getCurrentSpan() { throw new RuntimeException("Stub!"); }
/* 45 */   public float getCurrentSpanX() { throw new RuntimeException("Stub!"); }
/* 46 */   public float getCurrentSpanY() { throw new RuntimeException("Stub!"); }
/* 47 */   public float getPreviousSpan() { throw new RuntimeException("Stub!"); }
/* 48 */   public float getPreviousSpanX() { throw new RuntimeException("Stub!"); }
/* 49 */   public float getPreviousSpanY() { throw new RuntimeException("Stub!"); }
/* 50 */   public float getScaleFactor() { throw new RuntimeException("Stub!"); }
/* 51 */   public long getTimeDelta() { throw new RuntimeException("Stub!"); }
/* 52 */   public long getEventTime() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnScaleGestureListener
/*    */   {
/*    */     public abstract boolean onScale(ScaleGestureDetector paramScaleGestureDetector);
/*    */     
/*    */     public abstract boolean onScaleBegin(ScaleGestureDetector paramScaleGestureDetector);
/*    */     
/*    */     public abstract void onScaleEnd(ScaleGestureDetector paramScaleGestureDetector);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\view\ScaleGestureDetector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */