/*    */ package android.view;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.util.AttributeSet;
/*    */ import android.widget.RemoteViews.RemoteView;
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
/*    */ public final class ViewStub
/*    */   extends View
/*    */ {
/*    */   public ViewStub(Context context)
/*    */   {
/* 26 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public ViewStub(Context context, int layoutResource) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public ViewStub(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 29 */   public ViewStub(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 30 */   public ViewStub(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 31 */   public int getInflatedId() { throw new RuntimeException("Stub!"); }
/* 32 */   public void setInflatedId(int inflatedId) { throw new RuntimeException("Stub!"); }
/* 33 */   public int getLayoutResource() { throw new RuntimeException("Stub!"); }
/* 34 */   public void setLayoutResource(int layoutResource) { throw new RuntimeException("Stub!"); }
/* 35 */   public void setLayoutInflater(LayoutInflater inflater) { throw new RuntimeException("Stub!"); }
/* 36 */   public LayoutInflater getLayoutInflater() { throw new RuntimeException("Stub!"); }
/* 37 */   protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) { throw new RuntimeException("Stub!"); }
/* 38 */   public void draw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void dispatchDraw(Canvas canvas) { throw new RuntimeException("Stub!"); }
/* 40 */   public void setVisibility(int visibility) { throw new RuntimeException("Stub!"); }
/* 41 */   public View inflate() { throw new RuntimeException("Stub!"); }
/* 42 */   public void setOnInflateListener(OnInflateListener inflateListener) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnInflateListener
/*    */   {
/*    */     public abstract void onInflate(ViewStub paramViewStub, View paramView);
/*    */   }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\view\ViewStub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */