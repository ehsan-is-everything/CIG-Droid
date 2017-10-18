/*    */ package android.appwidget;
/*    */ 
/*    */ import android.content.ComponentName;
/*    */ import android.content.Context;
/*    */ import android.graphics.Canvas;
/*    */ import android.graphics.Rect;
/*    */ import android.os.Bundle;
/*    */ import android.os.Parcelable;
/*    */ import android.util.AttributeSet;
/*    */ import android.util.SparseArray;
/*    */ import android.view.View;
/*    */ import android.widget.FrameLayout;
/*    */ import android.widget.FrameLayout.LayoutParams;
/*    */ import android.widget.RemoteViews;
/*    */ import java.util.concurrent.Executor;
/*    */ 
/*    */ public class AppWidgetHostView extends FrameLayout
/*    */ {
/*    */   public AppWidgetHostView(Context context)
/*    */   {
/* 21 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*    */   
/* 23 */   public AppWidgetHostView(Context context, int animationIn, int animationOut) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 24 */   public void setAppWidget(int appWidgetId, AppWidgetProviderInfo info) { throw new RuntimeException("Stub!"); }
/* 25 */   public static Rect getDefaultPaddingForWidget(Context context, ComponentName component, Rect padding) { throw new RuntimeException("Stub!"); }
/* 26 */   public int getAppWidgetId() { throw new RuntimeException("Stub!"); }
/* 27 */   public AppWidgetProviderInfo getAppWidgetInfo() { throw new RuntimeException("Stub!"); }
/* 28 */   protected void dispatchSaveInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 29 */   protected void dispatchRestoreInstanceState(SparseArray<Parcelable> container) { throw new RuntimeException("Stub!"); }
/* 30 */   protected void onLayout(boolean changed, int left, int top, int right, int bottom) { throw new RuntimeException("Stub!"); }
/* 31 */   public void updateAppWidgetSize(Bundle newOptions, int minWidth, int minHeight, int maxWidth, int maxHeight) { throw new RuntimeException("Stub!"); }
/* 32 */   public void updateAppWidgetOptions(Bundle options) { throw new RuntimeException("Stub!"); }
/* 33 */   public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attrs) { throw new RuntimeException("Stub!"); }
/* 34 */   public void setExecutor(Executor executor) { throw new RuntimeException("Stub!"); }
/* 35 */   public void updateAppWidget(RemoteViews remoteViews) { throw new RuntimeException("Stub!"); }
/* 36 */   protected boolean drawChild(Canvas canvas, View child, long drawingTime) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void prepareView(View view) { throw new RuntimeException("Stub!"); }
/* 38 */   protected View getDefaultView() { throw new RuntimeException("Stub!"); }
/* 39 */   protected View getErrorView() { throw new RuntimeException("Stub!"); }
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\appwidget\AppWidgetHostView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */