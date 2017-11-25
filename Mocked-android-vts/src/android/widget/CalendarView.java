/*    */ package android.widget;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.res.Configuration;
/*    */ import android.graphics.drawable.Drawable;
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
/*    */ public class CalendarView
/*    */   extends FrameLayout
/*    */ {
/*    */   public CalendarView(Context context)
/*    */   {
/* 25 */     super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 26 */   public CalendarView(Context context, AttributeSet attrs) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public CalendarView(Context context, AttributeSet attrs, int defStyleAttr) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public CalendarView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) { super((Context)null, (AttributeSet)null, 0, 0);throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 30 */   public void setShownWeekCount(int count) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 32 */   public int getShownWeekCount() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 34 */   public void setSelectedWeekBackgroundColor(int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 36 */   public int getSelectedWeekBackgroundColor() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 38 */   public void setFocusedMonthDateColor(int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 40 */   public int getFocusedMonthDateColor() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 42 */   public void setUnfocusedMonthDateColor(int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 44 */   public int getUnfocusedMonthDateColor() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 46 */   public void setWeekNumberColor(int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 48 */   public int getWeekNumberColor() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 50 */   public void setWeekSeparatorLineColor(int color) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 52 */   public int getWeekSeparatorLineColor() { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 54 */   public void setSelectedDateVerticalBar(int resourceId) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 56 */   public void setSelectedDateVerticalBar(Drawable drawable) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 58 */   public Drawable getSelectedDateVerticalBar() { throw new RuntimeException("Stub!"); }
/* 59 */   public void setWeekDayTextAppearance(int resourceId) { throw new RuntimeException("Stub!"); }
/* 60 */   public int getWeekDayTextAppearance() { throw new RuntimeException("Stub!"); }
/* 61 */   public void setDateTextAppearance(int resourceId) { throw new RuntimeException("Stub!"); }
/* 62 */   public int getDateTextAppearance() { throw new RuntimeException("Stub!"); }
/* 63 */   public long getMinDate() { throw new RuntimeException("Stub!"); }
/* 64 */   public void setMinDate(long minDate) { throw new RuntimeException("Stub!"); }
/* 65 */   public long getMaxDate() { throw new RuntimeException("Stub!"); }
/* 66 */   public void setMaxDate(long maxDate) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 68 */   public void setShowWeekNumber(boolean showWeekNumber) { throw new RuntimeException("Stub!"); }
/*    */   @Deprecated
/* 70 */   public boolean getShowWeekNumber() { throw new RuntimeException("Stub!"); }
/* 71 */   public int getFirstDayOfWeek() { throw new RuntimeException("Stub!"); }
/* 72 */   public void setFirstDayOfWeek(int firstDayOfWeek) { throw new RuntimeException("Stub!"); }
/* 73 */   public void setOnDateChangeListener(OnDateChangeListener listener) { throw new RuntimeException("Stub!"); }
/* 74 */   public long getDate() { throw new RuntimeException("Stub!"); }
/* 75 */   public void setDate(long date) { throw new RuntimeException("Stub!"); }
/* 76 */   public void setDate(long date, boolean animate, boolean center) { throw new RuntimeException("Stub!"); }
/* 77 */   protected void onConfigurationChanged(Configuration newConfig) { throw new RuntimeException("Stub!"); }
/* 78 */   public CharSequence getAccessibilityClassName() { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnDateChangeListener
/*    */   {
/*    */     public abstract void onSelectedDayChange(CalendarView paramCalendarView, int paramInt1, int paramInt2, int paramInt3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\widget\CalendarView.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */