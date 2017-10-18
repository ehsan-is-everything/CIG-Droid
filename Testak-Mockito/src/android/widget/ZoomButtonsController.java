/*    */ package android.widget;
/*    */ 
/*    */ import android.view.MotionEvent;
/*    */ import android.view.View;
/*    */ import android.view.View.OnTouchListener;
/*    */ import android.view.ViewGroup;
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
/*    */ @Deprecated
/*    */ public class ZoomButtonsController
/*    */   implements View.OnTouchListener
/*    */ {
/* 27 */   public ZoomButtonsController(View ownerView) { throw new RuntimeException("Stub!"); }
/* 28 */   public void setZoomInEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 29 */   public void setZoomOutEnabled(boolean enabled) { throw new RuntimeException("Stub!"); }
/* 30 */   public void setZoomSpeed(long speed) { throw new RuntimeException("Stub!"); }
/* 31 */   public void setOnZoomListener(OnZoomListener listener) { throw new RuntimeException("Stub!"); }
/* 32 */   public void setFocusable(boolean focusable) { throw new RuntimeException("Stub!"); }
/* 33 */   public boolean isAutoDismissed() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setAutoDismissed(boolean autoDismiss) { throw new RuntimeException("Stub!"); }
/* 35 */   public boolean isVisible() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setVisible(boolean visible) { throw new RuntimeException("Stub!"); }
/* 37 */   public ViewGroup getContainer() { throw new RuntimeException("Stub!"); }
/* 38 */   public View getZoomControls() { throw new RuntimeException("Stub!"); }
/* 39 */   public boolean onTouch(View v, MotionEvent event) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnZoomListener
/*    */   {
/*    */     public abstract void onVisibilityChanged(boolean paramBoolean);
/*    */     
/*    */     public abstract void onZoom(boolean paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\ZoomButtonsController.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */