/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.View;
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
/*    */ @RemoteViews.RemoteView
/*    */ public class Chronometer
/*    */   extends TextView
/*    */ {
/*    */   public Chronometer(Context context)
/*    */   {
/* 26 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public Chronometer(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public Chronometer(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public Chronometer(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public void setCountDown(boolean countDown) { throw new RuntimeException("Stub!"); }
/* 31 */   public boolean isCountDown() { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isTheFinalCountDown() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setBase(long base) { throw new RuntimeException("Stub!"); }
/* 34 */   public long getBase() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setFormat(String format) { throw new RuntimeException("Stub!"); }
/* 36 */   public String getFormat() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setOnChronometerTickListener(OnChronometerTickListener listener) { throw new RuntimeException("Stub!"); }
/* 38 */   public OnChronometerTickListener getOnChronometerTickListener() { throw new RuntimeException("Stub!"); }
/* 39 */   public void start() { throw new RuntimeException("Stub!"); }
/* 40 */   public void stop() { throw new RuntimeException("Stub!"); }
/* 41 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/* 42 */   protected void onWindowVisibilityChanged(int visibility) { throw new RuntimeException("Stub!"); }
/* 43 */   protected void onVisibilityChanged(View changedView, int visibility) { throw new RuntimeException("Stub!"); }
/* 44 */   public CharSequence getContentDescription() { throw new RuntimeException("Stub!"); }
/* 45 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnChronometerTickListener
/*    */   {
/*    */     public abstract void onChronometerTick(Chronometer paramChronometer);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\Chronometer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */