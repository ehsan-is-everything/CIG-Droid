/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.util.AttributeSet;
/*    */ import android.view.ViewDebug.ExportedProperty;
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
/*    */ public class TextClock
/*    */   extends TextView
/*    */ {
/*    */   public TextClock(Context context)
/*    */   {
/* 23 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*    */   
/* 25 */   public TextClock(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public TextClock(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public TextClock(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty
/* 29 */   public CharSequence getFormat12Hour() { throw new RuntimeException("Stub!"); }
/* 30 */   public void setFormat12Hour(CharSequence format) { throw new RuntimeException("Stub!"); }
/*    */   @ViewDebug.ExportedProperty
/* 32 */   public CharSequence getFormat24Hour() { throw new RuntimeException("Stub!"); }
/* 33 */   public void setFormat24Hour(CharSequence format) { throw new RuntimeException("Stub!"); }
/* 34 */   public boolean is24HourModeEnabled() { throw new RuntimeException("Stub!"); }
/* 35 */   public String getTimeZone() { throw new RuntimeException("Stub!"); }
/* 36 */   public void setTimeZone(String timeZone) { throw new RuntimeException("Stub!"); }
/* 37 */   protected void onAttachedToWindow() { throw new RuntimeException("Stub!"); }
/* 38 */   public void onVisibilityAggregated(boolean isVisible) { throw new RuntimeException("Stub!"); }
/* 39 */   protected void onDetachedFromWindow() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */ 
/*    */ 
/*    */   @Deprecated
/* 44 */   public static final CharSequence DEFAULT_FORMAT_24_HOUR = null; @Deprecated
/* 44 */   public static final CharSequence DEFAULT_FORMAT_12_HOUR = null;
/*    */ }


/* Location:              C:\Users\Lab\Desktop\android-jar\android-26.jar!\android\widget\TextClock.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */