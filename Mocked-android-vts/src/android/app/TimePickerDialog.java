/*    */ package android.app;
/*    */ 
/*    */ import android.content.Context;
/*    */ import android.content.DialogInterface;
/*    */ import android.content.DialogInterface.OnClickListener;
/*    */ import android.os.Bundle;
/*    */ import android.widget.TimePicker;
/*    */ import android.widget.TimePicker.OnTimeChangedListener;
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
/*    */ public class TimePickerDialog
/*    */   extends AlertDialog
/*    */   implements DialogInterface.OnClickListener, TimePicker.OnTimeChangedListener
/*    */ {
/*    */   public TimePickerDialog(Context context, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView)
/*    */   {
/* 26 */     super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 27 */   public TimePickerDialog(Context context, int themeResId, OnTimeSetListener listener, int hourOfDay, int minute, boolean is24HourView) { super((Context)null, 0);throw new RuntimeException("Stub!"); }
/* 28 */   public void onTimeChanged(TimePicker view, int hourOfDay, int minute) { throw new RuntimeException("Stub!"); }
/* 29 */   public void show() { throw new RuntimeException("Stub!"); }
/* 30 */   public void onClick(DialogInterface dialog, int which) { throw new RuntimeException("Stub!"); }
/* 31 */   public void updateTime(int hourOfDay, int minuteOfHour) { throw new RuntimeException("Stub!"); }
/* 32 */   public Bundle onSaveInstanceState() { throw new RuntimeException("Stub!"); }
/* 33 */   public void onRestoreInstanceState(Bundle savedInstanceState) { throw new RuntimeException("Stub!"); }
/*    */   
/*    */   public static abstract interface OnTimeSetListener
/*    */   {
/*    */     public abstract void onTimeSet(TimePicker paramTimePicker, int paramInt1, int paramInt2);
/*    */   }
/*    */ }


/* Location:              C:\Users\Mahmoud\Desktop\android.jar!\android\app\TimePickerDialog.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       0.7.1
 */