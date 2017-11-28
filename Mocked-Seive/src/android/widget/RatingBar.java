/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
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
/*    */ public class RatingBar
/*    */   extends AbsSeekBar
/*    */ {
/*    */   public RatingBar(Context context, AttributeSet attrs, int defStyleAttr)
/*    */   {
/* 25 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public RatingBar(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public RatingBar(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public RatingBar(Context context) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public void setOnRatingBarChangeListener(OnRatingBarChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 30 */   public OnRatingBarChangeListener getOnRatingBarChangeListener() { throw new RuntimeException("Stub!"); }
/* 31 */   public void setIsIndicator(boolean isIndicator) { throw new RuntimeException("Stub!"); }
/* 32 */   public boolean isIndicator() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setNumStars(int numStars) { throw new RuntimeException("Stub!"); }
/* 34 */   public int getNumStars() { throw new RuntimeException("Stub!"); }
/* 35 */   public void setRating(float rating) { throw new RuntimeException("Stub!"); }
/* 36 */   public float getRating() { throw new RuntimeException("Stub!"); }
/* 37 */   public void setStepSize(float stepSize) { throw new RuntimeException("Stub!"); }
/* 38 */   public float getStepSize() { throw new RuntimeException("Stub!"); }
/* 39 */   protected synchronized void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 40 */   public synchronized void setMax(int max) { throw new RuntimeException("Stub!"); }
/* 41 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnRatingBarChangeListener
/*    */   {
/*    */     public abstract void onRatingChanged(RatingBar paramRatingBar, float paramFloat, boolean paramBoolean);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\RatingBar.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */